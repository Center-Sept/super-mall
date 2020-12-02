package com.centersept.supermall.product.dao;

import com.centersept.supermall.product.entity.AttrAttrgroupRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性&属性分组关联
 * 
 * @author center_sept
 * @email 253079439@qq.com
 * @date 2020-07-02 22:08:40
 */
@Mapper
public interface AttrAttrgroupRelationDao extends BaseMapper<AttrAttrgroupRelationEntity> {

    void deleteBatchRelation(@Param(value = "entities") List<AttrAttrgroupRelationEntity> entities);
}
