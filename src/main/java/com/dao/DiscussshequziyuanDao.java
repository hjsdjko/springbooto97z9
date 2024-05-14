package com.dao;

import com.entity.DiscussshequziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshequziyuanVO;
import com.entity.view.DiscussshequziyuanView;


/**
 * 社区资源评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
public interface DiscussshequziyuanDao extends BaseMapper<DiscussshequziyuanEntity> {
	
	List<DiscussshequziyuanVO> selectListVO(@Param("ew") Wrapper<DiscussshequziyuanEntity> wrapper);
	
	DiscussshequziyuanVO selectVO(@Param("ew") Wrapper<DiscussshequziyuanEntity> wrapper);
	
	List<DiscussshequziyuanView> selectListView(@Param("ew") Wrapper<DiscussshequziyuanEntity> wrapper);

	List<DiscussshequziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshequziyuanEntity> wrapper);
	
	DiscussshequziyuanView selectView(@Param("ew") Wrapper<DiscussshequziyuanEntity> wrapper);
	
}
