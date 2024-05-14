package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenxianziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenxianziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenxianziyuanView;


/**
 * 文献资源
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface WenxianziyuanService extends IService<WenxianziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenxianziyuanVO> selectListVO(Wrapper<WenxianziyuanEntity> wrapper);
   	
   	WenxianziyuanVO selectVO(@Param("ew") Wrapper<WenxianziyuanEntity> wrapper);
   	
   	List<WenxianziyuanView> selectListView(Wrapper<WenxianziyuanEntity> wrapper);
   	
   	WenxianziyuanView selectView(@Param("ew") Wrapper<WenxianziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenxianziyuanEntity> wrapper);
   	
}

