package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RencaipeiyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RencaipeiyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RencaipeiyangView;


/**
 * 人才培养
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface RencaipeiyangService extends IService<RencaipeiyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RencaipeiyangVO> selectListVO(Wrapper<RencaipeiyangEntity> wrapper);
   	
   	RencaipeiyangVO selectVO(@Param("ew") Wrapper<RencaipeiyangEntity> wrapper);
   	
   	List<RencaipeiyangView> selectListView(Wrapper<RencaipeiyangEntity> wrapper);
   	
   	RencaipeiyangView selectView(@Param("ew") Wrapper<RencaipeiyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RencaipeiyangEntity> wrapper);
   	
}

