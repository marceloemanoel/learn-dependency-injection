package emailer.corretorortografico;

import org.springframework.stereotype.Component;

@Component("corretorIngles")
public class CorretorOrtograficoIngles implements CorretorOrtografico{
    
    public void verificarOrtografia(String texto) {
        System.out.println("corretor ingles");
    } 
}
