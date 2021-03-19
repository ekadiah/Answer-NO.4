


import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import smart_homestay.koneksi_mysql;


public class history_tamu extends javax.swing.JDialog {
public Statement st;
    public ResultSet RsKamar;
    public String sql="";
   
    public history_tamu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tampil_Tamu();
        KoneksiDB();
    }
Connection conn = koneksi_mysql.Conn();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_karyawan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_history = new javax.swing.JTable();
        t_cari = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_karyawan.setBackground(new java.awt.Color(204, 204, 255));
        panel_karyawan.setLayout(null);

        tbl_history.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_history);

        panel_karyawan.add(jScrollPane1);
        jScrollPane1.setBounds(99, 97, 1040, 340);

        t_cari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cari.setToolTipText("Ketikkan yang akan dicari DISINI");
        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cariKeyTyped(evt);
            }
        });
        panel_karyawan.add(t_cari);
        t_cari.setBounds(99, 61, 963, 23);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Guest History");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(491, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(435, 435, 435))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_karyawan.add(jPanel4);
        jPanel4.setBounds(10, 11, 1120, 39);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_karyawan.add(jButton1);
        jButton1.setBounds(20, 63, 73, 23);

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel_karyawan.add(jButton2);
        jButton2.setBounds(1068, 63, 71, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, 1245, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTableModel tabmode;
    
        /**public void ShowData(String sql){
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("no_tamu");
        data.addColumn ("nama_tamu");
        data.addColumn ("jneis_kelamin");
        data.addColumn ("alamat");
        data.addColumn ("no_tlp");
        data.addColumn ("kode_kamar");
        data.addColumn ("lantai");
        data.addColumn ("no_kamar");
        data.addColumn ("tipe_kamar");
        data.addColumn ("harga_permalam");
        data.addColumn ("cek_in");
        data.addColumn ("cek_out");
        data.addColumn ("lama_menginap");
        data.addColumn ("total_biaya");
      
        
        try{    
            
            st=conn.createStatement();
            RsKamar=st.executeQuery("SELECT * FROM tb_history_tamu ORDER BY no_tamu asc");
            while (RsKamar.next())
                data.addRow(new Object[]{
                
                    RsKamar.getString(1), RsKamar.getString(2),
                    RsKamar.getString(3), RsKamar.getString(4),
                    RsKamar.getString(5), RsKamar.getString(6), 
                    RsKamar.getString(7), RsKamar.getString(8),
                    RsKamar.getString(9), RsKamar.getString(10),
                    RsKamar.getString(10), RsKamar.getString(11), RsKamar.getString(12),
                    RsKamar.getString(13), RsKamar.getString(14),
                });
            tbl_history.setModel(data);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR \n Gagal Memuat KeDatabase \n Aktifkan Database Sebelum Memulai");
        }
    }**/
    public void tampil_Tamu(){
        Object []baris = {"ID/No Tamu","Nama Tamu","Jenis Kelamin","Alamat","No Tlp","Kode Kamar","Lantai","No Kamar","Tipe Kamar","Harga/Malam","Tanggal Cek In","Tanggal Cek CekOut","Lama Menginap","Total Biaya"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_history.setModel(tabmode);
        try {
            String sql = "SELECT * FROM tb_history_tamu ORDER BY no_tamu asc";
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
                String harga = hasil.getString("harga_permalam");
                String tgl_cekin = hasil.getString("cek_in");
                String tgl_cekout = hasil.getString("cek_out");
                String lama_menginap = hasil.getString("lama_menginap");
                String total_biaya = hasil.getString("total_biaya");
                String[] data = {no_tamu, nama_tamu, jenis_kelamin, alamat, no_tlp, kode_kamar, lantai, no_kamar, tipe_kamar, harga, tgl_cekin, tgl_cekout, lama_menginap, total_biaya};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void cari_Tamu(){
        String cari = t_cari.getText();
        Object []baris = {"ID/No Tamu","Nama Tamu","Jenis Kelamin","Alamat","No Tlp","Kode Kamar","Lantai","No Kamar","Tipe Kamar","Harga/Malam","Tanggal Cek In","Tanggal Cek CekOut","Lama Menginap","Total Biaya"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_history.setModel(tabmode);
        try{
            String sql = "SELECT * from tb_history_tamu WHERE "
                    + "no_tamu like '%"+cari+"%' "
                    + "OR nama_tamu like '%"+cari+"%' "
                    + "OR jenis_kelamin like '%"+cari+"%' "
                    + "OR alamat like '%"+cari+"%' "
                    + "OR no_tlp like '%"+cari+"%' "
                    + "OR kode_kamar like '%"+cari+"%' "
                    + "OR lantai like '%"+cari+"%' "
                    + "OR no_kamar like '%"+cari+"%' "
                    + "OR tipe_kamar like '%"+cari+"%' "
                    + "OR cek_in like '%"+cari+"%' "
                    + "OR cek_out like '%"+cari+"%' "
                    + "OR harga_permalam like '%"+cari+"%' "
                    + "OR lama_menginap like '%"+cari+"%' "
                    + "OR total_biaya like '%"+cari+"%' "
                    + "order by no_tamu asc";
            Statement stmt=conn.createStatement();
            ResultSet hasil=stmt.executeQuery(sql);
            while(hasil.next()){
                String no_tamu = hasil.getString("no_tamu");
                String nama_tamu = hasil.getString("nama_tamu");
                String jenis_kelamin = hasil.getString("jenis_kelamin");
                String alamat = hasil.getString("alamat");
                String no_tlp = hasil.getString("no_tlp");
                String kode_kamar = hasil.getString("kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String harga = hasil.getString("harga_permalam");
                String tgl_cekin = hasil.getString("cek_in");
                String tgl_cekout = hasil.getString("cek_out");
                String lama_menginap = hasil.getString("lama_menginap");
                String total_biaya = hasil.getString("total_biaya");
                String[] data = {no_tamu, nama_tamu, jenis_kelamin, alamat, no_tlp, kode_kamar, lantai, no_kamar, tipe_kamar, harga, tgl_cekin, tgl_cekout, lama_menginap, total_biaya};
                tabmode.addRow(data);
            }
        }
        catch(Exception ex){
        }
    }
    private void t_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            cari_Tamu();
        }
    }//GEN-LAST:event_t_cariKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cari_Tamu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        tampil_Tamu();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(history_tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(history_tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(history_tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(history_tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                history_tamu dialog = new history_tamu(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_karyawan;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTable tbl_history;
    // End of variables declaration//GEN-END:variables
}
