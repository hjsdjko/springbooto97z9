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


import com.dao.XuekeziyuanDao;
import com.entity.XuekeziyuanEntity;
import com.service.XuekeziyuanService;
import com.entity.vo.XuekeziyuanVO;
import com.entity.view.XuekeziyuanView;

@Service("xuekeziyuanService")
public class XuekeziyuanServiceImpl extends ServiceImpl<XuekeziyuanDao, XuekeziyuanEntity> implements XuekeziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuekeziyuanEntity> page = this.selectPage(
                new Query<XuekeziyuanEntity>(params).getPage(),
                new EntityWrapper<XuekeziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuekeziyuanEntity> wrapper) {
		  Page<XuekeziyuanView> page =new Query<XuekeziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuekeziyuanVO> selectListVO(Wrapper<XuekeziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuekeziyuanVO selectVO(Wrapper<XuekeziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuekeziyuanView> selectListView(Wrapper<XuekeziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuekeziyuanView selectView(Wrapper<XuekeziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
