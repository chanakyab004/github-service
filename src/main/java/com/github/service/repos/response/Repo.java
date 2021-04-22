package com.github.service.repos.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class Repo {
    public String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<GithubUser> stargazer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GithubUser> getStargazer() {
        return stargazer;
    }

    public void setStargazer(List<GithubUser> stargazer) {
        this.stargazer = stargazer;
    }
}
