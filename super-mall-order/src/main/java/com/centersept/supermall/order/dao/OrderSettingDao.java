package com.centersept.supermall.order.dao;

import com.centersept.supermall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author center_sept
 * @email 253079439@qq.com
 * @date 2020-07-03 11:54:23
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
