package com.synisys.api;

import com.synisys.api.model.ProjectDto;
import com.synisys.api.model.ProjectSaveResultDto;
import com.synisys.api.model.ResponseDto;

import java.util.HashMap;
import java.util.Hashtable;

public interface ProjectService {
    ProjectDto[] getProjects();
    ProjectDto getProject(Integer id);
    ResponseDto deleteProject(Integer id);
    ResponseDto postProject(ProjectDto project);
    ResponseDto putProject(ProjectDto project);
}
