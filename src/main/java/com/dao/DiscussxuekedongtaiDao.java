package com.dao;

import com.entity.DiscussxuekedongtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuekedongtaiVO;
import com.entity.view.DiscussxuekedongtaiView;


/**
 * 学科动态评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
public interface DiscussxuekedongtaiDao extends BaseMapper<DiscussxuekedongtaiEntity> {
	
	List<DiscussxuekedongtaiVO> selectListVO(@Param("ew") Wrapper<DiscussxuekedongtaiEntity> wrapper);
	
	DiscussxuekedongtaiVO selectVO(@Param("ew") Wrapper<DiscussxuekedongtaiEntity> wrapper);
	
	List<DiscussxuekedongtaiView> selectListView(@Param("ew") Wrapper<DiscussxuekedongtaiEntity> wrapper);

	List<DiscussxuekedongtaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuekedongtaiEntity> wrapper);
	
	DiscussxuekedongtaiView selectView(@Param("ew") Wrapper<DiscussxuekedongtaiEntity> wrapper);
	
}
