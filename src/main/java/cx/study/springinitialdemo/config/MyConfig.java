package cx.study.springinitialdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath:myConfig.xml"})
public class MyConfig {
}
