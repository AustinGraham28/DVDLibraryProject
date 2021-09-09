/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.ui;

/**
 *
 * @author agrah
 */
public interface UserIO {
    void print(String msg);
    
    String readString(String prompt);

    int readInt(String prompt);

    int readInt(String prompt, int min, int max);
    
    double readDouble(String prompt);

    double readDouble(String prompt, double min, double max);

    float readFloat(String prompt);

    float readFloat(String prompt, float min, float max);

    long readLong(String prompt);

    long readLong(String prompt, long min, long max);

    public int[] readDate(String please_enter_new_date);
}
