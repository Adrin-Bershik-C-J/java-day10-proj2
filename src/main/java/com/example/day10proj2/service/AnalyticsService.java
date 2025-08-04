package com.example.day10proj2.service;

import com.example.day10proj2.dto.ProjectBugCountDTO;
import com.example.day10proj2.dto.StatusCountDTO;
import com.example.day10proj2.dto.PriorityCountDTO;

import java.util.List;

public interface AnalyticsService {
    List<ProjectBugCountDTO> getBugsByProject();

    List<StatusCountDTO> getBugsByStatus();

    List<PriorityCountDTO> getBugsByPriority();

    List<ProjectBugCountDTO> getTopProjects();
}
