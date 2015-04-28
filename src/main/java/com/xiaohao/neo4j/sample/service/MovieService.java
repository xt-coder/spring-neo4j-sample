package com.xiaohao.neo4j.sample.service;

import com.xiaohao.neo4j.sample.model.Movie;
import com.xiaohao.neo4j.sample.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 15-4-28.
 */
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public void test(){
        movieRepository.save(new Movie());
    }

}
