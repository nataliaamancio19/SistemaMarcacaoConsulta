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
   
    public Paciente(String numero_sus, String rua, String bairro, String cidade, String cep,String nome, String email, String telefone, String cpf, String sexo)
    {
        super(nome, email, telefone, cpf, sexo);
        this.numero_sus = numero_sus;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
       
    };
    
    public Paciente()
    {
        
    }
    
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
}