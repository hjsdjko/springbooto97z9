package com.dao;

import com.entity.XuekegaikuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuekegaikuangVO;
import com.entity.view.XuekegaikuangView;


/**
 * 学科概况
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface XuekegaikuangDao extends BaseMapper<XuekegaikuangEntity> {
	
	List<XuekegaikuangVO> selectListVO(@Param("ew") Wrapper<XuekegaikuangEntity> wrapper);
	
	XuekegaikuangVO selectVO(@Param("ew") Wrapper<XuekegaikuangEntity> wrapper);
	
	List<XuekegaikuangView> selectListView(@Param("ew") Wrapper<XuekegaikuangEntity> wrapper);

	List<XuekegaikuangView> selectListView(Pagination page,@Param("ew") Wrapper<XuekegaikuangEntity> wrapper);
	
	XuekegaikuangView selectView(@Param("ew") Wrapper<XuekegaikuangEntity> wrapper);
	
}
