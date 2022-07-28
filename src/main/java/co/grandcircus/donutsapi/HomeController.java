package co.grandcircus.donutsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    DonutService donutService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    // @RequestMapping("/")
    // public String index(Model model){
    //     DonutResponse response = donutService.getDonutResponse();
    //     model.addAttribute("response", response);
    //     System.out.println("IM HERE");
    //     return "index";
    // }
}
