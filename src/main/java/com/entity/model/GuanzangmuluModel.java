package com.entity.model;

import com.entity.GuanzangmuluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 馆藏目录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public class GuanzangmuluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 目录名称
	 */
	
	private String mulumingcheng;
		
	/**
	 * 内容
	 */
	
	private String neirong;
				
	
	/**
	 * 设置：目录名称
	 */
	 
	public void setMulumingcheng(String mulumingcheng) {
		this.mulumingcheng = mulumingcheng;
	}
	
	/**
	 * 获取：目录名称
	 */
	public String getMulumingcheng() {
		return mulumingcheng;
	}
				
	
	/**
	 * 设置：内容
	 */
	 
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
			
}
