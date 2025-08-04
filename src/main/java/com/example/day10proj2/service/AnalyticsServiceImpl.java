package com.example.day10proj2.service;

import com.example.day10proj2.dto.ProjectBugCountDTO;
import com.example.day10proj2.dto.StatusCountDTO;
import com.example.day10proj2.dto.PriorityCountDTO;
import com.example.day10proj2.repository.BugRepository;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AnalyticsServiceImpl implements AnalyticsService {

    private final BugRepository bugRepository;

    @Override
    public List<ProjectBugCountDTO> getBugsByProject() {
        return bugRepository.countBugsByProject();
    }

    @Override
    public List<StatusCountDTO> getBugsByStatus() {
        return bugRepository.countBugsByStatus();
    }

    @Override
    public List<PriorityCountDTO> getBugsByPriority() {
        return bugRepository.countBugsByPriority();
    }

    @Override
    public List<ProjectBugCountDTO> getTopProjects() {
        return bugRepository.findTopProjects().stream().limit(3).toList();
    }
}
