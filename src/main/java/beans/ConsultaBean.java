package beans;

import dados.Dados;
import entidades.Consulta;
import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class ConsultaBean implements Serializable {

    private Consulta consulta;

    private Dados dados = new Dados();

    public ConsultaBean() {
        consulta = new Consulta();
    }

    public void salvar() {
        if (dados.adicionarConsulta(consulta)) {
            adicionarMessagem(FacesMessage.SEVERITY_INFO, "Consulta salva com sucesso!");
        } else {
            adicionarMessagem(FacesMessage.SEVERITY_INFO, "Consulta já existe!");
        }

    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Dados getDados() {
        return dados;
    }

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public ArrayList listar() {
        return dados.getListaDeConsultas();
    }

    public void excluir(Consulta c) 
    {
        if (dados.excluiConsulta(c)) 
        {
            adicionarMessagem(FacesMessage.SEVERITY_INFO, "Consulta excluída com sucesso!");
        } 
        else 
        {
            adicionarMessagem(FacesMessage.SEVERITY_INFO, "Consulta não existe!");
        }
    }
    
    public void editar(Consulta consultaAtual)
    {
        
    }

    protected void adicionarMessagem(FacesMessage.Severity severity, String mensagem) {
        FacesMessage message = new FacesMessage(severity, mensagem, "");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
