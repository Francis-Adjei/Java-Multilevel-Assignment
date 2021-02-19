class Person{
	public void nationality(){
		System.out.println("Ghana");
	}
	public void place(){
		System.out.println("Kumasi");
	}
}
class Emp extends Person{
	public void organizatoin(){
		System.out.println("Military");
	}
	public void place(){
		System.out.println("Accra");
	}
}
class Manager extends Emp{
	public void subordinates(){
		System.out.println(7);
	}
	public void place(){
		System.out.println("Takoradi");
	}
}
public class Q3 {
	 public static void main(String[] args){
		 Manager francis = new Manager();
		 francis.nationality();
		 francis.organizatoin();
		 francis.subordinates();
		 francis.place();
		  
	 }

}
