package com.example.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    ////// URI VERSIONING //////
    @GetMapping("/v1/person")
    public PersonV1 personV1() {
        return new PersonV1("Kamal Nuriyev");
    }

    @GetMapping("/v2/person")
    public PersonV2 personV2() {
        return new PersonV2(new Name("Kamal", "Nuriyev"));
    }
    ////// 1 //////

    ////// REQUEST PARAMETER VERSIONING //////
    @GetMapping(value = "/person/param", params = "version=1")
    public PersonV1 paramV1() {
        return new PersonV1("Kamal Nuriyev");
    }

    @GetMapping(value = "/person/param", params = "version=2")
    public PersonV2 paramV2() {
        return new PersonV2(new Name("Kamal", "Nuriyev"));
    }
    ////// 2 //////

    ////// HEADER VERSIONING //////
    @GetMapping(value = "/person/param", headers = "API-VERSION=1")
    public PersonV1 headerV1() {
        return new PersonV1("Kamal Nuriyev");
    }

    @GetMapping(value = "/person/param", headers = "API-VERSION=2")
    public PersonV2 headerV2() {
        return new PersonV2(new Name("Kamal", "Nuriyev"));
    }
    ////// 3 //////

    ////// MINE TYPE / ACCEPT HEADER VERSIONING //////
    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v1+json")
    public PersonV1 producesV1() {
        return new PersonV1("Kamal Nuriyev");
    }

    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
    public PersonV2 producesV2() {
        return new PersonV2(new Name("Kamal", "Nuriyev"));
    }
    ////// 4 //////

}
