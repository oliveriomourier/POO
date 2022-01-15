package com.example.mascotasORM.repository;

import com.example.mascotasORM.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Integer> {
}
