package dados;

import entidades.AgenteSaude;
import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;
import java.util.ArrayList;
import java.util.Date;

public final class Dados {

    
    static ArrayList<Medico> listaDeMedicos = new ArrayList<>();
    static ArrayList<Paciente> listaDePacientes = new ArrayList<>();
    static ArrayList<Consulta> listaDeConsultas = new ArrayList<>();
    static ArrayList<AgenteSaude> listaDeAgenteSaude = new ArrayList<>();

    boolean jaExiste;
    static int id_medico, id_paciente, id_consulta, id_agenteSaude;

    public Dados() 
    {
      
    }

    public boolean validaLogin(String email, String senha)
    {
       for(AgenteSaude agenteAtual : listaDeAgenteSaude)
       {
           if(agenteAtual.getEmail().equals(email) && agenteAtual.getSenha().equals(senha))
           {
               return true;
           }
       }
               
               return false;
    }
    
    

    public boolean adicionarMedico(Medico m) 
    {
        
        jaExiste = verificaSeExisteMedico(m.getCrm());
        m.setId(id_medico);
        
        if (jaExiste) 
        {
            listaDeMedicos.add(m);
            ++ id_medico;
            return true;
        } 
        else 
        {
            return false;
        }

    }

    public boolean adicionarPaciente(Paciente p) 
    {
        jaExiste = verificaSeExistePaciente(p);
        p.setId(id_paciente);
        if (jaExiste) 
        {
            listaDePacientes.add(p);
            ++ id_paciente;
            return true;
        } else {
            return false;
        }

    }

    public boolean adicionarConsulta(Consulta c) 
    {

        jaExiste = verificaSeExisteConsulta(c.getDataHora());
        c.setId(id_consulta);
        if(jaExiste)
        {
            listaDeConsultas.add(c);
            ++ id_consulta;
            return true;
        }
        else 
        {
            return false;
        }
    }

    public boolean adicionarAgenteSaude(AgenteSaude a)
    {
        jaExiste = verificaSeExisteAgenteSaude(a);
        
        if(jaExiste)
        {
            listaDeAgenteSaude.add(a);
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public boolean verificaSeExisteAgenteSaude(AgenteSaude a)
    {
        for (int i = 0; i < listaDeAgenteSaude.size(); i++) {
            if (listaDeAgenteSaude.get(i).getEmail().equals(a.getEmail())) {
                return false;
            }
        }

        return true;
    }
    
    public boolean verificaSeExisteConsulta(Date dataHora) 
    {
        
        for (int i = 0; i < listaDeConsultas.size(); i++) {
            if (listaDeConsultas.get(i).getDataHora().equals(dataHora)) {
                return false;
            }
        }

        return true;

    }

    public boolean verificaSeExisteMedico(String crm) 
    {

        for (int i = 0; i < listaDeMedicos.size(); i++) {
            if (listaDeMedicos.get(i).getCrm().equals(crm)) {
                return false;
            }
        }

        return true;
    }

    public boolean verificaSeExistePaciente(Paciente p)
    {
        for (int i = 0; i < listaDePacientes.size(); i++) {
            if (listaDePacientes.get(i).getEmail().equals(p.getEmail()) )
            {
                return false;
            }
        }

        return true;
    }
     
    public boolean editarMedico(Medico medicoAntigo, Medico medicoAtual) 
    {
        if (listaDeMedicos.contains(medicoAntigo)) 
        {
            listaDeMedicos.set(listaDeMedicos.indexOf(medicoAntigo), medicoAtual);
            return true;
        } 
        else 
        {
            return false;
        }
    }
    
    public boolean editarAgenteDeSaude(AgenteSaude agenteAntigo, AgenteSaude agenteAtual) 
    {
        if (listaDeAgenteSaude.contains(agenteAntigo)) 
        {
            listaDeAgenteSaude.set(listaDeAgenteSaude.indexOf(agenteAntigo), agenteAtual);
            return true;
        } 
        else 
        {
            return false;
        }
    }

    public boolean excluiMedico(Medico m) 
    {

        if (listaDeMedicos.contains(m)) 
        {
            listaDeMedicos.remove(m);
            -- id_medico;
            return true;
        } 
        else 
        {
            return false;
        }

    }
    
    public boolean excluiConsulta(Consulta c)
    {
        if(listaDeConsultas.contains(c))
        {
            listaDeConsultas.remove(c);
            -- id_consulta;
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public boolean excluiAgenteSaude(AgenteSaude a)
    {
        if(listaDeAgenteSaude.contains(a))
        {
            listaDeAgenteSaude.remove(a);
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public boolean excluiPaciente(Paciente p)
    {
        if(listaDePacientes.contains(p))
        {
            listaDePacientes.remove(p);
            --id_paciente;
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    
    public static ArrayList<Medico> getListaDeMedicos() {
        return listaDeMedicos;
    }

    public static void setListaDeMedicos(ArrayList<Medico> listaDeMedicos) {
        Dados.listaDeMedicos = listaDeMedicos;
    }

    public static ArrayList<Paciente> getListaDePacientes() {
        return listaDePacientes;
    }

    public static void setListaDePacientes(ArrayList<Paciente> listaDePacientes) {
        Dados.listaDePacientes = listaDePacientes;
    }

    public static ArrayList<Consulta> getListaDeConsultas() {
        return listaDeConsultas;
    }

    public static void setListaDeConsultas(ArrayList<Consulta> listaDeConsultas) {
        Dados.listaDeConsultas = listaDeConsultas;
    }

    public boolean isJaExiste() {
        return jaExiste;
    }

    public void setJaExiste(boolean jaExiste) {
        this.jaExiste = jaExiste;
    }

    public static ArrayList<AgenteSaude> getListaDeAgenteSaude() {
        return listaDeAgenteSaude;
    }

    public static void setListaDeAgenteSaude(ArrayList<AgenteSaude> listaDeAgenteSaude) {
        Dados.listaDeAgenteSaude = listaDeAgenteSaude;
    }

    public static int getId_medico() {
        return id_medico;
    }

    public static void setId_medico(int id_medico) {
        Dados.id_medico = id_medico;
    }

    public static int getId_paciente() {
        return id_paciente;
    }

    public static void setId_paciente(int id_paciente) {
        Dados.id_paciente = id_paciente;
    }

    public static int getId_consulta() {
        return id_consulta;
    }

    public static void setId_consulta(int id_consulta) {
        Dados.id_consulta = id_consulta;
    }

    public static int getId_agenteSaude() {
        return id_agenteSaude;
    }

    public static void setId_agenteSaude(int id_agenteSaude) {
        Dados.id_agenteSaude = id_agenteSaude;
    }
}
