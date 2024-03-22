package bt.gcit.edu;

public class Alien {
    private int age;
    private Computer comp;

    // public Alien(int age, Laptop lap) {
    //     System.out.println("Alien Object Created!!");
    //     this.age = age;
    // }

    public Alien() {
        System.out.println("Alien Object is created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // System.out.println("Setter called");
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
    
    public void code() {
        System.out.println("Coding");
        comp.compile();
    }
}
