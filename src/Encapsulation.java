
public class Encapsulation {

	public static void main(String[] args) {

		/*Ogrenci ogr1=new Ogrenci(50,"alper",(byte)5,true);
		ogr1.ogrenciBilgileriniYazdir();
		ogr1.setOgrenciNo(10);
		System.out.println("ogrenci no: "+ ogr1.getOgrenciNo());
		ogr1.setIsim("Yeni İsim");
		ogr1.ogrenciBilgileriniYazdir();*/
		
		televizyon tv=new televizyon();
		tv.ac();
		/*tv.sesSeviyesi=25;
		tv.kanal=5; */
		tv.kapat();
		tv.setKanal(20);
		tv.setSesSeviyesi(15);
		
		tv.goster();
		
		
		

	}

}
