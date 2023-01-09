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
        List<String> str = Arrays.asList("Can", "I", "block", "your", "calendar", "from", "5:30", "to", "6pm", "today", "to", "review/discuss", "on", "test", "case", "scenarios", "for", "HK", "dashboard", "cards", "bills");
        //String[] names = new String[]{"Can block your calendar from 5:30 to 6pm today to review/discuss on test case scenarios for HK dashboard cards"};
       //String[] strArr1 = str.split(" ");

        // 1.1 print to console
        System.out.println("Original String[] Arrays :- \n" + str + "\n");
        Collections.sort(str, Comparator.comparingInt(String::length).reversed());


        // 3.1 print descending-order sorted Strings by its Length
        System.out.print("\nDescending-order Sorted String List "
                + "by its Length :- \n" + str);

        //2. sorting String[] Arrays in Ascending-order
        //Arrays.sort(str, Comparator.comparingInt(String::length));


        // 2.1 print ascending-order sorted Strings by its Length
        //System.out.println("\nAscending-order Sorted String[] Arrays by its Length :- \n" + Arrays.toString() + "\n");
    }
    }
    //demo-test push changes made in origin