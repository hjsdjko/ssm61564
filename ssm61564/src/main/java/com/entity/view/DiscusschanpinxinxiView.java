package com.entity.view;

import com.entity.DiscusschanpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 产品信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-17 22:18:19
 */
@TableName("discusschanpinxinxi")
public class DiscusschanpinxinxiView  extends DiscusschanpinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschanpinxinxiView(){
	}
 
 	public DiscusschanpinxinxiView(DiscusschanpinxinxiEntity discusschanpinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusschanpinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
