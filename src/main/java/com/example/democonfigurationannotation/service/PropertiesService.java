package com.example.democonfigurationannotation.service;

import com.example.democonfigurationannotation.configuration.AppConfiguration;
import org.springframework.stereotype.Service;

@Service
public class PropertiesService {

    AppConfiguration appConfiguration;

    public PropertiesService(AppConfiguration appConfiguration) {
        this.appConfiguration = appConfiguration;
    }

    public String getProperties() {
        return appConfiguration.getIntegrationServiceUrl();
    }
}
