package com.example.day10proj2.repository;

import com.example.day10proj2.dto.ProjectBugCountDTO;
import com.example.day10proj2.dto.StatusCountDTO;
import com.example.day10proj2.dto.PriorityCountDTO;
import com.example.day10proj2.entity.Bug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BugRepository extends JpaRepository<Bug, Long> {

    @Query("SELECT new com.example.day10proj2.dto.ProjectBugCountDTO(b.project.name, COUNT(b)) " +
            "FROM Bug b GROUP BY b.project.name")
    List<ProjectBugCountDTO> countBugsByProject();

    @Query("SELECT new com.example.day10proj2.dto.StatusCountDTO(b.status, COUNT(b)) " +
            "FROM Bug b GROUP BY b.status")
    List<StatusCountDTO> countBugsByStatus();

    @Query("SELECT new com.example.day10proj2.dto.PriorityCountDTO(b.priority, COUNT(b)) " +
            "FROM Bug b GROUP BY b.priority")
    List<PriorityCountDTO> countBugsByPriority();

    @Query("SELECT new com.example.day10proj2.dto.ProjectBugCountDTO(b.project.name, COUNT(b)) " +
            "FROM Bug b GROUP BY b.project.name ORDER BY COUNT(b) DESC")
    List<ProjectBugCountDTO> findTopProjects();
}
