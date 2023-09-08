//Programa que recebe um valor A, depois multiplica por 2 em um segundo modo e seu resultado é multiplicado por 3.



import java.util.Scanner; 

public class Main {
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        int vet = 10;
        int [] vetA = new int [vet];
        int [] vetB = new int [vet];
        int [] vetC = new int [vet];
        
        // Desenvolvendo vetor A 
        
        System.out.println ("Digite 10 números para o primeiro modo:");
        for (int i = 0; i < vet; i++){
            System.out.print ("Modo" +(i+1)+ ":");
            vetA[i]=sc.nextInt();
        }
        
        //Desenvolvendo vetor B
           System.out.println ("Resultado do 1º modo multiplicado por 2:");
            for (int i=0 ; i < vet; i++){
            vetB[i]= vetA[i] * 2;
             System.out.println ("Modo" + (i+1) + ":" + vetB[i]);
        }
        
        //Desenvolvenddo vetor C 
           System.out.println ("Resultado do 2º modo multiplicado por 3:");
           for (int i=0; i < vet; i++){
               vetC[i]= vetB[i] * 3 ;
               System.out.println ("Modo" + (i+1) + ":" + vetC[i]);
           }
        
        sc.close();
    }
    
    
}

