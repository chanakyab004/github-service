package com.github.service.services;

import com.github.service.followers.Follower;
import com.github.service.followers.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
public class GitHubServices {

    @Autowired
    RestTemplate restTemplate;

    public void getFollowers(String id, int level, Follower follower) {
        if(level > 3) return;
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.valueOf("application/vnd.github.v3+json")));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String response = restTemplate.exchange("https://api.github.com/users/"+id+"/followers?per_page=5&page=0", HttpMethod.GET, entity, String.class).getBody();

        List<Follower> followerList = new ArrayList<>();


        ObjectMapper mapper = new ObjectMapper();
        try {
            User[] users = mapper.readValue(response, User[].class);
            for (User user : users) {
                System.out.println("level :: " + level +", follower user id: " + user.getLogin());
                Follower follower1 = new Follower();
                follower1.setId(user.getLogin());
                getFollowers(user.getLogin(), level + 1, follower1);
                followerList.add(follower1);
                follower.setFollower(followerList);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
