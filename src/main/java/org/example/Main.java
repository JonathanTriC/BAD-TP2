package org.example;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main extends JFrame {
    private DefaultTableModel model;
    private DateFormat format;
    private JButton btnAddRow;
    private JButton btnDeleteRow;
    private JButton btnKeluar;
    private JLabel jtitle;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jhint;
    private JScrollPane jScrollPane;
    private JTable jTable;
    private JTextField jTextFieldNama;
    private JTextField jTextFieldNIK;
    private JFormattedTextField jTextFieldTanggalLahir;
    private JTextField jTextFieldAlamat;

    private ArrayList<String> nikList = new ArrayList<String>();
    public Main() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Klinik Jonathan");
        format = new SimpleDateFormat("yyyy-MMM-dd");
        jtitle = new JLabel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jhint = new JLabel();
        jTextFieldNama = new JTextField();
        jTextFieldNIK = new JTextField();
        jTextFieldTanggalLahir = new JFormattedTextField(format);
        jTextFieldAlamat = new JTextField();
        btnAddRow = new JButton();
        btnDeleteRow = new JButton();
        btnKeluar = new JButton();
        jScrollPane = new JScrollPane();
        jTable = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jtitle.setText("Program CRUD Data Klinik");
        jLabel1.setText("Nama :");
        jLabel2.setText("NIK :");
        jLabel3.setText("Tanggal Lahir :");
        jhint.setText("(yyyy-MMM-dd)");
        jLabel4.setText("Alamat :");


        String data[][] = {};
        String col[] = {"No","Nama", "NIK", "Tanggal Lahir", "Alamat"};
        model = new DefaultTableModel(data, col);
        jTable.setModel(model);
        jScrollPane.setViewportView(jTable);

        btnAddRow.setText("Tambah Data");
        btnAddRow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAddRowActionPerformed(e);
            }
        });

        btnDeleteRow.setText("Hapus Data");
        btnDeleteRow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDeleteRowActionPerformed(e);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnKeluarActionPerformed(e);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jtitle, GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextFieldNama, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextFieldNIK, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextFieldTanggalLahir, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addComponent(jhint, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextFieldAlamat, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                                )
                                        )
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(btnAddRow, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnDeleteRow, GroupLayout.PREFERRED_SIZE,151,GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnKeluar, GroupLayout.PREFERRED_SIZE,151,GroupLayout.PREFERRED_SIZE)
                                        )
                                )
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(29, Short.MAX_VALUE)
                        )
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jtitle)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldNama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldNIK, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldTanggalLahir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addComponent(jhint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldAlamat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddRow, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDeleteRow, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnKeluar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addGap(21,21,21)
                        )
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(14, Short.MAX_VALUE)
                                .addComponent(jScrollPane, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()
                        )
        );

        pack();
    }

    private void btnAddRowActionPerformed(ActionEvent e) {
        Set<String> str = new HashSet<String>();
        if (!jTextFieldNama.getText().isEmpty() && !jTextFieldNIK.getText().isEmpty() && !jTextFieldTanggalLahir.getText().isEmpty() && !jTextFieldAlamat.getText().isEmpty()) {

            boolean isListEmpty = true;
            System.out.println("nik list" + nikList);
            for(String nik : nikList) {
                if(nik.equals(jTextFieldNIK.getText())){
                    isListEmpty = false;
                }
            }
            if (isListEmpty) {
                nikList.add(jTextFieldNIK.getText());
                model.addRow(new Object[]{
                        model.getRowCount() + 1,
                        jTextFieldNama.getText(),
                        jTextFieldNIK.getText(),
                        jTextFieldTanggalLahir.getText(),
                        jTextFieldAlamat.getText()
                });
                JOptionPane.showMessageDialog(null, "Sukses tambah data");
            } else {
                JOptionPane.showMessageDialog(null, "NIK sudah terdaftar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mohon isi semua data");
        }
    }

    private void btnDeleteRowActionPerformed(ActionEvent e) {
        if(jTable.getSelectedRow() != -1) {
            model.removeRow(jTable.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Sukses hapus data");
        }
    }

    private void btnKeluarActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

}