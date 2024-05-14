package com.dao;

import com.entity.DiscusskaoyanshequEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskaoyanshequVO;
import com.entity.view.DiscusskaoyanshequView;


/**
 * 考研社区评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
public interface DiscusskaoyanshequDao extends BaseMapper<DiscusskaoyanshequEntity> {
	
	List<DiscusskaoyanshequVO> selectListVO(@Param("ew") Wrapper<DiscusskaoyanshequEntity> wrapper);
	
	DiscusskaoyanshequVO selectVO(@Param("ew") Wrapper<DiscusskaoyanshequEntity> wrapper);
	
	List<DiscusskaoyanshequView> selectListView(@Param("ew") Wrapper<DiscusskaoyanshequEntity> wrapper);

	List<DiscusskaoyanshequView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskaoyanshequEntity> wrapper);
	
	DiscusskaoyanshequView selectView(@Param("ew") Wrapper<DiscusskaoyanshequEntity> wrapper);
	
}
