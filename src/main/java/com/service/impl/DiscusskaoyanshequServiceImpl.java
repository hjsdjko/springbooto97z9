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


import com.dao.DiscusskaoyanshequDao;
import com.entity.DiscusskaoyanshequEntity;
import com.service.DiscusskaoyanshequService;
import com.entity.vo.DiscusskaoyanshequVO;
import com.entity.view.DiscusskaoyanshequView;

@Service("discusskaoyanshequService")
public class DiscusskaoyanshequServiceImpl extends ServiceImpl<DiscusskaoyanshequDao, DiscusskaoyanshequEntity> implements DiscusskaoyanshequService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskaoyanshequEntity> page = this.selectPage(
                new Query<DiscusskaoyanshequEntity>(params).getPage(),
                new EntityWrapper<DiscusskaoyanshequEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskaoyanshequEntity> wrapper) {
		  Page<DiscusskaoyanshequView> page =new Query<DiscusskaoyanshequView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskaoyanshequVO> selectListVO(Wrapper<DiscusskaoyanshequEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskaoyanshequVO selectVO(Wrapper<DiscusskaoyanshequEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskaoyanshequView> selectListView(Wrapper<DiscusskaoyanshequEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskaoyanshequView selectView(Wrapper<DiscusskaoyanshequEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
