package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskaoyanshequEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskaoyanshequVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskaoyanshequView;


/**
 * 考研社区评论表
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
public interface DiscusskaoyanshequService extends IService<DiscusskaoyanshequEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskaoyanshequVO> selectListVO(Wrapper<DiscusskaoyanshequEntity> wrapper);
   	
   	DiscusskaoyanshequVO selectVO(@Param("ew") Wrapper<DiscusskaoyanshequEntity> wrapper);
   	
   	List<DiscusskaoyanshequView> selectListView(Wrapper<DiscusskaoyanshequEntity> wrapper);
   	
   	DiscusskaoyanshequView selectView(@Param("ew") Wrapper<DiscusskaoyanshequEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskaoyanshequEntity> wrapper);
   	
}

