package com.centersept.supermall.coupon.dao;

import com.centersept.supermall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author center_sept
 * @email 253079439@qq.com
 * @date 2020-07-03 14:04:06
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
