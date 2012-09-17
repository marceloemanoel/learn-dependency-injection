package emailer.agenda;

public interface Agenda {

    public abstract void registrar(String nome, String email);

    public abstract String consultar(String nome);

}