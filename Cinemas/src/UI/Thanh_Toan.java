/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import controller.DatVe_ctrl;
import controller.HoaDon_ctrl;
import controller.JDBCConnection;
import controller.KhuyenMai_ctrl;
import controller.ThanhVien_ctrl;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ASUS
 */
public class Thanh_Toan extends javax.swing.JFrame {

    /**
     * 
     */
    public Thanh_Toan() {
        initComponents();
        this.setTitle("Thanh Toán");
        CB_no_matv.setSelected(true);
        tf_maTV.setEditable(false);
        CB_no_magg.setSelected(true);
        tf_maGG.setEditable(false);
        Lable_tongtien_ht.setText(DatVe.tongtien);
        Lable_thanhtien_ht.setText(DatVe.tongtien);
        tf_diemhienco.setEditable(true);
        
        Lable_tongtien_ht.setText(String.valueOf(DatVe.tongtien));
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        Label_GiamGia = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Label_MaTV = new javax.swing.JLabel();
        Label_DiemTL = new javax.swing.JLabel();
        Label_MaKM = new javax.swing.JLabel();
        Label_TongTien = new javax.swing.JLabel();
        Label_giamgia = new javax.swing.JLabel();
        Label_Thanhtien = new javax.swing.JLabel();
        CB_no_matv = new javax.swing.JCheckBox();
        CB_yes_matv = new javax.swing.JCheckBox();
        tf_maTV = new javax.swing.JTextField();
        bt_tim = new javax.swing.JButton();
        tf_diemhienco = new javax.swing.JTextField();
        tf_diemsudung = new javax.swing.JTextField();
        CB_no_magg = new javax.swing.JCheckBox();
        CB_yes_magg = new javax.swing.JCheckBox();
        tf_maGG = new javax.swing.JTextField();
        Lable_tongtien_ht = new javax.swing.JLabel();
        Lable_giamgia_ht = new javax.swing.JLabel();
        Lable_thanhtien_ht = new javax.swing.JLabel();
        btn_thanhtoan = new javax.swing.JButton();
        btn_inve = new javax.swing.JButton();
        Label_DiemTL1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_GiamGia.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THANH TOÁN");

        Label_MaTV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_MaTV.setForeground(new java.awt.Color(255, 255, 255));
        Label_MaTV.setText("Mã TV: ");

        Label_DiemTL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_DiemTL.setForeground(new java.awt.Color(255, 255, 255));
        Label_DiemTL.setText("Điểm Tích Luỹ: ");

        Label_MaKM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_MaKM.setForeground(new java.awt.Color(255, 255, 255));
        Label_MaKM.setText("Mã Giảm GIá");

        Label_TongTien.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_TongTien.setForeground(new java.awt.Color(255, 255, 255));
        Label_TongTien.setText("Tổng Tiền:");

        Label_giamgia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_giamgia.setForeground(new java.awt.Color(255, 255, 255));
        Label_giamgia.setText("Giảm Giá:");

        Label_Thanhtien.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_Thanhtien.setForeground(new java.awt.Color(255, 255, 255));
        Label_Thanhtien.setText("THÀNH TIỀN:");

        CB_no_matv.setForeground(new java.awt.Color(255, 255, 255));
        CB_no_matv.setText("Không");
        CB_no_matv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_no_matvActionPerformed(evt);
            }
        });

        CB_yes_matv.setForeground(new java.awt.Color(255, 255, 255));
        CB_yes_matv.setText("Có");
        CB_yes_matv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_yes_matvActionPerformed(evt);
            }
        });

        tf_maTV.setText("Mã thành viên");
        tf_maTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_maTVActionPerformed(evt);
            }
        });
        tf_maTV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_maTVKeyPressed(evt);
            }
        });

        bt_tim.setText("Tìm");
        bt_tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timActionPerformed(evt);
            }
        });

        tf_diemhienco.setText("0");
        tf_diemhienco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_diemhiencoActionPerformed(evt);
            }
        });

        tf_diemsudung.setText("0");
        tf_diemsudung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_diemsudungActionPerformed(evt);
            }
        });
        tf_diemsudung.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_diemsudungKeyPressed(evt);
            }
        });

        CB_no_magg.setForeground(new java.awt.Color(255, 255, 255));
        CB_no_magg.setText("Không");
        CB_no_magg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_no_maggActionPerformed(evt);
            }
        });

        CB_yes_magg.setForeground(new java.awt.Color(255, 255, 255));
        CB_yes_magg.setText("Có");
        CB_yes_magg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_yes_maggActionPerformed(evt);
            }
        });

        tf_maGG.setText("Mã giảm giá");
        tf_maGG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_maGGActionPerformed(evt);
            }
        });
        tf_maGG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_maGGKeyPressed(evt);
            }
        });

        Lable_tongtien_ht.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lable_tongtien_ht.setForeground(new java.awt.Color(255, 255, 255));
        Lable_tongtien_ht.setText("0");

        Lable_giamgia_ht.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lable_giamgia_ht.setForeground(new java.awt.Color(255, 255, 255));
        Lable_giamgia_ht.setText("0");

        Lable_thanhtien_ht.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lable_thanhtien_ht.setForeground(new java.awt.Color(255, 255, 255));
        Lable_thanhtien_ht.setText("0");

        btn_thanhtoan.setText("Thanh toán");
        btn_thanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thanhtoanActionPerformed(evt);
            }
        });

        btn_inve.setText("IN VÉ");
        btn_inve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inveActionPerformed(evt);
            }
        });

        Label_DiemTL1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_DiemTL1.setForeground(new java.awt.Color(255, 255, 255));
        Label_DiemTL1.setText("Điểm Sử Dụng:");

        Back.setBackground(new java.awt.Color(153, 153, 153));
        Back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Label_GiamGiaLayout = new javax.swing.GroupLayout(Label_GiamGia);
        Label_GiamGia.setLayout(Label_GiamGiaLayout);
        Label_GiamGiaLayout.setHorizontalGroup(
            Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Label_GiamGiaLayout.createSequentialGroup()
                .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Label_GiamGiaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Label_GiamGiaLayout.createSequentialGroup()
                                .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_MaTV)
                                    .addComponent(Label_TongTien)
                                    .addComponent(Label_giamgia)
                                    .addComponent(Label_DiemTL))
                                .addGap(10, 10, 10)
                                .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CB_no_magg)
                                    .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Lable_thanhtien_ht, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lable_giamgia_ht, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lable_tongtien_ht, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Label_GiamGiaLayout.createSequentialGroup()
                                        .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Label_GiamGiaLayout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(CB_yes_magg)
                                                    .addComponent(CB_yes_matv)))
                                            .addComponent(tf_diemhienco, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CB_no_matv))
                                        .addGap(18, 18, 18)
                                        .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(Label_GiamGiaLayout.createSequentialGroup()
                                                .addComponent(Label_DiemTL1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_diemsudung))
                                            .addComponent(tf_maGG, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_maTV, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(bt_tim, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(Label_MaKM)))
                    .addGroup(Label_GiamGiaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Label_Thanhtien))
                    .addGroup(Label_GiamGiaLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_inve, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Label_GiamGiaLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back))
        );
        Label_GiamGiaLayout.setVerticalGroup(
            Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Label_GiamGiaLayout.createSequentialGroup()
                .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Label_GiamGiaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(Back))
                .addGap(44, 44, 44)
                .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Label_GiamGiaLayout.createSequentialGroup()
                        .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_MaTV)
                            .addGroup(Label_GiamGiaLayout.createSequentialGroup()
                                .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CB_no_matv)
                                    .addComponent(CB_yes_matv)
                                    .addComponent(tf_maTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_tim))
                                .addGap(12, 12, 12)
                                .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_diemhienco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_DiemTL1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_diemsudung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_DiemTL))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(Label_MaKM))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CB_no_magg)
                        .addComponent(CB_yes_magg)
                        .addComponent(tf_maGG, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lable_tongtien_ht))
                .addGap(18, 18, 18)
                .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_giamgia)
                    .addComponent(Lable_giamgia_ht))
                .addGap(18, 18, 18)
                .addGroup(Label_GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Thanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lable_thanhtien_ht))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btn_thanhtoan)
                .addGap(18, 18, 18)
                .addComponent(btn_inve)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Label_GiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_GiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CB_no_matvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_no_matvActionPerformed
        // TODO add your handling code here:
        CB_yes_matv.setSelected(false);
        tf_maTV.setText("Mã thành viên");
        tf_maTV.setEditable(false);
    }//GEN-LAST:event_CB_no_matvActionPerformed

    private void CB_yes_matvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_yes_matvActionPerformed
        // TODO add your handling code here:
        CB_no_matv.setSelected(false);
        tf_maTV.setText("Nhập mã thành viên");
        tf_maTV.setEditable(true);
    }//GEN-LAST:event_CB_yes_matvActionPerformed

    private void tf_maTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_maTVActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tf_maTVActionPerformed

    private void tf_diemhiencoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_diemhiencoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_diemhiencoActionPerformed

    private void CB_no_maggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_no_maggActionPerformed
        // TODO add your handling code here:
        CB_yes_magg.setSelected(false);
        tf_maGG.setText("Mã giảm giá");
        tf_maGG.setEditable(false);
    }//GEN-LAST:event_CB_no_maggActionPerformed

    private void CB_yes_maggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_yes_maggActionPerformed
        // TODO add your handling code here:
        CB_no_magg.setSelected(false);
        tf_maGG.setText("Nhập mã giảm giá");
        tf_maGG.setEditable(true);
    }//GEN-LAST:event_CB_yes_maggActionPerformed

    private void tf_maGGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_maGGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_maGGActionPerformed

    private void btn_inveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inveActionPerformed
        // TODO add your handling code here:
        DatVe_ctrl datVe_ctrl = new DatVe_ctrl();
        HoaDon_ctrl hoaDon_ctrl = new HoaDon_ctrl();
        int GheDaDat = 0;
        String MaSC = DatVe.MaSuatChieu;
        
        for(int i = 0; i< DatVe.MaGhe.size(); i++){
            GheDaDat |= datVe_ctrl.KiemTraGhe(DatVe.MaGhe.get(i), MaSC); // ví dụ: 1 or 0 = 1, 0 or 0 = 0
            if(GheDaDat == 1){
                JOptionPane.showMessageDialog(this,"Ghế "+ DatVe.MaGhe.get(i)+" đã được đặt trước!");
                break;
            }
        }
        
        //CHú Ý phần này cần MANV
        if (GheDaDat == 0){
            long DiemTichLuy = 0;
            String MaNV = DangNhap.MaNV; //test thử
            //String MaNV = DangNhap.MaNV;
            
            String MaTV = null;
            String MaKM = null;
            float ThanhTien = Float.parseFloat(Lable_thanhtien_ht.getText());
            
            if(tf_maTV.isEditable()){
                MaTV = tf_maTV.getText();
                DiemTichLuy = Long.parseLong(tf_diemsudung.getText());
            }
            if(tf_maGG.isEditable()){
                MaKM = tf_maGG.getText();
            }
            int SOHD = hoaDon_ctrl.TaoHoaDon(MaNV, MaTV, ThanhTien, MaKM, DiemTichLuy);
            boolean DatVeThanhCong = true; //Sau khi tạo hóa đơn, tiến hành đặt vé cho từng ghế
            
             for (int i = 0; i < DatVe.MaGhe.size(); i++) {
                MaGheSQL = DatVe.MaGhe.get(i);
                 
                if (!datVe_ctrl.DatVe(DatVe.MaGhe.get(i), MaSC, SOHD))
                    DatVeThanhCong=false;
                if ( DatVeThanhCong == false) {
                    JOptionPane.showMessageDialog(null, "Đặt vé không thành công"); //Nếu có bất kì ghế nào không đặt được, break
                    break;
                }
            }
            if (DatVeThanhCong){
                Connection con = JDBCConnection.getJDBCConnection();
                
                try {
                    con.setAutoCommit(false);
                    con.commit();
                    for(int i = 0; i<DatVe.MaGhe.size(); i++){
                    InVe(DatVe.tenghe, MaSC, MaGheSQL);
                }
                    JOptionPane.showMessageDialog(null, "Đặt vé thành công");
                } catch (SQLException ex) {
                    Logger.getLogger(Thanh_Toan.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            
        }
        
    }//GEN-LAST:event_btn_inveActionPerformed

    private void tf_maTVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_maTVKeyPressed
        // TODO add your handling code here:
        if(tf_maTV.isEditable()==true){
            String Matv = tf_maTV.getText();
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {  
            
            System.out.println(Matv);
            ThanhVien_ctrl tv_ctrl = new ThanhVien_ctrl();
            if(tv_ctrl.isThanhVien(Matv)){
                int DiemTichLuy = tv_ctrl.getDiemTichLuy(Matv);
                tf_diemhienco.setText(String.valueOf(DiemTichLuy));
                System.out.println(DiemTichLuy);
            }
            else{
                JOptionPane.showMessageDialog(this,"Vui lòng nhập mã thành viên hợp lệ!");
            }
        }
        }
    }//GEN-LAST:event_tf_maTVKeyPressed

    private void bt_timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timActionPerformed
        // TODO add your handling code here:
        if(tf_maTV.isEditable()==true){ 
            String Matv = tf_maTV.getText();
            ThanhVien_ctrl tv_ctrl = new ThanhVien_ctrl();
            if(tv_ctrl.isThanhVien(Matv)){
                int DiemTichLuy = tv_ctrl.getDiemTichLuy(Matv);
                tf_diemhienco.setText(String.valueOf(DiemTichLuy));
            }
            else{
                JOptionPane.showMessageDialog(this,"Vui lòng nhập mã thành viên hợp lệ!");
            }
        }
    }//GEN-LAST:event_bt_timActionPerformed

    private void tf_diemsudungKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_diemsudungKeyPressed
        // TODO add your handling code here:
        int DiemHienCo = Integer.parseInt(tf_diemhienco.getText());
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            int DiemSuDung = Integer.parseInt(tf_diemsudung.getText());
            if (DiemSuDung <= DiemHienCo){
                if(temp_value_dtl <= DiemSuDung){ //dsd = 2000, temp = 1000
                    
                    DiemSuDung = DiemSuDung - temp_value_dtl; //dsd = 1000
                    temp_value_dtl = Integer.parseInt(tf_diemsudung.getText());// temp = 2000
                    float giamgiaDTL = Float.parseFloat(Lable_giamgia_ht.getText()); //vd dtl: 1000
                    giamgiaDTL += DiemSuDung; Lable_giamgia_ht.setText(String.valueOf(giamgiaDTL));

                    float tongtien = Float.parseFloat(Lable_tongtien_ht.getText());
                    float ThanhTien = tongtien - giamgiaDTL;
                    Lable_thanhtien_ht.setText(String.valueOf(ThanhTien));
                }
                else{ //dsd = 500, temp = 1000
                    DiemSuDung = temp_value_dtl - DiemSuDung; //dsd = 1000
                    temp_value_dtl = Integer.parseInt(tf_diemsudung.getText());// temp = 500
                    float giamgiaDTL = Float.parseFloat(Lable_giamgia_ht.getText()); //vd dtl: 1000
                    giamgiaDTL -= DiemSuDung; Lable_giamgia_ht.setText(String.valueOf(giamgiaDTL));
                    
                    
                    float tongtien = Float.parseFloat(Lable_tongtien_ht.getText());
                    float ThanhTien = tongtien - giamgiaDTL;
                    Lable_thanhtien_ht.setText(String.valueOf(ThanhTien));
                }
                
                
            
            }
            else{
                JOptionPane.showMessageDialog(this,"Bạn không đủ điểm tích luỹ!");    
            }
        }  
    }//GEN-LAST:event_tf_diemsudungKeyPressed

    private void tf_diemsudungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_diemsudungActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tf_diemsudungActionPerformed

    private void tf_maGGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_maGGKeyPressed
        // TODO add your handling code here:
         if(tf_maGG.isEditable()==true){
             if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                 String Magg = tf_maGG.getText();
                 float GG = 0;
                 KhuyenMai_ctrl khuyenMai_ctrl =new KhuyenMai_ctrl();
                 if(khuyenMai_ctrl.isKhuyenMai(Magg)){
                     int tylekm = khuyenMai_ctrl.getTyleKM(Magg);
                     float tongtien = Float.parseFloat(Lable_tongtien_ht.getText());
                     float GiamgiaKM = tongtien*tylekm/100;
                     float GiamGia = Float.parseFloat(Lable_giamgia_ht.getText());
                     GiamGia += GiamgiaKM;
                     GG = GiamgiaKM;
                     Lable_giamgia_ht.setText(String.valueOf(GiamGia));
                     Float ThanhTien = tongtien - GiamGia;
                     Lable_thanhtien_ht.setText(String.valueOf(ThanhTien));
                 }
                 else if(Magg.equals("")){ 
                     float GiamGia_old = Float.parseFloat(Lable_giamgia_ht.getText()); //30000
                     float tongtien = Float.parseFloat(Lable_tongtien_ht.getText()); //100000
                     GiamGia_old -= GG;
                     Lable_giamgia_ht.setText(String.valueOf(GiamGia_old));
                     Float ThanhTien = tongtien - GiamGia_old;
                     Lable_thanhtien_ht.setText(String.valueOf(ThanhTien));
                 }
                 else{
                     JOptionPane.showMessageDialog(this,"Mã tích luỹ của bạn không hợp lệ!");  
                 }
             }
         }
    }//GEN-LAST:event_tf_maGGKeyPressed

    private void btn_thanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thanhtoanActionPerformed
        // TODO add your handling code here:
        tien = Lable_thanhtien_ht.getText();
        HinhThucThanhToan ht = new HinhThucThanhToan();
    }//GEN-LAST:event_btn_thanhtoanActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:

        this.dispose();
        new DatVe().setVisible(true);
        
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Thanh_Toan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Thanh_Toan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Thanh_Toan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Thanh_Toan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thanh_Toan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JCheckBox CB_no_magg;
    private javax.swing.JCheckBox CB_no_matv;
    private javax.swing.JCheckBox CB_yes_magg;
    private javax.swing.JCheckBox CB_yes_matv;
    private javax.swing.JLabel Label_DiemTL;
    private javax.swing.JLabel Label_DiemTL1;
    private javax.swing.JPanel Label_GiamGia;
    private javax.swing.JLabel Label_MaKM;
    private javax.swing.JLabel Label_MaTV;
    private javax.swing.JLabel Label_Thanhtien;
    private javax.swing.JLabel Label_TongTien;
    private javax.swing.JLabel Label_giamgia;
    private javax.swing.JLabel Lable_giamgia_ht;
    private javax.swing.JLabel Lable_thanhtien_ht;
    private javax.swing.JLabel Lable_tongtien_ht;
    private javax.swing.JButton bt_tim;
    private javax.swing.JButton btn_inve;
    private javax.swing.JButton btn_thanhtoan;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tf_diemhienco;
    private javax.swing.JTextField tf_diemsudung;
    private javax.swing.JTextField tf_maGG;
    private javax.swing.JTextField tf_maTV;
    // End of variables declaration//GEN-END:variables
    private int temp_value_dtl = 0;
    public static String tien;
    public static String MaGheSQL;
    
    void InVe(String Ghe, String MaSc, String MaGhe){
        
        HashMap hashmap = new HashMap();
        hashmap.put("ghe", Ghe);
        hashmap.put("masc", MaSc);
        hashmap.put("maghe", MaGhe);
        
        try {
            Connection con = JDBCConnection.getJDBCConnection();
            String dir = "F:\\Java Swing Root(main)\\Ontap\\src\\report\\ticket.jrxml";
            JasperDesign jd = JRXmlLoader.load(dir);
            JasperReport jr = JasperCompileManager.compileReport(dir);
            JasperPrint jp = JasperFillManager.fillReport(jr, hashmap,con);
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

