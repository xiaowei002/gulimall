package com.xiaowei.gulimall.product.dao;

import com.xiaowei.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author xiaowei
 * @email xiaowei@gmail.com
 * @date 2023-02-14 14:41:59
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
