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


import com.dao.XuekedongtaiDao;
import com.entity.XuekedongtaiEntity;
import com.service.XuekedongtaiService;
import com.entity.vo.XuekedongtaiVO;
import com.entity.view.XuekedongtaiView;

@Service("xuekedongtaiService")
public class XuekedongtaiServiceImpl extends ServiceImpl<XuekedongtaiDao, XuekedongtaiEntity> implements XuekedongtaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuekedongtaiEntity> page = this.selectPage(
                new Query<XuekedongtaiEntity>(params).getPage(),
                new EntityWrapper<XuekedongtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuekedongtaiEntity> wrapper) {
		  Page<XuekedongtaiView> page =new Query<XuekedongtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuekedongtaiVO> selectListVO(Wrapper<XuekedongtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuekedongtaiVO selectVO(Wrapper<XuekedongtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuekedongtaiView> selectListView(Wrapper<XuekedongtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuekedongtaiView selectView(Wrapper<XuekedongtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
