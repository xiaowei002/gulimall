package com.xiaowei.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaowei.common.utils.PageUtils;
import com.xiaowei.gulimall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xiaowei
 * @email xiaowei@gmail.com
 * @date 2023-02-14 16:27:46
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

