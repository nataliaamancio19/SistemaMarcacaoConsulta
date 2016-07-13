package beans;

import dados.Dados;
import entidades.Medico;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class MedicoBean implements Serializable {

   
    private Dados dados = new Dados();

    private Medico medico;
    
    private List<Medico> medicos;
    
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
        dados.adicionarMedico(medico);
        adicionarMessagem(FacesMessage.SEVERITY_INFO, "Médico salvo com sucesso!");
    }
  
     protected void adicionarMessagem(FacesMessage.Severity severity, String mensagem)
    {
        FacesMessage message = new FacesMessage(severity, mensagem, "");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
