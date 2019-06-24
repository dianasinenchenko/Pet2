package com.diana.pet2.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Diana on 24.06.2019.
 */

public class Repository {

    public final long id;
    public final String name;
    public final String description;
    public final User owner;
    @SerializedName("stargazers_count")
    public final long stars;
    @SerializedName("forks_count")
    public final long forks;


    public Repository(long id, String name, String description, User owner, long stars, long forks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.stars = stars;
        this.forks = forks;
    }
}
