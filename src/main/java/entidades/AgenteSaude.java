package entidades;


public class AgenteSaude extends Pessoa{
    
    private String clinica; 
    
    private String senha; 

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
