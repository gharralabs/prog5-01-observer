package app;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            
            System.out.println("Informe o corpo da notícia: ");
            String materia = scanner.nextLine();
            
            lista.adicionar(titulo, materia);
        }
    }
    
}
