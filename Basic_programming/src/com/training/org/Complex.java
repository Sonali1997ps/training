package com.training.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Complex {

	private int real;
	private int imag;

	// Default Constructor
	public Complex() {
		System.out.println("Default Constructor");
		real = 10;
		imag = 40;
	}

	// Parameterized Constructor
	public Complex(int real, int imag) {
		System.out.println("Parameterized Constructor");
		this.real = real;
		this.imag = imag;
	}

	
	public String toString() {
		return ("Complex Values are " +real+" "+imag);
	}
	// display values
	public void showComplexValues() {
	//	System.out.println("Complex Values:\n" + real + "\n" + imag);
		
		JOptionPane.showMessageDialog(null, "Values are"+ this.real+" "+this.imag);
	}

	// Accept Values
	public void acceptValues() throws IOException {
		
		//Older Way
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter real number: ");
//		this.real = Integer.parseInt(in.readLine());
//		System.out.println("Enter imag number: ");
//		this.imag = Integer.parseInt(in.readLine());
//		
//		
//		//second method
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter real number: ");
		this.real=input.nextInt();
		System.out.println("Enter imag number: ");
		this.imag=input.nextInt();	
		
		
		//third way
//		this.real=Integer.parseInt(JOptionPane.showInputDialog("Enter real number"));
//		this.imag=Integer.parseInt(JOptionPane.showInputDialog("Enter imag number"));
//
//		
	}

	public static void main(String[] args) throws IOException {
		Complex c1 = new Complex();
	
		c1.acceptValues();
		//c1.showComplexValues();
		System.out.println(c1);
//		
	}
}
