package com.xiaowei.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合mybatis-plus
 *      1.导入依赖
 *      2.配置
 *          配置数据源：
 *          数据库驱动
 *          配置mybatis-plus
 *              使用mapperscan
 *              告诉mybatis-plus，SQL映射位置
 */
@MapperScan("com.xiaowei.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
