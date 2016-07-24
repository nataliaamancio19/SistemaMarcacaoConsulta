package entidades;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class AgenteSaude extends Pessoa{
    
    @NotNull
    @Size(min = 3, max = 40)
    @Pattern(regexp = "[A-Za-z ]+")
    private String clinica; 
    
    @NotNull
    @Size(min = 6)
    private String senha; 

    public AgenteSaude(String senha, String clinica, String nome, String email, String telefone, String cpf, String sexo, Integer id)
    {
        super(nome, email, telefone, cpf, sexo, id);
        this.senha = senha;
        this.clinica = clinica;
    }
    
    public AgenteSaude()
    {
       
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getClinica() {
        return clinica;
    }

    public void setClinica(String clinica) {
        this.clinica = clinica;
    }
    
  
}
