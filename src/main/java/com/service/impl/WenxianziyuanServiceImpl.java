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


import com.dao.WenxianziyuanDao;
import com.entity.WenxianziyuanEntity;
import com.service.WenxianziyuanService;
import com.entity.vo.WenxianziyuanVO;
import com.entity.view.WenxianziyuanView;

@Service("wenxianziyuanService")
public class WenxianziyuanServiceImpl extends ServiceImpl<WenxianziyuanDao, WenxianziyuanEntity> implements WenxianziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenxianziyuanEntity> page = this.selectPage(
                new Query<WenxianziyuanEntity>(params).getPage(),
                new EntityWrapper<WenxianziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenxianziyuanEntity> wrapper) {
		  Page<WenxianziyuanView> page =new Query<WenxianziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenxianziyuanVO> selectListVO(Wrapper<WenxianziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenxianziyuanVO selectVO(Wrapper<WenxianziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenxianziyuanView> selectListView(Wrapper<WenxianziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenxianziyuanView selectView(Wrapper<WenxianziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
