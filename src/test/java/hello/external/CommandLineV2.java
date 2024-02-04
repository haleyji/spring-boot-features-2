package hello.external;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

import java.util.List;
import java.util.Set;

@Slf4j
public class CommandLineV2 {
    public static void main(String[] args) {
        for (String arg : args) {
            log.info("arg => [{}]", arg);
        }

        ApplicationArguments arguments = new DefaultApplicationArguments(args);
        log.info("application Source argument => {}", List.of(arguments.getSourceArgs()));
        log.info("application Non Option argument => {}", arguments.getNonOptionArgs());
        log.info("OptionNames => {}", arguments.getOptionNames());

        Set<String> optionNames = arguments.getOptionNames();
        for (String optionName : optionNames) {
            log.info("option args => {}:{}", optionName, arguments.getOptionValues(optionName).get(0));
        }
        //edit configuration 의 program arguments 에서 -- 를 붙이고 입력하게되면 option arguments 로 읽어올 수 있음
        //value 에 [] 로 감싸져있음 -> list로 반환하기 때문 (getValues())

    }
}
