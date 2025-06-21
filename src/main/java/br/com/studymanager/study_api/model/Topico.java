package br.com.studymanager.study_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "topicos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

    // Dados para recomendação
    private double pontuacaoDesempenho; // Média de desempenho (ex: 0 a 1)
    private LocalDateTime ultimaRevisao;
    private int intervaloRevisaoDias; // Próximo intervalo de revisão
}
