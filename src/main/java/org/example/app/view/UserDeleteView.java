package org.example.app.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserDeleteView {

    public Map<String, String> getData() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> data = new HashMap<>();
        System.out.print("Введіть ID користувача: ");
        data.put("id", scanner.nextLine().trim());
        return data;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}