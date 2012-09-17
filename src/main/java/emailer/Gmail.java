package emailer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import emailer.agenda.Agenda;


public class Gmail {
    public static void main(String[] args) {
        ApplicationContext provedor = new ClassPathXmlApplicationContext("applicationContext.xml");

        Agenda agenda = provedor.getBean("hashMapAgenda", Agenda.class);
        agenda.registrar("mario henrique", "mariohenrique@gmail.com");
        agenda.registrar("marcelo emanoel", "marceloemanoel@gmail.com");

        Servico servico = provedor.getBean(Servico.class);
        servico.executa();
    }

}
