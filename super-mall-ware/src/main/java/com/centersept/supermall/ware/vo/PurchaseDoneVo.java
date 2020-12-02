package com.centersept.supermall.ware.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author center-qkz
 */
@Data
public class PurchaseDoneVo {

    @NotNull
    private Long id;//采购单id

    private List<PurchaseItemDoneVo> items;
}
