package com.baeldung.ls.service.impl;

import java.util.Optional;

import com.baeldung.ls.persistence.dao.IProjectDao;
import com.baeldung.ls.persistence.model.Project;
import com.baeldung.ls.service.IProjectService;

public class ProjectServiceImpl implements IProjectService {

    private IProjectDao projectDao;

    public ProjectServiceImpl(IProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectDao.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectDao.save(project);
    }

    public IProjectDao getProjectDao() {
        return projectDao;
    }

    public void setProjectDao(IProjectDao projectDao) {
        this.projectDao = projectDao;
    }

}
