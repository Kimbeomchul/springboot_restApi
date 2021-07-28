package com.miaps.repository;

import com.miaps.entity.person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personRepository extends JpaRepository<person, Integer> {
}
