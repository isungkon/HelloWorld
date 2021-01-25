package test.spring;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String str = "Hello World";
		String[] strArr = str.split(" ");
		for(String s : strArr) {
			System.out.println(s);
		}
	}

}
