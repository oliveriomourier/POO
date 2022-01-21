package com.example.mascotasORM.controller;

import com.example.mascotasORM.entity.Mascota;
import com.example.mascotasORM.service.IMascotaService;
import com.example.mascotasORM.service.impl.MascotaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
public class MascotaController {
    @Autowired
    IMascotaService mascotaService;

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

    @GetMapping("/precio")
    public ResponseEntity<?> filterByPrecio(@RequestParam (required = false) Integer precioMaximo, Integer precioMinimo){
        Set<Mascota> mascotas = null;

        if(precioMaximo == null){
            mascotas = mascotaService.filterByPrecioMinimo(precioMinimo);
        }
        else if(precioMinimo == null){
            mascotas = mascotaService.filterByPrecioMaximo(precioMaximo);
        }
        else{
            mascotas = mascotaService.filterByPrecio(precioMinimo, precioMaximo);
        }

        if(mascotas.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return ResponseEntity.ok(mascotas);

    };
}
