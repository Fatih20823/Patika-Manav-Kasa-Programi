package com.fatih.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
		double Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlican=5.00,toplamTutar = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Armut Kaç Kilo ? :");
		armutKg = scan.nextInt();
		toplamTutar += (armutKg*Armut);
		
		System.out.print("Elma Kaç Kilo ? :");
		elmaKg = scan.nextInt();
		toplamTutar += elmaKg*Elma;
		
		System.out.print("Domates Kaç Kilo ? :");
		domatesKg = scan.nextInt();
		toplamTutar += domatesKg*Domates;
		
		System.out.print("Muz Kaç Kilo ? :");
		muzKg = scan.nextInt();
		toplamTutar += muzKg*Muz;
		
		System.out.print("Patlıcan Kaç Kilo ? :");
		patlicanKg = scan.nextInt();
		toplamTutar += patlicanKg*Patlican;
		
		System.out.print("Toplam Tutar: "+toplamTutar+" TL");
	}

}
