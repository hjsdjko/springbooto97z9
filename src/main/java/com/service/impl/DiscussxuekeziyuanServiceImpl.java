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


import com.dao.DiscussxuekeziyuanDao;
import com.entity.DiscussxuekeziyuanEntity;
import com.service.DiscussxuekeziyuanService;
import com.entity.vo.DiscussxuekeziyuanVO;
import com.entity.view.DiscussxuekeziyuanView;

@Service("discussxuekeziyuanService")
public class DiscussxuekeziyuanServiceImpl extends ServiceImpl<DiscussxuekeziyuanDao, DiscussxuekeziyuanEntity> implements DiscussxuekeziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuekeziyuanEntity> page = this.selectPage(
                new Query<DiscussxuekeziyuanEntity>(params).getPage(),
                new EntityWrapper<DiscussxuekeziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuekeziyuanEntity> wrapper) {
		  Page<DiscussxuekeziyuanView> page =new Query<DiscussxuekeziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuekeziyuanVO> selectListVO(Wrapper<DiscussxuekeziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuekeziyuanVO selectVO(Wrapper<DiscussxuekeziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuekeziyuanView> selectListView(Wrapper<DiscussxuekeziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuekeziyuanView selectView(Wrapper<DiscussxuekeziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
