
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Insert_Room extends javax.swing.JDialog{

    /**
     * Creates new form Insert_Roomr
     * 
     */
    public Insert_Room(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        KoneksiDB();
        initComponents();
    }
    Connection conn = smart_homestay.koneksi_mysql.Conn();
 private void KoneksiDB (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/homestay", "root", "");
            System.out.println("Koneksi Berhasil");
            JOptionPane.showMessageDialog(null,"Welcome To Transaction!");
        } catch (Exception e) {
            System.out.println("koneksi gagal \n"+e);
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

        jPanel1 = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kodekamar = new javax.swing.JTextField();
        lantai = new javax.swing.JTextField();
        hargakamar = new javax.swing.JTextField();
        nokamar = new javax.swing.JTextField();
        tipekamar = new javax.swing.JComboBox<>();
        simpan = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        judul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 255, 255));
        judul.setText("Insert Room");

        jLabel2.setText("Room Code");

        jLabel3.setText("Floor");

        jLabel4.setText("No. Room");

        jLabel5.setText("Room Type");

        jLabel6.setText("Price");

        kodekamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodekamarActionPerformed(evt);
            }
        });

        tipekamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Choose-", "Family", "Deluxe", "Suite" }));

        simpan.setText("SAVE");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(simpan)
                        .addGap(43, 43, 43)
                        .addComponent(reset)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hargakamar)
                            .addComponent(tipekamar, 0, 240, Short.MAX_VALUE)
                            .addComponent(lantai)
                            .addComponent(nokamar)
                            .addComponent(kodekamar))
                        .addGap(77, 77, 77))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(judul)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(judul)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kodekamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lantai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(nokamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tipekamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hargakamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(reset))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        if ("".equals(kodekamar.getText())){
            JOptionPane.showMessageDialog(null, "Kolom Kode Kamar masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(lantai.getText())){
            JOptionPane.showMessageDialog(null, "Kolom Lantai masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(nokamar.getText())){
            JOptionPane.showMessageDialog(null, "Kolom No Kamar masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(tipekamar.getSelectedItem()) || "-Choose-".equals(tipekamar.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Pemilihan Tipe Kamar masih SALAH","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(hargakamar.getText())){
            JOptionPane.showMessageDialog(null, "Kolom Harga masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            cekjudul();
            if ("Edit Room".equals(judul.getText())){
                update();
            }
            else if ("Insert Room".equals(judul.getText())){
                String sql = "SELECT * FROM tb_kamar WHERE kode_kamar='"+ kodekamar.getText() +"'";
                try {
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()){
                        JOptionPane.showMessageDialog(null, "Kode Kamar "+ kodekamar.getText() +" Already Exist","Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        simpan();
                    }
                } catch (SQLException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
         reset();
    }//GEN-LAST:event_resetActionPerformed

    private void kodekamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodekamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodekamarActionPerformed
    
        private void cekjudul(){
            judul.setText(judul.getText());
        }
        private void reset() {
            kodekamar.setText(null);
            lantai.setText(null);
            nokamar.setText(null);
            tipekamar.setSelectedIndex(0);
            hargakamar.setText(null);
        }
        
        public void carikamar(){
        String sql = "SELECT * FROM tb_kamar WHERE kode_kamar='"+ kodekamar.getText() +"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                lantai.setText(rs.getString("lantai"));
                nokamar.setText(rs.getString("no_kamar"));
                tipekamar.setSelectedItem(rs.getString("tipe_kamar"));
                hargakamar.setText(rs.getString("harga_permalam"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Kode kamar TIDAK DITEMUKAN","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e,"Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
         private void update(){
        String sql="UPDATE tb_kamar set lantai=?, no_kamar=?, tipe_kamar=?, harga_permalam=? WHERE kode_kamar='"+ kodekamar.getText() +"'";
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(sql);
            stat.setString(1, lantai.getText());
            stat.setString(2, nokamar.getText());
            stat.setString(3, (String)tipekamar.getSelectedItem());
            stat.setString(4, hargakamar.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Update data BERHASIL","Informasi", JOptionPane.INFORMATION_MESSAGE);
            Data_Kamar form_utama = new Data_Kamar();
            form_utama.ShowData(sql);
            this.dispose();
            reset();
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null,"Update data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
          private void simpan(){
        String sql="INSERT INTO tb_kamar VALUES (?,?,?,?,?)";
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(sql);
            stat.setString(1, kodekamar.getText());
            stat.setString(2, lantai.getText());
            stat.setString(3, nokamar.getText());
            stat.setString(4, (String)tipekamar.getSelectedItem());
            stat.setString(5, hargakamar.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Menyimpan data BERHASIL","Informasi", JOptionPane.INFORMATION_MESSAGE);
            Data_Kamar form_utama = new Data_Kamar();
            form_utama.ShowData(sql);
            this.dispose();
            reset();
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null,"Menyimpan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(Insert_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Insert_Room dialog = new Insert_Room(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
});
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hargakamar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel judul;
    public javax.swing.JTextField kodekamar;
    private javax.swing.JTextField lantai;
    private javax.swing.JTextField nokamar;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JComboBox<String> tipekamar;
    // End of variables declaration//GEN-END:variables
}
