


import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import smart_homestay.koneksi_mysql;

public class check_in extends javax.swing.JDialog {

    /**
     * Creates new form f_cek_in
     */
    public check_in(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jamDigital();
        Tanggal_sekarang();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        l_judul = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        c_jenis_kelamin = new javax.swing.JComboBox<>();
        t_no_tlp = new javax.swing.JTextField();
        t_nama_tamu = new javax.swing.JTextField();
        t_no_tamu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_alamat = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        c_kode_kamar = new javax.swing.JComboBox<>();
        l_lantai = new javax.swing.JLabel();
        l_no_kamar = new javax.swing.JLabel();
        l_tipe_kamar = new javax.swing.JLabel();
        l_harga = new javax.swing.JLabel();
        l_info = new javax.swing.JLabel();
        l_jam = new javax.swing.JLabel();
        l_tanggal = new javax.swing.JLabel();
        l_tanggal1 = new javax.swing.JLabel();
        l_jam1 = new javax.swing.JLabel();
        b_ok = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        l_judul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_judul.setForeground(new java.awt.Color(255, 255, 255));
        l_judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_judul.setText("CHECK-IN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 11, 740, 44);

        jPanel3.setBackground(new java.awt.Color(15, 43, 75));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tamu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        c_jenis_kelamin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c_jenis_kelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Laki-laki", "Perempuan" }));

        t_no_tlp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        t_nama_tamu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        t_no_tamu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID/No KTP");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jenis Kelamin");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Akamat");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("No Tlp");

        t_alamat.setColumns(20);
        t_alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_alamat.setRows(5);
        jScrollPane1.setViewportView(t_alamat);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t_no_tamu, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t_nama_tamu, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(c_jenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(58, 58, 58)
                        .addComponent(t_no_tlp, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(t_no_tamu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(t_nama_tamu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(c_jenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11))
                    .addComponent(t_no_tlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(370, 80, 380, 330);

        jPanel4.setBackground(new java.awt.Color(15, 43, 75));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Kamar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga/Kamar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipe Kamar");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No Kamar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lantai");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kode Kamar");

        c_kode_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c_kode_kamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--" }));
        c_kode_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_kode_kamarActionPerformed(evt);
            }
        });

        l_lantai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_lantai.setForeground(new java.awt.Color(255, 255, 255));
        l_lantai.setText("-");

        l_no_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_no_kamar.setForeground(new java.awt.Color(255, 255, 255));
        l_no_kamar.setText("-");

        l_tipe_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_tipe_kamar.setForeground(new java.awt.Color(255, 255, 255));
        l_tipe_kamar.setText("-");

        l_harga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_harga.setForeground(new java.awt.Color(255, 255, 255));
        l_harga.setText("-");

        l_info.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        l_info.setForeground(new java.awt.Color(153, 0, 0));
        l_info.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c_kode_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l_lantai, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l_no_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l_tipe_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(l_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(l_info, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(c_kode_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(l_lantai))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(l_no_kamar))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(l_tipe_kamar))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(l_harga))
                .addGap(90, 90, 90)
                .addComponent(l_info, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 73, 355, 332);

        l_jam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_jam.setForeground(new java.awt.Color(255, 255, 255));
        l_jam.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l_jam.setText("Jam");
        jPanel1.add(l_jam);
        l_jam.setBounds(68, 416, 176, 17);

        l_tanggal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_tanggal.setForeground(new java.awt.Color(255, 255, 255));
        l_tanggal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l_tanggal.setText("Tanggal");
        jPanel1.add(l_tanggal);
        l_tanggal.setBounds(68, 442, 176, 17);

        l_tanggal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_tanggal1.setForeground(new java.awt.Color(255, 255, 255));
        l_tanggal1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l_tanggal1.setText("Tanggal");
        jPanel1.add(l_tanggal1);
        l_tanggal1.setBounds(10, 442, 48, 17);

        l_jam1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_jam1.setForeground(new java.awt.Color(255, 255, 255));
        l_jam1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l_jam1.setText("Jam");
        jPanel1.add(l_jam1);
        l_jam1.setBounds(10, 416, 48, 17);

        b_ok.setText("OK");
        b_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_okActionPerformed(evt);
            }
        });
        jPanel1.add(b_ok);
        b_ok.setBounds(533, 425, 47, 23);

        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(621, 425, 63, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //perintah menampilkan tanggal
    public void Tanggal_sekarang(){
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat ("dd-MM-yyyy") ;
        l_tanggal.setText(kal.format(sekarang));
    }
    
    // jam digital Konstruktor
    public void jamDigital() {
    // ActionListener untuk Keperluan Timer
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String nol_jam = "";
                String nol_menit = "";
                String nol_detik = "";
                // Membuat Date
                Date dt = new Date();
                // Mengambil nilaj JAM, MENIT, dan DETIK Sekarang
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                // Jika nilai JAM lebih kecil dari 10 (hanya 1 digit)
                if (nilai_jam <= 9) {
                  // Tambahkan "0" didepannya
                  nol_jam = "0";
                }
                // Jika nilai MENIT lebih kecil dari 10 (hanya 1 digit)
                if (nilai_menit <= 9) {
                  // Tambahkan "0" didepannya
                  nol_menit = "0";
                }
                // Jika nilai DETIK lebih kecil dari 10 (hanya 1 digit)
                if (nilai_detik <= 9) {
                  // Tambahkan "0" didepannya
                  nol_detik = "0";
                }
                // Membuat String JAM, MENIT, DETIK
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                // Menampilkan pada Layar
                l_jam.setText(jam + ":" + menit + ":" + detik);
            }
        };
        // Timer
        new Timer(1000, taskPerformer).start();
    }
    
    private void cek_judul(){
        l_judul.setText(l_judul.getText());
    }
    
    private void reset(){
        c_kode_kamar.setSelectedIndex(0);
        l_harga.setText("-");
        l_harga.setText("-");
        l_no_kamar.setText("-");
        l_tipe_kamar.setText("-");
        t_no_tamu.setText(null);
        t_nama_tamu.setText(null);
        c_jenis_kelamin.setSelectedIndex(0);
        t_alamat.setText(null);
        t_no_tlp.setText(null);
    }
    
    public void cari_Kode_kamar(){
        String sql = "SELECT * FROM tb_kamar WHERE kode_kamar='"+ c_kode_kamar.getSelectedItem()+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                l_harga.setText(rs.getString("lantai"));
                l_no_kamar.setText(rs.getString("no_kamar"));
                l_tipe_kamar.setText(rs.getString("tipe_kamar"));
                l_harga.setText(rs.getString("harga_permalam"));
                l_info.setText(null);
            }
            else {
                l_info.setText("Kode kamar TIDAK COCOK");
                reset();
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e,"Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void ketemu_kamar(){
        try {
            String sql = "SELECT * FROM tb_kamar order by kode_kamar asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String kode_kamar = hasil.getString("kode_kamar");
                c_kode_kamar.addItem(kode_kamar);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kode Kamar TIDAK DITEMUKAN","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void simpan(){
        String sql="INSERT INTO tb_tamu VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(sql);
            stat.setString(1, t_no_tamu.getText());
            stat.setString(2, t_nama_tamu.getText());
            stat.setString(3, (String)c_jenis_kelamin.getSelectedItem());
            stat.setString(4, t_alamat.getText());
            stat.setString(5, t_no_tlp.getText());
            stat.setString(6, (String)c_kode_kamar.getSelectedItem());
            stat.setString(7, l_tanggal.getText());
            stat.setString(8, l_jam.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cek In BERHASIL","Informasi", JOptionPane.INFORMATION_MESSAGE);
            Guest_Data form_utama = new Guest_Data();
            form_utama.ShowData(sql);
            this.dispose();
            reset();
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null,"Cek In GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void c_kode_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_kode_kamarActionPerformed
        cari_Kode_kamar();
    }//GEN-LAST:event_c_kode_kamarActionPerformed

    private void b_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_okActionPerformed
        // TODO add your handling code here:
         if ("".equals(c_kode_kamar.getSelectedItem()) || "--Pilih--".equals(c_kode_kamar.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Pemilihan kode kamar SALAH","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(t_no_tamu.getText())){
            JOptionPane.showMessageDialog(null, "Kolom ID/No Tamu masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(t_nama_tamu.getText())){
            JOptionPane.showMessageDialog(null, "Kolom Nama Tamu masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(c_jenis_kelamin.getSelectedItem()) || "--Pilih--".equals(c_jenis_kelamin.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Pemilihan Jenis Kelamin SALAH","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(t_alamat.getText())){
            JOptionPane.showMessageDialog(null, "Kolom Alamat masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(t_no_tlp.getText())){
            JOptionPane.showMessageDialog(null, "Kolom No Tlp masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            cek_judul();
            if ("Edit Room".equals(l_judul.getText())){
                //update();
            }
            else if ("CHECK-IN".equals(l_judul.getText())){
                String sql = "SELECT * FROM tb_tamu WHERE kode_kamar='"+ c_kode_kamar.getSelectedItem()+"'";
                try {
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()){
                        JOptionPane.showMessageDialog(null, "Kode Kamar "+ c_kode_kamar.getSelectedItem()+" SEDANG DIGUNAKAN","Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        simpan();
                    }
                } catch (SQLException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_b_okActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        reset();
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
            java.util.logging.Logger.getLogger(check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                check_in dialog = new check_in(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton b_ok;
    private javax.swing.JComboBox<String> c_jenis_kelamin;
    private javax.swing.JComboBox<String> c_kode_kamar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_harga;
    private javax.swing.JLabel l_info;
    private javax.swing.JLabel l_jam;
    private javax.swing.JLabel l_jam1;
    public static javax.swing.JLabel l_judul;
    private javax.swing.JLabel l_lantai;
    private javax.swing.JLabel l_no_kamar;
    private javax.swing.JLabel l_tanggal;
    private javax.swing.JLabel l_tanggal1;
    private javax.swing.JLabel l_tipe_kamar;
    private javax.swing.JTextArea t_alamat;
    private javax.swing.JTextField t_nama_tamu;
    private javax.swing.JTextField t_no_tamu;
    private javax.swing.JTextField t_no_tlp;
    // End of variables declaration//GEN-END:variables
}
