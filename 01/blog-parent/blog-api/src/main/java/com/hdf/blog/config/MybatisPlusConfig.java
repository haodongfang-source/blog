package com.hdf.blog.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 告诉SpringBoot这是一个配置类 == 配置文件
@MapperScan("com.hdf.blog.dao.mapper")
public class MybatisPlusConfig {
    // 配置集成的分页插件
    @Bean // 给容器中添加组件。以方法名作为组件ID。返回类型就是组件类型，返回的值，就是组件在容器中的实例
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
