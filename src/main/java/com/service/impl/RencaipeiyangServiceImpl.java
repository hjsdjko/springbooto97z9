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


import com.dao.RencaipeiyangDao;
import com.entity.RencaipeiyangEntity;
import com.service.RencaipeiyangService;
import com.entity.vo.RencaipeiyangVO;
import com.entity.view.RencaipeiyangView;

@Service("rencaipeiyangService")
public class RencaipeiyangServiceImpl extends ServiceImpl<RencaipeiyangDao, RencaipeiyangEntity> implements RencaipeiyangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RencaipeiyangEntity> page = this.selectPage(
                new Query<RencaipeiyangEntity>(params).getPage(),
                new EntityWrapper<RencaipeiyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RencaipeiyangEntity> wrapper) {
		  Page<RencaipeiyangView> page =new Query<RencaipeiyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RencaipeiyangVO> selectListVO(Wrapper<RencaipeiyangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RencaipeiyangVO selectVO(Wrapper<RencaipeiyangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RencaipeiyangView> selectListView(Wrapper<RencaipeiyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RencaipeiyangView selectView(Wrapper<RencaipeiyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
