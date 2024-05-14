package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuekedongtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuekedongtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuekedongtaiView;


/**
 * 学科动态评论表
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
public interface DiscussxuekedongtaiService extends IService<DiscussxuekedongtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuekedongtaiVO> selectListVO(Wrapper<DiscussxuekedongtaiEntity> wrapper);
   	
   	DiscussxuekedongtaiVO selectVO(@Param("ew") Wrapper<DiscussxuekedongtaiEntity> wrapper);
   	
   	List<DiscussxuekedongtaiView> selectListView(Wrapper<DiscussxuekedongtaiEntity> wrapper);
   	
   	DiscussxuekedongtaiView selectView(@Param("ew") Wrapper<DiscussxuekedongtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuekedongtaiEntity> wrapper);
   	
}

