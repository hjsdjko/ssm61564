package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusschanpinxinxiEntity;
import com.entity.view.DiscusschanpinxinxiView;

import com.service.DiscusschanpinxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 产品信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-17 22:18:19
 */
@RestController
@RequestMapping("/discusschanpinxinxi")
public class DiscusschanpinxinxiController {
    @Autowired
    private DiscusschanpinxinxiService discusschanpinxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusschanpinxinxiEntity discusschanpinxinxi, 
		HttpServletRequest request){

        EntityWrapper<DiscusschanpinxinxiEntity> ew = new EntityWrapper<DiscusschanpinxinxiEntity>();
		PageUtils page = discusschanpinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschanpinxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusschanpinxinxiEntity discusschanpinxinxi, 
		HttpServletRequest request){
        EntityWrapper<DiscusschanpinxinxiEntity> ew = new EntityWrapper<DiscusschanpinxinxiEntity>();
		PageUtils page = discusschanpinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschanpinxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusschanpinxinxiEntity discusschanpinxinxi){
       	EntityWrapper<DiscusschanpinxinxiEntity> ew = new EntityWrapper<DiscusschanpinxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusschanpinxinxi, "discusschanpinxinxi")); 
        return R.ok().put("data", discusschanpinxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusschanpinxinxiEntity discusschanpinxinxi){
        EntityWrapper< DiscusschanpinxinxiEntity> ew = new EntityWrapper< DiscusschanpinxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusschanpinxinxi, "discusschanpinxinxi")); 
		DiscusschanpinxinxiView discusschanpinxinxiView =  discusschanpinxinxiService.selectView(ew);
		return R.ok("查询产品信息评论表成功").put("data", discusschanpinxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusschanpinxinxiEntity discusschanpinxinxi = discusschanpinxinxiService.selectById(id);
        return R.ok().put("data", discusschanpinxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusschanpinxinxiEntity discusschanpinxinxi = discusschanpinxinxiService.selectById(id);
        return R.ok().put("data", discusschanpinxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusschanpinxinxiEntity discusschanpinxinxi, HttpServletRequest request){
    	discusschanpinxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschanpinxinxi);

        discusschanpinxinxiService.insert(discusschanpinxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusschanpinxinxiEntity discusschanpinxinxi, HttpServletRequest request){
    	discusschanpinxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschanpinxinxi);

        discusschanpinxinxiService.insert(discusschanpinxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusschanpinxinxiEntity discusschanpinxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusschanpinxinxi);
        discusschanpinxinxiService.updateById(discusschanpinxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusschanpinxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusschanpinxinxiEntity> wrapper = new EntityWrapper<DiscusschanpinxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusschanpinxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
