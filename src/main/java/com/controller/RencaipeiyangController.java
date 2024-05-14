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

import com.entity.RencaipeiyangEntity;
import com.entity.view.RencaipeiyangView;

import com.service.RencaipeiyangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 人才培养
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
@RestController
@RequestMapping("/rencaipeiyang")
public class RencaipeiyangController {
    @Autowired
    private RencaipeiyangService rencaipeiyangService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RencaipeiyangEntity rencaipeiyang,
		HttpServletRequest request){
        EntityWrapper<RencaipeiyangEntity> ew = new EntityWrapper<RencaipeiyangEntity>();
		PageUtils page = rencaipeiyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, rencaipeiyang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RencaipeiyangEntity rencaipeiyang, 
		HttpServletRequest request){
        EntityWrapper<RencaipeiyangEntity> ew = new EntityWrapper<RencaipeiyangEntity>();
		PageUtils page = rencaipeiyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, rencaipeiyang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RencaipeiyangEntity rencaipeiyang){
       	EntityWrapper<RencaipeiyangEntity> ew = new EntityWrapper<RencaipeiyangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( rencaipeiyang, "rencaipeiyang")); 
        return R.ok().put("data", rencaipeiyangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RencaipeiyangEntity rencaipeiyang){
        EntityWrapper< RencaipeiyangEntity> ew = new EntityWrapper< RencaipeiyangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( rencaipeiyang, "rencaipeiyang")); 
		RencaipeiyangView rencaipeiyangView =  rencaipeiyangService.selectView(ew);
		return R.ok("查询人才培养成功").put("data", rencaipeiyangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RencaipeiyangEntity rencaipeiyang = rencaipeiyangService.selectById(id);
        return R.ok().put("data", rencaipeiyang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RencaipeiyangEntity rencaipeiyang = rencaipeiyangService.selectById(id);
        return R.ok().put("data", rencaipeiyang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RencaipeiyangEntity rencaipeiyang, HttpServletRequest request){
    	rencaipeiyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(rencaipeiyang);
        rencaipeiyangService.insert(rencaipeiyang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RencaipeiyangEntity rencaipeiyang, HttpServletRequest request){
    	rencaipeiyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(rencaipeiyang);
        rencaipeiyangService.insert(rencaipeiyang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RencaipeiyangEntity rencaipeiyang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(rencaipeiyang);
        rencaipeiyangService.updateById(rencaipeiyang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        rencaipeiyangService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<RencaipeiyangEntity> wrapper = new EntityWrapper<RencaipeiyangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = rencaipeiyangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
