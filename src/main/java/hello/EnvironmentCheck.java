package hello;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EnvironmentCheck {
    private final Environment env;

    public EnvironmentCheck(Environment env) {
        this.env = env;
    }

    @PostConstruct
    public void init() {
        String username = env.getProperty("username");
        String password = env.getProperty("password");
        String url = env.getProperty("url");
        String mode = env.getProperty("mode");

        log.info("Environment url => {}", url);
        log.info("Environment password => {}", password);
        log.info("Environment username => {}", username);
        log.info("Environment mode => {}", mode);

        //우선순위는 VM option 보다 Command Line Option 이 우선임
        //더 유연한 것이 우선권을 가지며, 범위가 좁고 디테일 한 것이 우선권을 가진다
    }
}
