package com.diana.pet2.data.repository;

import com.diana.pet2.data.model.Repository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

/**
 * Created by Diana on 24.06.2019.
 */

public class RRepository {

    private final RRepository rRepository;

    @Inject
    public RRepository(RRepository rRepository) {
        this.rRepository = rRepository;
    }

    public Single<List<Repository>> getRepositories() {

        return rRepository.getRepositories();
    }

    public Single<Repository> getRepository (String owner, String name){

        return rRepository.getRepository(owner, name);
    }
}
