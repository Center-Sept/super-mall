/**
  * Copyright 2019 bejson.com 
  */
package com.centersept.supermall.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author center-qkz
 */
@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

}