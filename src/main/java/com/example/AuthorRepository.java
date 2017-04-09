package com.example;

/**
 * Created by Евгений on 09.04.2017.
 */
//public class AuthorRepository {
//}

import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AuthorRepository extends CrudRepository<Author, Long> {

}