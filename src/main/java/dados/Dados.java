package dados;

import entidades.Medico;
import entidades.Paciente;
import entidades.Pessoa;

public class Dados {
    
     String[][] medico = new String[20][3];
     String[][] pessoa = new String[20][5];
     String[][] paciente = new String[20][7];
     String[][] consulta = new String[20][10];
     
     int id_medico, id_pessoa, id_paciente, id_consulta;
    
     
     public static void main(String[] args)
     {
         Dados d = new Dados();
         
         Medico m = new Medico();
         m.setCrm("1234567");
         m.setEmail("natalia@gmail.com");
         m.setEspecialidade("endocrino");
         m.setSexo("feminino");
         m.setTelefone("997766961");
         d.adicionarMedico(m);
         System.out.println("dados.Dados.main()");
     }
     
     
    public void adicionarMedico(Medico m)
    {
           
        medico[id_medico][0] = m.getCrm();
        medico[id_medico][1] = m.getEspecialidade();
        medico[id_medico][2] = Integer.toString(id_medico);
        
        adicionarPessoa(m, id_medico);
        ++id_medico;
    }
    
    public void adicionarPaciente(Paciente p)
    {
        paciente[id_paciente][0] = p.getBairro();
        paciente[id_paciente][1] = p.getCep();
        paciente[id_paciente][2] = p.getCidade();
        paciente[id_paciente][3] = p.getNumero_sus();
        paciente[id_paciente][4] = p.getRua();
        paciente[id_paciente][5] = String.valueOf(p.getData()); 
        paciente[id_paciente][6] = p.getEstado().toString();
        
        adicionarPessoa(p, id_paciente);
        ++id_paciente;
    }
    
    public void adicionarPessoa(Pessoa p, int id)
    {
        
        pessoa[id_pessoa][0] = p.getNome();
        pessoa[id_pessoa][1] = p.getEmail();
        pessoa[id_pessoa][2] = p.getTelefone();
        pessoa[id_pessoa][3] = p.getSexo();
        pessoa[id_pessoa][4] = Integer.toString(id);
        
    }
    
   
}
