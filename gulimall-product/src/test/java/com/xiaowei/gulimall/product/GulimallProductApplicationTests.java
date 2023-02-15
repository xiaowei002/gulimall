package com.xiaowei.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaowei.gulimall.product.entity.BrandEntity;
import com.xiaowei.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads(){
//        BrandEntity b = new BrandEntity();
//        b.setBrandId(6L);
//        b.setDescript("帅死了");
//        b.setName("xiaowei");
//        b.setDescript("最好了");
//        brandService.save(b);
//        System.out.println("保存成功");
//        brandService.updateById(b);
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 6L));
        list.forEach(item->{
            System.out.println(item);
        });
    }


}
