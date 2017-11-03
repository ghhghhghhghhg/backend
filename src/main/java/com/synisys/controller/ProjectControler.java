package com.synisys.controller;

import com.synisys.api.model.ProjectDto;
import com.synisys.api.model.ResponseDto;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProjectControler {
    public ProjectDto[] getProjects();
    public ProjectDto getProject(Integer id);
    public ResponseDto deleteProject(Integer id);
    public ResponseDto postProject(ProjectDto project);
    public ResponseDto putProject(ProjectDto project);
}
