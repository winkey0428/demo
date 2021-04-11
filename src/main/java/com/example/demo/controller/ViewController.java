package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * i
 */
@Controller
public class ViewController {

	@Autowired
	private UserService userService;

	public ViewController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/view")
	public String View() {
		return "view";
	}

	@RequestMapping("/hello")
    public ModelAndView Hello(){
        ModelAndView modelAndView=new ModelAndView("hello");
        modelAndView.addObject("data1","hello world");
        modelAndView.addObject("data2","data2 ok");
        modelAndView.addObject("hello","ok");
        String s="hello";

      //  userService=new UserServiceImp();
        userService.Print();
        return modelAndView;
    }
}
