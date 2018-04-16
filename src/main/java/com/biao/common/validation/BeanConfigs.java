package com.biao.common.validation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author : kooing
 * @date : 2018/4/15 - 22:05
 * @desription :
 * @update by :
 */
@Configuration
public class BeanConfigs {

    @Bean
    public javax.validation.Validator getValidator(){
        return new LocalValidatorFactoryBean();
    }
}