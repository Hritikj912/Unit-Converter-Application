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
public class PlaneAngle extends javax.swing.JFrame {

    /**
     * Creates new form PlaneAngle
     */
    public PlaneAngle() {
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
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Degree", "Gradian", "Milliradian", "Minute of Arc", "Radian", "Second of Arc" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Degree", "Gradian", "Milliradian", "Minute of Arc", "Radian", "Second of Arc" }));

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
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLANE ANGLE   CONVERTER");
        jLabel1.setToolTipText("");

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
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)
                        .addComponent(jButton3)))
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(254, 254, 254))
            .addGroup(layout.createSequentialGroup()
                .addGap(544, 544, 544)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
  /*Degree
Gradian
Milliradian
Minute of Arc
Radian
Second of Arc
        */
  if(jComboBox1.getSelectedItem()=="Degree"&&jComboBox2.getSelectedItem()=="Degree")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Degree"&&jComboBox2.getSelectedItem()=="Gradian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1.11111*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Degree"&&jComboBox2.getSelectedItem()=="Milliradian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=17.4533*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Degree"&&jComboBox2.getSelectedItem()=="Minute of Arc")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=60*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Degree"&&jComboBox2.getSelectedItem()=="Radian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.0174533*a1;
jTextField2.setText(Double.toString(c1)); 
}
   else if(jComboBox1.getSelectedItem()=="Degree"&&jComboBox2.getSelectedItem()=="Second of Arc")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=3600*a1;
jTextField2.setText(Double.toString(c1)); 
}
   else  if(jComboBox1.getSelectedItem()=="Gradian"&&jComboBox2.getSelectedItem()=="Degree")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.9*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Gradian"&&jComboBox2.getSelectedItem()=="Gradian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Gradian"&&jComboBox2.getSelectedItem()=="Milliradian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=15.708*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Gradian"&&jComboBox2.getSelectedItem()=="Minute of Arc")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=54*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Gradian"&&jComboBox2.getSelectedItem()=="Radian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.015708*a1;
jTextField2.setText(Double.toString(c1)); 
}
   else if(jComboBox1.getSelectedItem()=="Gradian"&&jComboBox2.getSelectedItem()=="Second of Arc")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=3240*a1;
jTextField2.setText(Double.toString(c1)); 
}
   else  if(jComboBox1.getSelectedItem()=="Milliradian"&&jComboBox2.getSelectedItem()=="Degree")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.0572958*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Milliradian"&&jComboBox2.getSelectedItem()=="Gradian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.063662*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Milliradian"&&jComboBox2.getSelectedItem()=="Milliradian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Milliradian"&&jComboBox2.getSelectedItem()=="Minute of Arc")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=3.43775*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Milliradian"&&jComboBox2.getSelectedItem()=="Radian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.001*a1;
jTextField2.setText(Double.toString(c1)); 
}
   else if(jComboBox1.getSelectedItem()=="Milliradian"&&jComboBox2.getSelectedItem()=="Second of Arc")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=206.265*a1;
jTextField2.setText(Double.toString(c1)); 
}
   else  if(jComboBox1.getSelectedItem()=="Minute of Arc"&&jComboBox2.getSelectedItem()=="Degree")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.0166667*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Minute of Arc"&&jComboBox2.getSelectedItem()=="Gradian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.0185185*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Minute of Arc"&&jComboBox2.getSelectedItem()=="Milliradian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.290888*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Minute of Arc"&&jComboBox2.getSelectedItem()=="Minute of Arc")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Minute of Arc"&&jComboBox2.getSelectedItem()=="Radian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.000290888*a1;
jTextField2.setText(Double.toString(c1)); 
}
   else if(jComboBox1.getSelectedItem()=="Minute of Arc"&&jComboBox2.getSelectedItem()=="Second of Arc")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=60*a1;
jTextField2.setText(Double.toString(c1)); 
}
   else  if(jComboBox1.getSelectedItem()=="Radian"&&jComboBox2.getSelectedItem()=="Degree")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=57.2958*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Radian"&&jComboBox2.getSelectedItem()=="Gradian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=63.662*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Radian"&&jComboBox2.getSelectedItem()=="Milliradian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=1000*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Radian"&&jComboBox2.getSelectedItem()=="Minute of Arc")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=3437.75*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Radian"&&jComboBox2.getSelectedItem()=="Radian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=a1;
jTextField2.setText(Double.toString(c1)); 
}
   else if(jComboBox1.getSelectedItem()=="Radian"&&jComboBox2.getSelectedItem()=="Second of Arc")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=206265*a1;
jTextField2.setText(Double.toString(c1)); 
}
   else  if(jComboBox1.getSelectedItem()=="Second of Arc"&&jComboBox2.getSelectedItem()=="Degree")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.000277778*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Second of Arc"&&jComboBox2.getSelectedItem()=="Gradian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.000308642*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Second of Arc"&&jComboBox2.getSelectedItem()=="Milliradian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.00484814*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Second of Arc"&&jComboBox2.getSelectedItem()=="Minute of Arc")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=0.0166667*a1;
jTextField2.setText(Double.toString(c1)); 
}
  else if(jComboBox1.getSelectedItem()=="Second of Arc"&&jComboBox2.getSelectedItem()=="Radian")
{
    String a=jTextField1.getText();
    double a1=Double.parseDouble(a);
double c1=4.8481e-6*a1;
jTextField2.setText(Double.toString(c1)); 
}
   else if(jComboBox1.getSelectedItem()=="Second of Arc"&&jComboBox2.getSelectedItem()=="Second of Arc")
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
            java.util.logging.Logger.getLogger(PlaneAngle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaneAngle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaneAngle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaneAngle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaneAngle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
