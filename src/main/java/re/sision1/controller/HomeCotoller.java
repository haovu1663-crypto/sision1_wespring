package re.sision1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//trả v html
@Controller
public class HomeCotoller {

    @GetMapping("/haomilo")
    public String home(){
        return"Home";
    }
    @GetMapping("/thucute")
    public String thu(){
        return "thucute";
    }
    @GetMapping("/sum")
    public  String caculate(@RequestParam int a , @RequestParam int b, Model model){
        int s = a+b;
        model.addAttribute("s",s);
        return "Result";
    }
}
