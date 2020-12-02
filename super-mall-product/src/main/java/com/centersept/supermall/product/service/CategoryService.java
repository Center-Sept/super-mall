package com.centersept.supermall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.centersept.supermall.common.utils.PageUtils;
import com.centersept.supermall.product.entity.CategoryEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author center_sept
 * @email 253079439@qq.com
 * @date 2020-07-02 22:08:40
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    List<CategoryEntity> menu();

    void removeMenuByIds(List<Long> ids);

    Long[] findCatelogPath(Long catelogId);

    @Transactional
    void updateCascade(CategoryEntity category);
}

