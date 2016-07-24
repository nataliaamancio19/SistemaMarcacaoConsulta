package beans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import entidades.Paciente;
import dados.Dados;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class PacienteBean implements Serializable {

    Paciente paciente;
    Dados dados = new Dados();

    public PacienteBean() {
        paciente = new Paciente();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void formataData() {
        SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
        String teste = formatData.format(paciente.getDataNascimento());
        paciente.setDataexibicao(teste);
    }

    public void salvar() {
        if (paciente != null) {

            formataData();
            if (dados.adicionarPaciente(paciente)) {
                adicionarMessagem(FacesMessage.SEVERITY_INFO, "Paciente cadastrado com sucesso!");

            } else {
                adicionarMessagem(FacesMessage.SEVERITY_INFO, "Paciente já cadastrado!");
            }

        }
    }

    public ArrayList listar() {
        return Dados.getListaDePacientes();
    }

    public void excluir(Paciente paciente) {
        if (paciente != null) {

            if (dados.excluiPaciente(paciente)) {
                adicionarMessagem(FacesMessage.SEVERITY_INFO, "Exclusão efetuada  com sucesso!");
            } else {
                adicionarMessagem(FacesMessage.SEVERITY_INFO, "Paciente nao existe! ");
            }

        }
    }

    public void editar(Paciente paciente) {
        if (paciente != null) {
            if (dados.excluiPaciente(paciente)) {
                adicionarMessagem(FacesMessage.SEVERITY_INFO, "Exclusao efetuada  com sucesso!");
            } else {
                adicionarMessagem(FacesMessage.SEVERITY_INFO, "Paciente nao existe! ");
            }
        }
    }

    /*public void editar(Medico pacienteAtual)
    {
      if(dados.editarMedico(pacienteAtual, this.paciente))
      {
         adicionarMessagem(FacesMessage.SEVERITY_INFO, "Paciente editado com sucesso!");
      }
      else
      {
          adicionarMessagem(FacesMessage.SEVERITY_INFO, "Paciente não existe!");
      }
    }*/
    public ArrayList<Paciente> consultar() {
        return Dados.getListaDePacientes();
    }

    protected void adicionarMessagem(FacesMessage.Severity severity, String mensagem) {
        FacesMessage message = new FacesMessage(severity, mensagem, "");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
