package com.xiaohao.neo4j.sample.controller;

import com.xiaohao.neo4j.sample.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 15-4-28.
 */
@Controller
@RequestMapping("/")
public class MovieController {
    @Autowired
    MovieService movieService;

    @RequestMapping("test")
    public String test(){
        return null;
    }
}
