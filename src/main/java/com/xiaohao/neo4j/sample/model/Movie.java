package com.xiaohao.neo4j.sample.model;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.*;
import org.springframework.data.neo4j.support.index.IndexType;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 15-4-28.
 */
@NodeEntity
public class Movie implements Serializable {

    @GraphId
    Long id;

    @Indexed(indexType = IndexType.FULLTEXT,indexName = "search")
    String title;

    Person director;

    @RelatedTo(type="ACTS_IN",direction = Direction.INCOMING)
    Set<Person> actors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

    public Set<Person> getActors() {
        return actors;
    }

    public void setActors(Set<Person> actors) {
        this.actors = actors;
    }
}
