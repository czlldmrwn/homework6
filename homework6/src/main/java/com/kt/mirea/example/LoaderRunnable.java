/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kt.mirea.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author НР
 */
public class LoaderRunnable implements Runnable{
    private String path;

    public LoaderRunnable(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        FileInputStream fis;
        if(this.path != null && new File(this.path).exists()) {
            try {
                fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Product product = (Product)ois.readObject();
                System.out.println(product.toString());
            } catch (ClassNotFoundException | IOException ex) {
                System.out.println("Error loading object from path: " + this.path);
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("This file does not exist!");
        }
    }
    
}