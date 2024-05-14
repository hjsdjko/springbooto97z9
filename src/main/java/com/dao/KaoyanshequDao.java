package com.dao;

import com.entity.KaoyanshequEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoyanshequVO;
import com.entity.view.KaoyanshequView;


/**
 * 考研社区
 * 
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface KaoyanshequDao extends BaseMapper<KaoyanshequEntity> {
	
	List<KaoyanshequVO> selectListVO(@Param("ew") Wrapper<KaoyanshequEntity> wrapper);
	
	KaoyanshequVO selectVO(@Param("ew") Wrapper<KaoyanshequEntity> wrapper);
	
	List<KaoyanshequView> selectListView(@Param("ew") Wrapper<KaoyanshequEntity> wrapper);

	List<KaoyanshequView> selectListView(Pagination page,@Param("ew") Wrapper<KaoyanshequEntity> wrapper);
	
	KaoyanshequView selectView(@Param("ew") Wrapper<KaoyanshequEntity> wrapper);
	
}
