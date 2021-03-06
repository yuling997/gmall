package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhaoyuling
 * @email zyl@atguigu.com
 * @date 2020-01-08 16:26:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
