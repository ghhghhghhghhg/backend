package com.synisys.controller;

import com.synisys.api.ProjectControler;
import com.synisys.api.ProjectService;
import com.synisys.api.model.ProjectDto;
import com.synisys.api.model.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/projects")
public class ProjectControlerImpl implements ProjectControler {

    @Autowired
    ProjectService projectService;

    @RequestMapping("")
    public ProjectDto[] getProjects(){
        return projectService.getProjects();
    }

    @RequestMapping("{id}")
    public ProjectDto getProject(@PathVariable("id") Integer id){
        return projectService.getProject(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseDto deleteProject(@PathVariable("id") Integer id) {
        return projectService.deleteProject(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseDto postProject(@RequestBody ProjectDto project) {
        return projectService.postProject(project);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ResponseDto putProject(@RequestBody ProjectDto project) {
        return projectService.putProject(project);
    }
}
