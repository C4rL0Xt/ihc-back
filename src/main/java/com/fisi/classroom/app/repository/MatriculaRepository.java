package com.fisi.classroom.app.repository;

import com.fisi.classroom.app.models.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula,Integer> {
}
