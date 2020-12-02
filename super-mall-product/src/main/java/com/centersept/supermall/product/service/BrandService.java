package com.centersept.supermall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.centersept.supermall.common.utils.PageUtils;
import com.centersept.supermall.product.entity.BrandEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * 品牌
 *
 * @author center_sept
 * @email 253079439@qq.com
 * @date 2020-07-02 22:08:40
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    @Transactional
    void updateDetail(BrandEntity brand);
}

