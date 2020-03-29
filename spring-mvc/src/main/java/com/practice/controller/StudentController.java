package com.practice.controller;

import com.practice.models.Student;
import com.practice.service.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Autowired
    Result result;

    @RequestMapping("result")
    public ModelAndView findResult(Student student) {
        ModelAndView modelAndView = new ModelAndView("result.jsp");
        String studentResult = result.getResult(student.getMarks());
        modelAndView.addObject("result", studentResult);
        modelAndView.addObject("student", student);
        return modelAndView;
    }
}
