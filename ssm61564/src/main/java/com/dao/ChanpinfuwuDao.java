package com.dao;

import com.entity.ChanpinfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpinfuwuVO;
import com.entity.view.ChanpinfuwuView;


/**
 * 产品服务
 * 
 * @author 
 * @email 
 * @date 2022-03-17 22:18:19
 */
public interface ChanpinfuwuDao extends BaseMapper<ChanpinfuwuEntity> {
	
	List<ChanpinfuwuVO> selectListVO(@Param("ew") Wrapper<ChanpinfuwuEntity> wrapper);
	
	ChanpinfuwuVO selectVO(@Param("ew") Wrapper<ChanpinfuwuEntity> wrapper);
	
	List<ChanpinfuwuView> selectListView(@Param("ew") Wrapper<ChanpinfuwuEntity> wrapper);

	List<ChanpinfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinfuwuEntity> wrapper);
	
	ChanpinfuwuView selectView(@Param("ew") Wrapper<ChanpinfuwuEntity> wrapper);
	

}
