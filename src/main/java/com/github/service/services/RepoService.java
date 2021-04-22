package com.github.service.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.service.repos.request.RepoInfo;
import com.github.service.repos.request.Stargazer;
import com.github.service.repos.response.GithubUser;
import com.github.service.repos.response.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RepoService {

    @Autowired
    RestTemplate restTemplate;

    //WIP
    public String getRepos(String id, int levelR, int levelS, GithubUser githubUser) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.valueOf("application/vnd.github.v3+json")));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String response = restTemplate.exchange("https://api.github.com/users/" + id + "/repos?per_page=3&page=0", HttpMethod.GET, entity, String.class).getBody();

        List<Repo> repoList = new ArrayList<Repo>();

        ObjectMapper mapper = new ObjectMapper();

        try {
            RepoInfo[] repos = mapper.readValue(response, RepoInfo[].class);
            for (RepoInfo repoItr : repos) {
                System.out.println("Repo Name : " + repoItr.getName());
                Repo repo = new Repo();
                repo.setName(repoItr.getName());
                repoList.add(repo);
                githubUser.setRepos(repoList);
                // call stargazer
                getStargazers(id, repoItr.getName(), levelR++, levelS, githubUser);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return response;
    }

    //WIP
    public void getStargazers(String owner, String repo, int levelR, int levelS, GithubUser githubUser) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.valueOf("application/vnd.github.v3.star+json")));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String response = restTemplate.exchange("https://api.github.com/repos/" + owner + "/" + repo + "/stargazers?per_page=3&page=0", HttpMethod.GET, entity, String.class).getBody();

        List<GithubUser> githubUser1 = new ArrayList<>();
        for (Repo repo1 : githubUser.getRepos()) {
            // repo1.setStargazer();
        }
        githubUser.getRepos();
//        repoWithStargazers.setRepos();


        ObjectMapper mapper = new ObjectMapper();
        try {
            Stargazer[] stargazers = mapper.readValue(response, Stargazer[].class);
            for (Stargazer stargazer : stargazers) {
                System.out.println("Stargazer for repo ::" + repo + " ----->" + stargazer.getUser().getLogin());
                if (levelS <= 1) {
                    getRepos(stargazer.getUser().getLogin(), levelR, levelS++, githubUser);
                }
                //repoWithStargazers.getRepos(repo);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        //return repoWithStargazers;
    }
}
