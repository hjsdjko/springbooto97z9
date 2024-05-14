package com.entity.view;

import com.entity.JiangoumuluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 荐购目录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
@TableName("jiangoumulu")
public class JiangoumuluView  extends JiangoumuluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiangoumuluView(){
	}
 
 	public JiangoumuluView(JiangoumuluEntity jiangoumuluEntity){
 	try {
			BeanUtils.copyProperties(this, jiangoumuluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
