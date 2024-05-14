package com.dao;

import com.entity.WenxianziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenxianziyuanVO;
import com.entity.view.WenxianziyuanView;


/**
 * 文献资源
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface WenxianziyuanDao extends BaseMapper<WenxianziyuanEntity> {
	
	List<WenxianziyuanVO> selectListVO(@Param("ew") Wrapper<WenxianziyuanEntity> wrapper);
	
	WenxianziyuanVO selectVO(@Param("ew") Wrapper<WenxianziyuanEntity> wrapper);
	
	List<WenxianziyuanView> selectListView(@Param("ew") Wrapper<WenxianziyuanEntity> wrapper);

	List<WenxianziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<WenxianziyuanEntity> wrapper);
	
	WenxianziyuanView selectView(@Param("ew") Wrapper<WenxianziyuanEntity> wrapper);
	
}
