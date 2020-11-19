package com.centersept.supermall.supermalltts;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SuperMallTtsApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Test
    public void test() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("C:\\Users\\qkz-admin\\Pictures" +
                "\\ba4957ffgy1g89ginl2cwj20dw0dw75d.jpg");
        ossClient.putObject("center-test", "CC.jpg", inputStream);
        ossClient.shutdown();
        System.out.println("上传完成");
    }
}
