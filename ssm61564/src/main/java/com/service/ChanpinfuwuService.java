package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpinfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpinfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpinfuwuView;


/**
 * 产品服务
 *
 * @author 
 * @email 
 * @date 2022-03-17 22:18:19
 */
public interface ChanpinfuwuService extends IService<ChanpinfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinfuwuVO> selectListVO(Wrapper<ChanpinfuwuEntity> wrapper);
   	
   	ChanpinfuwuVO selectVO(@Param("ew") Wrapper<ChanpinfuwuEntity> wrapper);
   	
   	List<ChanpinfuwuView> selectListView(Wrapper<ChanpinfuwuEntity> wrapper);
   	
   	ChanpinfuwuView selectView(@Param("ew") Wrapper<ChanpinfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinfuwuEntity> wrapper);
   	

}

