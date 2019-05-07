/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import javax.swing.JOptionPane;

/**
 *
 * @author 123
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    private Product product;
    public CreatePanel(Product product) {
        initComponents();
        this.product = product;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        priceTextField = new javax.swing.JTextField();
        availNumTextField = new javax.swing.JTextField();
        descriptionTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(400, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Description:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 212, -1, -1));

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 68, 213, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("Create Your Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, -1, -1));

        jLabel3.setText("Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setText("Availabity Number:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, -1, -1));

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        priceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextFieldActionPerformed(evt);
            }
        });
        add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 114, 213, -1));

        availNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availNumTextFieldActionPerformed(evt);
            }
        });
        add(availNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 160, 213, -1));

        descriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTextFieldActionPerformed(evt);
            }
        });
        add(descriptionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 206, 213, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 256, 400, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        product.setName(nameTextField.getText());
        product.setPrice(priceTextField.getText());
        product.setAvailNum(availNumTextField.getText());
        product.setDescription(descriptionTextField.getText());
        // prompt user that product was successfully ceated
        JOptionPane.showMessageDialog(null, "product successfully ceated");
    }//GEN-LAST:event_createBtnActionPerformed

    private void priceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextFieldActionPerformed

    private void availNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availNumTextFieldActionPerformed

    private void descriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availNumTextField;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField priceTextField;
    // End of variables declaration//GEN-END:variables
}
