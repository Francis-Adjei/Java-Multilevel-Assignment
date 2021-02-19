class Electronics{
	public void device_type(){
		System.out.println("Device Type: Electronics");
	}
}

class Television extends Electronics{
	public void category(){
		System.out.println("Category: Television");
	}
}
class LED extends Television{
	public void display_tech(){
		System.out.println("The- technology is LED");
	}
}
public class Q1 {
	public static void main(String[] args) {
		LED s = new LED();
		s.device_type();
		s.category();
        s.display_tech();
   
   
}}
