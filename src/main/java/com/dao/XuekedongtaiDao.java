package com.dao;

import com.entity.XuekedongtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuekedongtaiVO;
import com.entity.view.XuekedongtaiView;


/**
 * 学科动态
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface XuekedongtaiDao extends BaseMapper<XuekedongtaiEntity> {
	
	List<XuekedongtaiVO> selectListVO(@Param("ew") Wrapper<XuekedongtaiEntity> wrapper);
	
	XuekedongtaiVO selectVO(@Param("ew") Wrapper<XuekedongtaiEntity> wrapper);
	
	List<XuekedongtaiView> selectListView(@Param("ew") Wrapper<XuekedongtaiEntity> wrapper);

	List<XuekedongtaiView> selectListView(Pagination page,@Param("ew") Wrapper<XuekedongtaiEntity> wrapper);
	
	XuekedongtaiView selectView(@Param("ew") Wrapper<XuekedongtaiEntity> wrapper);
	
}
