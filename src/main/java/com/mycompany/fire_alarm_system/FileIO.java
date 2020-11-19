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
    
    
    public static void WriteToFile(String ser) {
        //get absolute filepath of log file
        File file = new File("FireAlarm.log");
        String filePath = file.getAbsolutePath();
        
        try {
            //format current date and time to put in log file
            String s;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            s=dtf.format(now);
            
            ser="\n"+s+" com.mycompany.fire_alarm_system.LogGenerator <init>\n"+ser;
            //create file streams
            FileOutputStream fileOut = new FileOutputStream(filePath);
            BufferedOutputStream bufferOut = new BufferedOutputStream(fileOut);
            //convert string ser to bytes
            byte[] bytes = ser.getBytes();
            //write the bytes to log file
            bufferOut.write(bytes);
            //close streams
            bufferOut.close();
            fileOut.close();
            //print confirmation of writing to console
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

