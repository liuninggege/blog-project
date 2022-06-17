package top.blog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Description:
 *
 * @author liuning
 * @date: 2022/2/22
 */
@Configuration
@EnableTransactionManagement
@MapperScan("top.blog.**.mapper")
public class MybatisPlusConfig {

}