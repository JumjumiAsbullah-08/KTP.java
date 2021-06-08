# KTP.java
PRAKTIKUM UTS

package com.mycompany.ktp;
import javax.swing.*;
public class KARTU_TANDA_PENDUDUK {

    public static void main(String[] args) {
       
        String NIK = " ";
        NIK =  JOptionPane.showInputDialog (" NIK ");
        
        String NAMA = "";
        NAMA = JOptionPane.showInputDialog(" NAMA ");
        
        String Tempat_tgl_lahir = "";
        Tempat_tgl_lahir = JOptionPane.showInputDialog(" Tempat/Tgl Lahir ");
        
        String kelamin = "";
        kelamin = JOptionPane.showInputDialog(" JENIS KELAMIN ");
        
        String darah = "";
        darah = JOptionPane.showInputDialog(" GOLONGAN DARAH ");
        
        String Alamat = "";
        Alamat = JOptionPane.showInputDialog(" ALAMAT ");
        
        String Rt = "";
        Rt = JOptionPane.showInputDialog(" RT/RW ");
        
        String Desa = "";
        Desa = JOptionPane.showInputDialog(" KEL/DESA ");
        
        String Kecamatan = "";
        Kecamatan = JOptionPane.showInputDialog(" KECAMATAN ");
        
        String Agama = "";
        Agama = JOptionPane.showInputDialog(" AGAMA ");
        
        String Kawin = "";
        Kawin = JOptionPane.showInputDialog(" STATUS PERKAWINAN ");
        
        String Pekerjaan = "";
        Pekerjaan = JOptionPane.showInputDialog(" PEKERJAAN ");
        
        String negara = "";
        negara = JOptionPane.showInputDialog(" KEWARGANEGARAAN ");
        
        String berlaku = "";
        berlaku = JOptionPane.showInputDialog(" BERLAKU HINGGA ");
        
        JOptionPane.showMessageDialog(null, " NIK : " +NIK + "\n NAMA : " +NAMA + "\n TEMPAT/TGL LAHIR : " +Tempat_tgl_lahir + 
                "\n JENIS KELAMIN : " +kelamin + " \n GOL. DARAH : " +darah + " \n ALAMAT : " +Alamat + "\n RT/RW : " +Rt + 
                "\n KEL/DESA : " +Desa + "\n KECAMATAN : "+Kecamatan + "\n AGAMA : " +Agama + "\n STATUS PERKAWINAN : " +Kawin + "\n PEKERJAAN : " 
                +Pekerjaan + "\n KEWARGANEGARAAN :" +negara + "\n BERLAKU HINGGA : " +berlaku," KARTU TANDA PENDUDUK", JOptionPane.INFORMATION_MESSAGE);
        }
   
    }
    
