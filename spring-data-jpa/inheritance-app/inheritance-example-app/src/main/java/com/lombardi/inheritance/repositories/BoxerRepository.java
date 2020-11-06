package com.lombardi.inheritance.repositories;

import com.lombardi.inheritance.beans.Boxer;
import javax.transaction.Transactional;

@Transactional
public interface BoxerRepository extends FighterBaseRepository<Boxer>{

}
