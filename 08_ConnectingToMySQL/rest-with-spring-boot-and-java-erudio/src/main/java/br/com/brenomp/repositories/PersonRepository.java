package br.com.brenomp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.brenomp.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}