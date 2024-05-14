package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequziyuanView;


/**
 * 社区资源
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface ShequziyuanService extends IService<ShequziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequziyuanVO> selectListVO(Wrapper<ShequziyuanEntity> wrapper);
   	
   	ShequziyuanVO selectVO(@Param("ew") Wrapper<ShequziyuanEntity> wrapper);
   	
   	List<ShequziyuanView> selectListView(Wrapper<ShequziyuanEntity> wrapper);
   	
   	ShequziyuanView selectView(@Param("ew") Wrapper<ShequziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequziyuanEntity> wrapper);
   	
}

