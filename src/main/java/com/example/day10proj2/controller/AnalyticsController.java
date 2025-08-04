package com.example.day10proj2.controller;

import com.example.day10proj2.dto.ProjectBugCountDTO;
import com.example.day10proj2.dto.StatusCountDTO;
import com.example.day10proj2.dto.PriorityCountDTO;
import com.example.day10proj2.service.AnalyticsService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/analytics")
@AllArgsConstructor
public class AnalyticsController {

    private final AnalyticsService analyticsService;

    @GetMapping("/bugs-by-project")
    public List<ProjectBugCountDTO> bugsByProject() {
        return analyticsService.getBugsByProject();
    }

    @GetMapping("/bugs-by-status")
    public List<StatusCountDTO> bugsByStatus() {
        return analyticsService.getBugsByStatus();
    }

    @GetMapping("/bugs-by-priority")
    public List<PriorityCountDTO> bugsByPriority() {
        return analyticsService.getBugsByPriority();
    }

    @GetMapping("/top-projects")
    public List<ProjectBugCountDTO> topProjects() {
        return analyticsService.getTopProjects();
    }
}
