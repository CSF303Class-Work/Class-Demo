package bt.gcit.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Laptop obj = (Laptop) context.getBean("lap");
        Alien objj = context.getBean("alien", Alien.class);

        // Desktop obj = (Desktop) context.getBean("comp2");
       
        // obj.IsRunning();
        // objj.setAge(5);
        System.out.println(objj.getAge());
        objj.code();
    } 
}
