import java.util.Random;                // a véletlen szám generáló osztály importálása
public class Lotto{
    public static void main(String[] args) {
        
        int[] lottoszamok = new int[5]; //létrehozunk egy tömböt, öt elemmel
        /*
        lottoszamok[0] = 34;            //feltöltjük a tömböt, a 0 az az index, 
        lottoszamok[1] = 7;             //a tömb mutatója hogy melyik elemnél van
        lottoszamok[2] = 83;            //mindig 0-val kezdődik, az az első elem       
        lottoszamok[3] = 28;            // ha ciklussal töltöm fel, akkor ez már nem kell
        lottoszamok[4] = 69;
        
        Random veletlen = new Random();     //a veletlen változón meghívom a Random függvényt, ez a változót fogom használni a véletlenszámhoz
        for (int j = 0; j <= 4; j++){       //a j lesz a tömb indexe
            lottoszamok[j] = veletlen.nextInt(90) + 1;  //feltöltöm a tömböt véletlenszámokkal, azért +1 mert a 90 csak 0 és 89 között hoz létre számokat
        }
       // System.out.println(lottoszamok[3]); ha csak egy elemét akarjuk kiíratni akkor megdunk egy index-et
        System.out.print("Lottószámok: ");
        for (int i = 0; i <= 4; i++){       //végigmegyünk a tömb elemein egy ciklussal...
            System.out.print(lottoszamok[i] + " ");     //..és kiíratjuk elemenként. az i a tömb indexe /hányadik elem/
        }
        */

        
        Random szam = new Random();
        int temp;
        int szamlalo = 0;

        while(szamlalo < 5){
            temp = szam.nextInt(5) + 1;
            boolean egyforma = false;
         
            for (int k = szamlalo - 1; k >=0; k--){ 
                
                if(lottoszamok[k] == temp)  {
                    egyforma = true;
                }
            }
            if(!egyforma){
                lottoszamok[szamlalo] = temp;
                szamlalo++;
            }   

            System.out.println(szamlalo);
        };

        System.out.print("Lottószámok: ");
        for (int i = 0; i <= 4; i++){       //végigmegyünk a tömb elemein egy ciklussal...
            System.out.print(lottoszamok[i] + " ");     //..és kiíratjuk elemenként. az i a tömb indexe /hányadik elem/
        }
    }
}