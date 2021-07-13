
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
		
		/*main'in üstünde fonk yazdýktan sonra fonku çaðýrýrken ekrana yazdýrma komutunun
		 * içinde çaðýrýyoruz ki ekrana bastýrabilelim diye yoksa ekranda gözükmez
		 * her zaman böyle yap 4 iþlemli olduðunda
		 */
		
	}

}
