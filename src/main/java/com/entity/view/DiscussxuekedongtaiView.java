package com.entity.view;

import com.entity.DiscussxuekedongtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学科动态评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
@TableName("discussxuekedongtai")
public class DiscussxuekedongtaiView  extends DiscussxuekedongtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxuekedongtaiView(){
	}
 
 	public DiscussxuekedongtaiView(DiscussxuekedongtaiEntity discussxuekedongtaiEntity){
 	try {
			BeanUtils.copyProperties(this, discussxuekedongtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
