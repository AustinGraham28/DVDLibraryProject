/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.ui;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author agrah
 */
public class UserIOConsoleImpl implements UserIO{
    Scanner inRead = new Scanner(System.in);
    
    @Override
    public void print(String message){
        System.out.println(message);
    }
    
    @Override
    public String readString(String prompt){
        print(prompt);
        String userString = inRead.nextLine();
        return userString;
    }

    @Override
    public int readInt(String prompt){
        print(prompt);
        int number = Integer.parseInt(inRead.nextLine());
        return number;
    }

    @Override
    public int readInt(String prompt, int min, int max){
        print(prompt);
        int number = Integer.parseInt(inRead.nextLine());
        while(number < min || number > max){
            System.out.println("Invalid entry. Out of Bounds.");
            print(prompt);
            number = Integer.parseInt(inRead.nextLine());
        }
        return number;  
    }

    @Override
    public double readDouble(String prompt){
        print(prompt);
        double number = Double.parseDouble(inRead.nextLine());
        return number;
    }

    @Override
    public double readDouble(String prompt, double min, double max){
        print(prompt);
        double number = Double.parseDouble(inRead.nextLine());
        while(number < min || number > max){
            System.out.println("Invalid entry. Out of Bounds.");
            print(prompt);
            number = Double.parseDouble(inRead.nextLine());
        }
        return number; 
    }

    @Override
    public float readFloat(String prompt){
        print(prompt);
        float number = Float.parseFloat(inRead.nextLine());
        return number;
    }

    @Override
    public float readFloat(String prompt, float min, float max){
        print(prompt);
        float number = Float.parseFloat(inRead.nextLine());
        while(number < min || number > max){
            System.out.println("Invalid entry. Out of Bounds.");
            print(prompt);
            number = Float.parseFloat(inRead.nextLine());
        }
        return number; 
    }

    @Override
    public long readLong(String prompt){
        print(prompt);
        long number = Long.parseLong(inRead.nextLine());
        return number;
    }

    @Override
    public long readLong(String prompt, long min, long max){
        print(prompt);
        long number = Long.parseLong(inRead.nextLine());
        while(number < min || number > max){
            System.out.println("Invalid entry. Out of Bounds.");
            print(prompt);
            number = Long.parseLong(inRead.nextLine());
        }
        return number; 
    }
    
    // Method that parse in the date in mm-dd-yyyy format
    @Override
    public int[] readDate(String msgPrompt) {
        // Parsing date information using regular expression
        Pattern pattern = Pattern.compile("\\b(\\d{1,2})-(\\d{1,2})-(\\d{1,4})\\b");
        Matcher matcher;
        while (true) {
            matcher = pattern.matcher(this.readString(msgPrompt + " (mm-dd-yyyy)"));
            if (matcher.find()){
                int month = Integer.parseInt(matcher.group(1));
                int day = Integer.parseInt(matcher.group(2));
                int year = Integer.parseInt(matcher.group(3));
                if (month <= 0 || month > 12 || day <= 0 || day > 31 || year <= 0){
                    this.print("This is not a valid format for date. Please try again.");
                } else {
                    return new int[]{ month, day, year };
                }
            } else {
                this.print("This is not a valid format for date. Please try again.");
            }
        }
    }
}
