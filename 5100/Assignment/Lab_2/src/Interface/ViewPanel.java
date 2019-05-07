/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import Business.Supplier;
import javax.swing.JOptionPane;

/**
 *
 * @author 123
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    private Product product;
    private Supplier supplier;
    public ViewPanel(Product product) {
        initComponents();
        this.product = product;
        
        displayProduct(product);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        availNumTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        descriptionTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        supNameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        supAddTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("View Your Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 6, -1, -1));

        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, -1, -1));

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 58, 241, -1));

        jLabel3.setText("Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, -1, -1));

        priceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextFieldActionPerformed(evt);
            }
        });
        add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 98, 241, -1));

        jLabel4.setText("Availabity Number:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 144, 129, -1));

        availNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availNumTextFieldActionPerformed(evt);
            }
        });
        add(availNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 138, 241, -1));

        jLabel5.setText("Description:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, -1, -1));

        descriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTextFieldActionPerformed(evt);
            }
        });
        add(descriptionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 178, 241, -1));

        jLabel6.setText("Supplier Name:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 212, -1, -1));

        supNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supNameTextFieldActionPerformed(evt);
            }
        });
        add(supNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 212, 241, 26));

        jLabel7.setText("Supplier Address:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        supAddTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supAddTextFieldActionPerformed(evt);
            }
        });
        add(supAddTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 250, 241, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void priceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextFieldActionPerformed

    private void availNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availNumTextFieldActionPerformed

    private void descriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTextFieldActionPerformed

    private void supNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supNameTextFieldActionPerformed

    private void supAddTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supAddTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supAddTextFieldActionPerformed
    private void displayProduct(Product product){
              
       String productName = product.getName();
       nameTextField.setText(productName);
       nameTextField.setEnabled(false);
       
       String productPrice = product.getPrice();
       priceTextField.setText(productPrice);
       priceTextField.setEnabled(false);
       
       String productAvailNum = product.getAvailNum();
       availNumTextField.setText(productAvailNum);
       availNumTextField.setEnabled(false);
       
       String productDescription = product.getDescription();
       descriptionTextField.setText(productDescription);
       descriptionTextField.setEnabled(false);
       
       String suplierSupName = product.getSuplier().getSupName();
       supNameTextField.setText(suplierSupName);
       supNameTextField.setEnabled(false);
       
       String suplierSupAdd =  product.getSuplier().getSupAdd();
       supAddTextField.setText(suplierSupAdd);
       supAddTextField.setEnabled(false);
       
       
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availNumTextField;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField supAddTextField;
    private javax.swing.JTextField supNameTextField;
    // End of variables declaration//GEN-END:variables

  
}
