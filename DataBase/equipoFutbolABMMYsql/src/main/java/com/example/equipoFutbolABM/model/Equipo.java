package com.example.equipoFutbolABM.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Equipo")
public class Equipo {
    @Id
    @SequenceGenerator(name = "sequence_equipo", sequenceName = "sequence_equipo")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_equipo")
    private Integer id;
    private String nombre;
    private String ciudad;

    @OneToMany(mappedBy = "equipo", fetch = FetchType.LAZY)
    private Set<Jugador> jugadores;

    public Equipo(String nombre, String ciudad, Set<Jugador> jugadores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = jugadores;
    }


}
