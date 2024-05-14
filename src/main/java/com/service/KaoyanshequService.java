package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoyanshequEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoyanshequVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoyanshequView;


/**
 * 考研社区
 *
 * @author 
 * @email 
 * @date 2021-05-08 01:51:09
 */
public interface KaoyanshequService extends IService<KaoyanshequEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoyanshequVO> selectListVO(Wrapper<KaoyanshequEntity> wrapper);
   	
   	KaoyanshequVO selectVO(@Param("ew") Wrapper<KaoyanshequEntity> wrapper);
   	
   	List<KaoyanshequView> selectListView(Wrapper<KaoyanshequEntity> wrapper);
   	
   	KaoyanshequView selectView(@Param("ew") Wrapper<KaoyanshequEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoyanshequEntity> wrapper);
   	
}

