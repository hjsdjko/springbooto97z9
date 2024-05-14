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


import com.dao.KaoyanshequDao;
import com.entity.KaoyanshequEntity;
import com.service.KaoyanshequService;
import com.entity.vo.KaoyanshequVO;
import com.entity.view.KaoyanshequView;

@Service("kaoyanshequService")
public class KaoyanshequServiceImpl extends ServiceImpl<KaoyanshequDao, KaoyanshequEntity> implements KaoyanshequService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoyanshequEntity> page = this.selectPage(
                new Query<KaoyanshequEntity>(params).getPage(),
                new EntityWrapper<KaoyanshequEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoyanshequEntity> wrapper) {
		  Page<KaoyanshequView> page =new Query<KaoyanshequView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoyanshequVO> selectListVO(Wrapper<KaoyanshequEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoyanshequVO selectVO(Wrapper<KaoyanshequEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoyanshequView> selectListView(Wrapper<KaoyanshequEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoyanshequView selectView(Wrapper<KaoyanshequEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
