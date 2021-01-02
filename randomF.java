import java.util.Random;

public class randomF {
	
	public static void main(String[] args)
	{

		Random rand = new Random(); //random sınıfından nesne oluşturulmuştur.
        int [] arrayR= new int[9];// 9 tane int sayı alabilen dizi üretilmiştir.
        int num = 0, count=0, sameNum = 0;

        for (int i = 0; i < arrayR.length; i++){
        	sameNum = 0; //her döngü başında sayıların farklılığını sorgulamak için sıfırlanmıştır.
            num = rand.nextInt(9) + 1; //1 ile 9(dahil) arası random sayı üretilmiştir.
            for (int j = 0; j < i; j++){//eklenen sayıya kadar olan sayılar taranır, aynı sayı bulunursa sameNum azaltılır ve bir sonraki if'e giriş sağlanır.
                if (num == arrayR[j]){
                    sameNum--;                    
                }
            }
            if (sameNum <= -1){//dizide aynı sayıya rastlandığında tekrar "aynı indekse" random sayı atamak için for döngüsüne dönülür, random sayı üretme sayısı burada "count" ile sayılmıştır.
               i--;
               count++;
            }
            else{//dizide aynı sayıya "rastlanmadığında" arrayR dizisine döngüde random üretilen sayı atanmış olur.
                arrayR[i] = num;
            }
        }
        
        for (int k = 0; k < arrayR.length; k++){// Oluşturulan birbirinden farklı 9 rakamlı dizi yazdırılmıştır.
            System.out.print(arrayR[k] + ", ");
        }
		System.out.print("Random fonksiyonu "+ count +" kere çalışmıştır.");// kaç kere random fonk. kullanıldığı yazılmıştır.
		
    }
}
