
package beans;

import dados.Dados;
import entidades.AgenteSaude;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{
    
    private Dados dados = new Dados();
    AgenteSaude agente;

    
    public LoginBean()
    {
        agente = new AgenteSaude();
    }
    
    public void setAgente(AgenteSaude agente) {
        this.agente = agente;
    }

    public AgenteSaude getAgente() {
        return agente;
    }

    
    public String validaLogin()
    {
        if(dados.validaLogin(agente.getEmail(), agente.getSenha()))
        {
            return "sucesso";
        }
        else 
        {
            adicionarMessagem(FacesMessage.SEVERITY_INFO, "Dados não correspondem!");
            return "falha";
        }
    }
    
    
    public Dados getDados() {
        return dados;
    }

    public void setDados(Dados dados) {
        this.dados = dados;
    }
     protected void adicionarMessagem(FacesMessage.Severity severity, String mensagem) {
        FacesMessage message = new FacesMessage(severity, mensagem, "");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
