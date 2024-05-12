package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschanpinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschanpinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschanpinxinxiView;


/**
 * 产品信息评论表
 *
 * @author 
 * @email 
 * @date 2022-03-17 22:18:19
 */
public interface DiscusschanpinxinxiService extends IService<DiscusschanpinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschanpinxinxiVO> selectListVO(Wrapper<DiscusschanpinxinxiEntity> wrapper);
   	
   	DiscusschanpinxinxiVO selectVO(@Param("ew") Wrapper<DiscusschanpinxinxiEntity> wrapper);
   	
   	List<DiscusschanpinxinxiView> selectListView(Wrapper<DiscusschanpinxinxiEntity> wrapper);
   	
   	DiscusschanpinxinxiView selectView(@Param("ew") Wrapper<DiscusschanpinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschanpinxinxiEntity> wrapper);
   	

}

