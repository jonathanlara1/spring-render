package com.springrender.demo.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "nombre")
    String nombre;
    @Column(name= "apellido")
    String apellido;
    @Column(name = "fecha_nacimiento")
    LocalDate fecha_nacimiento;
    @Column(name = "direccion")
    String direccion;
}
