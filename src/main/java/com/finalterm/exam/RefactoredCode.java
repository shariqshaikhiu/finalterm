package com.finalterm.exam;

public class RefactoredCode {

    public void findDuplicate() {
        int[] arr = {10, 20, 30, 40, 50};
        if(arr==null || arr.length==0)  {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i]);
                }
            }
        }
    }
    public void processString() {
        String str = "Refactoring";
        if(str==null || str.length()==0)  {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Processing string: " + str);
        }
    }
    public void sum() {
            String[] arr = {"10", "20", "NaN", "30"};
            int sum = 0;
            for (String s : arr) {
                try{
                sum += Integer.parseInt(s);
                throw new NumberFormatException();
            }
                catch (NumberFormatException e) {
                    System.out.println("Invalid Integer: "+e);
                }
        }
            System.out.println(sum);
    }
    public void taskCompletion() {
        System.out.println("Task complete.");
        }

    }

