package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuekeziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuekeziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuekeziyuanView;


/**
 * 学科资源
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface XuekeziyuanService extends IService<XuekeziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuekeziyuanVO> selectListVO(Wrapper<XuekeziyuanEntity> wrapper);
   	
   	XuekeziyuanVO selectVO(@Param("ew") Wrapper<XuekeziyuanEntity> wrapper);
   	
   	List<XuekeziyuanView> selectListView(Wrapper<XuekeziyuanEntity> wrapper);
   	
   	XuekeziyuanView selectView(@Param("ew") Wrapper<XuekeziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuekeziyuanEntity> wrapper);
   	
}

