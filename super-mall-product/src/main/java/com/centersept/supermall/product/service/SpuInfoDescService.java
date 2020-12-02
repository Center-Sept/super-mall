package com.centersept.supermall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.centersept.supermall.common.utils.PageUtils;
import com.centersept.supermall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author center_sept
 * @email 253079439@qq.com
 * @date 2020-07-02 22:08:41
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfoDesc(SpuInfoDescEntity descEntity);
}

