package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
public class CardController {

    private final Random random;
    private final List<String> listOfNames;

    public CardController() {
        random = new Random();
        listOfNames = new ArrayList<>();
    }

    @GetMapping("/")
    public ModelAndView card() {
        getRandomNames();
        LocalDate randomDate = new java.sql.Date(getRandomDate().getTime()).toLocalDate();
        String randomName = listOfNames.get(random.nextInt(listOfNames.size()));
        Person person = new Person(randomName.split(" ")[0], randomName.split(" ")[1], randomDate);
        Address address = new Address("Ceska 1", "Brno", "60200");
        ModelAndView result = new ModelAndView("card");
        result.addObject("person", person);
        result.addObject("address", address);

        return result;
    }

    public void getRandomNames() {
        try {
            // Here we create a document object and use JSoup to fetch the website
            Document doc = Jsoup.connect("https://www.name-generator.org.uk/quick/").get();

            // Get the list of repositories
            Elements repositories = doc.getElementsByClass("name_heading");

            for (Element repository : repositories) {
                listOfNames.add(repository.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Date getRandomDate() {
        long milliseconds = -946771200000L + (Math.abs(random.nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000));
        return new Date(milliseconds);
    }

}
