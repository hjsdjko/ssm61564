package com.dao;

import com.entity.DiscusschanpinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschanpinxinxiVO;
import com.entity.view.DiscusschanpinxinxiView;


/**
 * 产品信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-17 22:18:19
 */
public interface DiscusschanpinxinxiDao extends BaseMapper<DiscusschanpinxinxiEntity> {
	
	List<DiscusschanpinxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusschanpinxinxiEntity> wrapper);
	
	DiscusschanpinxinxiVO selectVO(@Param("ew") Wrapper<DiscusschanpinxinxiEntity> wrapper);
	
	List<DiscusschanpinxinxiView> selectListView(@Param("ew") Wrapper<DiscusschanpinxinxiEntity> wrapper);

	List<DiscusschanpinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschanpinxinxiEntity> wrapper);
	
	DiscusschanpinxinxiView selectView(@Param("ew") Wrapper<DiscusschanpinxinxiEntity> wrapper);
	

}
