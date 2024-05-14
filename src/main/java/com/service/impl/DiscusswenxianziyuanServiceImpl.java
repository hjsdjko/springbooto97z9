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


import com.dao.DiscusswenxianziyuanDao;
import com.entity.DiscusswenxianziyuanEntity;
import com.service.DiscusswenxianziyuanService;
import com.entity.vo.DiscusswenxianziyuanVO;
import com.entity.view.DiscusswenxianziyuanView;

@Service("discusswenxianziyuanService")
public class DiscusswenxianziyuanServiceImpl extends ServiceImpl<DiscusswenxianziyuanDao, DiscusswenxianziyuanEntity> implements DiscusswenxianziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswenxianziyuanEntity> page = this.selectPage(
                new Query<DiscusswenxianziyuanEntity>(params).getPage(),
                new EntityWrapper<DiscusswenxianziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswenxianziyuanEntity> wrapper) {
		  Page<DiscusswenxianziyuanView> page =new Query<DiscusswenxianziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswenxianziyuanVO> selectListVO(Wrapper<DiscusswenxianziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswenxianziyuanVO selectVO(Wrapper<DiscusswenxianziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswenxianziyuanView> selectListView(Wrapper<DiscusswenxianziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswenxianziyuanView selectView(Wrapper<DiscusswenxianziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
