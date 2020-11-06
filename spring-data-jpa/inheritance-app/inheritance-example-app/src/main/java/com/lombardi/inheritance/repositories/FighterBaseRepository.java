package com.lombardi.inheritance.repositories;

import com.lombardi.inheritance.beans.Fighter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface FighterBaseRepository <T extends Fighter> extends CrudRepository<T, Integer> {

}
