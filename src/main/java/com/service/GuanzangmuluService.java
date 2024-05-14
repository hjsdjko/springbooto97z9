package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanzangmuluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanzangmuluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanzangmuluView;


/**
 * 馆藏目录
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface GuanzangmuluService extends IService<GuanzangmuluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanzangmuluVO> selectListVO(Wrapper<GuanzangmuluEntity> wrapper);
   	
   	GuanzangmuluVO selectVO(@Param("ew") Wrapper<GuanzangmuluEntity> wrapper);
   	
   	List<GuanzangmuluView> selectListView(Wrapper<GuanzangmuluEntity> wrapper);
   	
   	GuanzangmuluView selectView(@Param("ew") Wrapper<GuanzangmuluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanzangmuluEntity> wrapper);
   	
}

