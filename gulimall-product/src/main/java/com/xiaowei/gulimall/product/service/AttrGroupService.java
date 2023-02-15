package com.xiaowei.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaowei.common.utils.PageUtils;
import com.xiaowei.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author xiaowei
 * @email xiaowei@gmail.com
 * @date 2023-02-14 14:41:59
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

