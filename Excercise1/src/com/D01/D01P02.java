package com.D01;
 
 
interface MedicineInfo {
	void displayLabel();
}
 
 
class Syrup implements MedicineInfo {
	@Override
	public void displayLabel() {
		System.out.println("Syrup is consumable only on prescription");
	}
}
class Ointment implements MedicineInfo {
	@Override
	public void displayLabel() {
		System.out.println("Ointment is for external use only");
	}
}
class Tablet implements MedicineInfo {
	@Override
	public void displayLabel() {
		System.out.println("Store Tablets in a cool dry place.");
	}
 
	
}
public class D01P02 {
	public static void main(String[] args) {
		MedicineInfo tablet = new Tablet();
		MedicineInfo syrup = new Syrup();
		MedicineInfo ointment = new Ointment();
		tablet.displayLabel();
		syrup.displayLabel();
		ointment.displayLabel();
	}
 
}