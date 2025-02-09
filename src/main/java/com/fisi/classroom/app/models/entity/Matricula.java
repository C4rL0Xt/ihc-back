package com.fisi.classroom.app.models.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.util.Date;

public class Matricula {
    @Id
    @Column(name ="id_matricula")
    private Integer id_matricula;
    @OneToOne
    @JoinColumn(name = "id_alumno")
    private Alumno id_alumno;
    @OneToOne
    @JoinColumn(name = "id_plan")
    private PlanEstudio id_plan;
    @OneToOne
    @JoinColumn(name = "id_curso")
    private Curso id_curso;
    private String facultad;
    private String escuela;
    private String periodo;
    private Date fecha_matricula;

}
