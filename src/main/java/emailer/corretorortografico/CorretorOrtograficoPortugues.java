package emailer.corretorortografico;

import org.springframework.stereotype.Component;

@Component("corretorPortugues")
public class CorretorOrtograficoPortugues implements CorretorOrtografico {
    
    /* (non-Javadoc)
     * @see emailer.corretorortografico.CorretorOrtografico#verificarOrtografia(java.lang.String)
     */
    @Override
    public void verificarOrtografia(String texto){
        System.out.println("corretor portugues.");
    }

}
