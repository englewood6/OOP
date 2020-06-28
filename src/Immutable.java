
public class Immutable {

	public static void main(String[] args) {
		
		String[] ureticiFirmalari = {"HP", "Fujitsu", "Dell"};
		Bilgisayar b1= new Bilgisayar(8 , 16 ,ureticiFirmalari );
		bilgisayarYazdir(b1);
		
		String[] ureticiler = b1.getUreticifirmalari();
		ureticiler[0]="Apple";
		
		bilgisayarYazdir(b1);
	}
	
	public static void bilgisayarYazdir(Bilgisayar yazdırılacakPC) {
		System.out.println("Çekirdek sayısı: "+ yazdırılacakPC.getCekirdekSayisi()+ " Ram miktarı: "+ yazdırılacakPC.getRamBoyutu()+ " "+ "üretici firmalar: "+ yazdırılacakPC.getUreticifirmalari()[0]);
	}

}

class Bilgisayar {
	
	private int cekirdekSayisi;
	private int ramBoyutu;
	private String[] ureticifirmalari;
	
	public Bilgisayar(int cSayisi,int ramBoyutu, String[] ureticiFirmaAdlari) {
		
		this.cekirdekSayisi=cSayisi;
		this.ramBoyutu=ramBoyutu;
		this.ureticifirmalari= ureticiFirmaAdlari;
		
	}
	
	public int getCekirdekSayisi() {
		return cekirdekSayisi;
	}
	
	public int getRamBoyutu() {
		return ramBoyutu;
	}
	

	public String[] getUreticifirmalari() {
		return ureticifirmalari;
	}
	

	

}

