package com.xiaohao.neo4j.sample.repository;

import com.xiaohao.neo4j.sample.model.Movie;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by Administrator on 15-4-28.
 */
public interface MovieRepository extends GraphRepository<Movie> {



}
