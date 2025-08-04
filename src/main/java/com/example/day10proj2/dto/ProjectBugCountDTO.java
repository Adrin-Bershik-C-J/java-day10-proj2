package com.example.day10proj2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProjectBugCountDTO {

    private String projectName;
    private Long bugCount;

}
