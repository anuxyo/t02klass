public class TaisTrapets{
	double a, x, b, h, t;
	public TaisTrapets(double kylg, double alus, double hypotenuus, double korgus, double teravnurk){
		if(kylg<=0){
			throw new RuntimeException("Sobimatu");}
		if(alus<=0){
			throw new RuntimeException("Sobimatu");}
		if(korgus<=0){
			throw new RuntimeException("Sobimatu");}
		if(teravnurk>=90){
			throw new RuntimeException("Sobimatu");}
		a=kylg;
		x=alus;
		b=hypotenuus;
		h=korgus;
		t=teravnurk;
	}
	public double pindala(){
		return (a*a)+(x*h/2);
	}
	
	public double ymbermoot(){
		return (4*a+x+b);
	}
	
	/*Leian täisnurkse trapetsi nürinurga*/
	public double nyrinurk(){
		return ((180-90-t)+90);
	}
}