/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates  
 * and open the template in the editor.
 */

/**
 *
 * @author AADHARSH
 */
package com.mycompany.fire_alarm_system;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileIO {
    
    public String filepath;
    
    public static void WriteToFile(String ser) {
        File file = new File("FireAlarm.log");
        String filepath = file.getAbsolutePath();
        
        try {
            //File file = new File(filepath);
            String s;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            s=dtf.format(now);
            ser="\n"+s+" PM com.mycompany.fire_alarm_system.LogGenerator <init>\n"+ser;
            FileOutputStream fileOut = new FileOutputStream(filepath);
            BufferedOutputStream bufferOut = new BufferedOutputStream(fileOut);
            byte[] bytes = ser.getBytes();
            bufferOut.write(bytes);
            bufferOut.close();
            fileOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
//    public void ReadObjectFromFile(Object serObj) {
//        
//        try{    
//            File file = new File(filepath);
//            FileInputStream fileIn = new FileInputStream(filepath);
//            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
//            serObj = objectIn.readObject();
//            System.out.println(serObj);
//            Sensor s = (Sensor)serObj;
//            System.out.println(s.SensorType);
//            
//        } catch (Exception ex){
//            
//        }
//        
//    }
    
}

