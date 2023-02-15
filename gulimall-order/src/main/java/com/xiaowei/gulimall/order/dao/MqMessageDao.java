package com.xiaowei.gulimall.order.dao;

import com.xiaowei.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author xiaowei
 * @email xiaowei@gmail.com
 * @date 2023-02-14 16:27:46
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
