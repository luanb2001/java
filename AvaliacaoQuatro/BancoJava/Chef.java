import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Chef extends Pessoa {

    private String especialidade;
    private String salario;
    private ArrayList<Receita> receitas = new ArrayList<>();

    private final static String url = "jdbc:mysql://localhost:3306/bancopadaria?useTimezone=true&serverTimezone=UTC";
    private final static String user = "root";
    private final static String password = "";

    public Chef(
        int idPessoa, 
        String nomePessoa, 
        String cpf, 
        Date dataNascimento,
        String especialidade,
        String salario

    ) {
        super(idPessoa, nomePessoa, cpf, dataNascimento);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Chef( 
        String nomePessoa, 
        String cpf, 
        Date dataNascimento,
        String especialidade,
        String salario
    ) {
        super(0, nomePessoa, cpf, dataNascimento);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    public String getSalario() {
        return this.salario;
    }

    public void setReceita(Receita receita) {
        this.receitas.add(receita);
    }
    public ArrayList<Receita> getReceita() {
        return this.receitas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Chef)) {
            return false;
        }
        Chef chef = (Chef) o;
        return Objects.equals(this.getCpf(), chef.getCpf());
    }

    @Override
    public String toString() {
        return 
        "\n Id: " + this.getIdPessoa() +
        "\n Chef: " + this.getNomePessoa() +
        "\n CPF: " + this.getCpf() +
        "\n Data de nascimento: " + this.getDataNascimento()+
        "\n Especialidade: " + this.getEspecialidade()+
        "\n Salário: " + this.getSalario();
    }

    public static void printChef(
        ArrayList<Chef> chefs
    ) {
        try {
            for (Chef chef : chefs) {
                System.out.println(chef);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Chef> getChefS() throws Exception {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM chefs;");
            ArrayList<Chef> chefs = new ArrayList<>();
            while (rs.next()) {
                chefs.add(
                    new Chef(
                        rs.getInt("idPessoa"),
                        rs.getString("nomePessoa"),
                        rs.getString("cpf"),
                        rs.getDate("dataNascimento"),
                        rs.getString("especialidade"),
                        rs.getString("salario")
                    )
                );
            }
            con.close();
            return chefs;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }             
    }

    public static Chef getChefInsert(Scanner scanner) {
        System.out.println("Informe o nome do chefe");
        String nomePessoa = scanner.next();
        System.out.println("Informe o CPF do chefe");
        String cpf = scanner.next();
        System.out.println("Informe a Data de Nascimento do chefe");
        String dataNascimento = scanner.next();
        System.out.println("Informe a especialidade do chefe");
        String especialidade = scanner.next();
        System.out.println("Informe o salário do chefe");
        String salario = scanner.next();

        return new Chef(
            nomePessoa,
            cpf,
            Date.valueOf(dataNascimento),
            especialidade,
            salario
        );
    }

    public static void insertChefS(Chef chef) {
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            stm.execute("INSERT INTO chefs "
                + "(nomePessoa, cpf, dataNascimento, especialidade, salario) VALUES "
                + "('"+chef.getNomePessoa()+"', '"+chef.getCpf()+"', '"+chef.getDataNascimento()+"', '"+chef.getEspecialidade()+"','"+chef.getSalario()+"')");
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
 
    public static Chef getChef(Scanner scanner) throws Exception { 
        try {
            System.out.println("Informe o ID: ");
            int idPessoa = scanner.nextInt();
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM chefs WHERE idPessoa = " + idPessoa);
            
            if(!rs.next()) {
                throw new Exception("Id inválido");
            }
            return new Chef(
                rs.getInt("idPessoa"),
                rs.getString("nomePessoa"),
                rs.getString("cpf"),
                rs.getDate("dataNascimento"),
                rs.getString("especialidade"),
                rs.getString("salario")
            );

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static Chef getChef(int id) throws Exception { 
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM chefs WHERE idPessoa = " + id);
            
            if(!rs.next()) {
                throw new Exception("Id inválido");
            }
            return new Chef(
                rs.getInt("idPessoa"),
                rs.getString("nomePessoa"),
                rs.getString("cpf"),
                rs.getDate("dataNascimento"),
                rs.getString("especialidade"),
                rs.getString("salario")
            );

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public static Chef getChefUpdate(Scanner scanner) throws Exception {
        try {
            Chef chef = Chef.getChef(scanner);
            System.out.println("Informe o nome do chefe (Deixar vazio para manter)");
            String nomePessoa = scanner.next();
            if (nomePessoa.length() > 0){
                chef.setNomePessoa(nomePessoa);
            }
            System.out.println("Informe o CPF do chefe (Deixar vazio para manter)");
            String cpf = scanner.next();
            if (cpf.length() > 0){
                chef.setCpf(cpf);
            }
            System.out.println("Informe a Data de Nascimento do chefe (Deixar vazio para manter)");
            String dataNascimento = scanner.next();
            if (dataNascimento.length() > 0){
                chef.setDataNascimento(Date.valueOf(dataNascimento));
            }
            System.out.println("Informe o especialidade do chefe (Deixar vazio para manter)");
            String especialidade = scanner.next();
            if (especialidade.length() > 0){
                chef.setEspecialidade(especialidade);
            }
            System.out.println("Informe o salário do chefe (Deixar vazio para manter)");
            String salario = scanner.next();
            if (salario.length() > 0){
                chef.setSalario(salario);
            }
            return chef;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static void updateChefS(Chef chef) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            stm.execute("UPDATE chefs SET "
                + " nomePessoa = '" + chef.getNomePessoa() + "'"
                + ", cpf = '" + chef.getCpf() + "'"
                + ", dataNascimento = '" + chef.getDataNascimento() + "'"
                + ", especialidade = '" + chef.getEspecialidade() + "'"
                + ", salario = '" + chef.getSalario() + "'"
                + " WHERE idPessoa = " + chef.getIdPessoa());
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteChefS(Chef chef) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            stm.execute("DELETE FROM chefs "
                + " WHERE idPessoa = " + chef.getIdPessoa());
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);    
    }

    /*public void adicionarReceita(
        int idReceita, 
        String nomeReceita, 
        String etapas, 
        int numeroEtapas,
        String valor
    ) {
        Receita receita = new Receita(idReceita, nomeReceita, etapas, numeroEtapas, valor);
        this.receitas.add(receita);
    }*/
}          