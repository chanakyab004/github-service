package com.github.service.repos.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class GithubUser {

    public String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Repo> repos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Repo> getRepos() {
        return repos;
    }

    public void setRepos(List<Repo> repos) {
        this.repos = repos;
    }
}
