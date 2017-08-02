package edu.berliner.bookdatabase2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index(Model model)
    {
        model.addAttribute("message", "This is a message");
        return "hello";
    }
    @RequestMapping("/index")
    public @ResponseBody String welcome()
    {
        return "Welcome to the invoice app!";
    }

    @RequestMapping("/login")
    public @ResponseBody String login()
    {
        return "This is the login page";
    }

    @RequestMapping("/addproduct")
    public @ResponseBody String addProduct()
    {
        return "Add a product here";
    }

    @RequestMapping("/listproducts")
    public String listProducts(Model model2)
    {
        model2.addAttribute("message", "Dependency:spring-boot-starter-thymeleaf");
        model2.addAttribute("message1", "Dependency:spring-boot-starter-web");
        model2.addAttribute("message2", "Dependency:spring-boot-starter-test");
        return "books";
    }


}
