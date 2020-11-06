package com.lombardi.inheritance.repositories;


import com.lombardi.inheritance.beans.Fighter;
import javax.transaction.Transactional;

@Transactional
public interface FighterRepository extends FighterBaseRepository<Fighter>{

}
