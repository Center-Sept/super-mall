package com.centersept.supermall.product.controller;

import com.centersept.supermall.common.utils.PageUtils;
import com.centersept.supermall.common.utils.R;
import com.centersept.supermall.product.entity.CategoryEntity;
import com.centersept.supermall.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * 商品三级分类
 *
 * @author center_sept
 * @email 253079439@qq.com
 * @date 2020-07-02 22:08:40
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = categoryService.queryPage(params);
        return R.ok().put("page", page);
    }

    /**
     * 三级菜单列表
     */
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    @ResponseBody
    public R menu() {
        List<CategoryEntity> menu = categoryService.menu();
        return R.ok().put("data", menu);
    }

    /**
     * 查出所有分类以及子分类，以树形结构组装起来
     */
    @RequestMapping("/list/tree")
    public R list() {

        List<CategoryEntity> entities = categoryService.listWithTree();


        return R.ok().put("data", entities);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category) {
        categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category) {
        categoryService.updateById(category);
        return R.ok();
    }

    /**
     * 批量更新菜单排序
     */
    @RequestMapping("/update/sort")
    public R updateSort(@RequestBody CategoryEntity[] category) {
        categoryService.updateBatchById(Arrays.asList(category));
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds) {
        categoryService.removeMenuByIds(Arrays.asList(catIds));
        return R.ok();
    }

}
