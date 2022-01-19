package com.example.mascotasORM.service.impl;

import com.example.mascotasORM.entity.Mascota;
import com.example.mascotasORM.repository.IMascotaRepository;
import com.example.mascotasORM.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class MascotaImpl implements IMascotaService {
    @Autowired
    IMascotaRepository mascotaRepository;

    @Override
    public Mascota guardar(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public String eliminar(Integer id) {
        if(mascotaRepository.findById(id).isPresent()){
            mascotaRepository.deleteById(id);
            return "La mascota con id:" + id + " fue eliminada";
        }
        return "La mascota con id:" + id + " no fue encontrada";
    }

    @Override
    public String modificar(Mascota mascota) {
        if(mascota != null && (mascotaRepository.findById(mascota.getId()).isPresent())) {
            mascotaRepository.save(mascota);
            return "La mascota:" + mascota.getId() + " fue modificada";
        }
        return "La mascota:" + mascota.getId() + " no fue encontrada";
    }

    @Override
    public Optional<Mascota> buscar(Integer id) {
        return mascotaRepository.findById(id);
    }

    @Override
    public List<Mascota> listarTodo(){
        return mascotaRepository.findAll();
    }

    @Override
    public Set<Mascota> filterByPrecio(Integer precioMinimo, Integer precioMaximo) {
        return mascotaRepository.filterByPrecio(precioMinimo, precioMaximo);
    }
}
