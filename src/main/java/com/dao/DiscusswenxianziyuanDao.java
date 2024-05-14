package com.dao;

import com.entity.DiscusswenxianziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswenxianziyuanVO;
import com.entity.view.DiscusswenxianziyuanView;


/**
 * 文献资源评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
public interface DiscusswenxianziyuanDao extends BaseMapper<DiscusswenxianziyuanEntity> {
	
	List<DiscusswenxianziyuanVO> selectListVO(@Param("ew") Wrapper<DiscusswenxianziyuanEntity> wrapper);
	
	DiscusswenxianziyuanVO selectVO(@Param("ew") Wrapper<DiscusswenxianziyuanEntity> wrapper);
	
	List<DiscusswenxianziyuanView> selectListView(@Param("ew") Wrapper<DiscusswenxianziyuanEntity> wrapper);

	List<DiscusswenxianziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswenxianziyuanEntity> wrapper);
	
	DiscusswenxianziyuanView selectView(@Param("ew") Wrapper<DiscusswenxianziyuanEntity> wrapper);
	
}
