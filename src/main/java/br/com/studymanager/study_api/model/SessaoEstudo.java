package br.com.studymanager.study_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "sessoes_estudo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SessaoEstudo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;

    private LocalDateTime inicio;
    private LocalDateTime fim;

    @Column(name = "desempenho_registrado")
    private int desempenhoRegistrado; // Nota de 1 a 5, por exemplo
}