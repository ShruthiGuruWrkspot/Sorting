package com.wrkspot.demosort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoSortApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoSortApplication.class, args);
        String[] str = new String[] {"Can", "I", "block", "your", "calendar", "from", "5:30", "to", "6pm", "today", "to", "review/discuss", "on", "test", "case", "scenarios", "for", "HK", "dashboard", "cards"};
        //String[] names = new String[]{"Can block your calendar from 5:30 to 6pm today to review/discuss on test case scenarios for HK dashboard cards"};
       //String[] strArr1 = str.split(",");

        // 1.1 print to console
        System.out.println("Original String[] Arrays :- \n" + Arrays.toString(str) + "\n");

        // 3. sorting String[] Arrays in Descending-order
        Arrays.sort(str, (str1, str2) -> Integer.compare(str2.length(), str1.length()));

        // 3.1 print descending-order sorted Strings by its Length
        System.out.print("\nDescending-order Sorted String[] Arrays by its Length :- \n" + Arrays.toString(str));
        }
    }