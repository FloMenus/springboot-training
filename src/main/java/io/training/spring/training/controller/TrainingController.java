package io.training.spring.training.controller;

import io.training.spring.training.model.Cat;
import io.training.spring.training.model.Cat.FurLength;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController {

    @RequestMapping("/cat")
    public Cat getCat() {
        Cat myCat = new Cat("Felix", 6, "Very cute but a bit silly", "Salmon", FurLength.MEDIUM, Cat.FurColor.GREY, Cat.Gender.MALE);
        return myCat;
    }
}
