package com.dao;

import com.entity.JiangoumuluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiangoumuluVO;
import com.entity.view.JiangoumuluView;


/**
 * 荐购目录
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface JiangoumuluDao extends BaseMapper<JiangoumuluEntity> {
	
	List<JiangoumuluVO> selectListVO(@Param("ew") Wrapper<JiangoumuluEntity> wrapper);
	
	JiangoumuluVO selectVO(@Param("ew") Wrapper<JiangoumuluEntity> wrapper);
	
	List<JiangoumuluView> selectListView(@Param("ew") Wrapper<JiangoumuluEntity> wrapper);

	List<JiangoumuluView> selectListView(Pagination page,@Param("ew") Wrapper<JiangoumuluEntity> wrapper);
	
	JiangoumuluView selectView(@Param("ew") Wrapper<JiangoumuluEntity> wrapper);
	
}
