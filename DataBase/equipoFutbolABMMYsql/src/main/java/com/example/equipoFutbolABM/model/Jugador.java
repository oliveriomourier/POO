package com.example.equipoFutbolABM.model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table
public class Jugador {
    @Id
    @SequenceGenerator(name = "sequence_jugador", sequenceName = "sequence_jugador")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_jugador")
    private Integer id;
    private String nombre;
    private String posicion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    public Jugador(String nombre, String posicion, Equipo equipo) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.equipo = equipo;
    }
}
