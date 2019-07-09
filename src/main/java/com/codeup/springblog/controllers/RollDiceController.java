package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RollDiceController {

    @GetMapping(path = "/roll-dice")
    public String rollDice() {
        return "dice/dice-roll";
    }

    @GetMapping("/roll-dice/{guess}")
    public String guessNumber(@PathVariable long guess, Model model) {
        int random = getRandInt();
        model.addAttribute("roll", random);
        model.addAttribute("guess", guess);
        model.addAttribute("result", random == guess);
        return "dice/dice-results";
    }

    public int getRandInt() {
        double randomDouble = Math.random();
        randomDouble = randomDouble * 6 + 1;
        int randomInt = (int) randomDouble;
        return randomInt;
    }
}
