/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Agency.FlightSchedule;

import UserInterface.Agency.Airliner.*;
import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Flight;
import Business.FlightDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zerel
 */
public class MasterFlightJPanel extends javax.swing.JPanel {

    JPanel container;
    Airliner airliner;    
    FlightDirectory flightDirectory;
    AirlinerDirectory airlinerDirectory;
    /**
     * Creates new form ViewSupplier
     */
    public MasterFlightJPanel(JPanel c, AirlinerDirectory airDir) {
        initComponents();
        this.container = c;
        this.airlinerDirectory = airDir;
        refreshTable();
    }

  
    
    private void refreshTable() {
        int rowCount = masterSche.getRowCount();
        DefaultTableModel model = (DefaultTableModel)masterSche.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(Airliner a : airlinerDirectory.getAirlinerDict()){
            for (Flight f : a.getFlightDirectory().getFlightDir()){
                
            Object row[] = new Object[6];
            row[0] = a.getAirlinerName();  
            row[1] = f;
            row[2] = f.getFlightTime();
            row[3] = f.getFlightFromLoca();
            row[4] = f.getFlightToLoca();
            row[5] = f.getAirplaneName();
            model.addRow(row);
            }           
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airlinerName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        masterSche = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnViewFD = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFromLoca = new javax.swing.JTextField();
        btnSearchFromLoca = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSearchTime = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtToLoca = new javax.swing.JTextField();
        btnSearchToLoca = new javax.swing.JButton();
        boxTime = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        airlinerName.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        airlinerName.setText("Master Schedule");
        add(airlinerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 30));

        masterSche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Airliner", "Flight Name", "Flight Time", "From Location", "To Location", "Airplane"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(masterSche);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 630, 240));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        btnViewFD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViewFD.setText("View Flight Detail >>");
        btnViewFD.setToolTipText("");
        btnViewFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFDActionPerformed(evt);
            }
        });
        add(btnViewFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 220, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("From Location:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, 30));

        txtFromLoca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtFromLoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 250, -1));

        btnSearchFromLoca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchFromLoca.setText("Search From Location>>");
        btnSearchFromLoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFromLocaActionPerformed(evt);
            }
        });
        add(btnSearchFromLoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 240, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Flight Time:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 30));

        btnSearchTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchTime.setText("Search Time >>");
        btnSearchTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTimeActionPerformed(evt);
            }
        });
        add(btnSearchTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 180, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("To Location:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, 30));

        txtToLoca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtToLoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 250, -1));

        btnSearchToLoca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchToLoca.setText("Search To Location>>");
        btnSearchToLoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchToLocaActionPerformed(evt);
            }
        });
        add(btnSearchToLoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 240, 30));

        boxTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning", "Afternoon", "Evening" }));
        add(boxTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFDActionPerformed
        // TODO add your handling code here:
        int row = masterSche.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Flight f = (Flight)masterSche.getValueAt(row, 1);
        MasterFlightDetailJPanel mfdjp = new MasterFlightDetailJPanel(container, f);
        container.add("MasterFlightDetailJPanel", mfdjp);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnViewFDActionPerformed

    private void btnSearchFromLocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFromLocaActionPerformed
        // TODO add your handling code here:
            String flightFromLoca = txtFromLoca.getText();        
            Flight flight;
            flight = airlinerDirectory.searchAirlinerbyFromLoca(flightFromLoca);
            MasterFlightDetailJPanel mfdjp = new MasterFlightDetailJPanel(container, flight);
            container.add("MasterFlightDetailJPanel", mfdjp);
            CardLayout layout = (CardLayout)container.getLayout();
            layout.next(container);            
    }//GEN-LAST:event_btnSearchFromLocaActionPerformed

    private void btnSearchTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTimeActionPerformed
        // TODO add your handling code here:
        String flightTime = (String) boxTime.getSelectedItem();
            Flight flight;
            flight = airlinerDirectory.searchAirlinerbyTime(flightTime);
            MasterFlightDetailJPanel mfdjp = new MasterFlightDetailJPanel(container, flight);
            container.add("MasterFlightDetailJPanel", mfdjp);
            CardLayout layout = (CardLayout)container.getLayout();
            layout.next(container);   
    }//GEN-LAST:event_btnSearchTimeActionPerformed

    private void btnSearchToLocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchToLocaActionPerformed
        // TODO add your handling code here:
        String flightToLoca = txtToLoca.getText();        
            Flight flight;
            flight = airlinerDirectory.searchAirlinerbyFromLoca(flightToLoca);
            MasterFlightDetailJPanel mfdjp = new MasterFlightDetailJPanel(container, flight);
            container.add("MasterFlightDetailJPanel", mfdjp);
            CardLayout layout = (CardLayout)container.getLayout();
            layout.next(container);   
    }//GEN-LAST:event_btnSearchToLocaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airlinerName;
    private javax.swing.JComboBox boxTime;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearchFromLoca;
    private javax.swing.JButton btnSearchTime;
    private javax.swing.JButton btnSearchToLoca;
    private javax.swing.JButton btnViewFD;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable masterSche;
    private javax.swing.JTextField txtFromLoca;
    private javax.swing.JTextField txtToLoca;
    // End of variables declaration//GEN-END:variables
}
