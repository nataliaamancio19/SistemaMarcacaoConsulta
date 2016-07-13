package beans;

import dados.Dados;
import entidades.Medico;
import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class MedicoBean implements Serializable {

   
    private Dados dados = new Dados();

    private Medico medico;
        
    public MedicoBean()
    {
        medico = new Medico();
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public void salvar()
    {
        if(dados.adicionarMedico(medico))
        {
            adicionarMessagem(FacesMessage.SEVERITY_INFO, "Médico salvo com sucesso!");
        }
        else 
        {
            adicionarMessagem(FacesMessage.SEVERITY_INFO, "Médico já existe!");
        }
        
        
    }
  
    public ArrayList<Medico> listar()
    {
      return Dados.getListaDeMedicos();
    }
    
    public void excluir(Medico medico)
    {
       if(dados.excluiMedico(medico))
       {
           adicionarMessagem(FacesMessage.SEVERITY_INFO, "Médico excluido com sucesso!");
       }
       else 
       {
           adicionarMessagem(FacesMessage.SEVERITY_INFO, "Médico não existe!");
       }
      
    }
    
    public void editar(Medico medico)
    {
      if(dados.editarMedico(medico))
      {
         adicionarMessagem(FacesMessage.SEVERITY_INFO, "Médico editado com sucesso!");
      }
      else 
      {
          adicionarMessagem(FacesMessage.SEVERITY_INFO, "Médico não existe!");
      }
    }
    
    
     protected void adicionarMessagem(FacesMessage.Severity severity, String mensagem)
    {
        FacesMessage message = new FacesMessage(severity, mensagem, "");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
