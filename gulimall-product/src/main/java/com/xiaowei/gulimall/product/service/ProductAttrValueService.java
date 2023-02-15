package com.xiaowei.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaowei.common.utils.PageUtils;
import com.xiaowei.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author xiaowei
 * @email xiaowei@gmail.com
 * @date 2023-02-14 14:41:59
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

