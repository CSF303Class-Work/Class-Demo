package bt.gcit.edu;

public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop object created");
    }
    public void IsRunning(){
        System.out.println("Desktop is Running!!");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Desktop!");
    }
}
