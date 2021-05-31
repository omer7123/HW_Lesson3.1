package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Илья", "Макс", "Дастан"};
        for (int i = 0; i < 3; i++) {
            switch (names[i]) {
                case "Илья":
                    System.out.println(names[0] + ", доброе утро");
                    break;
                case "Макс":
                    System.out.println(names[1] + ", добрый день");
                    break;
                case "Дастан":
                    System.out.println(names[2] + ", добрый вечер");
                    break;
            }
        }
    }
}
