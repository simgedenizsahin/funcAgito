import java.util.*;
import java.util.Scanner;
import java.util.TreeSet;

public class  randomS{
	
	public static void main(String[] args) {
		TreeSet treeSet=new TreeSet(); //treeSet öðesi oluþturuldu.
		Scanner giris = new Scanner(System.in);//kullanýcýdan input için Scanner türetildi.
	        String metin;
	        System.out.println("input :");
	        metin=giris.nextLine();	  //input alýndý.
	        
	        char[] karakterler = metin.toCharArray();//alýnan input karakter dizisine aktarýldý.
	            
	        for (int i = 0; i < (karakterler.length-1) ; i++) {//her karakter treeSet koleksiyonuna eklendi.
	    			treeSet.add(karakterler[i]);
	            } 		
	        
	        Iterator itr = treeSet.iterator(); //treeSet öðesini iterator nesnesine baðladýk.
	        
         	System.out.println("output :");

	        while(itr.hasNext()) {//bir sonraki iterator boþa çýkana kadar döngü devam eder.
		        for (int j = 0; j < (karakterler.length-1) ; j++) { //dizi içinde dolaþmak için döngü kurulmuþtur.

		        	 if(karakterler[j]==karakterler[0]) {//ilk deðer ise iþaretsiz dýþarý çýkar.
		             	System.out.println(itr.next());
		             } 
		        	 
		             else if (karakterler[j] == karakterler[j-1]) {//bir önceki deðerle karþýlaþtýrýlýr, ayný ise indis arttýrýlýr.(indiste kaymanýn önlenmesi için.)
		          		j++;
		             }
		             
		             else if(karakterler[j] != karakterler[j+1]) {//bir sonraki deðerden farklý ise tek "-" konulur.
		             	System.out.println("-"+ itr.next());
		             }
		             
		             else if(karakterler[j] == karakterler[j+1]) { //bir sonraki deðer ile ayný ise çift "--" konulur. 
			             	System.out.println("--"+ itr.next());
		             }		        	
		       }
		        
	        }

		
	}
}