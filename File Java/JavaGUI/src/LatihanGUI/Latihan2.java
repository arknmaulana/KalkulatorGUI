/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanGUI;

/**
 *
 * @author HP ZBOOK 15
 */
public class Latihan2 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan2
     */
    public Latihan2() {
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

        pilihanJurusan = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        submit = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        cbDesigner = new javax.swing.JCheckBox();
        cbVideoEditing = new javax.swing.JCheckBox();
        cbAnimator = new javax.swing.JCheckBox();
        cbProgramming = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbRPL = new javax.swing.JRadioButton();
        rbTKJ = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        absen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));
        jPanel1.setLayout(null);

        submit.setBackground(new java.awt.Color(204, 204, 204));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(430, 410, 80, 25);

        remove.setBackground(new java.awt.Color(204, 204, 204));
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove);
        remove.setBounds(540, 410, 80, 25);

        exit.setBackground(new java.awt.Color(204, 204, 204));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(650, 410, 51, 25);

        jLabel6.setText("Hasil");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(560, 520, 23, 15);

        hasil.setBackground(new java.awt.Color(204, 204, 204));
        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(440, 550, 267, 145);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LatihanGUI/WhatsApp Image 2018-07-27 at 18.38.32.jpeg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-310, -30, 600, 820);

        nama.setBackground(new java.awt.Color(204, 204, 204));
        nama.setForeground(new java.awt.Color(0, 0, 0));
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel1.add(nama);
        nama.setBounds(500, 100, 210, 30);

        cbDesigner.setBackground(new java.awt.Color(102, 0, 51));
        cbDesigner.setForeground(new java.awt.Color(255, 255, 255));
        cbDesigner.setText("Designer");
        jPanel1.add(cbDesigner);
        cbDesigner.setBounds(510, 300, 90, 23);

        cbVideoEditing.setBackground(new java.awt.Color(102, 0, 51));
        cbVideoEditing.setForeground(new java.awt.Color(255, 255, 255));
        cbVideoEditing.setText("Video Editing");
        jPanel1.add(cbVideoEditing);
        cbVideoEditing.setBounds(610, 300, 140, 23);

        cbAnimator.setBackground(new java.awt.Color(102, 0, 51));
        cbAnimator.setForeground(new java.awt.Color(255, 255, 255));
        cbAnimator.setText("Animator");
        jPanel1.add(cbAnimator);
        cbAnimator.setBounds(610, 270, 110, 23);

        cbProgramming.setBackground(new java.awt.Color(102, 0, 51));
        cbProgramming.setForeground(new java.awt.Color(255, 255, 255));
        cbProgramming.setText("Programming");
        jPanel1.add(cbProgramming);
        cbProgramming.setBounds(510, 270, 100, 23);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hobi");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(420, 270, 34, 15);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jurusan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(420, 210, 39, 15);

        rbRPL.setBackground(new java.awt.Color(102, 0, 51));
        pilihanJurusan.add(rbRPL);
        rbRPL.setForeground(new java.awt.Color(255, 255, 255));
        rbRPL.setText("RPL");
        rbRPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRPLActionPerformed(evt);
            }
        });
        jPanel1.add(rbRPL);
        rbRPL.setBounds(510, 210, 60, 23);

        rbTKJ.setBackground(new java.awt.Color(102, 0, 51));
        pilihanJurusan.add(rbTKJ);
        rbTKJ.setForeground(new java.awt.Color(255, 255, 255));
        rbTKJ.setText("TKJ");
        jPanel1.add(rbTKJ);
        rbTKJ.setBounds(610, 210, 43, 23);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Absen ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(420, 150, 40, 15);

        absen.setBackground(new java.awt.Color(204, 204, 204));
        absen.setForeground(new java.awt.Color(0, 0, 0));
        absen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absenActionPerformed(evt);
            }
        });
        jPanel1.add(absen);
        absen.setBounds(500, 150, 210, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(420, 100, 40, 15);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIODATA SISWA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 30, 200, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 740);

        setBounds(0, 0, 784, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void absenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_absenActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void rbRPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRPLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRPLActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String namanya = nama.getText();
        String absennya = absen.getText();
        String jurusan;
        String hobi = "";
        
        //untuk pilihan jurusan
        if (rbRPL.isSelected())
            jurusan = "RPL";
        else if (rbTKJ.isSelected())
            jurusan = "TKJ";
        else
            jurusan = " ";
        
        //untuk pilihan checkbox
        if (cbAnimator.isSelected())
            hobi += cbAnimator.getText() + ", ";
        if (cbDesigner.isSelected())
            hobi += cbDesigner.getText() + ", ";
        if (cbVideoEditing.isSelected())
            hobi += cbVideoEditing.getText() + ", ";
        if (cbProgramming.isSelected())
            hobi += cbProgramming.getText() + ", ";
        
        //untuk hasil
        hasil.setText("Nama Anda : " + namanya + "\nAbsen Anda : " + absennya + "\nJurusan Anda : " + jurusan + "\nHobi Anda : " + hobi);
    }//GEN-LAST:event_submitActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
        //System.exit(1);^
    }//GEN-LAST:event_exitActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        nama.setText("");
        absen.setText("");
        cbProgramming.setSelected(false);
        cbDesigner.setSelected(false);
        cbVideoEditing.setSelected(false);
        cbAnimator.setSelected(false);
    }//GEN-LAST:event_removeActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absen;
    private javax.swing.JCheckBox cbAnimator;
    private javax.swing.JCheckBox cbDesigner;
    private javax.swing.JCheckBox cbProgramming;
    private javax.swing.JCheckBox cbVideoEditing;
    private javax.swing.JButton exit;
    private javax.swing.JTextArea hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.ButtonGroup pilihanJurusan;
    private javax.swing.JRadioButton rbRPL;
    private javax.swing.JRadioButton rbTKJ;
    private javax.swing.JButton remove;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
