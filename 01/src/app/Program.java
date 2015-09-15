package app;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        ListaNoticias lista = new ListaNoticias();
        
        VerificadorUltimaNoticiaRunnable vunr;
        vunr = new VerificadorUltimaNoticiaRunnable(lista);
                
        Thread th  = new Thread(vunr);
        th.start();

        while( true )
        {
            System.out.println("Informe o título da notícia: ");
            String titulo = scanner.nextLine();
            
            if( "sair".equals(titulo))
                break;
            
            System.out.println("Informe o corpo da notícia: ");
            String materia = scanner.nextLine();
            
            lista.adicionar(titulo, materia);
        }
        
        th.interrupt();
    }
    
}
