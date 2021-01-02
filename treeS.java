import java.util.*;
import java.util.Scanner;
import java.util.TreeSet;

public class  treeS{
	
	public static void main(String[] args) {
		TreeSet treeSet=new TreeSet(); //treeSet öğesi oluşturuldu.
		Scanner giris = new Scanner(System.in);//kullanıcıdan input için Scanner türetildi.
	        String metin;
	        System.out.println("input :");
	        metin=giris.nextLine();	  //input alındı.
	        
	        char[] karakterler = metin.toCharArray();//alınan input karakter dizisine aktarıldı.
	            
	        for (int i = 0; i < (karakterler.length-1) ; i++) {//her karakter treeSet koleksiyonuna eklendi.
	    			treeSet.add(karakterler[i]);
	            } 		
	        
	        Iterator itr = treeSet.iterator(); //treeSet öğesini iterator nesnesine bağladık.
	        
         	System.out.println("output :");

	        while(itr.hasNext()) {//bir sonraki iterator boşa çıkana kadar döngü devam eder.
		        for (int j = 0; j < (karakterler.length-1) ; j++) { //dizi içinde dolaşmak için döngü kurulmuştur.

		        	 if(karakterler[j]==karakterler[0]) {//ilk değer ise işaretsiz dışarı çıkar.
		             	System.out.println(itr.next());
		             } 
		        	 
		             else if (karakterler[j] == karakterler[j-1]) {//bir önceki değerle karşılaştırılır, aynı ise indis arttırılır.(indiste kaymanın önlenmesi için.)
		          		j++;
		             }
		             
		             else if(karakterler[j] != karakterler[j+1]) {//bir sonraki değerden farklı ise tek "-" konulur.
		             	System.out.println("-"+ itr.next());
		             }
		             
		             else if(karakterler[j] == karakterler[j+1]) { //bir sonraki değer ile aynı ise çift "--" konulur. 
			             	System.out.println("--"+ itr.next());
		             }		        	
		       }
		        
	        }

		
	}
}
