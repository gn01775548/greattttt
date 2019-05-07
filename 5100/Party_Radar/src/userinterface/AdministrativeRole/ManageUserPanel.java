/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;


import Business.Enterprise.Enterprise;
import Business.Group.Group;
import Business.Group.GroupDirectory;
import Business.Member.Member;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class ManageUserPanel extends javax.swing.JPanel {

    private GroupDirectory groupDir;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    
    /**
     * Creates new form ManageGroupJPanel
     */
    public ManageUserPanel(JPanel userProcessContainer,GroupDirectory groupDir, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.groupDir = groupDir;
        valueLabel.setText(enterprise.getName());
        
        populateGroupComboBox();
        populateGroupEmpComboBox();
    }
    
    public void populateGroupComboBox(){
        cbGroupName.removeAllItems();
        
        for (Group group : groupDir.getGroupList()){
            cbGroupName.addItem(group);
        }
    }
    
    public void populateGroupEmpComboBox(){
        cbGroup.removeAllItems();
        
        for (Group group : groupDir.getGroupList()){
            cbGroup.addItem(group);
        }
    }

    private void populateTable(Group group){
        DefaultTableModel model = (DefaultTableModel) tblGroup.getModel();
        
        model.setRowCount(0);
        
        for (Member member : group.getMemberDirectory().getMemberList()){
            Object[] row = new Object[2];
            row[0] = member.getId();
            row[1] = member.getName();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGroup = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        cbGroupName = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        cbGroup = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        lblHeader1 = new javax.swing.JLabel();
        lblHeader2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setForeground(new java.awt.Color(102, 102, 102));

        tblGroup.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblGroup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGroup.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tblGroup);
        if (tblGroup.getColumnModel().getColumnCount() > 0) {
            tblGroup.getColumnModel().getColumn(0).setResizable(false);
            tblGroup.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 430, 200));

        btnCreate.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 640, 80, 30));

        cbGroupName.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbGroupName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbGroupName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGroupNameActionPerformed(evt);
            }
        });
        add(cbGroupName, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 220, 250, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Show User by Group");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 60));

        backJButton.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, -1, 30));

        nameJTextField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 250, -1));

        cbGroup.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGroupActionPerformed(evt);
            }
        });
        add(cbGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 250, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Group");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(102, 102, 102));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, 30));

        lblHeader1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblHeader1.setForeground(new java.awt.Color(102, 102, 102));
        lblHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader1.setText("User Management");
        add(lblHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 220, -1));

        lblHeader2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(204, 0, 0));
        lblHeader2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/partyRadar/memberRole/logo_t.png"))); // NOI18N
        lblHeader2.setPreferredSize(new java.awt.Dimension(400, 124));
        add(lblHeader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 340, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        Group group = (Group) cbGroup.getSelectedItem();
        String name = nameJTextField.getText();
        if (name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Can not be empty!");
            return;
        }
        for (Member m : group.getMemberDirectory().getMemberList()){
            if (m.getName().equals(name)){
                JOptionPane.showMessageDialog(null, "Already created!");
                return;
            }
        }
        group.getMemberDirectory().createMember(name);
        populateTable(group);
        nameJTextField.setText(null);
        JOptionPane.showMessageDialog(null, "Created successfully!");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void cbGroupNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGroupNameActionPerformed
        Group group = (Group) cbGroupName.getSelectedItem();
        if (group != null){
            populateTable(group);
        }
    }//GEN-LAST:event_cbGroupNameActionPerformed

    private void cbGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGroupActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox cbGroup;
    private javax.swing.JComboBox cbGroupName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable tblGroup;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
