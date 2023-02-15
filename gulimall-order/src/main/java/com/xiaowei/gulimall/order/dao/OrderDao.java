package com.xiaowei.gulimall.order.dao;

import com.xiaowei.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiaowei
 * @email xiaowei@gmail.com
 * @date 2023-02-14 16:27:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
