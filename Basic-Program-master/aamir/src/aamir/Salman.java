package aamir;

interface Wer {
	void aamir();

	void salman();

	void arif();

}

abstract class Sallu implements Wer {

	@Override
	public void aamir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void salman() {
		// TODO Auto-generated method stub

	}

	@Override
	public void arif() {
		// TODO Auto-generated method stub

	}
}

class Salman extends Sallu {
	public  void salman() {
		System.out.println("salman");
	}
	public static void main(String[] args) {
		Salman s=new Salman();
		s.salman();
	}

}
