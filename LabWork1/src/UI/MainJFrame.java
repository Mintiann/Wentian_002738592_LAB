/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.Address;
import Model.Person;
import Model.ContactInformation;
import javax.swing.JOptionPane;

/**
 *
 * @author emi
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private Person person;
    
    public MainJFrame() {
        initComponents();
        
        this.person = new Person();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        CreateJPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        fName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldFirstName = new javax.swing.JTextField();
        fieldLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldNUID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldCollegeName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldOfficePhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fieldOfficeEmailID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldPersonalPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fieldPersonalEmailID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fieldCurrentStreetName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fieldCurrentApt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fieldCurrentCity = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fieldCurrentZipCode = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fieldPermanentStreetName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        fieldPermanentApt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        fieldPermanentCity = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        fieldPermanentZipCode = new javax.swing.JTextField();
        ViewJPanel = new javax.swing.JPanel();
        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        viewFirstName = new javax.swing.JLabel();
        viewLastName = new javax.swing.JLabel();
        nuID = new javax.swing.JLabel();
        viewnuID = new javax.swing.JLabel();
        collegeName = new javax.swing.JLabel();
        viewCollegeName = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        officePhone = new javax.swing.JLabel();
        viewOfficePhone = new javax.swing.JLabel();
        officeEmailID = new javax.swing.JLabel();
        viewOfficeEmailID = new javax.swing.JLabel();
        personalPhone = new javax.swing.JLabel();
        viewPersonalPhone = new javax.swing.JLabel();
        personalEmailID = new javax.swing.JLabel();
        viewPersonalEmailID = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        csName = new javax.swing.JLabel();
        viewCurrentStreetName = new javax.swing.JLabel();
        psName = new javax.swing.JLabel();
        viewPermanentStreetName = new javax.swing.JLabel();
        caNo = new javax.swing.JLabel();
        viewCurrentApt = new javax.swing.JLabel();
        paNo = new javax.swing.JLabel();
        viewPermanentApt = new javax.swing.JLabel();
        cCity = new javax.swing.JLabel();
        viewCurrentCity = new javax.swing.JLabel();
        pCity = new javax.swing.JLabel();
        viewPermanentCity = new javax.swing.JLabel();
        czCode = new javax.swing.JLabel();
        viewCurrentZipCode = new javax.swing.JLabel();
        pzCode = new javax.swing.JLabel();
        viewPermanentZipCode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreateJPanel.setBackground(new java.awt.Color(204, 204, 255));
        CreateJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        CreateJPanel.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, -1, -1));

        fName.setText("First Name");
        CreateJPanel.add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 25, -1, -1));

        jLabel2.setText("Last Name");
        CreateJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 62, -1, -1));

        fieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFirstNameActionPerformed(evt);
            }
        });
        CreateJPanel.add(fieldFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 89, -1));

        fieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldLastNameActionPerformed(evt);
            }
        });
        CreateJPanel.add(fieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 89, -1));

        jLabel3.setText("NUID");
        CreateJPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 103, -1, -1));

        fieldNUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNUIDActionPerformed(evt);
            }
        });
        CreateJPanel.add(fieldNUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 83, -1));

        jLabel4.setText("College Name");
        CreateJPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, -1, -1));

        fieldCollegeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCollegeNameActionPerformed(evt);
            }
        });
        CreateJPanel.add(fieldCollegeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 135, 76, -1));

        jLabel5.setText("Contact Information");
        CreateJPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 164, -1, -1));

        jLabel6.setText("Office Phone");
        CreateJPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 196, -1, -1));
        CreateJPanel.add(fieldOfficePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 193, 76, -1));

        jLabel7.setText("Office email ID");
        CreateJPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 231, -1, -1));
        CreateJPanel.add(fieldOfficeEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 228, 76, -1));

        jLabel8.setText("Personal Phone");
        CreateJPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 266, -1, -1));
        CreateJPanel.add(fieldPersonalPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 263, 76, -1));

        jLabel9.setText("Personal email ID");
        CreateJPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 307, -1, -1));
        CreateJPanel.add(fieldPersonalEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 304, 76, -1));

        jLabel10.setText("Address");
        CreateJPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 333, 50, 20));

        jLabel11.setText("Current Street Name");
        CreateJPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 120, 20));

        fieldCurrentStreetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCurrentStreetNameActionPerformed(evt);
            }
        });
        CreateJPanel.add(fieldCurrentStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 383, 76, 30));

        jLabel12.setText("Current Apt.No");
        CreateJPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 100, -1));
        CreateJPanel.add(fieldCurrentApt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 90, 30));

        jLabel13.setText("Current  City/State");
        CreateJPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));
        CreateJPanel.add(fieldCurrentCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 110, 30));

        jLabel14.setText("Current ZipCode");
        CreateJPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        fieldCurrentZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCurrentZipCodeActionPerformed(evt);
            }
        });
        CreateJPanel.add(fieldCurrentZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 80, 30));

        jLabel15.setText("Permanent Street Name");
        CreateJPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));
        CreateJPanel.add(fieldPermanentStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 80, 30));

        jLabel16.setText("Permanent Apt.No");
        CreateJPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));
        CreateJPanel.add(fieldPermanentApt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 100, 30));

        jLabel17.setText("Permanent City/State");
        CreateJPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));
        CreateJPanel.add(fieldPermanentCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 110, 30));

        jLabel18.setText("Permanent ZipCode");
        CreateJPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, -1, -1));
        CreateJPanel.add(fieldPermanentZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 80, 30));

        jSplitPane1.setLeftComponent(CreateJPanel);

        ViewJPanel.setBackground(new java.awt.Color(204, 255, 204));
        ViewJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setText("First Name");
        ViewJPanel.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lname.setText("Last Name");
        ViewJPanel.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 20));

        viewFirstName.setText("jLabel3");
        ViewJPanel.add(viewFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 70, 30));

        viewLastName.setText("jLabel4");
        ViewJPanel.add(viewLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 80, 30));

        nuID.setText("NUID");
        ViewJPanel.add(nuID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        viewnuID.setText("jLabel20");
        ViewJPanel.add(viewnuID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 70, 30));

        collegeName.setText("CollegeName");
        ViewJPanel.add(collegeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        viewCollegeName.setText("jLabel22");
        ViewJPanel.add(viewCollegeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 70, 30));

        jLabel23.setText("Contact Information");
        ViewJPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 120, -1));

        officePhone.setText("Office Phone");
        ViewJPanel.add(officePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        viewOfficePhone.setText("jLabel25");
        ViewJPanel.add(viewOfficePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        officeEmailID.setText("Office email ID");
        ViewJPanel.add(officeEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        viewOfficeEmailID.setText("jLabel27");
        ViewJPanel.add(viewOfficeEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        personalPhone.setText("Personal Phone");
        ViewJPanel.add(personalPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        viewPersonalPhone.setText("jLabel29");
        ViewJPanel.add(viewPersonalPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        personalEmailID.setText("Personal email ID");
        ViewJPanel.add(personalEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        viewPersonalEmailID.setText("jLabel31");
        ViewJPanel.add(viewPersonalEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel32.setText("Address");
        ViewJPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        csName.setText("Current Street Name");
        ViewJPanel.add(csName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        viewCurrentStreetName.setText("jLabel34");
        ViewJPanel.add(viewCurrentStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        psName.setText("Permanent Street Name");
        ViewJPanel.add(psName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        viewPermanentStreetName.setText("jLabel36");
        ViewJPanel.add(viewPermanentStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        caNo.setText("Current Apt.No");
        ViewJPanel.add(caNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        viewCurrentApt.setText("jLabel38");
        ViewJPanel.add(viewCurrentApt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        paNo.setText("Permanent Apt.No");
        ViewJPanel.add(paNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 110, -1));

        viewPermanentApt.setText("jLabel40");
        ViewJPanel.add(viewPermanentApt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        cCity.setText("Current  City/State");
        ViewJPanel.add(cCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        viewCurrentCity.setText("jLabel42");
        ViewJPanel.add(viewCurrentCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        pCity.setText("Permanent City/State");
        ViewJPanel.add(pCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        viewPermanentCity.setText("jLabel44");
        ViewJPanel.add(viewPermanentCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        czCode.setText("Current ZipCode");
        ViewJPanel.add(czCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        viewCurrentZipCode.setText("jLabel46");
        ViewJPanel.add(viewCurrentZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        pzCode.setText("Permanent ZipCode");
        ViewJPanel.add(pzCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, -1));

        viewPermanentZipCode.setText("jLabel48");
        ViewJPanel.add(viewPermanentZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, -1, -1));

        jSplitPane1.setRightComponent(ViewJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String fname = fieldFirstName.getText();
        String lname = fieldLastName.getText();
        String nuID = fieldNUID.getText();
        String collegeName = fieldCollegeName.getText();
        
        String csName = fieldCurrentStreetName.getText();
        String psName = fieldPermanentStreetName.getText();
        String caNo = fieldCurrentApt.getText();
        String paNo = fieldPermanentApt.getText();
        String czCode = fieldCurrentZipCode.getText();
        String pzCode = fieldPermanentZipCode.getText();
        String cCity = fieldCurrentCity.getText();
        String pCity = fieldPermanentCity.getText();
        
        String officePhone = fieldOfficePhone.getText();
        String officeEmailID = fieldOfficeEmailID.getText();
        String personalPhone = fieldPersonalPhone.getText();
        String personalEmailID = fieldPersonalEmailID.getText();
        
        this.person.setFirstName(fname);
        this.person.setLastName(lname);
        this.person.setNuID(nuID);
        this.person.setCollegeName(collegeName);
        
        Address address = this.person.getAddress();
        address.setCurrentStreetName(csName);
        address.setPermanentStreetName(psName);
        address.setCurrentaptNo(caNo);
        address.setPermanentaptNo(paNo);
        address.setCurrentzipCode(czCode);
        address.setPermanentzipCode(pzCode);
        address.setCurrentCity(cCity);
        address.setPermanentCity(pCity);
        
        ContactInformation contactInformation = this.person.getContactInformation();
        contactInformation.setOfficePhone(officePhone);
        contactInformation.setOfficeEmailID(officeEmailID);
        contactInformation.setPersonalPhone(personalPhone);
        contactInformation.setPersonalEmailID(personalEmailID);
        
        

        
        
        JOptionPane.showMessageDialog(null,"SAVED SUCCESSFULLY!");
        
        display();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void fieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldFirstNameActionPerformed

    private void fieldNUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNUIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNUIDActionPerformed

    private void fieldCurrentStreetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCurrentStreetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCurrentStreetNameActionPerformed

    private void fieldCurrentZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCurrentZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCurrentZipCodeActionPerformed

    private void fieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldLastNameActionPerformed

    private void fieldCollegeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCollegeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCollegeNameActionPerformed

    private void display(){
        viewFirstName.setText(this.person.getFirstName());
        viewLastName.setText(this.person.getLastName());
        viewnuID.setText(this.person.getNuID());
        viewCollegeName.setText(this.person.getCollegeName());
        
        viewCurrentStreetName.setText(this.person.getAddress().getCurrentStreetName());
        viewPermanentStreetName.setText(this.person.getAddress().getPermanentStreetName());
        viewCurrentApt.setText(this.person.getAddress().getCurrentaptNo());
        viewPermanentApt.setText(this.person.getAddress().getPermanentaptNo());
        viewCurrentZipCode.setText(this.person.getAddress().getCurrentzipCode());
        viewPermanentZipCode.setText(this.person.getAddress().getPermanentzipCode());
        viewCurrentCity.setText(this.person.getAddress().getCurrentCity());
        viewPermanentCity.setText(this.person.getAddress().getPermanentCity());
        
        viewOfficePhone.setText(this.person.getContactInformation().getOfficePhone());
        viewOfficeEmailID.setText(this.person.getContactInformation().getOfficeEmailID());
        viewPersonalPhone.setText(this.person.getContactInformation().getPersonalPhone());
        viewPersonalEmailID.setText(this.person.getContactInformation().getPersonalEmailID());
        
        
    }
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateJPanel;
    private javax.swing.JPanel ViewJPanel;
    private javax.swing.JLabel cCity;
    private javax.swing.JLabel caNo;
    private javax.swing.JLabel collegeName;
    private javax.swing.JLabel csName;
    private javax.swing.JLabel czCode;
    private javax.swing.JLabel fName;
    private javax.swing.JTextField fieldCollegeName;
    private javax.swing.JTextField fieldCurrentApt;
    private javax.swing.JTextField fieldCurrentCity;
    private javax.swing.JTextField fieldCurrentStreetName;
    private javax.swing.JTextField fieldCurrentZipCode;
    private javax.swing.JTextField fieldFirstName;
    private javax.swing.JTextField fieldLastName;
    private javax.swing.JTextField fieldNUID;
    private javax.swing.JTextField fieldOfficeEmailID;
    private javax.swing.JTextField fieldOfficePhone;
    private javax.swing.JTextField fieldPermanentApt;
    private javax.swing.JTextField fieldPermanentCity;
    private javax.swing.JTextField fieldPermanentStreetName;
    private javax.swing.JTextField fieldPermanentZipCode;
    private javax.swing.JTextField fieldPersonalEmailID;
    private javax.swing.JTextField fieldPersonalPhone;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel nuID;
    private javax.swing.JLabel officeEmailID;
    private javax.swing.JLabel officePhone;
    private javax.swing.JLabel pCity;
    private javax.swing.JLabel paNo;
    private javax.swing.JLabel personalEmailID;
    private javax.swing.JLabel personalPhone;
    private javax.swing.JLabel psName;
    private javax.swing.JLabel pzCode;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel viewCollegeName;
    private javax.swing.JLabel viewCurrentApt;
    private javax.swing.JLabel viewCurrentCity;
    private javax.swing.JLabel viewCurrentStreetName;
    private javax.swing.JLabel viewCurrentZipCode;
    private javax.swing.JLabel viewFirstName;
    private javax.swing.JLabel viewLastName;
    private javax.swing.JLabel viewOfficeEmailID;
    private javax.swing.JLabel viewOfficePhone;
    private javax.swing.JLabel viewPermanentApt;
    private javax.swing.JLabel viewPermanentCity;
    private javax.swing.JLabel viewPermanentStreetName;
    private javax.swing.JLabel viewPermanentZipCode;
    private javax.swing.JLabel viewPersonalEmailID;
    private javax.swing.JLabel viewPersonalPhone;
    private javax.swing.JLabel viewnuID;
    // End of variables declaration//GEN-END:variables
}
