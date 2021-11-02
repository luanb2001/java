package AtividadeHospital;

public class Cadastro {

    public static void main(String[] args) { 

        Medico medicoUm = new Medico("Jorge Luís","133.461.259-32","10/03/1988", "15991-3",3401,"Santa Catarina");
        Medico medicoDois = new Medico("Jorge Lucas","103.461.259-3=12","03/04/1980", "45691-3",3001,"Santa Catarina");
        Medico medicoTres = new Medico("Jorge Leandro","163.411.159-22", "26;12/1985", "15991-3",4810,"Santa Catarina");

        Paciente pacienteUm = new Paciente("Jorge Leal","130.451.239-32","10/03/1998", "15091-3",3040);
        Paciente pacienteDois = new Paciente("Jorge Lindoso","123.561.259-32","03/04/1990", "40691-3",3001);
        Paciente pacienteTres = new Paciente("Jorge Lodrigo","163.418.159-22", "26;12/1995", "05991-3",4810);

        Consulta consultaUm = new Consulta("14/10/2021","Cirurgia",1);
        Consulta consultaDois = new Consulta("15/11/1995","Transplante",2);
        Consulta consultaTres = new Consulta("12/02/2000","Bariatrica",3);
        Consulta consultaQuatro = new Consulta("17/05/2001","Implante",4);
        Consulta consultaCinco = new Consulta("01/04/2002","Cirurgia da mão",5);
        Consulta consultaSeis = new Consulta("15/06/2003","Polipectomia",6);
        Consulta consultaSete = new Consulta("07/03/2004","Varizes",7);
        Consulta consultaOito = new Consulta("31/10/2005","Facectomia",8);
        Consulta consultaNove = new Consulta("31/01/2006","Lipomas",9);
        Consulta consultaDez = new Consulta("12/12/2004","Biópsias: pele",10);
        
        System.out.println(medicoUm);
        System.out.println(medicoDois);
        System.out.println(medicoTres);

        System.out.println(pacienteUm);
        System.out.println(pacienteDois);
        System.out.println(pacienteTres);

        System.out.println(consultaUm);
        System.out.println(consultaDois);
        System.out.println(consultaTres);
        System.out.println(consultaQuatro);
        System.out.println(consultaCinco);
        System.out.println(consultaSeis);
        System.out.println(consultaSete);
        System.out.println(consultaOito);
        System.out.println(consultaNove);
        System.out.println(consultaDez);
    }    
}
