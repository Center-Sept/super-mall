package com.centersept.supermall.member.feigh;

import com.centersept.supermall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("supermall-coupon")
public interface CouponFeighService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
