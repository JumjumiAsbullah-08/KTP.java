# KTP.java
PRAKTIKUM UTS


package com.mycompany.e.ktp;

class KTP{
    String NIK,tgl_lahir;
    int RT;
    String NAMA,Tempat,kelamin,darah,alamat,desa,kecamatan,agama,kawin,pekerjaan,negara,berlaku;
    
    void isidata(String NIK, String NAMA, String Tempat,String tgl_lahir, String kelamin, String darah, String alamat, int RT,String desa, String kecamatan, String agama, String kawin, String pekerjaan, String negara, String berlaku){
        this.NIK = NIK;
        this.NAMA = NAMA;
        this.RT = RT;
        this.tgl_lahir = tgl_lahir;
        this.Tempat = Tempat;
        this.agama = agama;
        this.alamat = alamat;
        this.berlaku = berlaku;
        this.darah = darah;
        this.desa = desa;
        this.kawin = kawin;
        this.kecamatan = kecamatan;
        this.kelamin = kelamin;
        this.negara = negara;
        this.pekerjaan = pekerjaan;
}
}
public class KARTU_TANDA_PENDUDUK {
    public static void main(String[] args) {
       
        KTP ktp = new KTP();
       ktp.isidata("1220030808010004", "JUMJUMI ASBULLAH", "PANGIRKIRAN", "080801", "LAKI-LAKI", "-", "DESA PANGIRKIRAN", 00, "PANGIRKIRAN", "HALONGONAN", "ISLAM", "BELUM KAWIN", "TIDAK BEKERJA", "WNI", "SEUMUR HIDUP");
        
       System.out.println(" NIK               : "+ ktp.NIK);
       System.out.println(" NAMA              : "+ ktp.NAMA);
       System.out.println(" TEMPAT/TGL LAHIR  : "+ ktp.Tempat + "/" + ktp.tgl_lahir);
       System.out.println(" JENIS KELAMIN     : "+ ktp.kelamin);
       System.out.println(" GOLONGAN DARAH    : "+ ktp.darah);
       System.out.println(" ALAMAT            : "+ ktp.alamat);
       System.out.println(" RT/RW             : "+ ktp.RT);
       System.out.println(" KEL/DESA          : "+ ktp.desa);
       System.out.println(" KECAMATAN         : "+ ktp.kecamatan);
       System.out.println(" AGAMA             : "+ ktp.agama);
       System.out.println(" STATUS PERKAWINAN : "+ ktp.kawin);
       System.out.println(" PEKERJAAN         : "+ ktp.pekerjaan);
       System.out.println(" KEWARGANEGARAN    : "+ ktp.negara);
       System.out.println(" BERLAKU HINGGA    : "+ ktp.berlaku);
    }
    
}
