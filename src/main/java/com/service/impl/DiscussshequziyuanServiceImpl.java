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


import com.dao.DiscussshequziyuanDao;
import com.entity.DiscussshequziyuanEntity;
import com.service.DiscussshequziyuanService;
import com.entity.vo.DiscussshequziyuanVO;
import com.entity.view.DiscussshequziyuanView;

@Service("discussshequziyuanService")
public class DiscussshequziyuanServiceImpl extends ServiceImpl<DiscussshequziyuanDao, DiscussshequziyuanEntity> implements DiscussshequziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshequziyuanEntity> page = this.selectPage(
                new Query<DiscussshequziyuanEntity>(params).getPage(),
                new EntityWrapper<DiscussshequziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshequziyuanEntity> wrapper) {
		  Page<DiscussshequziyuanView> page =new Query<DiscussshequziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshequziyuanVO> selectListVO(Wrapper<DiscussshequziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshequziyuanVO selectVO(Wrapper<DiscussshequziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshequziyuanView> selectListView(Wrapper<DiscussshequziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshequziyuanView selectView(Wrapper<DiscussshequziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
