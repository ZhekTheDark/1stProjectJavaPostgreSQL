package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Евгений on 09.04.2017.
 */
@Controller
@RequestMapping(path = "/authors")
public class MainController {
    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping(path = "/all")
    @ResponseBody
    public Iterable<Author> getAllUsers() {
        return authorRepository.findAll();
    }
}
