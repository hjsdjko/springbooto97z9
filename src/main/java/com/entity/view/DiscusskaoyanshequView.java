package com.entity.view;

import com.entity.DiscusskaoyanshequEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考研社区评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
@TableName("discusskaoyanshequ")
public class DiscusskaoyanshequView  extends DiscusskaoyanshequEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskaoyanshequView(){
	}
 
 	public DiscusskaoyanshequView(DiscusskaoyanshequEntity discusskaoyanshequEntity){
 	try {
			BeanUtils.copyProperties(this, discusskaoyanshequEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
