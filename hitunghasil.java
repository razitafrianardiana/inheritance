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
public class hitunghasil {
    public static void main(String[] args) {
        datadiri dd= new datadiri();
        dd.nama= "Aldo Dido";
        dd.jk= "Laki-laki";
        dd.alamat= "Sukabumi";
        dd.agama= "Islam";
        dd.pekerjaan= "Mahasiswa";
        dd.kewarganegaraan= "Indonesia";
        dd.Tanggallahir= 15012000;
        
        dd.IdentitasDiri();
        dd.Syarat();
        System.out.println("Nomor NIK: " +dd.NIK(20001501));
    }
}
