package com.nisum.demobasedatos.Repository;

import com.nisum.demobasedatos.Model.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {
}
