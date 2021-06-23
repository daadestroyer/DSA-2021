package maths;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
1. Input no of test cases as T
2. Input no N to get that much prime no till T
Input
--------
2
5
1
Ouput
--------
11 (5 prime no from 1 are 2,3,5,7,11 to we've to print 5th prime no)
2
*/
public class App08_PrateekLovesCandy {
	
	static void primeSieve(boolean[] primes) {
		for (int i = 3; i < primes.length; i+=2) {
			primes[i] = true;
		}
		for (int i = 3; i * i < primes.length; i+=2) {
			if(primes[i] == true) {
				for (int j = i*i; j < primes.length; j+=i) {
					primes[j] = false;
				}
			}
		}
		primes[0]=primes[1]=false;
		primes[2]=true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] primes = new boolean[1000000];
		primeSieve(primes);
		
		int T = sc.nextInt();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < primes.length; i++) {
			if(primes[i]) {
				ans.add(i);
			}
		}
		
		while(T-->0) {
			int n  = sc.nextInt();
			System.out.println(ans.get(n-1));
		}
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(ans.get(i));
		}
	}
}
