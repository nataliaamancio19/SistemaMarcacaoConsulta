package entidades;

import java.util.Date;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

public class Consulta {

    private int id;
    
    @NotNull
    private Paciente paciente;
    
    @NotNull
    private Medico medico;
    
    @NotNull
    @Future
    private Date dataHora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
            this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

}
