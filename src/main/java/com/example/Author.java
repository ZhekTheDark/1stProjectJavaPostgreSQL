package com.example;

/**
 * Created by Евгений on 09.04.2017.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String name;

}

