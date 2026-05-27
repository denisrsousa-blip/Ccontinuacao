package com.senai.filmes.Model;

import com.senai.filmes.Model.Enums.GeneroFilme;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "cFilmes")
public class Filme {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;


  @NotBlank(message = "O titulo e obrigatorio")
  private String titulo;

  @Column(columnDefinition = "TEXT")
  private String descricao;

  private String urlPoster;

  @NotNull(message = "o campo genero e obrigatorio!")
 @Enumerated(EnumType.STRING)
  private GeneroFilme genero;

  @NotNull(message = "O campo minutos e obrigatorio!")
  @Min(value = 1, message = "A duracao deve ser maior que 0")
  private Integer duracaoMinutos;




}

