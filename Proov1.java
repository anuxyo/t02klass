public class Proov1{
	public static void main(String[] args){
		TaisTrapets laud1=new TaisTrapets(2,1,3,8);
		TaisTrapets laud2=new TaisTrapets(1.5,1,5.5,7.8);
		TaisTrapets laud3=new TaisTrapets(2, 1.3, 5, 6);
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
		
	}
/*VÄLJUND
taisnurksete trapetsite pindalad on:
8.0 ruutsentimeetrit
6.15 ruutsentimeetrit
7.9 ruutsentimeetrit

taisnurksete trapetsite ymbermoodud on:
12.0 sentimeetrit
12.5 sentimeetrit
14.3 sentimeetrit

taisnurksete trapetsite keskloigud on:
4.5 sentimeetrit
2.75 sentimeetrit
4.65 sentimeetrit
*/
}