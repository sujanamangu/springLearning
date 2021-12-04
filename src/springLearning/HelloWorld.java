package springLearning;

public class HelloWorld {

	private String message;
	private String message1;
	

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setMessage1(String message) {
		this.message1 = message;
	}
	

	public void getMesaage() {
		System.out.println("my message: " + message);

	}
	public void getMessage1() {
		System.out.println("my message1: "+ message1);
	}
	
	
	

}
