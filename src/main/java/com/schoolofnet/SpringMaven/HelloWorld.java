package com.schoolofnet.SpringMaven;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@RestController
@RequestMapping("/")
public class HelloWorld {
    @GetMapping
    public String sayHello() {
        return "Hello from SpringBoot by School of net";
    }

    @PostMapping("/post")
    public String sayHelloPost(@RequestBody Map<String, Object> payload) {
        return payload.get("name").toString();
    }

    @GetMapping("/subpath")
    public String subPath(@RequestParam(value = "name", required = false) String name) {
        return "This is one subPath of endpoint / " + name;
    }

//    @GetMapping("/subpath")
//    public String subPath(@RequestParam("name") String name) {
//        return "This is one subPath of endpoint / " + name;
//    }
//    @GetMapping("/subpath")
//    public String subPath(final WebRequest webRequest) {
//        String name =  webRequest.getParameter("name");
//        return "This is one subPath of endpoint / " + name;
//    }

    @GetMapping("/{dynamic}")
    public String dynamicSubPath(@PathVariable("dynamic") String name) {
        return "Hello " + name + " this is my route dynamic";
    }
}
