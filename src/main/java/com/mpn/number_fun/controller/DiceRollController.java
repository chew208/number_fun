package com.mpn.number_fun.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DiceRollController {
    @GetMapping()
    public String roller() {
        return "dice_roll";
    }
}
