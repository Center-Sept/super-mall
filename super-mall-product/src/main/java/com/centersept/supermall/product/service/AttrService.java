package com.centersept.supermall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.centersept.supermall.common.utils.PageUtils;
import com.centersept.supermall.product.entity.AttrEntity;
import com.centersept.supermall.product.vo.AttrGroupRelationVo;
import com.centersept.supermall.product.vo.AttrRespVo;
import com.centersept.supermall.product.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author center_sept
 * @email 253079439@qq.com
 * @date 2020-07-02 22:08:41
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);
}

