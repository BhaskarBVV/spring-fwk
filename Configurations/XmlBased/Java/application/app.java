package bhaskar.demo.application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
        context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle obj = (Vehicle)context.getBean("vehicle");
        obj.Drive();
    }
}
