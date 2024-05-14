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


import com.dao.JiangoumuluDao;
import com.entity.JiangoumuluEntity;
import com.service.JiangoumuluService;
import com.entity.vo.JiangoumuluVO;
import com.entity.view.JiangoumuluView;

@Service("jiangoumuluService")
public class JiangoumuluServiceImpl extends ServiceImpl<JiangoumuluDao, JiangoumuluEntity> implements JiangoumuluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiangoumuluEntity> page = this.selectPage(
                new Query<JiangoumuluEntity>(params).getPage(),
                new EntityWrapper<JiangoumuluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiangoumuluEntity> wrapper) {
		  Page<JiangoumuluView> page =new Query<JiangoumuluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiangoumuluVO> selectListVO(Wrapper<JiangoumuluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiangoumuluVO selectVO(Wrapper<JiangoumuluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiangoumuluView> selectListView(Wrapper<JiangoumuluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiangoumuluView selectView(Wrapper<JiangoumuluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
