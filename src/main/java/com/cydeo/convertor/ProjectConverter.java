package com.cydeo.convertor;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.service.ProjectService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class ProjectConverter implements Converter<String,ProjectDTO> {
    private final ProjectService projectService;

    public ProjectConverter(ProjectService projectService) {
        this.projectService = projectService;
    }

    public ProjectDTO convert(String source) {

        if (source == null || source.equals("")) {
            return null;
        }

        return projectService.findById(source);

    }
}
