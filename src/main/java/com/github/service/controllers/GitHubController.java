package com.github.service.controllers;

import com.github.service.followers.Follower;
import com.github.service.repos.response.GithubUser;
import com.github.service.services.FollowersServices;
import com.github.service.services.RepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubController {

    @Autowired
    FollowersServices followersServices;

    @Autowired
    RepoService repoService;


    @GetMapping("/getFollowersById/{id}")
    public Follower getGitFollowersById(@PathVariable("id") String id) {
        Follower follower = new Follower();
        follower.setId(id);
        followersServices.getFollowers(id, 1, follower);
        return follower;
    }

    //WIP
    @GetMapping("/getRepoNamesById/{id}")
    public GithubUser getGitRepoNamesById(@PathVariable("id") String id) {
        GithubUser githubUser = new GithubUser();
        githubUser.setId(id);
        repoService.getRepos(id, 1, 1, githubUser);
        return githubUser;
    }


}
