package com.onedigitalinnovation.personapi.repositories;

import com.onedigitalinnovation.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
