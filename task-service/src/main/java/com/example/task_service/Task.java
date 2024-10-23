package com.example.task_service;

import com.netflix.spectator.api.TagList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Task {

    private int id;
    private String name;
    private String description;
    private String titulo;
}