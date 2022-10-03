/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Utility.DateParser;
import Utility.ValidationHelper;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.EmployeePojo;

/**
 *
 * @author rohitPanicker
 */
public class CreateRecordJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateRecordJPanel
     */
    ArrayList<EmployeePojo> employeeDatabase;

    public CreateRecordJPanel(ArrayList<EmployeePojo> employeeProfiles) {
        initComponents();
        this.employeeDatabase = employeeProfiles;
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
        lblName = new javax.swing.JLabel();
        lblEmployeeId = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeamInformation = new javax.swing.JLabel();
        lblPositionTitle = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        lblPhoneNumber2 = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        btnCreateProfile = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtEmployeeId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInformation = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        radioBtnMale = new javax.swing.JRadioButton();
        radioBtnFemale = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE EMPLOYEE PROFILE");

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Name:");

        lblEmployeeId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmployeeId.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmployeeId.setText("Employee ID:");

        lblAge.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age:");

        lblGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGender.setText("Gender:");

        lblLevel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLevel.setText("Level:");

        lblTeamInformation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTeamInformation.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTeamInformation.setText("Team Information:");

        lblPositionTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPositionTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPositionTitle.setText("Title:");

        lblEmailAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmailAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmailAddress.setText("Email Id:");

        lblPhoneNumber2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPhoneNumber2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPhoneNumber2.setText("Phone Number:");

        lblStartDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStartDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblStartDate.setText("Start Date: ");

        btnCreateProfile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateProfile.setText("CREATE");
        btnCreateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProfileActionPerformed(evt);
            }
        });

        lblPhoto.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoto.setOpaque(true);

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Photo:");

        radioBtnMale.setText("Male");

        radioBtnFemale.setText("Female");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTeamInformation))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTeamInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(radioBtnMale)
                        .addGap(18, 18, 18)
                        .addComponent(radioBtnFemale)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnBrowse)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(btnCreateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(radioBtnMale)
                            .addComponent(radioBtnFemale))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLevel))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeId)
                            .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTeamInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTeamInformation))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPositionTitle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber2)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(btnCreateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProfileActionPerformed
        // TODO add your handling code here:

        try {
            EmployeePojo employeeProfile = new EmployeePojo();
            int errorCount = 0;
            StringBuffer errorNotifier = new StringBuffer("Please correct the following Errors\n");

            if (ValidationHelper.isValidName(txtName.getText())) {
                employeeProfile.setName(txtName.getText());
            } else {
                errorCount++;
                errorNotifier.append(errorCount).append(". Name should start with a Character\n");

            }

            if (ValidationHelper.isInteger(txtEmployeeId.getText())) {
                employeeProfile.setEmployeeId(Integer.parseInt(txtEmployeeId.getText()));
            } else {
                errorCount++;
                errorNotifier.append(errorCount).append(". EMP ID shoule be an Integer\n");

            }

            if (ValidationHelper.isInteger(txtAge.getText())) {
                employeeProfile.setAge(Integer.parseInt(txtAge.getText()));
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

            if (!ValidationHelper.isInteger(txtLevel.getText())) {
                employeeProfile.setLevel(txtLevel.getText());
            } else {
                errorCount++;
                errorNotifier.append(errorCount).append(". Level Should be a String\n");

            }

            if (!ValidationHelper.isInteger(txtTeamInformation.getText())) {
                employeeProfile.setTeamInformation(txtTeamInformation.getText());
            } else {
                errorCount++;
                errorNotifier.append(errorCount).append(". Team-Info Should be a String\n");

            }

            if (!ValidationHelper.isInteger(txtTitle.getText())) {
                employeeProfile.setPositionTitle(txtTitle.getText());
            } else {
                errorCount++;
                errorNotifier.append(errorCount).append(". Position Title Should be a String\n");

            }

            if (ValidationHelper.isValidEmailID(txtEmailId.getText())) {
                employeeProfile.setEmailAddress(txtEmailId.getText());
            } else {
                errorCount++;
                errorNotifier.append(errorCount).append(". Email-id is malformed [eg. abcd@gmail.com] \n");

            }

            if (ValidationHelper.checkPhoneNumberWith10Digits(txtPhoneNumber.getText())) {
                employeeProfile.setPhoneNumber(txtPhoneNumber.getText());
            } else {
                errorCount++;
                errorNotifier.append(errorCount).append(". Phone Number should be Integer and should be of 10 digits\n");

            }
            try {
                Date date = DateParser.getDateFromString(txtStartDate.getText());
                employeeProfile.setStartDate(date);
            } catch (ParseException exception) {
                errorCount++;
                errorNotifier.append(errorCount).append(" Please enter date in MM/dd/yyyy format\n");
            }

            if (null != globalImage) {
                employeeProfile.setImage(globalImage);
            } else {
                errorCount++;
                errorNotifier.append(errorCount + ". Please upload image before proceeding");
            }

            if (errorCount > 0) {
                JOptionPane.showMessageDialog(this, errorNotifier.toString());
                
            } else {
                if (!checkDuplicates(employeeProfile.getEmployeeId())) {
                    try {
                        employeeDatabase.add(employeeProfile);
                    } catch (Exception e) {
                        System.out.println("Exception occured while adding employee to Database Record = " + e.getMessage());
                    }
                    JOptionPane.showMessageDialog(this, "New Employee Profile Created successfully");
                    clearAllFields();
                } else {
                    JOptionPane.showMessageDialog(this, "An employee with Similar ID exists already, please try again");
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occoured while creation" + e.getMessage());
        }
    }//GEN-LAST:event_btnCreateProfileActionPerformed

    private boolean checkDuplicates(long empId) {

        for (EmployeePojo employeeRecord : employeeDatabase) {
            if (employeeRecord.getEmployeeId() == empId) {
                return true;
            }
        }
        return false;
    }

    private void clearAllFields() {
        txtAge.setText("");
        txtEmailId.setText("");
        txtEmployeeId.setText("");
        txtLevel.setText("");
        txtName.setText("");
        txtPhoneNumber.setText("");
        txtStartDate.setText("");
        txtTeamInformation.setText("");
        txtTitle.setText("");
        lblPhoto.setIcon(null);
        radioBtnMale.setSelected(false);
        radioBtnMale.setSelected(false);
    }

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        globalImage = null;
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Choose your extension", "jpg");
        jFileChooser.setFileFilter(fileNameExtensionFilter);

        try {
            int selectedOperation = jFileChooser.showOpenDialog(this);
            if (selectedOperation == JFileChooser.APPROVE_OPTION) {
                File file = jFileChooser.getSelectedFile();
                selectedImage = file.getAbsolutePath();

                JOptionPane.showInternalMessageDialog(null, "Are you sure you want this Photo?");

                ImageIcon imageIcon = new ImageIcon(selectedImage);
                Image imageDefault = imageIcon.getImage();
                Image imageDisplay = imageDefault.getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
                globalImage = imageDisplay;
                lblPhoto.setIcon(new ImageIcon(imageDisplay));
            }
        } catch (Exception e) {
            System.out.println("Exception occured while choosing image e= " + e.getMessage());
        }
    }//GEN-LAST:event_btnBrowseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnCreateProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmployeeId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber2;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInformation;
    private javax.swing.JRadioButton radioBtnFemale;
    private javax.swing.JRadioButton radioBtnMale;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInformation;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
    private Image globalImage = null;
    private String selectedImage;
}
