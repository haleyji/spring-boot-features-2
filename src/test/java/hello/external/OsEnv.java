package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class OsEnv {

    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        for (String key : env.keySet()) {
            log.info("env => {}:[{}]",key, env.get(key));
        }
    }

}
