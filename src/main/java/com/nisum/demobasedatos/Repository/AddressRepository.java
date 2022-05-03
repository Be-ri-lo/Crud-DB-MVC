package com.nisum.demobasedatos.Repository;

import com.nisum.demobasedatos.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
