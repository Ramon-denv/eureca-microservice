package com.example.notification_service.service;

import com.example.notification_service.entity.Notification;
import com.example.notification_service.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository _repository;

    public Notification getNotificationById(Long id) {
        return _repository.findById(id).orElse(null);
    }
    public Notification getNotificationByUserId(Long userId) {
        return _repository.findByUserId(userId);
    }
    public Notification createNotification(Notification notification) {
        sendNotification(notification.getMensagem());
        return _repository.save(notification);
    }
    public void sendNotification(String mensagem) {
        System.out.println("Notification sent: " + mensagem);
    }
}
