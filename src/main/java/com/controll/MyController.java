package com.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{
@RequestMapping("/")
public ModelAndView showIndex() {
	ModelAndView obj=new ModelAndView("index");
	return obj;
}
}
