package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussxuekeziyuanEntity;
import com.entity.view.DiscussxuekeziyuanView;

import com.service.DiscussxuekeziyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 学科资源评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
@RestController
@RequestMapping("/discussxuekeziyuan")
public class DiscussxuekeziyuanController {
    @Autowired
    private DiscussxuekeziyuanService discussxuekeziyuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussxuekeziyuanEntity discussxuekeziyuan,
		HttpServletRequest request){
        EntityWrapper<DiscussxuekeziyuanEntity> ew = new EntityWrapper<DiscussxuekeziyuanEntity>();
		PageUtils page = discussxuekeziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussxuekeziyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussxuekeziyuanEntity discussxuekeziyuan, 
		HttpServletRequest request){
        EntityWrapper<DiscussxuekeziyuanEntity> ew = new EntityWrapper<DiscussxuekeziyuanEntity>();
		PageUtils page = discussxuekeziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussxuekeziyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussxuekeziyuanEntity discussxuekeziyuan){
       	EntityWrapper<DiscussxuekeziyuanEntity> ew = new EntityWrapper<DiscussxuekeziyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussxuekeziyuan, "discussxuekeziyuan")); 
        return R.ok().put("data", discussxuekeziyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussxuekeziyuanEntity discussxuekeziyuan){
        EntityWrapper< DiscussxuekeziyuanEntity> ew = new EntityWrapper< DiscussxuekeziyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussxuekeziyuan, "discussxuekeziyuan")); 
		DiscussxuekeziyuanView discussxuekeziyuanView =  discussxuekeziyuanService.selectView(ew);
		return R.ok("查询学科资源评论表成功").put("data", discussxuekeziyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussxuekeziyuanEntity discussxuekeziyuan = discussxuekeziyuanService.selectById(id);
        return R.ok().put("data", discussxuekeziyuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussxuekeziyuanEntity discussxuekeziyuan = discussxuekeziyuanService.selectById(id);
        return R.ok().put("data", discussxuekeziyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussxuekeziyuanEntity discussxuekeziyuan, HttpServletRequest request){
    	discussxuekeziyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussxuekeziyuan);
        discussxuekeziyuanService.insert(discussxuekeziyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussxuekeziyuanEntity discussxuekeziyuan, HttpServletRequest request){
    	discussxuekeziyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussxuekeziyuan);
        discussxuekeziyuanService.insert(discussxuekeziyuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussxuekeziyuanEntity discussxuekeziyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussxuekeziyuan);
        discussxuekeziyuanService.updateById(discussxuekeziyuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussxuekeziyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussxuekeziyuanEntity> wrapper = new EntityWrapper<DiscussxuekeziyuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussxuekeziyuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
