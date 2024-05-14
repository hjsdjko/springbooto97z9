package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuekedongtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuekedongtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuekedongtaiView;


/**
 * 学科动态
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface XuekedongtaiService extends IService<XuekedongtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuekedongtaiVO> selectListVO(Wrapper<XuekedongtaiEntity> wrapper);
   	
   	XuekedongtaiVO selectVO(@Param("ew") Wrapper<XuekedongtaiEntity> wrapper);
   	
   	List<XuekedongtaiView> selectListView(Wrapper<XuekedongtaiEntity> wrapper);
   	
   	XuekedongtaiView selectView(@Param("ew") Wrapper<XuekedongtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuekedongtaiEntity> wrapper);
   	
}

