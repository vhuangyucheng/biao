package com.biao.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * @author : kooing
 * @date : 2018/4/9 - 18:31
 * @desription :
 * @update by :
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        // 定义一个convert转换消息对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        // 添加fastjosn配置信息, 比如是否格式化返回的json数据
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        // convert中添加配置
//        fastConverter.setFastJsonConfig(fastJsonConfig);
        // 添加到convert中
        converters.add(fastConverter);
    }
}