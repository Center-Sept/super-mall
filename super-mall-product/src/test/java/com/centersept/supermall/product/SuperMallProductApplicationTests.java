package com.centersept.supermall.product;

import com.centersept.supermall.product.service.BrandService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SuperMallProductApplicationTests {

    @Autowired
    BrandService brandService;

//    @Autowired
//    OSSClient ossClient;

    //    @Test
//    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("测试");
//        brandEntity.setName("测试");
//        boolean b = brandService.save(brandEntity);
//        System.out.println(b);
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("修改测试");
//        b = brandService.updateById(brandEntity);
//        System.out.println(b);
//         List<BrandEntity> queryListDto = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
//        System.out.println(queryListDto.toString());
//    }

//    @Test
//   public void test() throws FileNotFoundException {
//        InputStream inputStream = new FileInputStream("C:\\Users\\qkz-admin\\Pictures" +
//                "\\ba4957ffgy1g89ginl2cwj20dw0dw75d.jpg");
//        ossClient.putObject("center-test", "ba4957ffgy1g89ginl2cwj20dw0dw75d.jpg", inputStream);
//        ossClient.shutdown();
//        System.out.println("上传完成");
//    }

}
