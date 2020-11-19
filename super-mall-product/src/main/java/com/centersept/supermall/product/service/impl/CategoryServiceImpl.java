package com.centersept.supermall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.centersept.supermall.common.utils.PageUtils;
import com.centersept.supermall.common.utils.Query;
import com.centersept.supermall.product.dao.CategoryDao;
import com.centersept.supermall.product.entity.CategoryEntity;
import com.centersept.supermall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> menu() {
        List<CategoryEntity> allList = baseMapper.selectList(null);
        // 找到所有的一级分类
        List<CategoryEntity> level1Nenus = allList.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0
        ).map((item) -> {
            item.setChildren(getChildren(item, allList));
            return item;
        }).sorted((item1, item2) -> {
            return (item1.getSort() == null ? 0 : item1.getSort()) - (item2.getSort() == null ? 0 : item2.getSort());
        }).collect(Collectors.toList());
        return level1Nenus;
    }

    @Override
    public void removeMenuByIds(List<Long> ids) {
        // TODO 需要做引用校验
        baseMapper.deleteBatchIds(ids);
    }

    private List<CategoryEntity> getChildren(CategoryEntity currentItem, List<CategoryEntity> allList) {
        List<CategoryEntity> collect = allList.stream().filter((item) -> {
            return item.getParentCid().equals(currentItem.getCatId());
        }).map((item) -> {
            item.setChildren(getChildren(item, allList));
            return item;
        }).sorted((item1, item2) -> {
            return (item1.getSort() == null ? 0 : item1.getSort()) - (item2.getSort() == null ? 0 : item2.getSort());
        }).collect(Collectors.toList());
        return collect;
    }

}