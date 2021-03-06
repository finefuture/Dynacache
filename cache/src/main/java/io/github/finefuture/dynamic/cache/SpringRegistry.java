package io.github.finefuture.dynamic.cache;

import io.github.finefuture.dynamic.cache.core.CachePointcutAdvisor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Registry
 *
 * @author longqiang
 */
@Configuration
@ComponentScan(basePackageClasses = SpringRegistry.class)
public class SpringRegistry {

    @Bean
    public DefaultPointcutAdvisor cachePointcutAdvisor() {
        return new CachePointcutAdvisor();
    }

}
