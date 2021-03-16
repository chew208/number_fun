package com.mpn.number_fun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DiceRollController {
    @GetMapping("diceroll")
    public String roller() {
        return "dice_roll";
    }
}
