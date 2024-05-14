package com.dao;

import com.entity.ZhengdingmuluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhengdingmuluVO;
import com.entity.view.ZhengdingmuluView;


/**
 * 征订目录
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
public interface ZhengdingmuluDao extends BaseMapper<ZhengdingmuluEntity> {
	
	List<ZhengdingmuluVO> selectListVO(@Param("ew") Wrapper<ZhengdingmuluEntity> wrapper);
	
	ZhengdingmuluVO selectVO(@Param("ew") Wrapper<ZhengdingmuluEntity> wrapper);
	
	List<ZhengdingmuluView> selectListView(@Param("ew") Wrapper<ZhengdingmuluEntity> wrapper);

	List<ZhengdingmuluView> selectListView(Pagination page,@Param("ew") Wrapper<ZhengdingmuluEntity> wrapper);
	
	ZhengdingmuluView selectView(@Param("ew") Wrapper<ZhengdingmuluEntity> wrapper);
	
}
