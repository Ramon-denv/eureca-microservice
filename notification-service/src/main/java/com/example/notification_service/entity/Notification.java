package com.example.notification_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "notifications")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notifications")
    private Long id;
    @Column(name = "mensagem_notifications")
    private String mensagem;
    @Column(name = "user_id_notifications")
    private Long userId;
}
