package com.its.ex.cotroller;

import com.its.ex.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class TestController {
    // TestController는 TestService 호출
    // TestService는 TestRepository 호출
    // 의존관계를 만들어주세요. (생성자 주입을 이용)
    private final TestService testService;

}
