package springLearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainClass {
	
	public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	JavaCollection jc=(JavaCollection)context.getBean("javaCollections");
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	
	HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
	helloWorld.setMessage("HelloWorld");
	helloWorld.getMesaage();
	
	/*
	 * HelloWorld obj1= (HelloWorld) context.getBean("FirstBean");
	 * obj1.getMesaage(); obj1.getMessage1 ();
	 * 
	 * 
	 * HelloIndia obj2= (HelloIndia) context.getBean("SecondBean");
	 * obj2.getMessage(); obj2.getMessage1(); obj2.getMessage2();
	 * 
	 * TextEditor te = (TextEditor) context.getBean("textEditor"); te.spellCheck();
	 */
	
	
	/*
	 * jc.getAddressList(); jc.getAddressMap(); jc.getAddressProp();
	 * jc.getAddressSet();
	 */
	
	
}
	
}
