package app;

public class VerificadorUltimaNoticiaRunnable implements Runnable 
{
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
        while(! Thread.interrupted() )
        {
            estadao.exibirUltima();
            folha.mostrarUltima();
            
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                break;
            }
        }
    }
}
