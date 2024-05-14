package com.entity.view;

import com.entity.ShequziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社区资源
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
@TableName("shequziyuan")
public class ShequziyuanView  extends ShequziyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShequziyuanView(){
	}
 
 	public ShequziyuanView(ShequziyuanEntity shequziyuanEntity){
 	try {
			BeanUtils.copyProperties(this, shequziyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
