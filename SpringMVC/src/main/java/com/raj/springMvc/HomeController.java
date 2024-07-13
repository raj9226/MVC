package com.raj.springMvc;

import com.raj.springMvc.Model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String getCourse(){
        return "Java";
    }

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int a, @RequestParam("num2") int b, ModelAndView mv){
//        int a=Integer.parseInt(req.getParameter("num1") );
//        int b=Integer.parseInt(req.getParameter("num2") );
        int result=a+b;
//        ses.setAttribute("result",result);
        mv.addObject("result",result);
        mv.setViewName("result");
        return mv;

    }

    @RequestMapping("addAlien")
    public String addAlien(Alien alien){
        return "result";

    }


}
