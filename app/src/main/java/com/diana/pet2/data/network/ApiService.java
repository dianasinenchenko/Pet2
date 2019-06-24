package com.diana.pet2.data.network;

import com.diana.pet2.data.model.Repository;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Diana on 24.06.2019.
 */

public interface ApiService {

    @GET("orgs/Google/repos")
    Single<List<Repository>> getRepositories();

    @GET("repos/{owner}/{name}")
    Single<Repository> getRepository(@Path("owner") String owner,
                                     @Path("name") String name);
}
