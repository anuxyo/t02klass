public class Proov1{
	public static void main(String[] args){
		TaisTrapets laud1=new TaisTrapets(2,1,3,8,45.5);
		TaisTrapets laud2=new TaisTrapets(1.5,1,5.5,7.8,12);
		TaisTrapets laud3=new TaisTrapets(2, 1.3, 5, 6,60.6);
		System.out.println(" ");
		System.out.println("taisnurksete trapetsite pindalad on:");
		System.out.println(laud1.pindala()+" ruutsentimeetrit");
		System.out.println(laud2.pindala()+" ruutsentimeetrit");
		System.out.println(laud3.pindala()+" ruutsentimeetrit");
		System.out.println(" ");
		System.out.println("taisnurksete trapetsite ymbermoodud on:");
		System.out.println(laud1.ymbermoot()+" sentimeetrit");
		System.out.println(laud2.ymbermoot()+" sentimeetrit");
		System.out.println(laud3.ymbermoot()+" sentimeetrit");
		System.out.println(" ");
		System.out.println("taisnurksete trapetsite keskloigud on:");
		System.out.println(laud1.keskloik()+" sentimeetrit");
		System.out.println(laud2.keskloik()+" sentimeetrit");
		System.out.println(laud3.keskloik()+" sentimeetrit");
		System.out.println(" ");
		System.out.println("taisnurksete trapetsite nyrinurgad on:");
		System.out.println(laud1.nyrinurk()+" kraadi");
		System.out.println(laud2.nyrinurk()+" kraadi");
		System.out.println(laud3.nyrinurk()+" kraadi");

		
	}
}