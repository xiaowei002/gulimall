package com.xiaowei.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaowei.common.utils.PageUtils;
import com.xiaowei.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author xiaowei
 * @email xiaowei@gmail.com
 * @date 2023-02-14 16:03:28
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

