package com.web.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 
@Controller
@RequestMapping("/inscription")

public class InscriptionController extends HttpServlet {   


    @RequestMapping(method = RequestMethod.GET)
    public String afficherConnexion(final ModelMap pModel) {
        //pModel.addAttribute("personne", "Regis");
        return "inscription";
    }

}
