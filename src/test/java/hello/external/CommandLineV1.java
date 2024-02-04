package hello.external;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommandLineV1 {

    public static void main(String[] args) {
        for (String arg : args) {
            log.info("arg {}", arg);

        }

        //edit configuration 에서 program arguments 에 넣은 args 들이 띄어쓰기를 기준으로 출력된다
    }
}
