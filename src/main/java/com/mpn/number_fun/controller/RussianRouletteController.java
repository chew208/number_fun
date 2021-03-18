package com.mpn.number_fun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RussianRouletteController {
    @GetMapping("chancegame")
    public String russian() {
        return "russian_roulette";
    }
}
