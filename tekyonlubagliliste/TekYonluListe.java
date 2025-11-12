package tekyonlubagliliste;



public class TekYonluListe {
	Node head=null;
	Node tail=null;
	
	void basaEkle(int x)
	{
		Node eleman =new Node();
		eleman.data=x;
		
		if(head==null)
		{
			// tek eleman olacak, diğer eleman null ayarla.
			eleman.next=null;
			head=eleman;
			tail=eleman;
			System.out.println("Liste yapısı oluşturuldu.");

			
			
		}
		else
		{
			// önceki head, elemandan sonra gelir ve head yeni eklenen x değeri olur.
			eleman.next=head;
			head=eleman;
			System.out.println("Eleman listenin başına eklendi.");
		}
		
		
		
	}
	
	void sonaEkle(int x)
	{
		Node eleman =new Node();
		eleman.data=x;
		
		if(head==null)
		{
			// tek eleman olacak, diğer eleman null ayarla.
			eleman.next=null;
			head=eleman;
			tail=eleman;
			System.out.print("Liste yapısı oluşturuldu.");

			
		}
		else
		{
			eleman.next=null;
			tail.next=eleman;
			tail=eleman;
			
		}
		
		
		
	}
	void arayaEkle(int indis,int x) 
	{
		//eklenecek düğüm
		Node eleman=new Node();
		eleman.data=x; 
		eleman.next=null;
		
		if(head==null && indis==0) 
		{
			head=eleman;
			tail=eleman; 
			System.out.println("Liste oluşturuldu, baş ve son elemanı girilen değer olarak atandı."+head.data+" eklendi.");
			
		}
		// başa ekleme durumu var
		else if (head!=null && indis==0)  
		{
			eleman.next=head;
			head=eleman;
			System.out.println("Eleman başa eklendi");
		}
		
		else
			
		{
			int n=0;
			Node temp=head;
			Node temp2=head;
			
			// sona kadar iterasyon yap
			while(temp.next!=null) 
			{
				
				// temp2, tailden öncekini; temp de tail elemanını tutuyor.
				temp2=temp;
				temp=temp.next;
				//eleman sayısını bulmak için
				n++;
			}
			// yani ekleyeceğimiz eleman aslında taildir. -> Sona eklencek
			if(n==indis) 
			{
				temp2.next=eleman;
				eleman.next=tail;
				System.out.println("eleman eklendi.");
			}
			else 
			{
				temp=head;
				temp2=head;
				
				int i=0;
				while(i<indis) 
				{
					temp2=temp;
					temp=temp.next;
					i++;
					
				}
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println(indis+". sıraya eleman eklendi");
			}
			
		}
	}
	
	void bastanSil() 
	
	// head silinecek
	{
		if(head==null) 
		{
			System.out.println("Liste yapısı boş.");

		}
		// tek elemanlıysa
		else if(head.next==null) 
		{
			head=null;
			tail=null;
			System.out.println("Listenin son elemanı silindi.");

			
		}
		else
		{
			head=head.next;
			System.out.println("Baştaki eleman silindi");

			
		}
		
	}
	void sondanSil() 
	
	// head silinecek
	{
		if(head==null) 
		{
			System.out.println("Liste yapısı boş.");

		}
		// tek elemanlıysa
		else if(head.next==null) 
		{
			head=null;
			tail=null;
			System.out.println("Listenin son elemanı silindi.");

			
		}
		else
		{
			// tailden önceki düğümü bulup son düğüm yapmamız gerekiyor.
			
			Node temp=head;
			Node temp2=head;
			
			while(temp.next!=null) 
			{
				temp2=temp;
				temp=temp.next; 
			}
			//temp2 son eleman olacak
			temp2.next=null;
			tail=temp2;
			System.out.println("Sondan eleman silindi.");

			
		}
		
	}
	
	void aradanSil(int indis) 
	{
		if(head==null) 
		{
			System.out.println("Liste boş.");
		}
		//tek düğüm varsa  ve: 
		else if(head.next==null && indis==0 ) 
		{
			head=null;
			tail=null;
			System.out.println("Listenin kalan son elemanı silindi.");

		}
		//birden fazla eleman varsa ama ilk eleman silinecekse -> Yani baştaki silinecekse
		else if(head.next!=null && indis==0)
		{
			head=head.next;
			System.out.println("Listenin başındaki eleman silindi.");

		}
		else
		{
			int i=0;
			Node temp=head;
			Node temp2=head;
			
			while(temp!=null)
			{
				i++;
				temp2=temp;
				temp=temp.next;
			}
			
			// son düğüm tail silinecekse öncekini ilk tut.
			if(i==indis) 
			{
				temp2.next=null;
				tail=temp2;
				System.out.println("Listenin sonundaki eleman silindi");

				
			}
			// aradaki düğüm silinecekse
			else
			{
				temp=head;
				temp2=head;
				int j=0;
				
				// temp2 j ye bağlanacak
				while(j!=indis)
				{
					temp2=temp;
					temp=temp.next;
					j++;
				}
				//temp ortada kaldı ve sistemden silindi
				temp2.next=temp.next;
				System.out.println("Aradaki eleman silindi.");
			}
		}
	}
	
	
	
	
	
	
	
	void yazdir() 
	{

		if(head==null)
		{
			
			System.out.print("Liste yapısı boş.");

			
		}
		else
		{
			Node temp=head;
			
			while(temp!=null) 
			{
				System.out.print(temp.data+"-> " );
				temp=temp.next;
			}
			
			System.out.println("Liste Sonu.");

		}
	}
	
}
