package org.example.entities;

import java.time.Instant;
import java.util.List;

public class Emprestimo {
    private Long id;
    private Instant dataEmprestimo;
    private Instant dataDevolucaoPrevista;
    private Instant dataDevolucaoReal;
    private String status;
    private String livro;
    private List usuario;
}
