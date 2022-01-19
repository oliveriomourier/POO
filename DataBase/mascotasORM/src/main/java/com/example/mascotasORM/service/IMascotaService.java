package com.example.mascotasORM.service;

import com.example.mascotasORM.entity.Mascota;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface IMascotaService {
    public Mascota guardar(Mascota mascota);
    public String eliminar(Integer id);
    public String modificar(Mascota mascota);
    public Optional<Mascota> buscar(Integer id);
    public List<Mascota> listarTodo();
    Set<Mascota> filterByPrecio(Integer precioMinimo, Integer precioMaximo);
}
