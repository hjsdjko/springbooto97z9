package com.entity.view;

import com.entity.XuekeziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学科资源
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
@TableName("xuekeziyuan")
public class XuekeziyuanView  extends XuekeziyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuekeziyuanView(){
	}
 
 	public XuekeziyuanView(XuekeziyuanEntity xuekeziyuanEntity){
 	try {
			BeanUtils.copyProperties(this, xuekeziyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
