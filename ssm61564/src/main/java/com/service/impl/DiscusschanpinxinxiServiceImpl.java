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


import com.dao.DiscusschanpinxinxiDao;
import com.entity.DiscusschanpinxinxiEntity;
import com.service.DiscusschanpinxinxiService;
import com.entity.vo.DiscusschanpinxinxiVO;
import com.entity.view.DiscusschanpinxinxiView;

@Service("discusschanpinxinxiService")
public class DiscusschanpinxinxiServiceImpl extends ServiceImpl<DiscusschanpinxinxiDao, DiscusschanpinxinxiEntity> implements DiscusschanpinxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschanpinxinxiEntity> page = this.selectPage(
                new Query<DiscusschanpinxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusschanpinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschanpinxinxiEntity> wrapper) {
		  Page<DiscusschanpinxinxiView> page =new Query<DiscusschanpinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschanpinxinxiVO> selectListVO(Wrapper<DiscusschanpinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschanpinxinxiVO selectVO(Wrapper<DiscusschanpinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschanpinxinxiView> selectListView(Wrapper<DiscusschanpinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschanpinxinxiView selectView(Wrapper<DiscusschanpinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
