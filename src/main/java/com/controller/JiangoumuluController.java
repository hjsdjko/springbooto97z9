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

import com.entity.JiangoumuluEntity;
import com.entity.view.JiangoumuluView;

import com.service.JiangoumuluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 荐购目录
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
@RestController
@RequestMapping("/jiangoumulu")
public class JiangoumuluController {
    @Autowired
    private JiangoumuluService jiangoumuluService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiangoumuluEntity jiangoumulu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiangoumulu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiangoumuluEntity> ew = new EntityWrapper<JiangoumuluEntity>();
		PageUtils page = jiangoumuluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiangoumulu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiangoumuluEntity jiangoumulu, 
		HttpServletRequest request){
        EntityWrapper<JiangoumuluEntity> ew = new EntityWrapper<JiangoumuluEntity>();
		PageUtils page = jiangoumuluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiangoumulu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiangoumuluEntity jiangoumulu){
       	EntityWrapper<JiangoumuluEntity> ew = new EntityWrapper<JiangoumuluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiangoumulu, "jiangoumulu")); 
        return R.ok().put("data", jiangoumuluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiangoumuluEntity jiangoumulu){
        EntityWrapper< JiangoumuluEntity> ew = new EntityWrapper< JiangoumuluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiangoumulu, "jiangoumulu")); 
		JiangoumuluView jiangoumuluView =  jiangoumuluService.selectView(ew);
		return R.ok("查询荐购目录成功").put("data", jiangoumuluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiangoumuluEntity jiangoumulu = jiangoumuluService.selectById(id);
        return R.ok().put("data", jiangoumulu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiangoumuluEntity jiangoumulu = jiangoumuluService.selectById(id);
        return R.ok().put("data", jiangoumulu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiangoumuluEntity jiangoumulu, HttpServletRequest request){
    	jiangoumulu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiangoumulu);
        jiangoumuluService.insert(jiangoumulu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiangoumuluEntity jiangoumulu, HttpServletRequest request){
    	jiangoumulu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiangoumulu);
        jiangoumuluService.insert(jiangoumulu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiangoumuluEntity jiangoumulu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiangoumulu);
        jiangoumuluService.updateById(jiangoumulu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiangoumuluService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiangoumuluEntity> wrapper = new EntityWrapper<JiangoumuluEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiangoumuluService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
