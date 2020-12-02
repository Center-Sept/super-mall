package com.centersept.supermall.ware.vo;

import lombok.Data;

/**
 * @author center-qkz
 */
@Data
public class PurchaseItemDoneVo {
    //{itemId:1,status:4,reason:""}
    private Long itemId;
    private Integer status;
    private String reason;
}
