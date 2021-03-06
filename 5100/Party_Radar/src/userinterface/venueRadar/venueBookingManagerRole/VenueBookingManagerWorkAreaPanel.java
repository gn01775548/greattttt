/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package userinterface.venueRadar.venueBookingManagerRole;

import Business.Campus.Campus;
import Business.Enterprise.Enterprise;
import Business.Group.VenueBookingManagerGroup;
import Business.UserAccount.UserAccount;
import Business.Group.VenueMaintainanceManagerGroup;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author
 */
public class VenueBookingManagerWorkAreaPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private VenueBookingManagerGroup group;
    private Enterprise enterprise;
    private Campus campus;
    
    


    /** Creates new form BrowseProducts */
    public VenueBookingManagerWorkAreaPanel(JPanel userProcessContainer, UserAccount account, VenueBookingManagerGroup group, Enterprise enterprise, Campus campus) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.group = group;
        this.campus = campus;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
      
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        productTable2 = new javax.swing.JTable();
        btnMngBooking = new javax.swing.JButton();
        btnMngVenue = new javax.swing.JButton();
        lblHeader2 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        lblHeader1 = new javax.swing.JLabel();

        productTable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Product Id", "Price", "Avail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(productTable2);

        setBackground(new java.awt.Color(250, 250, 250));
        setPreferredSize(new java.awt.Dimension(750, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMngBooking.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnMngBooking.setText(">> Process Venue Request");
        btnMngBooking.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMngBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngBookingActionPerformed(evt);
            }
        });
        add(btnMngBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 290, 40));

        btnMngVenue.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnMngVenue.setText(">> Manage Venue");
        btnMngVenue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMngVenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngVenueActionPerformed(evt);
            }
        });
        add(btnMngVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 290, 40));

        lblHeader2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(204, 0, 0));
        lblHeader2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/partyRadar/memberRole/logo_v.png"))); // NOI18N
        lblHeader2.setPreferredSize(new java.awt.Dimension(400, 124));
        add(lblHeader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 70));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(102, 102, 102));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, 30));

        lblHeader1.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblHeader1.setForeground(new java.awt.Color(102, 102, 102));
        lblHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader1.setText("Venue Booking Work Area");
        add(lblHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMngBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngBookingActionPerformed

        ProcessVenueRequestPanel processVenueRequestPanel = new ProcessVenueRequestPanel(userProcessContainer, account, group, enterprise, campus);
        userProcessContainer.add("ProcessVenueRequestPanel", processVenueRequestPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMngBookingActionPerformed

    private void btnMngVenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngVenueActionPerformed
        // TODO add your handling code here:
        ManageVenuePanel mngVenuePanel = new ManageVenuePanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageBookingPanel", mngVenuePanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnMngVenueActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMngBooking;
    private javax.swing.JButton btnMngVenue;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JTable productTable2;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
