/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapersyaratanktp;

/**
 *
 * @author PC
 */
public class datadiri extends Datapersyaratanktp {
    public String nama,jk, alamat,agama,pekerjaan,kewarganegaraan ;
    public int Tanggallahir;
    public int NIK;
    //overriding
    @Override
    public void IdentitasDiri(){
        System.out.println("Nama: " +nama);
        System.out.println("Jenis Kelamin: " +jk);
        System.out.println("Alamat: " +alamat);
        System.out.println("Agama: " +agama);
        System.out.println("Pekerjaan: " +pekerjaan);
        System.out.println("Kewarganegaraan: " +kewarganegaraan);
        System.out.println("Tanggal Tahun Lahir: " +Tanggallahir);
    }
    @Override
    public void Syarat (){
        System.out.println("Semua Persyaratan " + super.Syarat);
    }
    //overloading
    public int NIK (int NomorNIK){
        this.NIK=NomorNIK;
        return NIK;
    }
}
