/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodataSiswa;

/**
 *
 * @author HP ZBOOK 15
 */
public class outputBio extends javax.swing.JFrame {

    /**
     * Creates new form outputBio
     */

public outputBio(String nama, String absen, String jurusan, String alamat, String kelas){
    initComponents();
    Nama.setText(nama);
    Absen.setText(absen);
    Jurusan.setText(jurusan);
    Alamat.setText(alamat);
    Kelas.setText(kelas);
    
}

    private outputBio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Absen = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        Kelas = new javax.swing.JLabel();
        Jurusan = new javax.swing.JLabel();
        Alamat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        Absen.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        Absen.setForeground(new java.awt.Color(0, 153, 153));
        Absen.setText("ABSEN");
        jPanel1.add(Absen);
        Absen.setBounds(270, 180, 360, 60);

        Nama.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        Nama.setForeground(new java.awt.Color(0, 153, 153));
        Nama.setText("NAMA");
        jPanel1.add(Nama);
        Nama.setBounds(280, 90, 360, 60);

        Kelas.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        Kelas.setForeground(new java.awt.Color(0, 153, 153));
        Kelas.setText("KELAS");
        jPanel1.add(Kelas);
        Kelas.setBounds(270, 270, 360, 60);

        Jurusan.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        Jurusan.setForeground(new java.awt.Color(0, 153, 153));
        Jurusan.setText("JURUSAN");
        jPanel1.add(Jurusan);
        Jurusan.setBounds(260, 340, 360, 60);

        Alamat.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        Alamat.setForeground(new java.awt.Color(0, 153, 153));
        Alamat.setText("ALAMAT");
        jPanel1.add(Alamat);
        Alamat.setBounds(260, 420, 360, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 530);

        setBounds(0, 0, 697, 565);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(outputBio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(outputBio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(outputBio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(outputBio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new outputBio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Absen;
    private javax.swing.JLabel Alamat;
    private javax.swing.JLabel Jurusan;
    private javax.swing.JLabel Kelas;
    private javax.swing.JLabel Nama;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
