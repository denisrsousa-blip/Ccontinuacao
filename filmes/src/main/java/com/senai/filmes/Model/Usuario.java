package com.senai.filmes.Model;

import com.senai.filmes.Model.Enums.Cargo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;


@Data
    @NoArgsConstructor
    @Entity
    @Table(name = "usuarios")

    public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.UUID)

        private UUID id;

        @NotBlank(message = "O nome e obrigatorio")
        private String nome;

        @NotBlank(message = "O email e obrigatorio")
        @Column(unique = true)
    private String email;

        @NotBlank(message = "A senha e obrigatoria")
    private String senha;

        @NotNull(message = "O cargo e obrigatorio")
    @Enumerated(EnumType.STRING)
    private Cargo cargo;

        @CreationTimestamp
    private LocalDateTime criadoEm;





}
