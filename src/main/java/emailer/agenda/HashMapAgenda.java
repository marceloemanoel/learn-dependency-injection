package emailer.agenda;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component("hashMapAgenda")
public class HashMapAgenda implements Agenda {
    private HashMap<String, String> agenda;

    public HashMapAgenda(){
        this.agenda = new HashMap<String, String>();
    }
    
    /* (non-Javadoc)
     * @see emailer.Agend#registrar(java.lang.String, java.lang.String)
     */
    @Override
    public void registrar(String nome, String email){
        System.out.println("Entrou no registrar do HashMapAgenda");
        agenda.put(nome, email);
    }
    
    /* (non-Javadoc)
     * @see emailer.Agend#consultar(java.lang.String)
     */
    @Override
    public String consultar(String nome){
        System.out.println("Entrou no consultar do HashMapAgenda");
        return agenda.get(nome);
    }
}
