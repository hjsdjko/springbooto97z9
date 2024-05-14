package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhengdingmuluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhengdingmuluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhengdingmuluView;


/**
 * 征订目录
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:10
 */
public interface ZhengdingmuluService extends IService<ZhengdingmuluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhengdingmuluVO> selectListVO(Wrapper<ZhengdingmuluEntity> wrapper);
   	
   	ZhengdingmuluVO selectVO(@Param("ew") Wrapper<ZhengdingmuluEntity> wrapper);
   	
   	List<ZhengdingmuluView> selectListView(Wrapper<ZhengdingmuluEntity> wrapper);
   	
   	ZhengdingmuluView selectView(@Param("ew") Wrapper<ZhengdingmuluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhengdingmuluEntity> wrapper);
   	
}

