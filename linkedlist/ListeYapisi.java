package linked;

public class ListeYapisi {
	Node head=null; //ilk düğüm
	Node tail=null; // son düğüm
			
	
	void ekle(int x) 
	{
		//eklenecek düğüm
		Node eleman=new Node();
		eleman.data=x; 
		eleman.next=null;
		
		if(head==null) 
		{
			head=eleman;
			tail=eleman; 
			System.out.println("Liste oluşturuldu, baş ve son elemanı girilen değer olarak atandı."+head.data+" eklendi.");
			
		}
		else
			//head doluysa sona ekleyelim
		{
			// tailin devamına eleman objesini sona ekledik.
			tail.next=eleman;
			
			//güncelledik
			tail=eleman;
			System.out.println("Listenin sonuna girilen eleman eklendi.");
		}
	}
	
	void yazdir()
	{
		int sayac=1;
		if(head==null) 
		{
			System.out.println("Liste zaten boş.");
		}
		else
		{
			Node temp=head;
			System.out.println("Liste başlangıcı:");
			
			while(temp!=null)
			{	
				System.out.println(sayac+". eleman= "+temp.data);
				temp=temp.next;
				sayac++;
			}
			System.out.println("Liste sonu");

			
		}
	}

}
