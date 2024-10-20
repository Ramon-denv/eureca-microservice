package com.example.notification_service.controller;

import com.example.notification_service.entity.Notification;
import com.example.notification_service.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    @Autowired
    private NotificationService _service;

    @GetMapping("/{id}")
    public Notification getNotificationsById(long id) {
        return _service.getNotificationById(id);
    }
    @GetMapping("/user/{userId}")
    public Notification getNotificationsByUserId(long userId) {
        return _service.getNotificationByUserId(userId);
    }
    @PostMapping
    public Notification createNotification(Notification notification) {
        return _service.createNotification(notification);
    }
}
