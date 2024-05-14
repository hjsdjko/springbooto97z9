package com.entity.view;

import com.entity.XuekedongtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学科动态
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
@TableName("xuekedongtai")
public class XuekedongtaiView  extends XuekedongtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuekedongtaiView(){
	}
 
 	public XuekedongtaiView(XuekedongtaiEntity xuekedongtaiEntity){
 	try {
			BeanUtils.copyProperties(this, xuekedongtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
