package com.xiaowei.gulimall.member.dao;

import com.xiaowei.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiaowei
 * @email xiaowei@gmail.com
 * @date 2023-02-14 16:15:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
