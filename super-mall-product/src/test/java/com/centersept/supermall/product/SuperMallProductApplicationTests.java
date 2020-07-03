package com.centersept.supermall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.centersept.supermall.product.entity.BrandEntity;
import com.centersept.supermall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SuperMallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("测试");
        brandEntity.setName("测试");
        boolean b = brandService.save(brandEntity);
        System.out.println(b);
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("修改测试");
        b = brandService.updateById(brandEntity);
        System.out.println(b);
         List<BrandEntity> queryListDto = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
        System.out.println(queryListDto.toString());
    }


}
