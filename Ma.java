package ma;

import java.util.Scanner;

public class ma {
	public static void main (String [] args) throws Exception{
        int N ,I;
        double Med=0;
        Scanner dados=new Scanner(System.in);
        System.out.print("Quantos elementos tem a media");
        N = dados.nextInt();
        double []A=new double[N];
        for(I=0; I<=N-1;I++) {
        	System.out.print("Qual é o " + (I+1) + " Elemento ?");
            A[I]=dados.nextDouble();
            }
            for(I=0;I<=N-1;I++)
                Med += A[I];
                Med = Med/N;
        System.out.print(String.format("A Média é %5.2f",Med));
	}
}
    

