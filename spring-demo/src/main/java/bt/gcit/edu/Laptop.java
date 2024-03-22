package bt.gcit.edu;

public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop Object is created");
    }

    public void IsRunning(){
        System.out.println("It is Running!!");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using laptop!");
    }
}
