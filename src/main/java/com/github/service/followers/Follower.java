package com.github.service.followers;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


public class Follower {
    public String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Follower> follower;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Follower> getFollower() {
        return follower;
    }

    public void setFollower(List<Follower> follower) {
        this.follower = follower;
    }
}
