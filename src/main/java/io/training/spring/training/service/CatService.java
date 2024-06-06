package io.training.spring.training.service;


import java.util.ArrayList;
import java.util.List;

import io.training.spring.training.model.Cat;
import io.training.spring.training.repository.CatRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatService {

    @Autowired
    private CatRepository catRepository;

    // GET METHODS SERVICES
    public List<Cat> getCats() {
        List<Cat> cats = new ArrayList<>();
        catRepository.findAll().forEach(cat -> {
            cats.add(cat);
        });
        return cats;
    }

    public Cat getCat(long id) {
        return catRepository.findById(id).orElse(null);
    }
    // POST METHODS SERVICES
    public void addCat(Cat cat) {
        catRepository.save(cat);
    }
    
    // PUT METHODS SERVICES
    public void updateCat(Cat cat, long id) {
      catRepository.save(cat);
    }

    // DELETE METHODS SERVICES
    public void deleteCat(long id) {
        catRepository.deleteById(id);
    }
}
