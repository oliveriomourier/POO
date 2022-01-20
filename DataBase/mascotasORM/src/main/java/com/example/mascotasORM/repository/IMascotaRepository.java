package com.example.mascotasORM.repository;

import com.example.mascotasORM.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.Set;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Integer> {
    @Query("FROM Mascota m WHERE m.precio BETWEEN :precioMinimo AND :precioMaximo")
    Set<Mascota> filterByPrecio(Integer precioMinimo, Integer precioMaximo);

    @Query("FROM Mascota m WHERE m.precio < :precioMaximo")
    Set<Mascota> filterByPrecioMaximo(Integer precioMaximo);

    @Query("FROM Mascota m WHERE m.precio > :precioMaximo")
    Set<Mascota> filterByPrecioMinimo(Integer precioMaximo);
}
