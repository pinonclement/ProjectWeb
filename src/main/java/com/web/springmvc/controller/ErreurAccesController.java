package com.web.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import javax.servlet.http.HttpServlet;  

@Controller
@RequestMapping("/erreuracces")

public class ErreurAccesController extends HttpServlet {   


    @RequestMapping(method = RequestMethod.GET)
    public String afficherErreur(final ModelMap pModel) {
        //pModel.addAttribute("personne", "Regis");
        return "erreuracces";
    }

}
