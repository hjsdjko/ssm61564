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


import com.dao.ChanpinfuwuDao;
import com.entity.ChanpinfuwuEntity;
import com.service.ChanpinfuwuService;
import com.entity.vo.ChanpinfuwuVO;
import com.entity.view.ChanpinfuwuView;

@Service("chanpinfuwuService")
public class ChanpinfuwuServiceImpl extends ServiceImpl<ChanpinfuwuDao, ChanpinfuwuEntity> implements ChanpinfuwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpinfuwuEntity> page = this.selectPage(
                new Query<ChanpinfuwuEntity>(params).getPage(),
                new EntityWrapper<ChanpinfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpinfuwuEntity> wrapper) {
		  Page<ChanpinfuwuView> page =new Query<ChanpinfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChanpinfuwuVO> selectListVO(Wrapper<ChanpinfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChanpinfuwuVO selectVO(Wrapper<ChanpinfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChanpinfuwuView> selectListView(Wrapper<ChanpinfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpinfuwuView selectView(Wrapper<ChanpinfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
