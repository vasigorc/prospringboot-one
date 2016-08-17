/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vgorcinschi.bootone.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.vgorcinschi.bootone.domain.Journal;
import com.vgorcinschi.bootone.repository.JournalRepository;

/**
 *
 * @author v_gorcin
 */
@Controller
public class JournalController {

    @Autowired
    JournalRepository journalRepository;

    @RequestMapping("/")
    public String index(Model model) {
        System.out.println("method index entered");
        model.addAttribute("journal", journalRepository.findAll());
        return "index";
    }
    
    @RequestMapping(value="/journal", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public @ResponseBody List<Journal> getJournal(){
        System.out.println("method getJournal entered");
        return journalRepository.findAll();
    }
}
