package com.nisum.demobasedatos.Rest;

import com.nisum.demobasedatos.Model.People;
import com.nisum.demobasedatos.Service.PeopleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping ("/api/people/")
public class PeopleREST {

    @Autowired
    private PeopleService peopleService;

    //Guardar una persona
    @PostMapping
    private ResponseEntity<People> savePeople (@RequestBody People people) {
        People temporal = peopleService.create(people);

        try {
            return ResponseEntity.created(new URI("api/people"+temporal.getId())).body(temporal);
        } catch (Exception e) {
            //TODO: handle exception
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    //Retorna Listar las personas
    @GetMapping
    private ResponseEntity<List<People>> allPeople () {
        return ResponseEntity.ok(peopleService.getAllPeople());
    }

    //Eliminar
    @DeleteMapping
    private ResponseEntity<Void> deletePeople (@RequestBody People people) {
        peopleService.delete(people);
        return ResponseEntity.ok().build();
    }

    //Encontrar por id
    @GetMapping (value = "{id}")
    private ResponseEntity<Object> allPeopleById (@PathVariable("id") Long id) {
        return ResponseEntity.ok(peopleService.findById(id));
    }

}
