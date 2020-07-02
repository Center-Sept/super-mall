package com.centersept.supermall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.centersept.supermall.common.utils.PageUtils;
import com.centersept.supermall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author center_sept
 * @email 253079439@qq.com
 * @date 2020-07-02 22:08:41
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

