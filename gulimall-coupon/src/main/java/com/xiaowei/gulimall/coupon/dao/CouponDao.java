package com.xiaowei.gulimall.coupon.dao;

import com.xiaowei.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xiaowei
 * @email xiaowei@gmail.com
 * @date 2023-02-14 16:03:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
