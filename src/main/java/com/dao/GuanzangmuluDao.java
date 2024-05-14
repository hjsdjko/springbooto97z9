package com.dao;

import com.entity.GuanzangmuluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanzangmuluVO;
import com.entity.view.GuanzangmuluView;


/**
 * 馆藏目录
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface GuanzangmuluDao extends BaseMapper<GuanzangmuluEntity> {
	
	List<GuanzangmuluVO> selectListVO(@Param("ew") Wrapper<GuanzangmuluEntity> wrapper);
	
	GuanzangmuluVO selectVO(@Param("ew") Wrapper<GuanzangmuluEntity> wrapper);
	
	List<GuanzangmuluView> selectListView(@Param("ew") Wrapper<GuanzangmuluEntity> wrapper);

	List<GuanzangmuluView> selectListView(Pagination page,@Param("ew") Wrapper<GuanzangmuluEntity> wrapper);
	
	GuanzangmuluView selectView(@Param("ew") Wrapper<GuanzangmuluEntity> wrapper);
	
}
