import java.util.Scanner;

public class vetores {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        
        //Definindo as variaveis 
        
        int inteirosA = 5;
        int inteirosB = 10;
        int inteirosC = 15;
        
        //Declarando as variaveis 
        int [] vetA = new int [inteirosA];
        int [] vetB = new int [inteirosB];
        int [] vetC = new int [inteirosC];
        
        //Vetor A 
        
        System.out.println ("Digite 05 números:");
        for (int i=0; i<inteirosA; i++) {
            System.out.println ("Número" + (i+1) + ":");
            vetA [i] = sc.nextInt();
        }
        
        //Vetor B 
        
        System.out.println ("Agora digite 10 números:");
        for (int i=0; i<inteirosB; i++){
            System.out.println ("Número" + (i+1) + ":");
            vetB[i] = sc.nextInt();
        }
        
        //Vetor C 
        
        for (int i = 0; i < inteirosA; i++) {
            vetC[i] = vetA[i];
        }

        for (int i = 0; i < inteirosB; i++) {
            vetC[inteirosA + i] = vetB[i];
        }
        System.out.println ("Você agora visualizará todos os 15 números digitados:");
        for (int i=0; i<inteirosC; i++){
           
            System.out.println("Números" + (i+1) + ":" + vetC[i]);
        }
        
        sc.close ();
    }
}