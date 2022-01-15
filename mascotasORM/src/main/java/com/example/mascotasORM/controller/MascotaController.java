package com.example.mascotasORM.controller;

import com.example.mascotasORM.entity.Mascota;
import com.example.mascotasORM.service.impl.MascotaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MascotaController {
    @Autowired
    MascotaImpl mascotaService;

    @PostMapping("/")
    public Mascota guardar(@RequestBody Mascota mascota){
        return mascotaService.guardar(mascota);
    }

    @GetMapping("{id}")
    public Optional<Mascota> buscar(@PathVariable Integer id){
        return mascotaService.buscar(id);
    }

    @GetMapping("/")
    public List<Mascota> listarTodo(){
        return mascotaService.listarTodo();
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Integer id){
        return mascotaService.eliminar(id);
    }

    @PutMapping("/")
    public String modificar(@RequestBody Mascota mascota){
        return mascotaService.modificar(mascota);
    }
}
