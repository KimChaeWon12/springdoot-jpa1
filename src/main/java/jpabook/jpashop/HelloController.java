package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") //hello라는 url이 오면 이 컨트롤러 호출(localhoet:8080/hello)
    public String hello(Model model) { //springUI에 있는 model이란 어떤 데이터를 실어서 view에 넘길 수 있다(컨트롤러에서 데이터를 view로)
        model.addAttribute("data", "hello!!!"); //model에 값을 담음
        return "hello"; //화면 이름
    }
}
