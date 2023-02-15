package com.xiaowei.gulimall.ware.dao;

import com.xiaowei.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author xiaowei
 * @email xiaowei@gmail.com
 * @date 2023-02-14 16:32:48
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
