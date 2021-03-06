
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import smart_homestay.koneksi_mysql;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Guest_Data extends javax.swing.JFrame {
 public Statement st;
    public ResultSet RsKamar;
    public String sql="";
     Connection conn = koneksi_mysql.Conn();
    /**
     * Creates new form Guest_Data
     */
    public Guest_Data() {

        initComponents();
        ShowData(sql);
        KoneksiDB();
    }
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

        caritamu = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tamu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        caritamu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caritamuActionPerformed(evt);
            }
        });
        caritamu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caritamuKeyTyped(evt);
            }
        });
        getContentPane().add(caritamu);
        caritamu.setBounds(83, 138, 327, 20);

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(0, 137, 65, 23);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Guest Data");

        jButton2.setText("Check-In");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Check-Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("History");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        tbl_tamu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_tamu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(refresh)
                        .addGap(292, 292, 292))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addComponent(refresh)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(11, 11, 11)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        cari_Tamu();
    }//GEN-LAST:event_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        check_in ci = new check_in(this, rootPaneCheckingEnabled);
        ci.l_judul.setText("CHECK-IN");
        ci.ketemu_kamar();
        ci.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void caritamuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caritamuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caritamuActionPerformed

    private void caritamuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caritamuKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            cari_Tamu();
        }
    }//GEN-LAST:event_caritamuKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        check_out co = new check_out(this, rootPaneCheckingEnabled);
        co.ketemu_Tamu();
        co.l_judul.setText("CHECK-OUT");
        int baris = tbl_tamu.getSelectedRow();
        String kode = (String)tbl_tamu.getValueAt(baris, 0);
        co.c_no_tamu.setSelectedItem(kode);
        co.cari_ID_Tamu();
        co.cari_Kode_Kamar();
        co.hitung_Hari();
        co.hitung_TotalBayar();
        co.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        history_tamu ht = new history_tamu(this, rootPaneCheckingEnabled);
        ht.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        ShowData(sql);
    }//GEN-LAST:event_refreshActionPerformed
private DefaultTableModel tabmode;
    
/**public void tampil_Tamu(){
        Object []baris = {"ID/No Tamu","Nama Tamu","Jenis Kelamin","Alamat","No Tlp","Kode Kamar","Lantai","No Kamar","Tipe Kamar","Tanggal Cek In","Jam Cek In"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_tamu.setModel(tabmode);
        try {
             sql = "SELECT tb_tamu.*,  tb_kamar.* FROM tb_tamu, tb_kamar WHERE tb_tamu.kode_kamar=tb_kamar.kode_kamar ORDER BY tb_kamar.kode_kamar asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String no_tamu = hasil.getString("no_tamu");
                String nama_tamu = hasil.getString("nama_tamu");
                String jenis_kelamin = hasil.getString("jenis_kelamin");
                String alamat = hasil.getString("alamat");
                String no_tlp = hasil.getString("no_tlp");
                String kode_kamar = hasil.getString("kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String tgl_cek_in = hasil.getString("tgl_cek_in");
                String jam_cek_in = hasil.getString("jam_cek_in");
                String[] data = {no_tamu, nama_tamu, jenis_kelamin, alamat, no_tlp, kode_kamar, lantai, no_kamar, tipe_kamar, tgl_cek_in, jam_cek_in};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }**/
    public void ShowData(String sql){
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("no_tamu");
        data.addColumn ("nama_tamu");
        data.addColumn ("jenis_kelamin");
        data.addColumn ("alamat");
        data.addColumn ("no_tlp");
        data.addColumn ("kode_kamar");
        data.addColumn ("lantai");
        data.addColumn ("no_kamar");
        data.addColumn ("tipe_kamar");
        data.addColumn ("tgl_cek_in");
        data.addColumn ("jam_cek_in");
      
        
        try{    
            
            st=conn.createStatement();
            RsKamar=st.executeQuery("SELECT tb_tamu.*,  tb_kamar.* FROM tb_tamu, tb_kamar WHERE tb_tamu.kode_kamar=tb_kamar.kode_kamar ORDER BY tb_kamar.kode_kamar asc");
            while (RsKamar.next())
                data.addRow(new Object[]{
                
                    RsKamar.getString(1), RsKamar.getString(2),
                    RsKamar.getString(3), RsKamar.getString(4),
                    RsKamar.getString(5), RsKamar.getString(6), 
                    RsKamar.getString(7), RsKamar.getString(8),
                    RsKamar.getString(9), RsKamar.getString(10),
                    RsKamar.getString(11),
                });
            tbl_tamu.setModel(data);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR \n Gagal Memuat KeDatabase \n Aktifkan Database Sebelum Memulai");
        }
    }
     public void cari_Tamu(){
        String cari = caritamu.getText();
        Object []baris = {"ID/No Tamu","Nama Tamu","Jenis Kelamin","Alamat","No Tlp","Kode Kamar","Lantai","No Kamar","Tipe Kamar","Tanggal Cek In","Jam Cek In"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_tamu.setModel(tabmode);
        try{
            String sql = "SELECT tb_tamu.*, tb_kamar.* FROM tb_tamu INNER JOIN tb_kamar ON tb_tamu.kode_kamar=tb_kamar.kode_kamar WHERE "
                    + "no_tamu like '%"+cari+"%' "
                    + "OR nama_tamu like '%"+cari+"%' "
                    + "OR jenis_kelamin like '%"+cari+"%' "
                    + "OR alamat like '%"+cari+"%' "
                    + "OR no_tlp like '%"+cari+"%' "
                    + "OR tb_tamu.kode_kamar like '%"+cari+"%' "
                    + "OR lantai like '%"+cari+"%' "
                    + "OR no_kamar like '%"+cari+"%' "
                    + "OR tipe_kamar like '%"+cari+"%' "
                    + "OR tgl_cek_in like '%"+cari+"%' "
                    + "OR jam_cek_in like '%"+cari+"%' "
                    + "order by tb_tamu.kode_kamar asc";
            Statement stmt=conn.createStatement();
            ResultSet hasil=stmt.executeQuery(sql);
            while(hasil.next()){
                String no_tamu = hasil.getString("no_tamu");
                String nama_tamu = hasil.getString("nama_tamu");
                String jenis_kelamin = hasil.getString("jenis_kelamin");
                String alamat = hasil.getString("alamat");
                String no_tlp = hasil.getString("no_tlp");
                String kode_kamar = hasil.getString("tb_tamu.kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String tgl_cek_in = hasil.getString("tgl_cek_in");
                String jam_cek_in = hasil.getString("jam_cek_in");
                String[] data = {no_tamu, nama_tamu, jenis_kelamin, alamat, no_tlp, kode_kamar, lantai, no_kamar, tipe_kamar, tgl_cek_in, jam_cek_in};
                tabmode.addRow(data);
            }
        }
        catch(Exception ex){
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
            java.util.logging.Logger.getLogger(Guest_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guest_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guest_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guest_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guest_Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caritamu;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    private javax.swing.JButton search;
    private javax.swing.JTable tbl_tamu;
    // End of variables declaration//GEN-END:variables
}
