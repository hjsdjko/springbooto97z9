package com.dao;

import com.entity.XuekeziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuekeziyuanVO;
import com.entity.view.XuekeziyuanView;


/**
 * 学科资源
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface XuekeziyuanDao extends BaseMapper<XuekeziyuanEntity> {
	
	List<XuekeziyuanVO> selectListVO(@Param("ew") Wrapper<XuekeziyuanEntity> wrapper);
	
	XuekeziyuanVO selectVO(@Param("ew") Wrapper<XuekeziyuanEntity> wrapper);
	
	List<XuekeziyuanView> selectListView(@Param("ew") Wrapper<XuekeziyuanEntity> wrapper);

	List<XuekeziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<XuekeziyuanEntity> wrapper);
	
	XuekeziyuanView selectView(@Param("ew") Wrapper<XuekeziyuanEntity> wrapper);
	
}
