package com.gal;

public class Planet {
	public void earth() {
		//for reference
		System.out.println("Earth revelvoes around the sun");
	}
	
	private void mars() {
		System.out.println("Mars is too far from the earth");
	}
		public static void main (String []args) {
			planet a = new planet ();
			a.earth();
			a.mars();
		}
	}
