package com.centersept.supermall.product.dao;

import com.centersept.supermall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author center_sept
 * @email 253079439@qq.com
 * @date 2020-07-02 22:08:40
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
