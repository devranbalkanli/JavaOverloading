
public class OverLoading {
	
	static int add(int a,int b) {
		return a+b;
		}
	
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	static double add(int a,double b) {
		return a+b;
	}
	
	static double add(double a,double b,int c) {
		return a+b+c;
	}
	
	public static void main(String []args) {
		
		
		System.out.println(add(7.2,5.0,7));
		System.out.println(add(5,10));
		System.out.println(add(10,20,30));
		System.out.println(add(10,8.3));
		
		/*main'in �st�nde fonk yazd�ktan sonra fonku �a��r�rken ekrana yazd�rma komutunun
		 * i�inde �a��r�yoruz ki ekrana bast�rabilelim diye yoksa ekranda g�z�kmez
		 * her zaman b�yle yap 4 i�lemli oldu�unda
		 */
		
	}

}
