package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 馆藏目录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
@TableName("guanzangmulu")
public class GuanzangmuluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GuanzangmuluEntity() {
		
	}
	
	public GuanzangmuluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 目录编号
	 */
					
	private String mulubianhao;
	
	/**
	 * 目录名称
	 */
					
	private String mulumingcheng;
	
	/**
	 * 内容
	 */
					
	private String neirong;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：目录编号
	 */
	public void setMulubianhao(String mulubianhao) {
		this.mulubianhao = mulubianhao;
	}
	/**
	 * 获取：目录编号
	 */
	public String getMulubianhao() {
		return mulubianhao;
	}
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
