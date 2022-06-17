package top.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.blog.common.config.BlogConfig;

@SpringBootApplication
public class BlogProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogProjectApplication.class, args);
        printKeyLoadMessage();
    }

    /**
     * 获取Key加载信息
     */
    public static void printKeyLoadMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("\r\n======================================================================\r\n");
        sb.append("\r\n    欢迎使用 " + BlogConfig.getName() + "  - Powered By https://www.blog.top\r\n");
        sb.append("\r\n======================================================================\r\n");
        System.out.println(sb);
    }

}
