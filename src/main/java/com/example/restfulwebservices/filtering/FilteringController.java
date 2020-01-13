package com.example.restfulwebservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public MappingJacksonValue retrieveAllStudents() {

        StudentBean student = new StudentBean("Kamal", 30, "1234");

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(student);
        SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("name", "age");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("StudentBeanFilter", simpleBeanPropertyFilter);

        mappingJacksonValue.setFilters(filterProvider);

        return mappingJacksonValue;

    }
}
