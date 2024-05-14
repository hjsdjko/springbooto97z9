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


import com.dao.ShequziyuanDao;
import com.entity.ShequziyuanEntity;
import com.service.ShequziyuanService;
import com.entity.vo.ShequziyuanVO;
import com.entity.view.ShequziyuanView;

@Service("shequziyuanService")
public class ShequziyuanServiceImpl extends ServiceImpl<ShequziyuanDao, ShequziyuanEntity> implements ShequziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequziyuanEntity> page = this.selectPage(
                new Query<ShequziyuanEntity>(params).getPage(),
                new EntityWrapper<ShequziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequziyuanEntity> wrapper) {
		  Page<ShequziyuanView> page =new Query<ShequziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequziyuanVO> selectListVO(Wrapper<ShequziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequziyuanVO selectVO(Wrapper<ShequziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequziyuanView> selectListView(Wrapper<ShequziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequziyuanView selectView(Wrapper<ShequziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
