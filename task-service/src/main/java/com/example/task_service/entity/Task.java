package com.example.task_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "task")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_task")
    private Long id;
    @Column(name = "titulo_task")
    private String titulo;
    @Column(name = "descricao_task")
    private String descricao;
    @Column(name = "status_task")
    private String status;
    @Column(name = "user_id_task")
    private Long userId;
}
