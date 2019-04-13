package _02autoBoxing;

public class _03AutoBoxingAutoUnBoxingDemo {

	static Integer I = 10; //AutoBoxing
	
	public static void main(String[] args) {
		int i = I; //AutoUnBoxing
		
		m1(i); //-----------------
							//	 |  
	}						//	 |AutoBoxing
							//	 |
	public static void m1(Integer K) {
		int m = K;//AutoUnBoxing
		System.out.println(m);
	}

}
