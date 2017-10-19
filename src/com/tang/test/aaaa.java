package com.tang.test;

import java.util.Random;

public class aaaa {
	public static void main(String[] args) {
		Random random = new Random(200);
		for(int i=0;i<100;i++){
			System.out.println(random.nextInt(90000));
		}
	}
}
