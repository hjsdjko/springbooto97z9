package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuekeziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuekeziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuekeziyuanView;


/**
 * 学科资源评论表
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
public interface DiscussxuekeziyuanService extends IService<DiscussxuekeziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuekeziyuanVO> selectListVO(Wrapper<DiscussxuekeziyuanEntity> wrapper);
   	
   	DiscussxuekeziyuanVO selectVO(@Param("ew") Wrapper<DiscussxuekeziyuanEntity> wrapper);
   	
   	List<DiscussxuekeziyuanView> selectListView(Wrapper<DiscussxuekeziyuanEntity> wrapper);
   	
   	DiscussxuekeziyuanView selectView(@Param("ew") Wrapper<DiscussxuekeziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuekeziyuanEntity> wrapper);
   	
}

