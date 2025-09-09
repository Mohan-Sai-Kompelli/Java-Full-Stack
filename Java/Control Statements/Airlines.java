package com.codegnan.controlStatements;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class Airlines {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = 50000;
		System.out.println("Ennter whether your age : ");
		int x = sc.nextInt();
		LocalDateTime time1 = LocalDateTime.now();
		//System.out.println(time1);
		DateTimeFormatter time2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatted_time = time1.format(time2);
//		Temporal format_time = time1.format(time2);
//		String time = "15-12-2025 15:00:00";
//		String timee = time - formatted_time;
		LocalDateTime time = LocalDateTime.of(2025,12,15,16,30,00);
		Duration duration = Duration.between(time1, time);
		String res = x<=18?"KID":(x>18 && x<=60)?"ADULT":"OLD ";
//		long sec = duration.getSeconds();
		long min = duration.toMinutes();
		long hr = duration.toHours();
		long days = duration.toDays();
		double disc=0.0,disc2=0.0,disc3=0.0;
		System.out.println("Enter yes or no based on your membership: ");
		String member = sc.next();
		
		
		if(res == "KID") {
			disc = base-base*0.5; 
		}else {
			if(res == "OLD") {
			disc = base-base*0.2;
			}else {
				//no specific prompt
			}
		}
		System.out.println(days);
		if(days > 120 && days<=240) {
			disc2 =disc-disc*0.1;
			
			
		}else {
			if(days > 30 && days<=120) {
				disc2 = disc;
			}else {
				if(days<30) {
					disc2 = disc+(disc*0.2);
				}else {
					// no content
				}
				
			}
		}
		
		if(member.equalsIgnoreCase("Yes")) {
			disc3 = disc2-disc2*0.05;
		}
		else {
			disc3 = disc2;
		}
//		System.out.println(formatted_time);
		System.out.println(disc3);
	}
}
