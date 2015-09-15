package app;

import java.util.logging.Level;
import java.util.logging.Logger;


public class VerificadorUltimaNoticiaRunnable implements Runnable {
    private final ListaNoticias lista;
    private final FolhaSP folha;
    private final Estadao estadao;
    
    public VerificadorUltimaNoticiaRunnable(ListaNoticias lista )
    {
        this.lista = lista;
        folha = new FolhaSP(lista);
        estadao = new Estadao(lista);
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            estadao.exibirUltima();
            folha.mostrarUltima();
            
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
