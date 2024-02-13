package org.example.app.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserUpdateView {

    public Map<String, String> getData() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> data = new HashMap<>();
        System.out.print("Введіть ID користувача: ");
        data.put("id", scanner.nextLine().trim());
        System.out.print("Ведіть ім'я: ");
        data.put("name", scanner.nextLine().trim());
        System.out.print("Введіть оновлену електронну адресу у форматі example@mail.com: ");
        data.put("email", scanner.nextLine().trim());
        return data;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
