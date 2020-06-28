
public class OgrenciDurumu {

	public static void main(String[] args) {
		
		int sayi= 1;
		Ogrenci alper = new Ogrenci(); //constructor
		
		alper.isim="alper şensoy ";
		alper.sinif=9;
		alper.ogrenciNo=135;
		alper.aktif=true;
		
		alper.ogrenciBilgileriniYazdir();
		
		Ogrenci hasan=new Ogrenci();
		hasan.isim="hasan ziyagil";
		hasan.sinif=12;
		hasan.ogrenciNo=185;
		
		hasan.ogrenciBilgileriniYazdir();
		
		Ogrenci bos=new Ogrenci();
		bos.ogrenciBilgileriniYazdir();
		
		Ogrenci ayse=new Ogrenci(500,"ayşe yılmaz",(byte)5,true);
		ayse.ogrenciBilgileriniYazdir();
		
		Ogrenci ali= new Ogrenci("Ali");
		ali.ogrenciBilgileriniYazdir();
		ali.aktif=true;
		ali.ogrenciBilgileriniYazdir();
		
		alper=hasan;
		
		System.out.println("ALPERİN BİLGİLERİ YAZDIRILACAK");
		alper.ogrenciBilgileriniYazdir();
		System.out.println("HASANIN BİLGİLERİ YAZDIRILACAK");
		hasan.ogrenciBilgileriniYazdir();
	}

}
