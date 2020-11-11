package com.lombardi.manytomanyexampleapp.repositories;

import com.lombardi.manytomanyexampleapp.beans.Topping;
import org.springframework.data.repository.CrudRepository;


public interface ToppingRepository extends CrudRepository<Topping, Integer> {


}
