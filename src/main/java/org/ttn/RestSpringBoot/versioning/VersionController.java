package org.ttn.RestSpringBoot.versioning;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {


    //uri
    @GetMapping("v1/user")
    public UserV1 userV1() {
        return new UserV1("geetanjali");
    }

    @GetMapping("v2/user")
    public UserV2 userV2() {
        return new UserV2("geetanjali", "bisht");

    }

    //params
    @GetMapping(path = "/user", params = "version=1")
    public UserV1 requestParameterVersioning1() {
        return new UserV1("Geetanjali");
    }


    @GetMapping(path = "/user", params = "version=2")
    public UserV2 requestParameterVersioning2() {
        return new UserV2("Geetanjali", "Bisht");
    }


    //headres cutom request headers
    @GetMapping(path = "/user/head",headers="X-API-VERSION=1")
    public UserV1 requestHeader1() {
        return new UserV1("Geetanjali");
    }

    @GetMapping(path = "/user/head", headers="X-API-VERSION=2")
    public UserV2 requestHeader2() {
        return new UserV2("Geetanjaki", "Bisht");
    }

    //media type nversioning
    @GetMapping(path = "/user/accept", produces = "application/vnd.company.app-v1+json")
    public UserV2 requestMIME() {
        return new UserV2("Geetanjali", "Bisht");
    }

    @GetMapping(path = "/user/accept", produces = "application/vnd.company.app-v2+json")
    public UserV1 requestMIME2() {
        return new UserV1("Geetanjali");
    }




}

