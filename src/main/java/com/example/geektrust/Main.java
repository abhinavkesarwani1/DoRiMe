package com.example.geektrust;

import com.example.geektrust.service.SubscriptionService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            SubscriptionService lms = new SubscriptionService();
            //File myObj = new File("sample_input/input1.txt");
            File myObj = new File(args[0]);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data[] = myReader.nextLine().split(" ");
                lms.executeCommand(data[0], Arrays.asList(data).subList(1, data.length));
            }
            myReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
