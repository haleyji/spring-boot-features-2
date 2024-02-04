package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;
import java.util.Properties;

@Slf4j
public class JavaSystemProperties {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
//            log.info("prop = {}:[{}]", key, properties.get(key));
        }

        String url = System.getProperty("url");
        String username = System.getProperty("username");
        String password = System.getProperty("password");

        log.info("url={}", url);
        log.info("username={}", username);
        log.info("password={}", password);

        //edit configuration 에서 입력한 VM 옵션들이 출력된다 -Dusername=test1234 이런식으로 -D를 붙여줘야함
    }
}
