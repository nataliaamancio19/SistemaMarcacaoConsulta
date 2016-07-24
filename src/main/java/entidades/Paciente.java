package entidades;
 
import enumeracao.EstadosDoBrasil;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import sun.text.resources.FormatData;
 
public class Paciente extends Pessoa  {
 
     
    @Size(min=15, max=15, message = "O número do SUS deve ter 15 dígitos.")
    private String numero_sus;
   
    private String cep;
 
    @Past(message = "A data deve ser anterior a data atual.")
    private Date dataNascimento;
    private String dataexibicao;
  
    public Paciente()
    {
        
    }
   
    public Paciente(String numero_sus, String cep, String nome, String email, String telefone, 
            String cpf, String sexo, Integer id, Date dataNascimento
    )
    {
        super(nome, email, telefone, cpf, sexo, id);
        SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
        this.numero_sus = numero_sus;
        this.cep = cep;
        this.dataNascimento  = dataNascimento;
        this.dataexibicao = formatData.format(dataNascimento);
       
      
        
    }
    
   public String getNumero_sus() {
        return numero_sus;
    }
 
    public void setNumero_sus(String numero_sus) {
        this.numero_sus = numero_sus;
    }
 
    public void setDataexibicao(String dataexibicao) {
        this.dataexibicao = dataexibicao;
    }
 
    public String getDataexibicao() {
        return dataexibicao;
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