package app;


public class Noticia {

    private final String titulo;

    public String getMateria()
    {
        return materia;
    }

    private String materia;
    
    public void setMateria(String materia)
    {
        this.materia = materia;
    }


    public Noticia(String titulo)
    {
        this.titulo = titulo;
    }

    Noticia(String titulo, String materia)
    {
        this.titulo = titulo;
        this.materia = materia;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
}
