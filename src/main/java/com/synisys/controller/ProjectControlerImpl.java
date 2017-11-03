package com.synisys.controller;

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
    ProjectService ps;

    @RequestMapping("")
    public ProjectDto[] getProjects(){
        return ps.getProjects();
    }

    @RequestMapping("{id}")
    public ProjectDto getProject(@PathVariable("id") Integer id){
        return ps.getProject(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseDto deleteProject(@PathVariable("id") Integer id) {
        return ps.deleteProject(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseDto postProject(@RequestBody ProjectDto project) {
        return ps.postProject(project);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ResponseDto putProject(@RequestBody ProjectDto project) {
        return ps.putProject(project);
    }
}
