import java.util.*;
import java.util.Scanner;
import java.util.TreeSet;

public class  randomS{
	
	public static void main(String[] args) {
		TreeSet treeSet=new TreeSet(); //treeSet ��esi olu�turuldu.
		Scanner giris = new Scanner(System.in);//kullan�c�dan input i�in Scanner t�retildi.
	        String metin;
	        System.out.println("input :");
	        metin=giris.nextLine();	  //input al�nd�.
	        
	        char[] karakterler = metin.toCharArray();//al�nan input karakter dizisine aktar�ld�.
	            
	        for (int i = 0; i < (karakterler.length-1) ; i++) {//her karakter treeSet koleksiyonuna eklendi.
	    			treeSet.add(karakterler[i]);
	            } 		
	        
	        Iterator itr = treeSet.iterator(); //treeSet ��esini iterator nesnesine ba�lad�k.
	        
         	System.out.println("output :");

	        while(itr.hasNext()) {//bir sonraki iterator bo�a ��kana kadar d�ng� devam eder.
		        for (int j = 0; j < (karakterler.length-1) ; j++) { //dizi i�inde dola�mak i�in d�ng� kurulmu�tur.

		        	 if(karakterler[j]==karakterler[0]) {//ilk de�er ise i�aretsiz d��ar� ��kar.
		             	System.out.println(itr.next());
		             } 
		        	 
		             else if (karakterler[j] == karakterler[j-1]) {//bir �nceki de�erle kar��la�t�r�l�r, ayn� ise indis artt�r�l�r.(indiste kayman�n �nlenmesi i�in.)
		          		j++;
		             }
		             
		             else if(karakterler[j] != karakterler[j+1]) {//bir sonraki de�erden farkl� ise tek "-" konulur.
		             	System.out.println("-"+ itr.next());
		             }
		             
		             else if(karakterler[j] == karakterler[j+1]) { //bir sonraki de�er ile ayn� ise �ift "--" konulur. 
			             	System.out.println("--"+ itr.next());
		             }		        	
		       }
		        
	        }

		
	}
}