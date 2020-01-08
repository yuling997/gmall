package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhaoyuling
 * @email zyl@atguigu.com
 * @date 2020-01-08 08:58:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
