package exbook.book.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StatusController {
    @GetMapping("lista")
    public ModelAndView status(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
