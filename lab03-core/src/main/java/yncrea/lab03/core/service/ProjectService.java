package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.dao.ProjectDAO;
import yncrea.lab03.core.entity.Project;

import java.util.List;

@Service
@Transactional
public class ProjectService {

    private ProjectDAO projectDAO;


    public ProjectService(final ProjectDAO projectDAO) {
        this.projectDAO = projectDAO;
    }


    public void deleteAll() {
        projectDAO.deleteAll();
    }


    public void save(Project project) {
        projectDAO.save(project);
    }


    public long countAll() {
        return projectDAO.count();
    }


    public List<Project> findAll() {
        return projectDAO.findAll();
    }
}
