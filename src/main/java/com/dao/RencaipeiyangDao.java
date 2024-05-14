package com.dao;

import com.entity.RencaipeiyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RencaipeiyangVO;
import com.entity.view.RencaipeiyangView;


/**
 * 人才培养
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface RencaipeiyangDao extends BaseMapper<RencaipeiyangEntity> {
	
	List<RencaipeiyangVO> selectListVO(@Param("ew") Wrapper<RencaipeiyangEntity> wrapper);
	
	RencaipeiyangVO selectVO(@Param("ew") Wrapper<RencaipeiyangEntity> wrapper);
	
	List<RencaipeiyangView> selectListView(@Param("ew") Wrapper<RencaipeiyangEntity> wrapper);

	List<RencaipeiyangView> selectListView(Pagination page,@Param("ew") Wrapper<RencaipeiyangEntity> wrapper);
	
	RencaipeiyangView selectView(@Param("ew") Wrapper<RencaipeiyangEntity> wrapper);
	
}
