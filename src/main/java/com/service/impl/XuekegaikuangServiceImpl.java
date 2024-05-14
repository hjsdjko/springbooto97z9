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


import com.dao.XuekegaikuangDao;
import com.entity.XuekegaikuangEntity;
import com.service.XuekegaikuangService;
import com.entity.vo.XuekegaikuangVO;
import com.entity.view.XuekegaikuangView;

@Service("xuekegaikuangService")
public class XuekegaikuangServiceImpl extends ServiceImpl<XuekegaikuangDao, XuekegaikuangEntity> implements XuekegaikuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuekegaikuangEntity> page = this.selectPage(
                new Query<XuekegaikuangEntity>(params).getPage(),
                new EntityWrapper<XuekegaikuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuekegaikuangEntity> wrapper) {
		  Page<XuekegaikuangView> page =new Query<XuekegaikuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuekegaikuangVO> selectListVO(Wrapper<XuekegaikuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuekegaikuangVO selectVO(Wrapper<XuekegaikuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuekegaikuangView> selectListView(Wrapper<XuekegaikuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuekegaikuangView selectView(Wrapper<XuekegaikuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
