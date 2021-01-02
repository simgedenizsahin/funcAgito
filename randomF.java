package randomFunction;

import java.util.Random;

public class randomF {
	
	public static void main(String[] args)
	{

		Random rand = new Random(); //random sýnýfýndan nesne oluþturulmuþtur.
        int [] arrayR= new int[9];// 9 tane int sayý alabilen dizi üretilmiþtir.
        int num = 0, count=0, sameNum = 0;

        for (int i = 0; i < arrayR.length; i++){
        	sameNum = 0; //her döngü baþýnda sayýlarýn farklýlýðýný sorgulamak için sýfýrlanmýþtýr.
            num = rand.nextInt(9) + 1; //1 ile 9(dahil) arasý random sayý üretilmiþtir.
            for (int j = 0; j < i; j++){//eklenen sayýya kadar olan sayýlar taranýr, ayný sayý bulunursa sameNum azaltýlýr ve bir sonraki if'e giriþ saðlanýr.
                if (num == arrayR[j]){
                    sameNum--;                    
                }
            }
            if (sameNum <= -1){//dizide ayný sayýya rastlandýðýnda tekrar "ayný indekse" random sayý atamak için for döngüsüne dönülür, random sayý üretme sayýsý burada "count" ile sayýlmýþtýr.
               i--;
               count++;
            }
            else{//dizide ayný sayýya "rastlanmadýðýnda" arrayR dizisine döngüde random üretilen sayý atanmýþ olur.
                arrayR[i] = num;
            }
        }
        
        for (int k = 0; k < arrayR.length; k++){// Oluþturulan birbirinden farklý 9 rakamlý dizi yazdýrýlmýþtýr.
            System.out.print(arrayR[k] + ", ");
        }
		System.out.print("Random fonksiyonu "+ count +" kere çalýþmýþtýr.");// kaç kere random fonk. kullanýldýðý yazýlmýþtýr.
		
    }
}