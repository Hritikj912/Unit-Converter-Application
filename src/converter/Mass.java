/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;

/**
 *
 * @author RAHUL
 */
public class Mass extends javax.swing.JFrame {

    /**
     * Creates new form Mass
     */
    public Mass() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonne", "Kilogram", "Gram", "Milligram", "Microgram", "Imperial Ton", "US Ton", "Stone", "Pound", "Ounce" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonne", "Kilogram", "Gram", "Milligram", "Microgram", "Imperial Ton", "US Ton", "Stone", "Pound", "Ounce" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MASS  CONVERTER");
        jLabel1.setToolTipText("");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonne", "Kilogram", "Gram", "Milligram", "Microgram", "Imperial Ton", "US Ton", "Stone", "Pound", "Ounce" }));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("TO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-A NOSCIP TECH PRODUCT");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("By Hritik jain");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(145, 145, 145)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(254, 254, 254))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(137, 137, 137)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 FrstFrame f= new FrstFrame();
 f.getContentPane().setBackground(Color.DARK_GRAY);
 f.setExtendedState(MAXIMIZED_BOTH);
f.setVisible(true);
this.dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
/*Tonne
Kilogram
Gram
Milligram
Microgram
Imperial Ton
US Ton
Stone
Pound
Ounce*/
if(jComboBox1.getSelectedItem()=="Tonne"&&jComboBox2.getSelectedItem()=="Tonne")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Tonne"&&jComboBox2.getSelectedItem()=="Kilogram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1000*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Tonne"&&jComboBox2.getSelectedItem()=="Gram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e+6*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Tonne"&&jComboBox2.getSelectedItem()=="Milligram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e+9*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Tonne"&&jComboBox2.getSelectedItem()=="Microgram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e+12*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Tonne"&&jComboBox2.getSelectedItem()=="Imperial Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.984207*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Tonne"&&jComboBox2.getSelectedItem()=="US Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1.10231*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Tonne"&&jComboBox2.getSelectedItem()=="Stone")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=157.473*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Tonne"&&jComboBox2.getSelectedItem()=="Pound")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=2204.62*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Tonne"&&jComboBox2.getSelectedItem()=="Ounce")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=35273.962*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Kilogram"&&jComboBox2.getSelectedItem()=="Tonne")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.001*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Kilogram"&&jComboBox2.getSelectedItem()=="Kilogram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Kilogram"&&jComboBox2.getSelectedItem()=="Gram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1000*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Kilogram"&&jComboBox2.getSelectedItem()=="Milligram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e+6*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Kilogram"&&jComboBox2.getSelectedItem()=="Microgram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e+9*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Kilogram"&&jComboBox2.getSelectedItem()=="Imperial Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.000984207*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Kilogram"&&jComboBox2.getSelectedItem()=="US Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.00110231*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Kilogram"&&jComboBox2.getSelectedItem()=="Stone")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.157473*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Kilogram"&&jComboBox2.getSelectedItem()=="Pound")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=2.20462*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Kilogram"&&jComboBox2.getSelectedItem()=="Ounce")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=35.274*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Gram"&&jComboBox2.getSelectedItem()=="Tonne")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e-6*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Gram"&&jComboBox2.getSelectedItem()=="Kilogram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e-3*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Gram"&&jComboBox2.getSelectedItem()=="Gram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Gram"&&jComboBox2.getSelectedItem()=="Milligram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1000*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Gram"&&jComboBox2.getSelectedItem()=="Microgram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e+6*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Gram"&&jComboBox2.getSelectedItem()=="Imperial Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=9.8421e-7*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Gram"&&jComboBox2.getSelectedItem()=="US Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1.1023e-6*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Gram"&&jComboBox2.getSelectedItem()=="Stone")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.000157473*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Gram"&&jComboBox2.getSelectedItem()=="Pound")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.00220462*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Gram"&&jComboBox2.getSelectedItem()=="Ounce")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.035274*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Milligram"&&jComboBox2.getSelectedItem()=="Tonne")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e-9*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Milligram"&&jComboBox2.getSelectedItem()=="Kilogram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e-6*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Milligram"&&jComboBox2.getSelectedItem()=="Gram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e-3*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Milligram"&&jComboBox2.getSelectedItem()=="Milligram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Milligram"&&jComboBox2.getSelectedItem()=="Microgram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1000*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Milligram"&&jComboBox2.getSelectedItem()=="Imperial Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=9.8421e-10*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Milligram"&&jComboBox2.getSelectedItem()=="US Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1.1023e-9*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Milligram"&&jComboBox2.getSelectedItem()=="Stone")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1.5747e-7*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Milligram"&&jComboBox2.getSelectedItem()=="Pound")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=2.2046e-6*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Milligram"&&jComboBox2.getSelectedItem()=="Ounce")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=3.5274e-5*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Microgram"&&jComboBox2.getSelectedItem()=="Tonne")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e-12*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Microgram"&&jComboBox2.getSelectedItem()=="Kilogram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e-9*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Microgram"&&jComboBox2.getSelectedItem()=="Gram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e-6*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Microgram"&&jComboBox2.getSelectedItem()=="Milligram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1e-3*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Microgram"&&jComboBox2.getSelectedItem()=="Microgram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Microgram"&&jComboBox2.getSelectedItem()=="Imperial Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=9.8421e-13*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Microgram"&&jComboBox2.getSelectedItem()=="US Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1.1023e-12*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Microgram"&&jComboBox2.getSelectedItem()=="Stone")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1.5747e-10*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Microgram"&&jComboBox2.getSelectedItem()=="Pound")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=2.2046e-9*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Microgram"&&jComboBox2.getSelectedItem()=="Ounce")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=3.5274e-8*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Imperial Ton"&&jComboBox2.getSelectedItem()=="Tonne")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1.01605*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Imperial Ton"&&jComboBox2.getSelectedItem()=="Kilogram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1016.05*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Imperial Ton"&&jComboBox2.getSelectedItem()=="Gram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1.016e+6*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Imperial Ton"&&jComboBox2.getSelectedItem()=="Milligram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1.016e+9*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Imperial Ton"&&jComboBox2.getSelectedItem()=="Microgram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1.016e+12*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Imperial Ton"&&jComboBox2.getSelectedItem()=="Imperial Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Imperial Ton"&&jComboBox2.getSelectedItem()=="US Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1.12*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Imperial Ton"&&jComboBox2.getSelectedItem()=="Stone")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=160*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Imperial Ton"&&jComboBox2.getSelectedItem()=="Pound")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=2240*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Imperial Ton"&&jComboBox2.getSelectedItem()=="Ounce")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=35840*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="US Ton"&&jComboBox2.getSelectedItem()=="Tonne")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.907185*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="US Ton"&&jComboBox2.getSelectedItem()=="Kilogram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=907.185*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="US Ton"&&jComboBox2.getSelectedItem()=="Gram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=907185*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="US Ton"&&jComboBox2.getSelectedItem()=="Milligram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=9.072e+8*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="US Ton"&&jComboBox2.getSelectedItem()=="Microgram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=9.072e+11*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="US Ton"&&jComboBox2.getSelectedItem()=="Imperial Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.892857*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="US Ton"&&jComboBox2.getSelectedItem()=="US Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="US Ton"&&jComboBox2.getSelectedItem()=="Stone")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=142.857*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="US Ton"&&jComboBox2.getSelectedItem()=="Pound")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=2000*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="US Ton"&&jComboBox2.getSelectedItem()=="Ounce")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=32000*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Stone"&&jComboBox2.getSelectedItem()=="Tonne")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.00635029*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Stone"&&jComboBox2.getSelectedItem()=="Kilogram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=6.35029*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Stone"&&jComboBox2.getSelectedItem()=="Gram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=6350.29*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Stone"&&jComboBox2.getSelectedItem()=="Milligram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=6350290*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Stone"&&jComboBox2.getSelectedItem()=="Microgram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=6.35e+9*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Stone"&&jComboBox2.getSelectedItem()=="Imperial Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.00625*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Stone"&&jComboBox2.getSelectedItem()=="US Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.007*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Stone"&&jComboBox2.getSelectedItem()=="Stone")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Stone"&&jComboBox2.getSelectedItem()=="Pound")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=14*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Stone"&&jComboBox2.getSelectedItem()=="Ounce")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=224*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Pound"&&jComboBox2.getSelectedItem()=="Tonne")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.000453592*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Pound"&&jComboBox2.getSelectedItem()=="Kilogram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.453592*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Pound"&&jComboBox2.getSelectedItem()=="Gram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=453.592*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Pound"&&jComboBox2.getSelectedItem()=="Milligram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=453592*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Pound"&&jComboBox2.getSelectedItem()=="Microgram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=453592000*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Pound"&&jComboBox2.getSelectedItem()=="Imperial Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.000446429*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Pound"&&jComboBox2.getSelectedItem()=="US Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.0005*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Pound"&&jComboBox2.getSelectedItem()=="Stone")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.0714286*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Pound"&&jComboBox2.getSelectedItem()=="Pound")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Pound"&&jComboBox2.getSelectedItem()=="Ounce")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=16*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Ounce"&&jComboBox2.getSelectedItem()=="Tonne")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=2.835e-5*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Ounce"&&jComboBox2.getSelectedItem()=="Kilogram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=2.835e-2*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Ounce"&&jComboBox2.getSelectedItem()=="Gram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=28.3495*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Ounce"&&jComboBox2.getSelectedItem()=="Milligram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=28349.5*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Ounce"&&jComboBox2.getSelectedItem()=="Microgram")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=2.835e+7*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Ounce"&&jComboBox2.getSelectedItem()=="Imperial Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=2.7902e-5*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Ounce"&&jComboBox2.getSelectedItem()=="US Ton")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=3.125e-5*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Ounce"&&jComboBox2.getSelectedItem()=="Stone")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.00446429*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Ounce"&&jComboBox2.getSelectedItem()=="Pound")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.0625*a1;
jTextField2.setText(Double.toString(c1)); 
}
else if(jComboBox1.getSelectedItem()=="Ounce"&&jComboBox2.getSelectedItem()=="Ounce")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Mass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
