package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author 王国梁
 * @date 2023/3/31 10:54
 */
@Configuration   //配置文件，替代xml配置文件
@ComponentScan(basePackages = {"service"+""})
public class SpringConfig {
}
