package com.acc.aluno.repository;

import org.springframework.data.repository.CrudRepository;

import com.acc.aluno.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Integer> {

}
