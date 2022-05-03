package com.nisum.demobasedatos.Service;

import com.nisum.demobasedatos.Model.People;
import com.nisum.demobasedatos.Repository.PeopleRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PeopleService {

    //propiedad para conectarme con el repositorio, autowired, dice que estoy conectada.
    @Autowired
    private PeopleRepository peopleRepository;

    //Crud
    //Crear, invocar a clase People para crear el objeto
    public People create (People people) {
        return peopleRepository.save(people);
    }

    //Método para listar a todas las personas y las retornará.
    public List<People> getAllPeople () {
        return peopleRepository.findAll();
    }

    //Método para borrar
    public void delete (People people) {
        peopleRepository.delete(people);
    }

    //Buscar por un identificador
    public Optional<People> create (Long id) {
        return peopleRepository.findById(id);
    }

    public Object findById(Long id) {
        return findById(id);
    }
}
