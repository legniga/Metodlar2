package metodlar2;



public class main {
	public static void main(String []args) {
		int toplam=topla2(1,2,3,4,5,6);
				System.out.println(toplam);
		}
	public static void ekle() {
		System.out.println("Eklendi");
		
	}
    public static void sil() {
		System.out.println("Silindi");

		
	}
    public static void guncelle() {
		System.out.println("Güncellendi");

	
}
    public static int topla2(int... sayilar) {
    	int toplam=0;
    	for(int sayi:sayilar) {
    		toplam+=sayi;
    	}
    	return toplam;
	

	
}



}
