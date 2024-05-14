package com.entity.model;

import com.entity.XuekegaikuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学科概况
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public class XuekegaikuangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 专业名称
	 */
	
	private String zhuanyemingcheng;
		
	/**
	 * 专业编辑
	 */
	
	private String zhuanyebianji;
		
	/**
	 * 专业简介
	 */
	
	private String zhuanyejianjie;
				
	
	/**
	 * 设置：专业名称
	 */
	 
	public void setZhuanyemingcheng(String zhuanyemingcheng) {
		this.zhuanyemingcheng = zhuanyemingcheng;
	}
	
	/**
	 * 获取：专业名称
	 */
	public String getZhuanyemingcheng() {
		return zhuanyemingcheng;
	}
				
	
	/**
	 * 设置：专业编辑
	 */
	 
	public void setZhuanyebianji(String zhuanyebianji) {
		this.zhuanyebianji = zhuanyebianji;
	}
	
	/**
	 * 获取：专业编辑
	 */
	public String getZhuanyebianji() {
		return zhuanyebianji;
	}
				
	
	/**
	 * 设置：专业简介
	 */
	 
	public void setZhuanyejianjie(String zhuanyejianjie) {
		this.zhuanyejianjie = zhuanyejianjie;
	}
	
	/**
	 * 获取：专业简介
	 */
	public String getZhuanyejianjie() {
		return zhuanyejianjie;
	}
			
}
