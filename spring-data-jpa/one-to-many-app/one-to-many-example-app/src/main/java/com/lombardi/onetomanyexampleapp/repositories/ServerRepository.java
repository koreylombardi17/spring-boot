package com.lombardi.onetomanyexampleapp.repositories;

import com.lombardi.onetomanyexampleapp.beans.Server;
import org.springframework.data.repository.CrudRepository;

public interface ServerRepository extends CrudRepository<Server, Integer> {
}
