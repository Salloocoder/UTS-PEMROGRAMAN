/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author ASUS TUF
 */
import java.util.Scanner;
import java.util.HashMap;

public class HitungIps {
    static double totalNilaiMutu = 0;
    static int totalSks = 0;
    
    static HashMap<String, Double> bobotNilai = new HashMap<>();
   
    public static void konversi() {
    bobotNilai.put("A", 4.0);
    bobotNilai.put("A-", 3.7);
    bobotNilai.put("B+", 3.3);
    bobotNilai.put("B", 3.0);
    bobotNilai.put("B-", 2.7);
    bobotNilai.put("C+", 2.3);
    bobotNilai.put("C", 2.0);
    bobotNilai.put("D", 1.0);
    bobotNilai.put("E", 0.0);
    }
    
    public static void main(String[] args) {
        konversi();
        String nama;
        String nilaiHuruf;
        int sks;
        double bobot;
   
        try {
            Scanner ips = new Scanner (System.in);
            System.out.print("Masukkan jumlah mata kuliah: ");
            
            int jumlahMK = ips.nextInt();
            ips.nextLine();
            
            for (int i = 1; i <= jumlahMK; i++) {
                System.out.println("\n---------Mata Kuliah ke-" + i + "---------");
                
                System.out.print("Nama Mata Kuliah : ");
                nama = ips.nextLine();
                
                System.out.print("Jumlah SKS: ");
                sks = ips.nextInt();
                
                System.out.print("Nilai Huruf: ");
                nilaiHuruf = ips.next().toUpperCase();
                ips.nextLine();
                
                if (bobotNilai.containsKey(nilaiHuruf)) {
                    bobot = bobotNilai.get(nilaiHuruf);
                } else {
                    bobot = 0.0;
                    System.out.println("Nilai tidak dikenal, dianggap E (0,0)");
                }
                
                double nilaiMutu = bobot * sks;
                totalNilaiMutu += nilaiMutu;
                totalSks += sks;
                
                System.out.println("Nilai Mutu " + nama + ":");
                System.out.println(bobot + " x " + sks + " = " + nilaiMutu);
            }
            
            double ipsSemester = totalNilaiMutu/totalSks;
            
            System.out.println("\n===============================");
            System.out.println("Total Nilai Mutu  : " + totalNilaiMutu);
            System.out.println("Total SKS         : " + totalSks);
            System.out.printf("IPS Semester      : %.2f%n", ipsSemester);
            System.out.println("=================================");
            
        } catch (Exception e) {
            System.out.println("Perhatikan Input");
        }
    }
}


    
  

