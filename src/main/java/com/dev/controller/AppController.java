package com.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

   @RequestMapping("/")
   public String index() {
      return "index";
   }

   @PostMapping("/message")
   public String testMessage(@RequestParam("message") String message, Model model) {
      model.addAttribute("message", message);
      return "message";
   }
}
