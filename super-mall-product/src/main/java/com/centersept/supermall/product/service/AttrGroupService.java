package com.centersept.supermall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.centersept.supermall.common.utils.PageUtils;
import com.centersept.supermall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author center_sept
 * @email 253079439@qq.com
 * @date 2020-07-02 22:08:40
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
