import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Cliente extends Pessoa {

    private String telefone;
    private ArrayList<Receita> receitas = new ArrayList<>();

    private final static String url = "jdbc:mysql://localhost:3306/bancopadaria?useTimezone=true&serverTimezone=UTC";
    private final static String user = "root";
    private final static String password = "";

    public Cliente(
        int idPessoa, 
        String nomePessoa, 
        String cpf, 
        Date dataNascimento,
        String telefone
    ) {
        super(idPessoa, nomePessoa, cpf, dataNascimento);
        this.telefone = telefone;
    }

    public Cliente(
        String nomePessoa, 
        String cpf, 
        Date dataNascimento,
        String telefone
    ) {
        super(0, nomePessoa, cpf, dataNascimento);
        this.telefone = telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone() {
        return this.telefone;
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
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(this.getCpf(), cliente.getCpf());
    }

    @Override
    public String toString() {
        return 
        "\n Id: " + this.getNomePessoa() + 
        "\n Cliente: " + this.getNomePessoa() +
        "\n CPF: " + this.getCpf() +
        "\n Data de nascimento: " + this.getDataNascimento() +
        "\n Telefone: " + this.getTelefone();
    }

    public static void printCliente(
        ArrayList<Cliente> clientes
    ) {
        try {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Cliente> getClienteS() throws Exception {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM clientes;");
            ArrayList<Cliente> clientes = new ArrayList<>();
            while (rs.next()) {
                clientes.add(
                    new Cliente(
                        rs.getInt("idPessoa"),
                        rs.getString("nomePessoa"),
                        rs.getString("cpf"),
                        rs.getDate("dataNascimento"),
                        rs.getString("telefone")
                    )
                );
            }
            con.close();
            return clientes;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }             
    }

    public static Cliente getClienteInsert(Scanner scanner) {
        System.out.println("Informe o nome do cliente");
        String nomePessoa = scanner.next();
        System.out.println("Informe o CPF do cliente");
        String cpf = scanner.next();
        System.out.println("Informe a Data de Nascimento do cliente");
        String dataNascimento = scanner.next();
        System.out.println("Informe a telefone do cliente");
        String telefone = scanner.next();

        return new Cliente(
            nomePessoa,
            cpf,
            Date.valueOf(dataNascimento),
            telefone
        );
    }

    public static void insertClienteS(Cliente cliente) {
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            stm.execute("INSERT INTO clientes "
                + "(nomePessoa, cpf, dataNascimento, telefone) VALUES "
                + "('"+cliente.getNomePessoa()+"', '"+cliente.getCpf()+"', '"+cliente.getDataNascimento()+"', '"+cliente.getTelefone()+"')");
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static Cliente getCliente(Scanner scanner) throws Exception { 
        try {
            System.out.println("Informe o ID de exclusão: ");
            int idPessoa = scanner.nextInt();
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM clientes WHERE idPessoa = " + idPessoa);
            
            if(!rs.next()) {
                throw new Exception("Id inválido");
            }
            return new Cliente(
                rs.getInt("idPessoa"),
                rs.getString("nomePessoa"),
                rs.getString("cpf"),
                rs.getDate("dataNascimento"),
                rs.getString("telefone")
            );

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static Cliente getCliente(int id) throws Exception { 
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM clientes WHERE idPessoa = " + id);
            
            if(!rs.next()) {
                throw new Exception("Id inválido");
            }
            return new Cliente(
                rs.getInt("idPessoa"),
                rs.getString("nomePessoa"),
                rs.getString("cpf"),
                rs.getDate("dataNascimento"),
                rs.getString("telefone")
            );

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static Cliente getClienteUpdate(Scanner scanner) throws Exception {
        try {
            Cliente cliente = Cliente.getCliente(scanner);
            System.out.println("Informe o nome do cliente (Deixar vazio para manter)");
            String nomePessoa = scanner.next();
            if (nomePessoa.length() > 0){
                cliente.setNomePessoa(nomePessoa);
            }
            System.out.println("Informe o CPF do cliente (Deixar vazio para manter)");
            String cpf = scanner.next();
            if (cpf.length() > 0){
                cliente.setCpf(cpf);
            }
            System.out.println("Informe a Data de Nascimento do cliente (Deixar vazio para manter)");
            String dataNascimento = scanner.next();
            if (dataNascimento.length() > 0){
                cliente.setDataNascimento(Date.valueOf(dataNascimento));
            }
            System.out.println("Informe o telefone do cliente (Deixar vazio para manter)");
            String telefone = scanner.next();
            if (telefone.length() > 0){
                cliente.setTelefone(telefone);
            }
            return cliente;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static void updateClienteS(Cliente cliente) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            stm.execute("UPDATE clientes SET "
                + " nomePessoa = '" + cliente.getNomePessoa() + "'"
                + ", cpf = '" + cliente.getCpf() + "'"
                + ", dataNascimento = '" + cliente.getDataNascimento() + "'"
                + ", telefone = '" + cliente.getTelefone() + "'"
                + " WHERE idPessoa = " + cliente.getIdPessoa());
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteClienteS(Cliente cliente) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            stm.execute("DELETE FROM clientes "
                + " WHERE idPessoa = " + cliente.getIdPessoa());
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);
        receita.adicionarCliente(this);
    }
}