package com.entity.view;

import com.entity.DiscussshequziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社区资源评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
@TableName("discussshequziyuan")
public class DiscussshequziyuanView  extends DiscussshequziyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshequziyuanView(){
	}
 
 	public DiscussshequziyuanView(DiscussshequziyuanEntity discussshequziyuanEntity){
 	try {
			BeanUtils.copyProperties(this, discussshequziyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
