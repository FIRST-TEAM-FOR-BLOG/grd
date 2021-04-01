package com.wang.blog.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxiang
 * @since 2021/4/1 17:42
 */
@Slf4j
@RestController
public class TestApplication {

    @GetMapping("/test")
    public String test(){
        return "hello";
    }
}
