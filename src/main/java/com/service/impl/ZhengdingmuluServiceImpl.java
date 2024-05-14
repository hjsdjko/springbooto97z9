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


import com.dao.ZhengdingmuluDao;
import com.entity.ZhengdingmuluEntity;
import com.service.ZhengdingmuluService;
import com.entity.vo.ZhengdingmuluVO;
import com.entity.view.ZhengdingmuluView;

@Service("zhengdingmuluService")
public class ZhengdingmuluServiceImpl extends ServiceImpl<ZhengdingmuluDao, ZhengdingmuluEntity> implements ZhengdingmuluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhengdingmuluEntity> page = this.selectPage(
                new Query<ZhengdingmuluEntity>(params).getPage(),
                new EntityWrapper<ZhengdingmuluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhengdingmuluEntity> wrapper) {
		  Page<ZhengdingmuluView> page =new Query<ZhengdingmuluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhengdingmuluVO> selectListVO(Wrapper<ZhengdingmuluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhengdingmuluVO selectVO(Wrapper<ZhengdingmuluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhengdingmuluView> selectListView(Wrapper<ZhengdingmuluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhengdingmuluView selectView(Wrapper<ZhengdingmuluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
