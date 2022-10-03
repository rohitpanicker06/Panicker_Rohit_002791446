/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Utility.ValidationHelper;
import java.awt.CardLayout;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.EmployeePojo;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
import javax.swing.text.Document;

/**
 *
 * @author rohitPanicker
 */
public class ViewRecordsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRecordsJPanel
     */
    ArrayList<EmployeePojo> employeeDatabase;

    public ViewRecordsJPanel(ArrayList<EmployeePojo> employeeDatabase) {
        initComponents();
        this.employeeDatabase = employeeDatabase;
        populateAndFillRecordsTable();
    }

    private void populateAndFillRecordsTable() {
        DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        tableModel.setRowCount(0);
        try {
            for (EmployeePojo employeeRecord : employeeDatabase) {

                Object[] row = new Object[5];
                row[0] = employeeRecord;
                row[1] = employeeRecord.getName();
                row[2] = employeeRecord.getGender();
                row[3] = employeeRecord.getAge();
                row[4] = employeeRecord.getPositionTitle();

                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        btnViewSelectedRecord = new javax.swing.JButton();
        btnDeleteSelectedRecord = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAdditionalName = new javax.swing.JTextField();
        txtAdditionalId = new javax.swing.JTextField();
        txtAdditionalAge = new javax.swing.JTextField();
        txtAdditionalTitle = new javax.swing.JTextField();
        txtAdditionalTeamInfo = new javax.swing.JTextField();
        txtAdditionalStartDate = new javax.swing.JTextField();
        txtAdditionalLevel = new javax.swing.JTextField();
        txtAdditionalEmailId = new javax.swing.JTextField();
        txtAdditionalPhoneNumber = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtFieldSearch = new javax.swing.JTextField();
        radioBtnMale = new javax.swing.JRadioButton();
        radioBtnFemale = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW EMPLOYEE RECORDS");

        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Name", "Gender", "Age", "Position Title"
            }
        ));
        jScrollPane1.setViewportView(tblRecords);

        btnViewSelectedRecord.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewSelectedRecord.setText("View Selected Record");
        btnViewSelectedRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSelectedRecordActionPerformed(evt);
            }
        });

        btnDeleteSelectedRecord.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeleteSelectedRecord.setText("Delete Selected Record");
        btnDeleteSelectedRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSelectedRecordActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Employee ID:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Age:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("Title:");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setText("Team Info:");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setText("Gender:");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setText("Start Date:");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setText("Level:");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setText("Email Id:");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel11.setText("Phone Number:");

        txtAdditionalId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdditionalIdActionPerformed(evt);
            }
        });

        txtAdditionalEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdditionalEmailIdActionPerformed(evt);
            }
        });

        lblPhoto.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoto.setOpaque(true);

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update Selected Record");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtFieldSearch.setOpaque(true);
        txtFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldSearchActionPerformed(evt);
            }
        });
        txtFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldSearchKeyPressed(evt);
            }
        });

        radioBtnMale.setText("Male");
        radioBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMaleActionPerformed(evt);
            }
        });

        radioBtnFemale.setText("Female");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel12.setText("Search Employee:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(765, 765, 765))
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(lblPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnViewSelectedRecord)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(txtAdditionalName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(88, 88, 88)
                                                .addComponent(txtAdditionalId, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtAdditionalAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAdditionalTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(radioBtnMale)
                                                    .addGap(25, 25, 25)
                                                    .addComponent(radioBtnFemale))
                                                .addComponent(txtAdditionalTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(69, 69, 69)
                                                .addComponent(btnDeleteSelectedRecord))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(113, 113, 113)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel9))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtAdditionalEmailId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtAdditionalPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(39, 39, 39)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtAdditionalStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtAdditionalLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))))))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewSelectedRecord)
                    .addComponent(btnUpdate)
                    .addComponent(btnDeleteSelectedRecord))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAdditionalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtAdditionalStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAdditionalEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdditionalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAdditionalAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtAdditionalPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdditionalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(txtAdditionalLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAdditionalTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(radioBtnMale)
                    .addComponent(radioBtnFemale))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteSelectedRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSelectedRecordActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblRecords.getSelectedRow();

            if (selectedRowIndex == -1) {
                JOptionPane.showMessageDialog(this, "No Row is selected to Delete, Please Try Again");
                return;
            }

            DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
            EmployeePojo employeeRecord = (EmployeePojo) tableModel.getValueAt(selectedRowIndex, 0);
            deleteRecord(employeeRecord);
            clearAllFields();
        } catch (Exception e) {
            System.out.println("Exception occured while deleting ");
        }
    }//GEN-LAST:event_btnDeleteSelectedRecordActionPerformed

    private void btnViewSelectedRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSelectedRecordActionPerformed
        // TODO add your handling code here:
        clearAllFields();
        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Row is selected to View, Please Try Again");
            return;
        }

        EmployeePojo employeeRecord = (EmployeePojo) tblRecords.getValueAt(selectedRowIndex, 0);
        lblPhoto.setIcon(new ImageIcon(employeeRecord.getImage()));
        populateAdditionalDetails(employeeRecord);

    }//GEN-LAST:event_btnViewSelectedRecordActionPerformed

    private void populateAdditionalDetails(EmployeePojo employeeRecord) {
        radioBtnMale.setSelected(false);
        radioBtnFemale.setSelected(false);
        txtAdditionalName.setText(employeeRecord.getName());
        txtAdditionalAge.setText(String.valueOf(employeeRecord.getAge()));
        txtAdditionalEmailId.setText(employeeRecord.getEmailAddress());
        if (employeeRecord.getGender().equalsIgnoreCase("Male")) {
            radioBtnMale.setSelected(true);
        } else {
            radioBtnFemale.setSelected(true);
        }
        txtAdditionalLevel.setText(employeeRecord.getLevel());
        txtAdditionalPhoneNumber.setText(employeeRecord.getPhoneNumber());
        txtAdditionalTitle.setText(employeeRecord.getPositionTitle());
        txtAdditionalTeamInfo.setText(employeeRecord.getTeamInformation());
        txtAdditionalStartDate.setText(employeeRecord.getStartDate().toString());
        txtAdditionalId.setText(String.valueOf(employeeRecord.getEmployeeId()));
    }
    private void txtAdditionalEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdditionalEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdditionalEmailIdActionPerformed
    private EmployeePojo generateUpdatedRecord(EmployeePojo employeeProfile) {

        return employeeProfile;
    }


    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblRecords.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Row is selected to Update, Please Try Again");
            return;
        }

        EmployeePojo employeeRecord = (EmployeePojo) tblRecords.getValueAt(selectedRowIndex, 0);
        boolean result = checkAllValidation(employeeRecord);
        if (result) {
            employeeRecord = generateUpdatedRecord(employeeRecord);
            JOptionPane.showMessageDialog(this, "Record updated successfully");
            populateAndFillRecordsTable();
            clearAllFields();
        }

    }//GEN-LAST:event_btnUpdateActionPerformed
    private void clearAllFields() {
        txtAdditionalAge.setText("");
        txtAdditionalEmailId.setText("");
        txtAdditionalId.setText("");
        txtAdditionalLevel.setText("");
        txtAdditionalName.setText("");
        txtAdditionalPhoneNumber.setText("");
        txtAdditionalStartDate.setText("");
        txtAdditionalTeamInfo.setText("");
        txtAdditionalTitle.setText("");
        lblPhoto.setIcon(null);
        radioBtnFemale.setSelected(false);
        radioBtnMale.setSelected(false);

    }

    private boolean checkAllValidation(EmployeePojo employeeProfile) {
        int errorCount = 0;
        StringBuffer errorNotifier = new StringBuffer("Please correct the following Errors\n");

        if (ValidationHelper.isValidName(txtAdditionalName.getText())) {
            employeeProfile.setName(txtAdditionalName.getText());
        } else {
            errorCount++;
            errorNotifier.append(errorCount).append(". Name should start with a Character\n");
        }

        if (ValidationHelper.isInteger(txtAdditionalId.getText())) {
            employeeProfile.setEmployeeId(Integer.parseInt(txtAdditionalId.getText()));
        } else {
            errorCount++;
            errorNotifier.append(errorCount).append(". EMP ID shoule be an Integer\n");

        }

        if (ValidationHelper.isInteger(txtAdditionalAge.getText())) {
            employeeProfile.setAge(Integer.parseInt(txtAdditionalAge.getText()));
        } else {
            errorCount++;
            errorNotifier.append(errorCount).append(". Age should be an Integer\n");

        }

        if (radioBtnMale.isSelected() || radioBtnFemale.isSelected()) {
            employeeProfile.setGender(radioBtnMale.isSelected() ? "Male" : "Female");
        } else {
            errorCount++;
            errorNotifier.append(errorCount).append(". Select Gender\n");

        }

        if (!ValidationHelper.isInteger(txtAdditionalLevel.getText())) {
            employeeProfile.setLevel(txtAdditionalLevel.getText());
        } else {
            errorCount++;
            errorNotifier.append(errorCount).append(". Level Should be a String\n");

        }

        if (!ValidationHelper.isInteger(txtAdditionalTeamInfo.getText())) {
            employeeProfile.setTeamInformation(txtAdditionalTeamInfo.getText());
        } else {
            errorCount++;
            errorNotifier.append(errorCount).append(". Team-Info Should be a String\n");

        }

        if (!ValidationHelper.isInteger(txtAdditionalTitle.getText())) {
            employeeProfile.setPositionTitle(txtAdditionalTitle.getText());
        } else {
            errorCount++;
            errorNotifier.append(errorCount).append(". Position Title Should be a String\n");

        }

        if (ValidationHelper.isValidEmailID(txtAdditionalEmailId.getText())) {
            employeeProfile.setEmailAddress(txtAdditionalEmailId.getText());
        } else {
            errorCount++;
            errorNotifier.append(errorCount).append(". Email-id is malformed [eg. abcd@gmail.com] \n");

        }

        if (ValidationHelper.checkPhoneNumberWith10Digits(txtAdditionalPhoneNumber.getText())) {
            employeeProfile.setPhoneNumber(txtAdditionalPhoneNumber.getText());
        } else {
            errorCount++;
            errorNotifier.append(errorCount).append(". Phone Number should be Integer and should be of 10 digits\n");

        }

        if (errorCount > 0) {
            JOptionPane.showMessageDialog(this, errorNotifier.toString());
            return false;
        } else {
            return true;
        }
    }
    private void txtAdditionalIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdditionalIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdditionalIdActionPerformed

    private void txtFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldSearchKeyPressed
        // TODO add your handling code here:
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblRecords.getModel();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(defaultTableModel);
        tblRecords.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(txtFieldSearch.getText().trim()));
    }//GEN-LAST:event_txtFieldSearchKeyPressed

    private void txtFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSearchActionPerformed

    private void radioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMaleActionPerformed

    private void deleteRecord(EmployeePojo employeeRecord) {
        employeeDatabase.remove(employeeRecord);
        JOptionPane.showMessageDialog(this, "Record deleted successfully");
        populateAndFillRecordsTable();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteSelectedRecord;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewSelectedRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JRadioButton radioBtnFemale;
    private javax.swing.JRadioButton radioBtnMale;
    private javax.swing.JTable tblRecords;
    private javax.swing.JTextField txtAdditionalAge;
    private javax.swing.JTextField txtAdditionalEmailId;
    private javax.swing.JTextField txtAdditionalId;
    private javax.swing.JTextField txtAdditionalLevel;
    private javax.swing.JTextField txtAdditionalName;
    private javax.swing.JTextField txtAdditionalPhoneNumber;
    private javax.swing.JTextField txtAdditionalStartDate;
    private javax.swing.JTextField txtAdditionalTeamInfo;
    private javax.swing.JTextField txtAdditionalTitle;
    private javax.swing.JTextField txtFieldSearch;
    // End of variables declaration//GEN-END:variables
}
