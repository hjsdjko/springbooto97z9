package com.dao;

import com.entity.ShequziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequziyuanVO;
import com.entity.view.ShequziyuanView;


/**
 * 社区资源
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface ShequziyuanDao extends BaseMapper<ShequziyuanEntity> {
	
	List<ShequziyuanVO> selectListVO(@Param("ew") Wrapper<ShequziyuanEntity> wrapper);
	
	ShequziyuanVO selectVO(@Param("ew") Wrapper<ShequziyuanEntity> wrapper);
	
	List<ShequziyuanView> selectListView(@Param("ew") Wrapper<ShequziyuanEntity> wrapper);

	List<ShequziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShequziyuanEntity> wrapper);
	
	ShequziyuanView selectView(@Param("ew") Wrapper<ShequziyuanEntity> wrapper);
	
}
