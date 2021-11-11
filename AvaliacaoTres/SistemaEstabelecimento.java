package AvaliacaoTres;

public class SistemaEstabelecimento {
    public static void main(String[] args) {
        //Criando chefs
        Chef chefUm = new Chef(33455,"Jacquin","019.645.321-32","20/03/1988","Comida Requentada");
        Chef chefDois = new Chef(69453,"Juan","119.632.361-30","10/06/1995", "Comida pré-preparada");
        Chef chefTres = new Chef(44800,"Jorge","128.782.754-78","07/11/1990", "Doces");

        //Criando clientes
        Cliente clienteUm = new Cliente(13435,"João","015.610.431-12","15/10/1980","47 93462-5560");
        Cliente clienteDois = new Cliente(27423,"Joaquim","109.640.311-10","15/12/1997", "47 94622-4510");
        Cliente clienteTres = new Cliente(34850,"Jó","125.706.705-67","09/01/1991", "47 95162-5561");
        
        //Criando padarias
        Padaria padariaUm = new Padaria(335,"Doce Sonho","03/06/2009",159,"89240-900","Aurora",645,"Barueri","Joinville", "6:00 - 21:00");
        Padaria padariaDois = new Padaria(453,"Padoca da Esquina","11/10/2011",201,"89208-970","Celso Ramos",126,"Jardim Alegre","Jaraguá do Sul", "6:00 - 19:00");
        Padaria padariaTres = new Padaria(407,"Panificadora Alfa","07/01/2008",305,"89210-660","Água Doce",200,"Nova Iguaçu","Itajaí", "6:00 - 20:00");

        //Criando mercados
        Mercado mercadoUm = new Mercado(335,"Brasólho","03/06/2005",195,"89220-911","Joaquina",546,"Nova Brasília","Chapecó", "30 ovos por apenas 10 reais");
        Mercado mercadoDois = new Mercado(453,"Rio do Sul","01/10/2003",210,"89210-938","Celso Russomano",503,"Jardim Paraíso","Itajaí", "60 ovos por apenas 20 reais");
        Mercado mercadoTres = new Mercado(407,"Santana","03/01/2018",345,"89213-632","Água Santa",304,"Nova Rondônia","Jaraguá do Sul", "15 ovos por apenas 5 reais");

        //Criando receitas
        Receita receitaUm = new Receita(100234,"Lasanha de microondas","Retirar o plástico protetor, colocar a lasanha no microondas",2,"R$ 6,50");
        Receita receitaDois = new Receita(136234,"Coxinha","Esquentar a coxinha pré pronta no forno",1,"R$ 3,50");
        Receita receitaTres = new Receita(101234,"Misto Quente","Adicionar presunto e queijo no pão, colocar o pão na chapa",2,"R$ 4,50");
        Receita receitaQuatro = new Receita(000234,"Pao de Queijo","Colocar a massa de pão de queijo no forma, adicionar a forma de pão de queijo ao forno",2,"R$ 2,00");
        Receita receitaCinco = new Receita(010200,"Sonho","Preparar a massa do sonho, colocar a massa para assar",2,"R$ 2,50");
        Receita receitaSeis= new Receita(153894,"Quibe","Adiconar o quibe pré pronto na airfryer",1,"R$ 3,29");
        Receita receitaSete = new Receita(003144,"Pão com Ovo","Fritar o ovo, adicionar o ovo frito ao pão",2,"R$ 4,50");
        Receita receitaOito = new Receita(194568,"Brigadeiro","Preparar o brigadeiro, fazer as bolinhas de brigadeiro, adicionar a forminha",3,"R$ 1,50");
        Receita receitaNove= new Receita(012347,"Bolo de Chocolate Light","Preparar a massa do bolo, colocar a massa do bolo no forno",2,"R$ 5,50");
        Receita receitaDez= new Receita(153894,"Quibe Vegano","Adiconar o quibe pré pronto na airfryer",1,"R$ 4,29");
        Receita receitaOnze = new Receita(003144,"Pão com Ovo Light","Fritar o ovo, adicionar o ovo frito ao pão",2,"R$ 5,50");
        Receita receitaDoze = new Receita(194568,"Brigadeiro Light","Preparar o brigadeiro, fazer as bolinhas de brigadeiro, adicionar a forminha",3,"R$ 2,50");
        Receita receitaTreze= new Receita(012347,"Bolo de Chocolate Diet","Preparar a massa do bolo, colocar a massa do bolo no forno",2,"R$ 4,50");
        Receita receitaQuatorze = new Receita(100234,"Lasanha de microondas vegana","Retirar o plástico protetor, colocar a lasanha no microondas",2,"R$ 10,50");
        Receita receitaQuinze = new Receita(136234,"Coxinha vegana","Esquentar a coxinha pré pronta no forno",1,"R$ 5,50");

        //adicionando receitas ao chef
        chefUm.adicionarReceita(receitaUm);
        chefUm.adicionarReceita(receitaDois);
        chefUm.adicionarReceita(receitaTres);
        chefUm.adicionarReceita(receitaDez);
        chefUm.adicionarReceita(receitaOnze);

        chefDois.adicionarReceita(receitaQuatro);
        chefDois.adicionarReceita(receitaCinco);
        chefDois.adicionarReceita(receitaSeis);
        chefDois.adicionarReceita(receitaDoze);
        chefDois.adicionarReceita(receitaTreze);

        chefTres.adicionarReceita(receitaSete);
        chefTres.adicionarReceita(receitaOito);
        chefTres.adicionarReceita(receitaNove);
        chefTres.adicionarReceita(receitaQuatorze);
        chefTres.adicionarReceita(receitaQuinze);

        //adicionando receitas compradas pelo cliente
        clienteUm.adicionarReceita(receitaUm);
        clienteUm.adicionarReceita(receitaDois);
        clienteUm.adicionarReceita(receitaTres);
        clienteUm.adicionarReceita(receitaQuatro);
        clienteUm.adicionarReceita(receitaCinco);
        clienteUm.adicionarReceita(receitaSeis);
        clienteUm.adicionarReceita(receitaSete);
        clienteUm.adicionarReceita(receitaOito);
        clienteUm.adicionarReceita(receitaNove);
        clienteUm.adicionarReceita(receitaDez);

        clienteDois.adicionarReceita(receitaQuatro);
        clienteDois.adicionarReceita(receitaCinco);
        clienteDois.adicionarReceita(receitaSeis);
        clienteDois.adicionarReceita(receitaSete);
        clienteDois.adicionarReceita(receitaOito);
        clienteDois.adicionarReceita(receitaNove);
        clienteDois.adicionarReceita(receitaDez);
        clienteDois.adicionarReceita(receitaOnze);
        clienteDois.adicionarReceita(receitaDoze);
        clienteDois.adicionarReceita(receitaTreze);

        clienteTres.adicionarReceita(receitaSete);
        clienteTres.adicionarReceita(receitaOito);
        clienteTres.adicionarReceita(receitaNove);
        clienteTres.adicionarReceita(receitaDez);
        clienteTres.adicionarReceita(receitaOnze);
        clienteTres.adicionarReceita(receitaDoze);
        clienteTres.adicionarReceita(receitaTreze);
        clienteTres.adicionarReceita(receitaQuatorze);
        clienteTres.adicionarReceita(receitaQuinze);
        clienteTres.adicionarReceita(receitaUm);

        //Padaria adicionando receitas
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

        //Mercado adicionando receitas
        mercadoUm.adicionarReceita(receitaCinco);
        mercadoUm.adicionarReceita(receitaSeis);
        mercadoUm.adicionarReceita(receitaSete);
        mercadoUm.adicionarReceita(receitaOito);
        mercadoUm.adicionarReceita(receitaNove);

        mercadoDois.adicionarReceita(receitaUm);
        mercadoDois.adicionarReceita(receitaDois);
        mercadoDois.adicionarReceita(receitaTres);
        mercadoDois.adicionarReceita(receitaQuatro);
        mercadoDois.adicionarReceita(receitaCinco);

        mercadoTres.adicionarReceita(receitaQuatro);
        mercadoTres.adicionarReceita(receitaCinco);
        mercadoTres.adicionarReceita(receitaSeis);
        mercadoTres.adicionarReceita(receitaSete);
        mercadoTres.adicionarReceita(receitaOito);

        //printando as padarias
        System.out.println("\n\tPadarias");
        System.out.println(padariaUm + "\n");

        System.out.println("\n\n\tReceitas da Padaria Doce Sonho:\n");
    
        for (Receita receita : padariaUm.receitas) {
            System.out.println(receita.nomeReceita);
        }

        System.out.println("\n\t" + padariaDois);
        System.out.println("\n");
        System.out.println("\n\tReceitas da Padoca da Esquina:\n");

        for (Receita receita : padariaDois.receitas) {
            System.out.println(receita.nomeReceita);
        }

        System.out.println("\n\t" + padariaTres);
        System.out.println("\n");
        System.out.println("\n\tReceitas da Panificadora Alfa:\n");

        for (Receita receita : padariaTres.receitas) {
            System.out.println(receita.nomeReceita + receita.valor);
        }

        //printando os mercados
        System.out.println("\n\tMercados");
        System.out.println(mercadoUm + "\n");

        System.out.println("\n\n\tReceitas do Mercado Brasólho:\n");
    
        for (Receita receita : mercadoUm.receitas) {
            System.out.println(receita.nomeReceita + " " + receita.valor);
        }

        System.out.println("\n\t" + mercadoDois);
        System.out.println("\n");
        System.out.println("\n\tReceitas do Mercado Rio do Sul:\n");

        for (Receita receita : mercadoDois.receitas) {
            System.out.println(receita.nomeReceita + " " + receita.valor);
        }

        System.out.println("\n\t" + mercadoTres);
        System.out.println("\n");
        System.out.println("\n\tReceitas do Mercado Santana:\n");

        for (Receita receita : mercadoTres.receitas) {
            System.out.println(receita.nomeReceita + " " + receita.valor);
        }

        //printando os chefs e as receitas criadas
        System.out.println("\n\tChefs");
        System.out.println("\n" + chefUm);
        System.out.println("\nReceitas do chefe Jacquin:");
        for (Receita receita : chefUm.receitas) {
            System.out.println(receita.nomeReceita);
        }

        System.out.println("\n" + chefDois);
        System.out.println("\nReceitas do chefe Juan:");
        for (Receita receita : chefDois.receitas) {
            System.out.println(receita.nomeReceita);
        }

        System.out.println("\n" +chefTres);
        System.out.println("\nReceitas do chefe Jorge:");
        for (Receita receita : chefTres.receitas) {
            System.out.println(receita.nomeReceita);
        }

        //printando os clientes e as receitas compradas
        System.out.println("\n\tClientes");
        System.out.println("\n"+ clienteUm);
        System.out.println("\nReceitas compradas por João:");
        for (Receita receita : clienteUm.receitas) {
            System.out.println(receita.nomeReceita);
        }

        System.out.println("\n" + clienteDois);
        System.out.println("\nReceitas compradas por Joaquim:");
        for (Receita receita : clienteDois.receitas) {
            System.out.println(receita.nomeReceita);
        }

        System.out.println("\n" +clienteTres);
        System.out.println("\nReceitas compradas por Jó:");
        for (Receita receita : clienteTres.receitas) {
            System.out.println(receita.nomeReceita);
        }

        //printando as receitas
        System.out.println("\n\tReceitas:");
        System.out.println("\n" + receitaUm);
        System.out.println("\n" + receitaDois);
        System.out.println("\n" + receitaTres);
        System.out.println("\n" + receitaQuatro);
        System.out.println("\n" + receitaCinco);
        System.out.println("\n" + receitaSeis);
        System.out.println("\n" + receitaSete);
        System.out.println("\n" + receitaOito);
        System.out.println("\n" + receitaNove);
        System.out.println("\n" + receitaDez);
        System.out.println("\n" + receitaOnze);
        System.out.println("\n" + receitaDoze);
        System.out.println("\n" + receitaTreze);
        System.out.println("\n" + receitaQuatorze);
        System.out.println("\n" + receitaQuinze);
    }
}         
