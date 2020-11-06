package com.lombardi.inheritance.repositories;

import com.lombardi.inheritance.beans.Wrestler;
import javax.transaction.Transactional;

@Transactional
public interface WrestlerRepository extends FighterBaseRepository<Wrestler>{

}
