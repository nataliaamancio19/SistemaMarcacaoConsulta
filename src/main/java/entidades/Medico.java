package entidades;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Medico extends Pessoa {
    
    @NotNull
    @Size(min = 5, max = 30)
    @Pattern(regexp = "[A-Za-z ]+")
    private String especialidade;

    @NotNull
    @Size(min = 4, max = 10)
    @Pattern(regexp = "[0-9]+")
    private String crm;
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

}
