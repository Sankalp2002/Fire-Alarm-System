/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor  .
 */
package com.mycompany.fire_alarm_system;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class ConfigureSensor extends javax.swing.JFrame {
     //is the timer for logging operation running
     static boolean isLogTimer=false;
     //timer for logging 
     static java.util.Timer logTimer;
     //selected index on configure screen for log duration
     static int logIndex;
    /**
     * Creates new form Configure_a_sensor
     */
    public ConfigureSensor() {
        // initialising gui components
        initComponents();
        // setting volumeSlider index according to previously saved volume.
        volumeSlider.setValue(Location.alarmVolume);
        switch(Location.logInterval){
            case 10:
                logIndex=0;
                break;
            case 15:
                logIndex=1;
                break;
            case 30:
                logIndex=2;
                break;
            case 60:
                logIndex=3;
                break;
            case 120:
                logIndex=4;
                break;
        }
        logIntervalComboBox.setSelectedIndex(logIndex);
        //Displays Email ID already present in mailLabel
        if(MainScreen.isEmailPresent==true){
            mailLabel.setText("Email ID (Already Present):");}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        configureLabel = new javax.swing.JLabel();
        thresholdLabel = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        volumeLabel = new javax.swing.JLabel();
        logIntervalLabel = new javax.swing.JLabel();
        thresholdTextField = new javax.swing.JTextField();
        alarmDurationComboBox = new javax.swing.JComboBox<>();
        volumeSlider = new javax.swing.JSlider();
        logIntervalComboBox = new javax.swing.JComboBox<>();
        configureButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        sensorTypeLabel = new javax.swing.JLabel();
        sensorTypeComboBox = new javax.swing.JComboBox<>();
        mailLabel = new javax.swing.JLabel();
        mailTextField = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        configureLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        configureLabel.setForeground(new java.awt.Color(255, 255, 255));
        configureLabel.setText("Configure ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(configureLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(configureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        thresholdLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thresholdLabel.setForeground(new java.awt.Color(255, 255, 255));
        thresholdLabel.setText("Threshold Value(in P.P.M.):");

        durationLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        durationLabel.setForeground(new java.awt.Color(255, 255, 255));
        durationLabel.setText("Duration of Alarm(min):");

        volumeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        volumeLabel.setForeground(new java.awt.Color(255, 255, 255));
        volumeLabel.setText("Volume of Alarm(in dB):");
        volumeLabel.setToolTipText("");

        logIntervalLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logIntervalLabel.setForeground(new java.awt.Color(255, 255, 255));
        logIntervalLabel.setText("Log Interval(sec):");

        thresholdTextField.setBackground(new java.awt.Color(44, 62, 80));
        thresholdTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thresholdTextField.setForeground(new java.awt.Color(255, 255, 255));
        thresholdTextField.setOpaque(false);
        thresholdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thresholdTextFieldActionPerformed(evt);
            }
        });

        alarmDurationComboBox.setBackground(new java.awt.Color(108, 120, 137));
        alarmDurationComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        alarmDurationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "4", "8" }));
        alarmDurationComboBox.setSelectedIndex(2);
        alarmDurationComboBox.setToolTipText("Time(in minutes)");
        alarmDurationComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        volumeSlider.setBackground(new java.awt.Color(44, 62, 80));
        volumeSlider.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        volumeSlider.setMajorTickSpacing(10);
        volumeSlider.setMaximum(120);
        volumeSlider.setMinimum(60);
        volumeSlider.setMinorTickSpacing(5);
        volumeSlider.setPaintLabels(true);
        volumeSlider.setSnapToTicks(true);
        volumeSlider.setValue(90);
        volumeSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        logIntervalComboBox.setBackground(new java.awt.Color(108, 120, 137));
        logIntervalComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logIntervalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "15", "30", "60", "120", " " }));
        logIntervalComboBox.setToolTipText("Time(in second)");
        logIntervalComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logIntervalComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logIntervalComboBoxActionPerformed(evt);
            }
        });

        configureButton.setBackground(new java.awt.Color(0, 119, 182));
        configureButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        configureButton.setText("Configure");
        configureButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configureButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configureButtonMouseClicked(evt);
            }
        });
        configureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configureButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 51, 51));
        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        sensorTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sensorTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        sensorTypeLabel.setText("Sensor Type:");

        sensorTypeComboBox.setBackground(new java.awt.Color(108, 120, 137));
        sensorTypeComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sensorTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CO Sensor", "Heat Sensor", "Smoke Sensor" }));
        sensorTypeComboBox.setToolTipText("Select sensor type.");
        sensorTypeComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sensorTypeComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sensorTypeComboBoxMouseClicked(evt);
            }
        });
        sensorTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensorTypeComboBoxActionPerformed(evt);
            }
        });

        mailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mailLabel.setForeground(new java.awt.Color(255, 255, 255));
        mailLabel.setText("Email ID (for Alerts):");

        mailTextField.setBackground(new java.awt.Color(44, 62, 80));
        mailTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mailTextField.setForeground(new java.awt.Color(255, 255, 255));
        mailTextField.setOpaque(false);
        mailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(configureButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(logIntervalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(volumeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(volumeSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logIntervalComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mailTextField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(durationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thresholdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thresholdTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alarmDurationComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sensorTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sensorTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sensorTypeLabel)
                    .addComponent(sensorTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thresholdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thresholdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alarmDurationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volumeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logIntervalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logIntervalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(configureButton))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thresholdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thresholdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thresholdTextFieldActionPerformed
    //ActionListener for directing to MainScreen window without configuring any sensor.
    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        // TODO add your handling code here:
        MainScreen.dashBoard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked
    //ActionListener for Configuring a particular type of sensor and directing to MainScreen window.
    private void configureButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configureButtonMouseClicked
        // TODO add your handling code here:
        int stype=sensorTypeComboBox.getSelectedIndex();
        int errorFlag2=0;
        //regex for validating threshold- for accepting any float value
        if(!thresholdTextField.getText().matches("[+]?([0-9]*[.])?[0-9]+")){
            errorFlag2++;
        }
        //regex for validating email ID- for accepting standard email id
        if(!mailTextField.getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")){
            errorFlag2=errorFlag2+2;
        }
        
        if(errorFlag2==0||(errorFlag2==2&&MainScreen.isEmailPresent==true)){
            //stores threshold according to sensor type index chosen
            switch(stype)
            {
                case 0 -> Sensor.thresholdCO = Float.parseFloat(thresholdTextField.getText());
                case 1 -> Sensor.thresholdHeat = Float.parseFloat(thresholdTextField.getText());
                case 2 -> Sensor.thresholdSmoke = Float.parseFloat(thresholdTextField.getText());
            }
            //stores other configuration values
            Sensor.duration = Integer.parseInt(alarmDurationComboBox.getSelectedItem().toString());
            Sensor.volume = volumeSlider.getValue();
            Sensor.logint = Integer.parseInt(logIntervalComboBox.getSelectedItem().toString());
            //if entered mail is not null then store the mail id and set isEmailPresent to true 
            if(!mailTextField.getText().equals(""))
                MainScreen.emailID=mailTextField.getText();
            
            MainScreen.isEmailPresent=true;
            
            switch(stype)
            {
                case 0 -> Location.conCsensor(Sensor.duration,Sensor.volume,Sensor.logint, Sensor.thresholdCO);
                case 1 -> Location.conHsensor(Sensor.duration,Sensor.volume,Sensor.logint, Sensor.thresholdHeat);
                case 2 -> Location.conSsensor(Sensor.duration,Sensor.volume,Sensor.logint, Sensor.thresholdSmoke);
            }
            
            synchronized(this){
                FileIO.WriteToFile("Configured\n"+sensorTypeComboBox.getSelectedItem()+":"+thresholdTextField.getText()+"\nDuration:"+Sensor.duration+"\nVolume:"+Sensor.volume+"\nLog Interval:"+Sensor.logint+"\nEmail ID:"+MainScreen.emailID+"\n");
            }
            
            JOptionPane.showMessageDialog(this,"Configuration Successful");
            
           
            if(isLogTimer==false){              
                logTimer = new java.util.Timer();
                TimerTask logtask = new DataUpdate(){
                    @Override
                    public void run(){
                        Location.allSet();
                        try {
                            synchronized(this){
                            LogGenerator log = new LogGenerator();}
                        } 
                        catch (InterruptedException ex) {
                            Logger.getLogger(ConfigureSensor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                };
                logTimer.scheduleAtFixedRate(logtask, 0, 1000*10000); 
                isLogTimer=true;
            }
            
            
        ConfigureSensor C=new ConfigureSensor();
        C.setVisible(true);
        this.dispose();
        }
        else if(errorFlag2==2&&MainScreen.isEmailPresent==false){
            JOptionPane.showMessageDialog(this,"Invalid Email Address!");
        }
        else{
            JOptionPane.showMessageDialog(this,"Invalid Threshold!");
        }    
    }//GEN-LAST:event_configureButtonMouseClicked

    private void logIntervalComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logIntervalComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logIntervalComboBoxActionPerformed


    private void configureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configureButtonActionPerformed
        // TODO add your handling code here:
   }//GEN-LAST:event_configureButtonActionPerformed

    private void sensorTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sensorTypeComboBoxActionPerformed
        // TODO add your handling code here:
        int stype2= (sensorTypeComboBox.getSelectedIndex());
        
        switch (stype2) {
            case 0:
                thresholdLabel.setText("Threshold Value(in P.P.M.)");
                break;
            case 2:
                thresholdLabel.setText("Threshold Value(in OD/metre)");
                break;
            case 1:
                thresholdLabel.setText("Threshold Value(in °C)");
                break;
            default:
                thresholdLabel.setText("Threshold Value(in P.P.M.)");
                break;
        }
    }//GEN-LAST:event_sensorTypeComboBoxActionPerformed

    private void sensorTypeComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sensorTypeComboBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sensorTypeComboBoxMouseClicked

    private void mailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextFieldActionPerformed

   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConfigureSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigureSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigureSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigureSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigureSensor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alarmDurationComboBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton configureButton;
    private javax.swing.JLabel configureLabel;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> logIntervalComboBox;
    private javax.swing.JLabel logIntervalLabel;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JComboBox<String> sensorTypeComboBox;
    private javax.swing.JLabel sensorTypeLabel;
    private javax.swing.JLabel thresholdLabel;
    private javax.swing.JTextField thresholdTextField;
    private javax.swing.JLabel volumeLabel;
    private javax.swing.JSlider volumeSlider;
    // End of variables declaration//GEN-END:variables
}