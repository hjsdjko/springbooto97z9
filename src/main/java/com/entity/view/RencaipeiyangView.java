package com.entity.view;

import com.entity.RencaipeiyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 人才培养
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
@TableName("rencaipeiyang")
public class RencaipeiyangView  extends RencaipeiyangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RencaipeiyangView(){
	}
 
 	public RencaipeiyangView(RencaipeiyangEntity rencaipeiyangEntity){
 	try {
			BeanUtils.copyProperties(this, rencaipeiyangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
