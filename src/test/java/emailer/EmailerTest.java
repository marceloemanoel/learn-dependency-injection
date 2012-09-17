package emailer;

import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;
import static com.google.common.collect.Lists.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import emailer.agenda.HashMapAgenda;
import emailer.corretorortografico.CorretorOrtografico;
import emailer.corretorortografico.ErroOrtografico;

public class EmailerTest {
    private Emailer emailer;
    @Mock private CorretorOrtografico corretorOrtografico;
    @Mock private HashMapAgenda agenda;
    
    @Before public void
    setUp(){
        MockitoAnnotations.initMocks(this);
        emailer = new Emailer(agenda, corretorOrtografico);
    }
    
    @Test public void
    antesDeEnviarExecutaAChecagemOrtografica(){
        when(agenda.consultar(anyString())).thenReturn("mariohenrique@gmail.com");
        emailer.enviar(newArrayList("mario henrique"),"tudo minúsculo");
        verify(corretorOrtografico).verificarOrtografia("tudo minúsculo");
        verify(agenda).consultar("mario henrique");
    }
    
    @Test public void
    casoNaoEncontreONomeNaAgendaNaoEnviaOEmail(){
        try{
            emailer.enviar(newArrayList("mario henrique"),"texto");
            fail("Não deveria enviar o email!");
        }catch(Exception error){
            assertEquals("'mario henrique' não foi encontrado na agenda!", error.getMessage());
        }
    }
    
    @Test public void
    casoEncontreErrosOrtograficosNaoEnvieOEmail(){
        doThrow(new ErroOrtografico("Encontrado erro ortográfico!")).when(corretorOrtografico).verificarOrtografia(anyString());
        try{
            emailer.enviar(newArrayList(""),"texto");
            fail("Não deveria enviar o email!");
        }catch(Exception error){
            assertEquals("Encontrado erro ortográfico!", error.getMessage());
        }
    }
}