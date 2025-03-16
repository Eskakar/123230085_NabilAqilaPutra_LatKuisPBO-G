/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latkuizpbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author ASUS
 */
public class Home extends JFrame implements ActionListener{
    JLabel lNama = new JLabel("Nama Mahasiswa : ");
    JTextField tNama = new JTextField();
    JLabel lNIM = new JLabel("NIM : ");
    JTextField tNIM = new JTextField();
    JLabel lTugas = new JLabel("Niali Tugas : ");
    JTextField tTugas = new JTextField();
    JLabel lQuiz = new JLabel("Nilai Quiz : ");
    JTextField tQuiz = new JTextField();
    JLabel lKelas = new JLabel("Tipe Kelas : ");
    ButtonGroup typeKelas= new ButtonGroup();
    JRadioButton bKelasPrak = new JRadioButton("Praktikum",true);
    JRadioButton bKelasTeori = new JRadioButton("Teori");
    JLabel lMatkul = new JLabel("Mata Kuliah : ");
    String[] Matkul = {"PBO","SCPK","Algo Lanjut"};
    JComboBox<String> cbMatkul = new JComboBox<String>(Matkul);
    
    //button
    JButton bSubmit = new JButton("Submit");
    JButton bLogout = new JButton("Logout");
    public Home(){
        setTitle("Login");
        setDefaultCloseOperation(3);
        setSize(690,390);
        setLayout(null);
        //Add object
        add(lNama);
        add(tNama);
        add(lNIM);
        add(tNIM);
        add(lTugas);
        add(tTugas);
        add(lQuiz);
        add(tQuiz);
        add(lKelas);
        add(bKelasPrak);
        add(bKelasTeori);
        add(lMatkul);
        add(cbMatkul);
        add(bSubmit);
        add(bLogout);
        typeKelas.add(bKelasPrak);
        typeKelas.add(bKelasTeori);
        //action listener
        bSubmit.addActionListener(this);
        bKelasPrak.addActionListener(this);
        bKelasTeori.addActionListener(this);
        bLogout.addActionListener(this);
        //set bound
        lNama.setBounds(30,20,110,30);
        tNama.setBounds(250,20,400,30);
        lNIM.setBounds(30,50,110,30);
        tNIM.setBounds(250,50,400,30);
        lTugas.setBounds(30,80,110,30);
        tTugas.setBounds(250,80,400,30);
        lQuiz.setBounds(30,110,110,30);
        tQuiz.setBounds(250,110,400,30);
        lKelas.setBounds(30,140,110,30);
        bKelasPrak.setBounds(250,140,100,30);
        bKelasTeori.setBounds(250,170,100,30);
        lMatkul.setBounds(30,230,110,30);
        cbMatkul.setBounds(250,230,400,30);
        bSubmit.setBounds(220,270,100,30);
        bLogout.setBounds(330,270,100,30);
        //biar framenya tampil ditengah
        setLocationRelativeTo(null);
	setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bSubmit){
            String Nama = tNama.getText();
            String NIM = tNIM.getText();
            double nilaiTugas =  Double.parseDouble(tTugas.getText());
            double nilaiQuiz =  Double.parseDouble(tQuiz.getText());
            double HasilNilai = 0;
            if(bKelasTeori.isSelected()){
                HasilNilai = (0.3 * nilaiTugas) + (0.7 * nilaiQuiz);
            }else if(bKelasPrak.isSelected()){
                HasilNilai = (0.7 * nilaiTugas) + (0.3 * nilaiQuiz);
            }
            String Kelulusan = "NOT PASS";
            if(HasilNilai > 85){
                Kelulusan = "PASS";
            }
            JOptionPane.showMessageDialog(null, "Nama: " + Nama + "\nNIM:" + NIM + "\nMata Kuliah: "
            + cbMatkul.getSelectedItem() + "\nTotal Nilai: "
            + HasilNilai + "\nHasil: " + Kelulusan);

        }
        if(e.getSource() == bLogout){
            int keluar = JOptionPane.showConfirmDialog(null,"Apakah anda Yakin Untuk Keluar ? ","Logout",JOptionPane.YES_NO_OPTION);
            if(keluar == JOptionPane.YES_OPTION){
                dispose();
            }
        }
    }
}
