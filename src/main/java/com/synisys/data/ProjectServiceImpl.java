package com.synisys.data;


import com.synisys.api.ProjectService;
import com.synisys.api.model.*;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private DataAccessService data = new DataAccessService();

    /**
     * Returned all projects
     * @return
     */
    @Override
    public ProjectDto[] getProjects() {
        ProjectDto[] projects = new ProjectDto[data.getProjects().size()];
        for (int i = 0; i < data.getProjects().size(); ++i) {
            projects[i] = data.getProjects().get(i);
        }
        return projects;
    }

    /**
     * Returned project by project ID
     * @param id
     * @return
     */
    @Override
    public ProjectDto getProject(Integer id) {
        for (int i = 0; i < data.getProjects().size(); ++i) {
            if (data.getProjects().get(i).getId().equals(id)) {
                return data.getProjects().get(i);
            }
        }
        return null;
    }

    /**
     * Delite project by project ID
     * @param id
     * @return
     */
    @Override
    public ResponseDto deleteProject(Integer id) {
        ResponseDto res = new ResponseDto(id, "Can not find project for delete", false);
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

    /**
     * Save new project
     * @param project
     * @return
     */
    @Override
    public ResponseDto postProject(ProjectDto project) {
        for (int i = 0; i < data.getProjects().size(); ++i) {
            if(data.getProjects().get(i).getCode().equals(project.getCode()) && data.getProjects().get(i).getTitle().equals(project.getTitle())){
                return new ResponseDto(null, "Can not save new project please check code or title" ,false);
            }
        }
        project.setId(DataAccessService.id++);
        data.getProjects().add(project);
        return new ResponseDto(project.getId(), "Project added", true);
    }

    /**
     * Update project by project ID
     * @param project
     * @return
     */
    @Override
    public ResponseDto putProject(ProjectDto project) {
        ResponseDto res = new ResponseDto(project.getId(), "Can not find project for change", false);
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

