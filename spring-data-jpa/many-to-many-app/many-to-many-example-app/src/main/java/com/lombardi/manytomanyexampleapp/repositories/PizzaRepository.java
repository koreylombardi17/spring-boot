package com.lombardi.manytomanyexampleapp.repositories;

import com.lombardi.manytomanyexampleapp.beans.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends CrudRepository<Pizza, Integer> {
}
