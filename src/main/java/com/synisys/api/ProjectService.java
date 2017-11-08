package com.synisys.api;

import com.synisys.api.model.ProjectDto;
import com.synisys.api.model.ResponseDto;

public interface ProjectService {
    ProjectDto[] getProjects();
    ProjectDto getProject(Integer id);
    ResponseDto deleteProject(Integer id);
    ResponseDto postProject(ProjectDto project);
    ResponseDto putProject(ProjectDto project);

}
