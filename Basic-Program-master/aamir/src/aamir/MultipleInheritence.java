package aamir;
interface Mobile{
    void run();
}
interface Chip{
    void show();
}
public class MultipleInheritence implements Mobile,Chip {
    public static void main(String[] args) {
    MultipleInheritence multipleInheritence=new MultipleInheritence();
    multipleInheritence.run();
    multipleInheritence.show();
    }

    @Override
    public void run() {
        System.out.println("runnig");
    }

    @Override
    public void show() {
        System.out.println("showing");
    }
}
