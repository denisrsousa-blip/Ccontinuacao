package com.senai.filmes.Model.Enums;

import com.senai.filmes.Model.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


    @Data
    @NoArgsConstructor
    @Entity
    @Table(name = "cReservas")

    public class Reserva {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull
        @ManyToOne
        @JoinColumn(name = "usuario_id")
        private Usuario usuario;
    



}
