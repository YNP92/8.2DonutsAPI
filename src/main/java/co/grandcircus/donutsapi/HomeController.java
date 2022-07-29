package co.grandcircus.donutsapi;

import java.security.DrbgParameters.Reseed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    DonutService donutService;


    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("response", donutService.getDonutResponse());
        // System.out.println(response.getCount());
        return "index";
    }

    @RequestMapping("/details")
    public String showDetails(@RequestParam Integer id, Model model) {
        model.addAttribute("response", donutService.getDonutbyID(id));
        return "details";
    }
}
