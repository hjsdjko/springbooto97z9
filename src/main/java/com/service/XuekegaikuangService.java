package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuekegaikuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuekegaikuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuekegaikuangView;


/**
 * 学科概况
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface XuekegaikuangService extends IService<XuekegaikuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuekegaikuangVO> selectListVO(Wrapper<XuekegaikuangEntity> wrapper);
   	
   	XuekegaikuangVO selectVO(@Param("ew") Wrapper<XuekegaikuangEntity> wrapper);
   	
   	List<XuekegaikuangView> selectListView(Wrapper<XuekegaikuangEntity> wrapper);
   	
   	XuekegaikuangView selectView(@Param("ew") Wrapper<XuekegaikuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuekegaikuangEntity> wrapper);
   	
}

