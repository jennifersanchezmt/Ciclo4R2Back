/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2_Ciclo4.Reto2.repositorio;

import Reto2_Ciclo4.Reto2.interfaces.InterfaceAccesory;
import Reto2_Ciclo4.Reto2.modelo.Accesory;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jeffe
 */
@Repository
public class AccesoryRepositorio {
    @Autowired
    private InterfaceAccesory repository;

    public List<Accesory> getAll() {
        return repository.findAll();
    }

    public Optional<Accesory> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Accesory create(Accesory clothe) {
        return repository.save(clothe);
    }

    public void update(Accesory clothe) {
        repository.save(clothe);
    }
    
    public void delete(Accesory clothe) {
        repository.delete(clothe);
    }
}

