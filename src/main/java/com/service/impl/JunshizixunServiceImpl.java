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


import com.dao.JunshizixunDao;
import com.entity.JunshizixunEntity;
import com.service.JunshizixunService;
import com.entity.vo.JunshizixunVO;
import com.entity.view.JunshizixunView;

@Service("junshizixunService")
public class JunshizixunServiceImpl extends ServiceImpl<JunshizixunDao, JunshizixunEntity> implements JunshizixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JunshizixunEntity> page = this.selectPage(
                new Query<JunshizixunEntity>(params).getPage(),
                new EntityWrapper<JunshizixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JunshizixunEntity> wrapper) {
		  Page<JunshizixunView> page =new Query<JunshizixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JunshizixunVO> selectListVO(Wrapper<JunshizixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JunshizixunVO selectVO(Wrapper<JunshizixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JunshizixunView> selectListView(Wrapper<JunshizixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JunshizixunView selectView(Wrapper<JunshizixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
