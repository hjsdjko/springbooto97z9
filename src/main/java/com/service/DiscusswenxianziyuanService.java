package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswenxianziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswenxianziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswenxianziyuanView;


/**
 * 文献资源评论表
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
public interface DiscusswenxianziyuanService extends IService<DiscusswenxianziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswenxianziyuanVO> selectListVO(Wrapper<DiscusswenxianziyuanEntity> wrapper);
   	
   	DiscusswenxianziyuanVO selectVO(@Param("ew") Wrapper<DiscusswenxianziyuanEntity> wrapper);
   	
   	List<DiscusswenxianziyuanView> selectListView(Wrapper<DiscusswenxianziyuanEntity> wrapper);
   	
   	DiscusswenxianziyuanView selectView(@Param("ew") Wrapper<DiscusswenxianziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswenxianziyuanEntity> wrapper);
   	
}

