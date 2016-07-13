package dados;

import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;
import entidades.Pessoa;
import java.util.ArrayList;

public class Dados {

    public static ArrayList<Medico> getListaDeMedicos() {
        return listaDeMedicos;
    }

    public static void setListaDeMedicos(ArrayList<Medico> listaDeMedicos) {
        Dados.listaDeMedicos = listaDeMedicos;
    }

    public static ArrayList<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }

    public static void setListaDePessoas(ArrayList<Pessoa> listaDePessoas) {
        Dados.listaDePessoas = listaDePessoas;
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

    static ArrayList<Medico> listaDeMedicos = new ArrayList<>();
    static ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
    static ArrayList<Paciente> listaDePacientes = new ArrayList<>();
    static ArrayList<Consulta> listaDeConsultas = new ArrayList<>();

    public Dados() {

    }

    public void inicializaDados() {
        Medico m = new Medico();
        m.setCrm("1234567");
        m.setEmail("natalia@gmail.com");
        m.setEspecialidade("endocrino");
        m.setSexo("feminino");
        m.setTelefone("997766961");
        adicionarMedico(m);
    }

   
    public static int getId_medico() {
        return id_medico;
    }

    public static void setId_medico(int id_medico) {
        Dados.id_medico = id_medico;
    }

    public static int getId_pessoa() {
        return id_pessoa;
    }

    public static void setId_pessoa(int id_pessoa) {
        Dados.id_pessoa = id_pessoa;
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

    public boolean isJaExiste() {
        return jaExiste;
    }

    public void setJaExiste(boolean jaExiste) {
        this.jaExiste = jaExiste;
    }

    static int id_medico, id_pessoa, id_paciente, id_consulta;
    boolean jaExiste;

    public static void main(String[] args) {
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

    public boolean adicionarMedico(Medico m) {
        jaExiste = verificaSeExisteMedico(m.getCrm());

        if (jaExiste) {
            listaDeMedicos.add(m);
            adicionarPessoa(m, id_medico);
            ++id_medico;
            return true;
        } else {
            return false;
        }

    }

    public boolean adicionarPaciente(Paciente p) {
        
        if (jaExiste) {
            listaDePacientes.add(p);
            adicionarPessoa(p, id_paciente);
             ++id_paciente;
            return true;
        } else {
            return false;
        }
       
    }

    public void adicionarPessoa(Pessoa p, int id) {
        p.setId(id);
        listaDePessoas.add(p);

    }

    public boolean verificaSeExisteMedico(String crm) {

        for (int i = 0; i < listaDeMedicos.size(); i++) {
            if (listaDeMedicos.get(i).getCrm().equals(crm)) {
                return false;
            }
        }

        return true;
    }

    public boolean editarMedico(Medico m)
    {
        if(listaDeMedicos.contains(m))
        {
            listaDeMedicos.set(listaDeMedicos.indexOf(m), m);
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public boolean excluiMedico(Medico m) {
        
        if(listaDeMedicos.contains(m))
        {
            listaDeMedicos.remove(m);
            return true;
        }
        else 
        {
            return false;
        }
        
        
      
    }
}
