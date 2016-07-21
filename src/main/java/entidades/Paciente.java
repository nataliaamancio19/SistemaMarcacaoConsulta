package entidades;

import enumeracao.EstadosDoBrasil;
import java.util.Date;

public class Paciente extends Pessoa  {

    private String numero_sus;
    
    private String rua; 

    private String bairro;

    private String cidade;

    private String cep;

    private Date dataNascimento;

    EstadosDoBrasil estado;
    
   public String getNumero_sus() {
        return numero_sus;
    }

    public void setNumero_sus(String numero_sus) {
        this.numero_sus = numero_sus;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public EstadosDoBrasil getEstado() {
        return estado;
    }

    public void setEstado(EstadosDoBrasil estado) {
        this.estado = estado;
    }
  

}