package entidades;

public class Pessoa  {

    protected int id;

    private String nome;

    private String email;
    
    private String telefone;
    
    private String cpf;
    
    private String sexo;
   
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
   
    @Override
    public boolean equals(Object o) {
        if (o != null) {
            if (o instanceof Pessoa) {
                Pessoa outra = (Pessoa) o;
                if (this.id == outra.id && this.nome.equals(outra.nome)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        return hash;
    }
}
