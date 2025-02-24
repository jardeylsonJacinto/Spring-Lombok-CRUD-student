package com.acc.aluno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acc.aluno.model.Aluno;
import com.acc.aluno.service.AlunoService;

@RestController
public class AlunoController {

  @Autowired
  AlunoService alunoService;

  @GetMapping("/aluno")
  private List<Aluno> getAllAluno() {
    return alunoService.getAllAluno();
  }

  @GetMapping("/aluno/{id}")
  private Aluno getAlunoById(int id) {
    return alunoService.getAlunoById(id);
  }

  @PostMapping("/aluno")
  private int saveAluno(@RequestBody Aluno aluno) {
    alunoService.saveAluno(aluno);
    return aluno.getId();
  }

  @DeleteMapping("/aluno/{id}")
  private void deleteAluno(@PathVariable("id") int id) {
    alunoService.deleteAlunoById(id);
  }

}
