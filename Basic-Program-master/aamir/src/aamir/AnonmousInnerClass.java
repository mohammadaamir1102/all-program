package aamir;

interface Masjid {
	void m1();

}

class AnonmousInnerClass {
	public static void main(String[] args) {
		Masjid m=new Masjid() {
			
			@Override
			public void m1() {
				System.out.println("Anonymous Inner Class");
				
			}
		};
		m.m1();
	}
}