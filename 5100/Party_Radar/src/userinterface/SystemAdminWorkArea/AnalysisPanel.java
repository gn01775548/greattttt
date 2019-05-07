/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Campus.Campus;
import Business.CampusParty;
import Business.Enterprise.Enterprise;
import Business.Enterprise.VenueRadarEnterprise;
import Business.Group.EventManagerGroup;
import Business.Group.Group;
import Business.InformationQueue.EventPost;
import Business.InformationQueue.InformationPost;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shuai
 */
public class AnalysisPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CampusParty system;
    /**
     * Creates new form AnalysisPanel
     */
    public AnalysisPanel(JPanel userProcessContainer, CampusParty system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populate();
    }
    private void populate(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        
        // calculate Venue number
        int venueSize = 0;
        // total event number
        int eventNum = 0;
        // total rigist event number
        int eventReg = 0;
        for (Campus c : system.getCampusList()){
            for (Enterprise e : c.getEnterpriseDirectory().getEnterpriseList()){
                if (e instanceof VenueRadarEnterprise){
                    venueSize = ((VenueRadarEnterprise) e).getVenueDirectory().getVenueDirectory().size();
                } else {
                    for (Group g : e.getGroupDirectory().getGroupList()){
                        if (g instanceof EventManagerGroup){
                            for (InformationPost info : g.getInfoQueue().getInfoPostList()){
                                if (info instanceof EventPost){
                                    Object[] row = new Object[2];
                                    row[0] = ((EventPost) info).getEventName();
                                    row[1] = ((EventPost) info).getCurrentRegister().size();
                                    model.addRow(row);
                                    eventNum++;
                                    eventReg += ((EventPost) info).getCurrentRegister().size();
                                }
                            }
                        }
                    }
                }
            }
        }
        lblVenue.setText(Integer.toString(venueSize));
        lblEvent.setText(Integer.toString(eventNum));
        lblReg.setText(Integer.toString(eventReg));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblEvent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblReg = new javax.swing.JLabel();
        lblVenue = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblHeader1 = new javax.swing.JLabel();
        lblHeader2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Event Name", "# Registration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 500, 250));

        lblEvent.setForeground(new java.awt.Color(102, 102, 102));
        lblEvent.setText("#");
        add(lblEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Events in total");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Registration");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        lblReg.setForeground(new java.awt.Color(102, 102, 102));
        lblReg.setText("#");
        add(lblReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        lblVenue.setForeground(new java.awt.Color(102, 102, 102));
        lblVenue.setText("#");
        add(lblVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("In Campus Party Ecosystem, there are:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, -1, -1));

        lblHeader1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblHeader1.setForeground(new java.awt.Color(102, 102, 102));
        lblHeader1.setText("Analysis Dashboard");
        add(lblHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 250, -1));

        lblHeader2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(204, 0, 0));
        lblHeader2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/partyRadar/memberRole/logo_t.png"))); // NOI18N
        lblHeader2.setPreferredSize(new java.awt.Dimension(400, 124));
        add(lblHeader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 340, 70));

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Venue");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaPanel sysAdminWA = (SystemAdminWorkAreaPanel) component;
        sysAdminWA.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblReg;
    private javax.swing.JLabel lblVenue;
    // End of variables declaration//GEN-END:variables
}