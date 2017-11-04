package com.synisys.controller;

import com.synisys.api.model.ProjectDto;
import com.synisys.api.model.ResponseDto;

public interface ProjectControler {
    ProjectDto[] getProjects();
    ProjectDto getProject(Integer id);
    ResponseDto deleteProject(Integer id);
    ResponseDto postProject(ProjectDto project);
    ResponseDto putProject(ProjectDto project);
}
