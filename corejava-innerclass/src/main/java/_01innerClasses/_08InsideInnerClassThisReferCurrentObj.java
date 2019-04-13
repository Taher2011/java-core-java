package _01innerClasses;

public class _08InsideInnerClassThisReferCurrentObj {

	int x = 10;

	class Inner8 {
		
		int x = 100;

		public void m1() {
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(_08InsideInnerClassThisReferCurrentObj.this.x);
		}
	}

	public static void main(String[] args) {
		new _08InsideInnerClassThisReferCurrentObj().new Inner8().m1();
	}

}
