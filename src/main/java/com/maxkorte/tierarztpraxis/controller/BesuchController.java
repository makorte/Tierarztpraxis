package com.maxkorte.tierarztpraxis.controller;

import com.maxkorte.tierarztpraxis.repositories.BesuchRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/besuche")
public class BesuchController {
    private final BesuchRepository br;

    public BesuchController(BesuchRepository br) {
        this.br = br;
    }

    @GetMapping({"/", ""})
    public String index(Model model) {
        model.addAttribute("besuche", br.findAll());
        return "/besuch/index";
    }
}
