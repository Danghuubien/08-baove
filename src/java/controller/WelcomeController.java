/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author BienBien
 */
@Controller
@RequestMapping(value = "/welcome")
public class WelcomeController {
    
    @RequestMapping(value = "/welcome1")
    public String welcome(){
       
        return "jsp/welcome";
    }
  
    
}
