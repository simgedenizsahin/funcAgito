package randomFunction;

import java.util.Random;

public class randomF {
	
	public static void main(String[] args)
	{

		Random rand = new Random(); //random s�n�f�ndan nesne olu�turulmu�tur.
        int [] arrayR= new int[9];// 9 tane int say� alabilen dizi �retilmi�tir.
        int num = 0, count=0, sameNum = 0;

        for (int i = 0; i < arrayR.length; i++){
        	sameNum = 0; //her d�ng� ba��nda say�lar�n farkl�l���n� sorgulamak i�in s�f�rlanm��t�r.
            num = rand.nextInt(9) + 1; //1 ile 9(dahil) aras� random say� �retilmi�tir.
            for (int j = 0; j < i; j++){//eklenen say�ya kadar olan say�lar taran�r, ayn� say� bulunursa sameNum azalt�l�r ve bir sonraki if'e giri� sa�lan�r.
                if (num == arrayR[j]){
                    sameNum--;                    
                }
            }
            if (sameNum <= -1){//dizide ayn� say�ya rastland���nda tekrar "ayn� indekse" random say� atamak i�in for d�ng�s�ne d�n�l�r, random say� �retme say�s� burada "count" ile say�lm��t�r.
               i--;
               count++;
            }
            else{//dizide ayn� say�ya "rastlanmad���nda" arrayR dizisine d�ng�de random �retilen say� atanm�� olur.
                arrayR[i] = num;
            }
        }
        
        for (int k = 0; k < arrayR.length; k++){// Olu�turulan birbirinden farkl� 9 rakaml� dizi yazd�r�lm��t�r.
            System.out.print(arrayR[k] + ", ");
        }
		System.out.print("Random fonksiyonu "+ count +" kere �al��m��t�r.");// ka� kere random fonk. kullan�ld��� yaz�lm��t�r.
		
    }
}