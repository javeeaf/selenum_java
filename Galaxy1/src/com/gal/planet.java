package com.gal;
public class planet {
	
	public void earth() {
		System.out.println("earth"); 
	}
	public void mars () {
		System.out.println("Mars");
	}
  public static void main (String[]args) {
	planet pla = new planet ();
	pla.earth();
	pla.mars();
}
}
