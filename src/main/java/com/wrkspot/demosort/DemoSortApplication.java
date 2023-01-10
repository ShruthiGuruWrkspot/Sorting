package com.wrkspot.demosort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class DemoSortApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoSortApplication.class, args);
        String string = "Can I block your calendar from 5:30 to 6pm today to review/discuss on test case scenarios for HK dashboard cards ";
        List<String> str =Arrays.asList(string.split("\\u0020"));
        Collections.sort(str, Comparator.comparingInt(String::length).reversed());
        System.out.print(str);
}
}
    //demo-test push changes made in origin