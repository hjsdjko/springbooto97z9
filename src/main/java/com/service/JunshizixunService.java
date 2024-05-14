package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JunshizixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JunshizixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JunshizixunView;


/**
 * 军事资讯
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface JunshizixunService extends IService<JunshizixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JunshizixunVO> selectListVO(Wrapper<JunshizixunEntity> wrapper);
   	
   	JunshizixunVO selectVO(@Param("ew") Wrapper<JunshizixunEntity> wrapper);
   	
   	List<JunshizixunView> selectListView(Wrapper<JunshizixunEntity> wrapper);
   	
   	JunshizixunView selectView(@Param("ew") Wrapper<JunshizixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JunshizixunEntity> wrapper);
   	
}

