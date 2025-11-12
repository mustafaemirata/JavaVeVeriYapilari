package tekyonlubagliliste;

public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TekYonluListe tekListe=new TekYonluListe();
		tekListe.basaEkle(10);
		tekListe.basaEkle(4);
		tekListe.basaEkle(3);
		tekListe.basaEkle(18);
		tekListe.sonaEkle(49);
		
		System.out.println("---------");
		
		System.out.println(tekListe.head.data);
		System.out.println(tekListe.tail.data);
		
		System.out.println("---------");
		tekListe.sonaEkle(-15);
		
		tekListe.arayaEkle(3, 25);
		
		

		tekListe.yazdir();
		System.out.println("---------");
		tekListe.arayaEkle(3, 34);
		
		tekListe.yazdir();
		tekListe.bastanSil();
		tekListe.yazdir();
		tekListe.bastanSil();
		tekListe.bastanSil();
		tekListe.bastanSil();
		tekListe.bastanSil();
		tekListe.bastanSil();
		tekListe.bastanSil();
		tekListe.bastanSil();
		tekListe.bastanSil();
		
		tekListe.basaEkle(10);
		tekListe.basaEkle(4);
		tekListe.basaEkle(3);
		tekListe.basaEkle(18);
		tekListe.yazdir();
		tekListe.sondanSil();

		tekListe.yazdir();
		tekListe.aradanSil(1);
		tekListe.yazdir();





		

		
		

		



	}

}
