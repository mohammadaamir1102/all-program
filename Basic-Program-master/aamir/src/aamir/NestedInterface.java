package aamir;

interface MOuse {
	void damage();

	interface Rabbit {
		void jump();
	}
}

public class NestedInterface implements MOuse.Rabbit {

	@Override
	public void jump() {
		System.out.println("Jumping");
	}
	public static void main(String[] args) {
		MOuse.Rabbit rabbit=new NestedInterface();
		rabbit.jump();
	}

}
