package com.dao;

import com.entity.DiscussxuekeziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuekeziyuanVO;
import com.entity.view.DiscussxuekeziyuanView;


/**
 * 学科资源评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
public interface DiscussxuekeziyuanDao extends BaseMapper<DiscussxuekeziyuanEntity> {
	
	List<DiscussxuekeziyuanVO> selectListVO(@Param("ew") Wrapper<DiscussxuekeziyuanEntity> wrapper);
	
	DiscussxuekeziyuanVO selectVO(@Param("ew") Wrapper<DiscussxuekeziyuanEntity> wrapper);
	
	List<DiscussxuekeziyuanView> selectListView(@Param("ew") Wrapper<DiscussxuekeziyuanEntity> wrapper);

	List<DiscussxuekeziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuekeziyuanEntity> wrapper);
	
	DiscussxuekeziyuanView selectView(@Param("ew") Wrapper<DiscussxuekeziyuanEntity> wrapper);
	
}
