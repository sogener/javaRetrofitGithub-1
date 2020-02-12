package chistotest.test.retrofitrabotaet.api.service;

import java.util.List;

import chistotest.test.retrofitrabotaet.api.model.GitHubRepo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(@Path("user") String user);
}
