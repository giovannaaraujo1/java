import java.util.Scanner;

public class estudo {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        //Declarando variaveis 
        
        int elementos = 10;
        int [] vetA = new int [elementos];
        int [] vetB = new int [elementos];
        int [] vetC = new int [elementos];
        
        // VETOR A
        
        System.out.println ("Digite um valor para A:");
        for (int i=0; i<elementos; i++){
            System.out.print ("Valor" + (i+1) + ":");
            vetA[i] = sc.nextInt();
        }
        
        // VETOR B 
        
        System.out.println ("Digite um valor para B:");
            for (int i=0; i< elementos; i++){
                System.out.print ("Valor" + (i+1) + ":");
                vetB[i] = sc.nextInt();
            }
            
        // VETOR C 
        
        System.out.println ("O valor da subtração dos valores de A-B, são:");
        for (int i=0; i<elementos; i++){
            vetC[i] = vetA[i]-vetB[i];
            System.out.println ("A" + vetA[i] + ("- B") + vetB[i] + (":") + vetC[i]);
            
        
        
        sc.close();
        
        }
    }
    
}


