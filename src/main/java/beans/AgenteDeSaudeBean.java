package beans;

import dados.Dados;
import entidades.AgenteSaude;
import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class AgenteDeSaudeBean implements Serializable{
    
    private Dados dados = new Dados();
    private AgenteSaude agente;
 
    
    public AgenteDeSaudeBean()
    {
        agente = new AgenteSaude();
    }
    
    
    public void salvar()
    {
        if (dados.adicionarAgenteSaude(agente) ) 
        {
            adicionarMessagem(FacesMessage.SEVERITY_INFO, "Agente de saúde salvo com sucesso!");
            
        } 
        else 
        {
            adicionarMessagem(FacesMessage.SEVERITY_INFO, "Agente de saúde já existe!");
            
        }

    }
    
    public void editar(AgenteSaude agenteAntigo)
    {
        if(dados.editarAgenteDeSaude(agenteAntigo, agente))
        {
            adicionarMessagem(FacesMessage.SEVERITY_INFO, "Agente de saúde editado com sucesso!");
        }
        else 
        {
            adicionarMessagem(FacesMessage.SEVERITY_INFO, "Agente de saúde não existe!");
        }
    }
    
    
    public void Exclui(AgenteSaude agente)
    {
        if(dados.excluiAgenteSaude(agente))
        {
            adicionarMessagem(FacesMessage.SEVERITY_INFO, "Agente de saúde excluído com sucesso!");
        }
        else 
        {
            adicionarMessagem(FacesMessage.SEVERITY_INFO, "Agente de saúde não existe!");
        }
    
    }
    
    
    public ArrayList listar()
    {
        return Dados.getListaDeAgenteSaude();
    }
        
    public Dados getDados() {
        return dados;
    }

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public AgenteSaude getAgente() {
        return agente;
    }

    public void setAgente(AgenteSaude agente) {
        this.agente = agente;
    }
    
       protected void adicionarMessagem(FacesMessage.Severity severity, String mensagem) {
        FacesMessage message = new FacesMessage(severity, mensagem, "");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
