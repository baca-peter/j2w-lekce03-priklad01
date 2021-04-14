package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class CardController {

    private final Person PERSON;
    private final Address ADDRESS;

    public CardController() {
        LocalDate date = LocalDate.of(1960, 12, 18);

        PERSON = new Person("Brad", "Pitt", date);
        ADDRESS = new Address("Ceska 1", "Brno", "60200");
    }

    @GetMapping("/")
    public ModelAndView card(){
        ModelAndView result = new ModelAndView("card");
        result.addObject("person", PERSON);
        result.addObject("address", ADDRESS);

        return result;
    }
}
