package emailer.corretorortografico;

@SuppressWarnings("serial")
public class ErroOrtografico extends RuntimeException {
    
    public ErroOrtografico(String msg){
        super(msg);
    }
    
}
