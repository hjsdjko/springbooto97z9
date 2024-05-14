package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshequziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshequziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshequziyuanView;


/**
 * 社区资源评论表
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
public interface DiscussshequziyuanService extends IService<DiscussshequziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshequziyuanVO> selectListVO(Wrapper<DiscussshequziyuanEntity> wrapper);
   	
   	DiscussshequziyuanVO selectVO(@Param("ew") Wrapper<DiscussshequziyuanEntity> wrapper);
   	
   	List<DiscussshequziyuanView> selectListView(Wrapper<DiscussshequziyuanEntity> wrapper);
   	
   	DiscussshequziyuanView selectView(@Param("ew") Wrapper<DiscussshequziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshequziyuanEntity> wrapper);
   	
}

