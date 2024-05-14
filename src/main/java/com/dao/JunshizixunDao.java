package com.dao;

import com.entity.JunshizixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JunshizixunVO;
import com.entity.view.JunshizixunView;


/**
 * 军事资讯
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface JunshizixunDao extends BaseMapper<JunshizixunEntity> {
	
	List<JunshizixunVO> selectListVO(@Param("ew") Wrapper<JunshizixunEntity> wrapper);
	
	JunshizixunVO selectVO(@Param("ew") Wrapper<JunshizixunEntity> wrapper);
	
	List<JunshizixunView> selectListView(@Param("ew") Wrapper<JunshizixunEntity> wrapper);

	List<JunshizixunView> selectListView(Pagination page,@Param("ew") Wrapper<JunshizixunEntity> wrapper);
	
	JunshizixunView selectView(@Param("ew") Wrapper<JunshizixunEntity> wrapper);
	
}
