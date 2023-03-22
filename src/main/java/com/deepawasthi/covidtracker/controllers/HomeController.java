package com.deepawasthi.covidtracker.controllers;

import com.deepawasthi.covidtracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    CoronaVirusDataService coronaVirusDataService;
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("locationStats", coronaVirusDataService.getAllStats());
        return "home";
    }
}
