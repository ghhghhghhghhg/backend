package com.synisys.data;


import com.synisys.api.ProjectService;
import com.synisys.api.model.*;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private DataAccessService data = new DataAccessService();


    @Override
    public ProjectDto[] getProjects() {
        ProjectDto[] projects = new ProjectDto[data.getProjects().size()];
        for (int i = 0; i < data.getProjects().size(); ++i) {
            projects[i] = data.getProjects().get(i);
        }
        return projects;
    }

    @Override
    public ProjectDto getProject(Integer id) {
        for (int i = 0; i < data.getProjects().size(); ++i) {
            if (data.getProjects().get(i).getId().equals(id)) {
                return data.getProjects().get(i);
            }
        }
        return null;
    }

    @Override
    public ResponseDto deleteProject(Integer id) {
        ResponseDto res = new ResponseDto(id, "Can not find project", false);
        for (int i = 0; i < data.getProjects().size(); ++i) {
            if (data.getProjects().get(i).getId().equals(id)) {
                data.getProjects().remove(i);
                res.setMessage("Project deleted");
                res.setSuccess(true);
                return res;
            }
        }
        return res;
    }

    @Override
    public ResponseDto postProject(ProjectDto project) {
        Integer id = 1;
        for (int i = 0; i < data.getProjects().size(); ++i) {
            if (data.getProjects().get(i).getId() > id) {
                id = data.getProjects().get(i).getId();
            }
        }
        project.setId(++id);
        data.getProjects().add(project);
        return new ResponseDto(project.getId(), "Project added", true);
    }

    @Override
    public ResponseDto putProject(ProjectDto project) {
        ResponseDto res = new ResponseDto(project.getId(), "Can not find project", false);
        for (int i = 0; i < data.getProjects().size(); ++i) {
            if (data.getProjects().get(i).getId().equals(project.getId())) {
                data.getProjects().set(i, project);
                res.setMessage("Project updated");
                res.setSuccess(true);
                return res;
            }
        }
        return res;
    }
}

