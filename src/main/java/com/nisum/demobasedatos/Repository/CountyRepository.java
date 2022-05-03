package com.nisum.demobasedatos.Repository;

import com.nisum.demobasedatos.Model.County;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountyRepository extends JpaRepository<County, Long> {
}
