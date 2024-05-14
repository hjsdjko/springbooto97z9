package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GuanzangmuluDao;
import com.entity.GuanzangmuluEntity;
import com.service.GuanzangmuluService;
import com.entity.vo.GuanzangmuluVO;
import com.entity.view.GuanzangmuluView;

@Service("guanzangmuluService")
public class GuanzangmuluServiceImpl extends ServiceImpl<GuanzangmuluDao, GuanzangmuluEntity> implements GuanzangmuluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanzangmuluEntity> page = this.selectPage(
                new Query<GuanzangmuluEntity>(params).getPage(),
                new EntityWrapper<GuanzangmuluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanzangmuluEntity> wrapper) {
		  Page<GuanzangmuluView> page =new Query<GuanzangmuluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanzangmuluVO> selectListVO(Wrapper<GuanzangmuluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanzangmuluVO selectVO(Wrapper<GuanzangmuluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanzangmuluView> selectListView(Wrapper<GuanzangmuluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanzangmuluView selectView(Wrapper<GuanzangmuluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
