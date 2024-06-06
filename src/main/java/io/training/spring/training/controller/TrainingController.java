package io.training.spring.training.controller;

import io.training.spring.training.model.Cat;
import io.training.spring.training.service.CatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TrainingController {

    @Autowired
    private CatService catService;

    // GET METHODS ROUTES
    @RequestMapping(method= RequestMethod.GET, value="/cats")
    public List<Cat> getCats() {
        return catService.getCats();
    }
    @RequestMapping(method= RequestMethod.GET, value="/cat/{id}")
    public Cat getCat(@PathVariable long id) {
        return catService.getCat(id);
    }


    // POST METHODS ROUTE
    @RequestMapping(method= RequestMethod.POST, value="/cats")
    public void addCate(@RequestBody Cat cat) {
        catService.addCat(cat);
    }


    //PUT METHODS ROUTE
    @RequestMapping(method= RequestMethod.PUT, value="/cat/{id}")
    public void updateCat(@RequestBody Cat cat, @PathVariable long id) {
        catService.updateCat(cat, id);
    }


    // DELETE METHODS ROUTES
    @RequestMapping(method= RequestMethod.DELETE, value="/cat/{id}")
    public void deleteCat(@PathVariable long id) {
        catService.deleteCat(id);
    }
}
