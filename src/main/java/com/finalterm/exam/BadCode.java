package com.finalterm.exam;

public class BadCode {

    public void spaghetti() {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i]);
                }
            }
        }
    }
    public void lazy() {
        String str = "badcode";
        for (int i = 0; i < 100; i++) {
            System.out.println("Processing string: " + str);
        }
    }
    public void mess() {
        try {
            String[] arr = {"10", "20", "NaN", "30"};
            int sum = 0;
            for (String s : arr) {
                sum += Integer.parseInt(s);
            }
        } catch (Exception e) {
            System.out.println("Error occurred.");
        }
    }
    public void dumb() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Unnecessary loop iteration: " + i);
        }
        System.out.println("Task complete.");
    }
}
