
public class Ogrenci {

	
		
		int ogrenciNo;
		String isim;
		byte sinif;
		boolean aktif;
		
		
		
		public void setOgrenciNo(int yeniOgrenciNo) {
			
			this.ogrenciNo= yeniOgrenciNo;
			
		}
		
		public int getOgrenciNo() {
			
			return this.ogrenciNo;
		
		}
		public String getIsim() {
			
			return this.isim;
		
		}
		public void setIsim(String isim) {
			
			this.isim=isim;
		}
		
		public Ogrenci() {
			System.out.println("Öğrenci nesnesi oluşturuluyor");
			aktif=true;
			ogrenciNo=999;
			isim="Henüz isim verilmemiş";
			sinif=127;
		}
		
		public Ogrenci(int ogrenciNo, String isim ,byte sinif, boolean aktif) {
			
			this.ogrenciNo = ogrenciNo;
			this.isim=isim;
			this.sinif=sinif;
			this.aktif=aktif;
		}
		
		public Ogrenci(String isim) {
			
			
			this.isim=isim;
			
		}
		
		public void dersAl() {
			System.out.println("Öğrenci ders alıyor");
		}

		public void ogrenciBilgileriniYazdir() {
			if(aktif) {
				System.out.println("Adım :"+ isim + " numaram:"+ogrenciNo+ " sınıfım:"+sinif);
			}else {
				System.out.println("Bu öğrenci aktif değil");
			}
			
			
		}
	}


