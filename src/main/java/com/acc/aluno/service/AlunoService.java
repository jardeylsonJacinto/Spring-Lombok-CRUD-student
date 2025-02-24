package com.acc.aluno.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.aluno.model.Aluno;
import com.acc.aluno.repository.AlunoRepository;

@Service
public class AlunoService {

  @Autowired
  AlunoRepository alunoRepository;

  public List<Aluno> getAllAluno() {
    List<Aluno> alunos = new ArrayList<Aluno>();
    alunoRepository.findAll().forEach(alunos::add);
    return alunos;
  }

  public Aluno getAlunoById(int id) {
    return alunoRepository.findById(id).get();
  }

  public void saveAluno(Aluno aluno) {
    alunoRepository.save(aluno);
  }

  public void deleteAlunoById(int id) {
    alunoRepository.deleteById(id);
  }
}
