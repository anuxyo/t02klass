public class Proov1{
	public static void main(String[] args){
		TaisTrapets laud1=new TaisTrapets(2,1,3,8);
		TaisTrapets laud2=new TaisTrapets(1.5,1,5.5,7.8);
		TaisTrapets laud3=new TaisTrapets(2, 1.3, 5, 6);
		System.out.println(laud1.pindala());
		System.out.println(laud2.pindala());
		System.out.println(laud3.pindala());
		
		System.out.println("---------");
		
		System.out.println(laud1.ymbermoot());
		System.out.println(laud2.ymbermoot());
		System.out.println(laud3.ymbermoot());
		
		System.out.println("---------");
		
	}
}