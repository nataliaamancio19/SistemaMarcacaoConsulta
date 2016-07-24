package entidades;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

public class Pessoa  {

    protected Integer id;

    @NotNull
    private String nome;

    @NotNull
    @Email(message = "Insira um email válido!")
    private String email;
    
    @NotNull
    private String telefone;
    
    @NotNull
    @CPF(message = "Insira um cpf válido!")
    private String cpf;
    
    @NotNull
    private String sexo;
   
    public Pessoa(String nome, String email, String telefone, String cpf, String sexo, Integer id)
    {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.sexo = sexo;
        this.id = id;
    }
    
    public Pessoa()
    {
    
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
}
