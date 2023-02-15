package com.xiaowei.gulimall.coupon.dao;

import com.xiaowei.gulimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author xiaowei
 * @email xiaowei@gmail.com
 * @date 2023-02-14 16:03:28
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
