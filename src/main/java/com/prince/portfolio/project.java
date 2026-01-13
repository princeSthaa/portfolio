package com.prince.portfolio;

import java.util.List;

public class project {
    private String name;
    private String path;
    private String slug;
    private String image;
    private String description;
    private List<Tech> techStack;


    public project(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }
}
