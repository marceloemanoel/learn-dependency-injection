package emailer.corretorortografico;

public interface CorretorOrtografico {

    public void verificarOrtografia(String texto) throws ErroOrtografico;

}