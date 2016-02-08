package user;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import java.net.UnknownHostException;
import java.util.Collections;

import static com.mongodb.MongoCredential.createCredential;


@Configuration
@EnableWebMvc
@ComponentScan("java")
public class AppContext extends WebMvcConfigurerAdapter {

    @Bean
    public UrlBasedViewResolver urlBasedViewResolver(){
        UrlBasedViewResolver r = new UrlBasedViewResolver();
        r.setViewClass(JstlView.class);
        r.setPrefix("/jsp/");
        r.setSuffix(".jsp");
        return r;
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws UnknownHostException {
       MongoCredential credential = createCredential("admin","user","admin".toCharArray());
        MongoClient c = new MongoClient(new ServerAddress("ds053794.mongolab.com",53794), Collections.singletonList(credential));
        return new MongoTemplate(new SimpleMongoDbFactory(c, "user"));
    }

}
