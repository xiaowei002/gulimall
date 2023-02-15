package com.xiaowei.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaowei.common.utils.PageUtils;
import com.xiaowei.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author xiaowei
 * @email xiaowei@gmail.com
 * @date 2023-02-14 16:15:22
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

