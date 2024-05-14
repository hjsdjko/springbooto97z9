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


import com.dao.DiscussxuekedongtaiDao;
import com.entity.DiscussxuekedongtaiEntity;
import com.service.DiscussxuekedongtaiService;
import com.entity.vo.DiscussxuekedongtaiVO;
import com.entity.view.DiscussxuekedongtaiView;

@Service("discussxuekedongtaiService")
public class DiscussxuekedongtaiServiceImpl extends ServiceImpl<DiscussxuekedongtaiDao, DiscussxuekedongtaiEntity> implements DiscussxuekedongtaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuekedongtaiEntity> page = this.selectPage(
                new Query<DiscussxuekedongtaiEntity>(params).getPage(),
                new EntityWrapper<DiscussxuekedongtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuekedongtaiEntity> wrapper) {
		  Page<DiscussxuekedongtaiView> page =new Query<DiscussxuekedongtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuekedongtaiVO> selectListVO(Wrapper<DiscussxuekedongtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuekedongtaiVO selectVO(Wrapper<DiscussxuekedongtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuekedongtaiView> selectListView(Wrapper<DiscussxuekedongtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuekedongtaiView selectView(Wrapper<DiscussxuekedongtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
