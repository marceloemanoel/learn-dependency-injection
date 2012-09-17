package emailer;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

@Component
public class Servico {

    private Emailer emailer;
    
    @Autowired
    public Servico(Emailer emailer) {
        this.emailer = emailer;
    }

    public void executa() {
        List<String> destinatarios = Lists.newArrayList("mario henrique", "marcelo emanoel");
        emailer.enviar(destinatarios, "mensagem para você");
    }
}
