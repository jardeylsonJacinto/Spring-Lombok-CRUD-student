package com.acc.aluno.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Entity
@Table(name = "Aluno")
public class Aluno implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "nome", nullable = false)
  private String name;

  @Column(name = "email", nullable = false, unique = true)
  private String email;

  @Column(name = "cpf", unique = true)
  private String cpf;

  @Column(name = "data_criacao", nullable = false)
  private Date dataCriacao;

  @Column(name = "data_atualizacao", nullable = false)
  private Date dataAtualizacao;

  @PreUpdate
  public void preUpdate() {
    dataAtualizacao = new Date();
  }

  @PrePersist
  public void prePersist() {
    final Date atual = new Date();
    dataCriacao = atual;
    dataAtualizacao = atual;
  }
}
