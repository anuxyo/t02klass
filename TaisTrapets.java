public class TaisTrapets{
	double a, x, b, h;
	public TaisTrapets(double kylg, double alus, double hypotenuus, double korgus){
		if(kylg<=0){
			throw new RuntimeException("Sobimatu");}
		if(alus<=0){
			throw new RuntimeException("Sobimatu");}
		if(hypotenuus<=0){
			throw new RuntimeException("Sobimatu");}
		if(korgus<=0){
			throw new RuntimeException("Sobimatu");}
	
		a=kylg;
		x=alus;
		b=hypotenuus;
		h=korgus;

	}
	public double pindala(){
		return (a*h)+(x*h/2);
	}
	
	public double ymbermoot(){
		return (2*a+x+b+h);
	}

	/*Leian täisnurkse trapetsi kesklõigu pikkuse*/
	public double keskloik(){
		return ((a+(a+x))/2);
	}


/*VÄLJUND
taisnurksete trapetsite pindalad on:
20.0 ruutsentimeetrit
15.6 ruutsentimeetrit
15.9 ruutsentimeetrit

taisnurksete trapetsite ymbermoodud on:
16.0 sentimeetrit
17.3 sentimeetrit
16.3 sentimeetrit

taisnurksete trapetsite keskloigud on:
2.5 sentimeetrit
2.0 sentimeetrit
2.65 sentimeetrit

*/
}