package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiangoumuluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiangoumuluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiangoumuluView;


/**
 * 荐购目录
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface JiangoumuluService extends IService<JiangoumuluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiangoumuluVO> selectListVO(Wrapper<JiangoumuluEntity> wrapper);
   	
   	JiangoumuluVO selectVO(@Param("ew") Wrapper<JiangoumuluEntity> wrapper);
   	
   	List<JiangoumuluView> selectListView(Wrapper<JiangoumuluEntity> wrapper);
   	
   	JiangoumuluView selectView(@Param("ew") Wrapper<JiangoumuluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiangoumuluEntity> wrapper);
   	
}

