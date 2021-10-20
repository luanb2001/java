package AvaliacaoDois;

public class SistemaPadaria {
    public static void main(String[] args) {
        Chef chefUm = new Chef(33455,"Jacquin","019.645.321-32","20/03/1988");
        Chef chefDois = new Chef(69453,"Juan","119.632.361-30","10/06/1995");
        Chef chefTres = new Chef(44800,"Jorge","128.782.754-78","07/11/1990");

        Padaria padariaUm = new Padaria(335,"Doce Sonho","03/06/2009",159,"89240-900","Aurora",645,"Barueri","Joinville");
        Padaria padariaDois = new Padaria(453,"Padoca da Esquina","11/10/2011",201,"89208-970","Celso Ramos",126,"Jardim Alegre","Jaraguá do Sul");
        Padaria padariaTres = new Padaria(407,"Panificadora Alfa","07/01/2008",305,"89210-660","Água Doce",200,"Nova Iguaçu","Itajaí");

        Receita receitaUm = new Receita(100234,"Lasanha de microondas","Retirar o plástico protetor, colocar a lasanha no microondas",2);
        Receita receitaDois = new Receita(136234,"Coxinha","Esquentar a coxinha pré pronta no forno",1);
        Receita receitaTres = new Receita(101234,"Misto Quente","Adicionar presunto e queijo no pão, colocar o pão na chapa",2);
        Receita receitaQuatro = new Receita(000234,"Pao de Queijo","Colocar a massa de pão de queijo no forma, adicionar a forma de pão de queijo ao forno",2);
        Receita receitaCinco = new Receita(010200,"Sonho","Preparar a massa do sonho, colocar a massa para assar",2);
        Receita receitaSeis= new Receita(153894,"Quibe","Adiconar o quibe pré pronto na airfryer",1);
        Receita receitaSete = new Receita(003144,"Pão com Ovo","Fritar o ovo, adicionar o ovo frito ao pão",2);
        Receita receitaOito = new Receita(194568,"Brigadeiro","Preparar o brigadeiro, fazer as bolinhas de brigadeiro, adicionar a forminha",3);
        Receita receitaNove= new Receita(012347,"Bolo de Chocolate","Preparar a massa do bolo, colocar a massa do bolo no forno",2);

        chefUm.adicionarReceita(receitaUm);
        chefUm.adicionarReceita(receitaDois);
        chefUm.adicionarReceita(receitaTres);

        chefDois.adicionarReceita(receitaQuatro);
        chefDois.adicionarReceita(receitaCinco);
        chefDois.adicionarReceita(receitaSeis);

        chefTres.adicionarReceita(receitaSete);
        chefTres.adicionarReceita(receitaOito);
        chefTres.adicionarReceita(receitaNove);

        System.out.println("Receitas do chefe Jacquin:");
        for (Receita receita : chefUm.receitas) {
            System.out.println(receita.nomeReceita);
        }
        System.out.println("\n");
        System.out.println("Receitas do chefe Juan:");
        for (Receita receita : chefDois.receitas) {
            System.out.println(receita.nomeReceita);
        }
        System.out.println("\n");
        System.out.println("Receitas do chefe Jorge:");
        for (Receita receita : chefTres.receitas) {
            System.out.println(receita.nomeReceita);
        }

        padariaUm.adicionarReceita(receitaUm);
        padariaUm.adicionarReceita(receitaDois);
        padariaUm.adicionarReceita(receitaTres);
        padariaUm.adicionarReceita(receitaQuatro);
        padariaUm.adicionarReceita(receitaCinco);

        padariaDois.adicionarReceita(receitaQuatro);
        padariaDois.adicionarReceita(receitaCinco);
        padariaDois.adicionarReceita(receitaSeis);
        padariaDois.adicionarReceita(receitaSete);
        padariaDois.adicionarReceita(receitaOito);

        padariaTres.adicionarReceita(receitaCinco);
        padariaTres.adicionarReceita(receitaSeis);
        padariaTres.adicionarReceita(receitaSete);
        padariaTres.adicionarReceita(receitaOito);
        padariaTres.adicionarReceita(receitaNove);

        System.out.println("\n");
        System.out.println("Receitas da Padaria Doce Sonho:");
    
        for (Receita receita : padariaUm.receitas) {
            System.out.println(receita.nomeReceita);
        }

        System.out.println("\nEndereço:");
        System.out.println(
            " \nCEP: " + padariaUm.endereco.cep + 
            " \nRua: "+ padariaUm.endereco.rua + 
            " \nNúmero: " + padariaUm.endereco.numero + 
            " \nBairro: " + padariaUm.endereco.bairro + 
            " \nCidade: " + padariaUm.endereco.cidade
        );

        System.out.println("\n");
        System.out.println("Receitas da Padoca da Esquina:");
        
        for (Receita receita : padariaDois.receitas) {
            System.out.println(receita.nomeReceita);
        }

        System.out.println("\nEndereço:");
        System.out.println(
            " \nCEP: " + padariaDois.endereco.cep + 
            " \nRua: "+ padariaDois.endereco.rua + 
            " \nNúmero: " + padariaDois.endereco.numero + 
            " \nBairro: " + padariaDois.endereco.bairro + 
            " \nCidade: " + padariaDois.endereco.cidade
        );
        System.out.println("\n");
        System.out.println("Receitas da Panificadora Alfa:");
        
        for (Receita receita : padariaTres.receitas) {
            System.out.println(receita.nomeReceita);
        }

        System.out.println("\nEndereço:");
        System.out.println(
            " \nCEP: " + padariaTres.endereco.cep + 
            " \nRua: "+ padariaTres.endereco.rua + 
            " \nNúmero: " + padariaTres.endereco.numero + 
            " \nBairro: " + padariaTres.endereco.bairro + 
            " \nCidade: " + padariaTres.endereco.cidade
        );
    }
}         
