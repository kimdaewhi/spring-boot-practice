package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
// public class Main {
//     public static void main(String[] args) {
//         //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
//         // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
//         System.out.print("Hello and welcome!");
//
//         for (int i = 1; i <= 5; i++) {
//             //TIP <shortcut actionId="Debug"/>을(를) 눌러 코드 디버그를 시작하세요. 1개의 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 중단점을 설정해 드렸습니다
//             // 언제든 <shortcut actionId="ToggleLineBreakpoint"/>을(를) 눌러 중단점을 더 추가할 수 있습니다.
//             System.out.println("i = " + i);
//         }
//     }
// }

@SpringBootApplication  // Spring BOot 애플리케이션 시작 지점
public class Main {
    public static void main(String[] args) {
        // /swagger-ui/index.html  Swagger UI 경로
        SpringApplication.run(Main.class, args);        // Spring Boot 애플리케이션 시작
    }
}


@RestController // REST API 컨트롤러 선언
@RequestMapping("/api")
class HelloController {
    @GetMapping("/hello")   // GET 요청에 대한 엔드포인트 정의
    public String hello() {
        return "Hello, Spring Boot!";
    }
}