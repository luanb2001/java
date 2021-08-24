import java.util.Scanner;
public class Exercicio2
{
    public static void main(String args[]) 
    {
    
    System.out.println("Ex. 1");
        {
            System.out.println("Média das Notas");
            Scanner scanner = new Scanner (System.in);
            double nota = 0.0;
            double soma = 0.0;
        
            for(int i=1;i<4;i++) 
            {
                System.out.println("Digite a "+ i +"ª nota: ");
                nota = scanner.nextDouble();
                soma+=nota;
            }
        
        String media = (soma / 3) >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.println(media);
        }
    System.out.println("\n");
        
    System.out.println("Ex. 2 ");
        {
           Scanner scanner = new Scanner (System.in);
           
           System.out.println("Digite o número de um mês");
           int mes = scanner.nextInt();
           
           if (mes==1)
           {
               System.out.println("Janeiro");
           }
           if (mes==2)
           {
               System.out.println("Fevereiro");
           }
           if (mes==3)
           {
               System.out.println("Março");
           }
           if (mes==4)
           {
               System.out.println("Abril");
           }
           if (mes==5)
           {
               System.out.println("Maio");
           }
           if (mes==6)
           {
               System.out.println("Junho");
           }
           if (mes==7)
           {
               System.out.println("Julho");
           }
           if (mes==8)
           {
               System.out.println("Agosto");
           }
           if (mes==9)
           {
               System.out.println("Setembro");
           }
           if (mes==10)
           {
               System.out.println("Outubro");
           }
           if (mes==11)
           {
               System.out.println("Novembro");
           }
           if (mes==12)
           {
               System.out.println("Dezembro");
           }
          
        }
    System.out.println("\n");
        
    System.out.println("Ex. 3 ");
        {   
            Scanner scanner = new Scanner (System.in);
            
            String pOculta = "";
            String pInformada = "";
        
            System.out.println("Informe a palavra oculta: ");
            pOculta = scanner.next();
        
            System.out.println("\n Quantidade de tentativas: 6");
        
            for (int tentativas=5;tentativas>=0;--tentativas) 
            {
            
                System.out.println("\n Digite a sua tentativa: ");
                pInformada = scanner.next();
            
                if (pInformada.equals(pOculta)) 
                {
                    System.out.println("\n Parabéns, você acertou antes de ser enforcado!!!!!");
                    break;
                }
                else if (tentativas == 5) 
                {
                    System.out.println("\n\t Você perdeu a cabeça");
                }
                else if (tentativas == 4) 
                {
                    System.out.println("\n\t Você perdeu o tronco");
                }
                else if (tentativas == 3) 
                {
                    System.out.println("\n\t Você perdeu um braço");
                }
                else if (tentativas == 2) 
                {
                    System.out.println("\n\t Você perdeu o outro braço");
                }
                else if (tentativas == 1) 
                {
                    System.out.println("\n\t Você perdeu uma perna");
                }
                else 
                {
                    System.out.println("\n\t Você perdeu a outra perna e foi enforcado");
                }
            }
        }
    System.out.println("\n");
        
    System.out.println("Ex. 4 "); 
        {
            Scanner scanner = new Scanner (System.in);
            
            System.out.println("Digite o valor da tabuada: ");
            int valor = scanner.nextInt();
        
            for (int i=0;i<=10;i++) 
            {
                System.out.println(valor + " x " + i + " = " + (valor*i));
            }
        }
    System.out.println("\n");
    
    System.out.println("Ex. 5");
        {
            Scanner scanner = new Scanner (System.in);
        
            System.out.println("Insira uma palavra: ");
            String stringTorre = scanner.nextLine();
        
            for (int cont=0;cont<stringTorre.length();cont++) 
            {
                System.out.println(stringTorre.charAt(cont));
            }
        }
    System.out.println("\n");
    
    System.out.println("Ex. 6");
        {
            Scanner scanner = new Scanner (System.in);
            int soma = 0;
        
            for (int cont=1;cont<=500;cont+=2) 
            {
                if (cont%2==1 && cont%7==0) 
                {
                    soma+=cont;
                }
            }
                System.out.println("A soma dos números ímpares múltiplos de 7 é: " + soma);
        }
    System.out.println("\n");
    
    System.out.println("Ex. 7");
        {
            Scanner scanner = new Scanner (System.in);
            double soma = 0.0, nota = 0.0;
            int qntNotas = 0;
        
            do
            {
                System.out.println("Informe a " + (qntNotas+1) + " ª nota do aluno: ");
                nota = scanner.nextDouble();
                soma+=nota;
                qntNotas++;
            
            }
            while(nota >= 0);
        
            System.out.println("A média das notas informadas é: " + (soma/qntNotas));
        }
    System.out.println("\n");
     
    System.out.println("Ex. 8");
        {
            Scanner scanner = new Scanner (System.in);
        
            System.out.println("Informe um número: ");
            int fatorial = scanner.nextInt();
        
            for (int cont=fatorial;cont>1;cont--) 
            {
                fatorial = fatorial * (cont-1);
            }
        
            System.out.println("A fatorial desse número é: " + fatorial);
        }
    System.out.println("\n");
        
    System.out.println("Ex. 9");
        {    
            double altura = 0.0, peso = 0.0, imc = 0.0;
            String resultadoIMC = "";
        
            Scanner scanner = new Scanner (System.in);
        
            System.out.println("Informe sua altura: ");
            altura = scanner.nextDouble();
        
            System.out.println("\n Informe seu peso: ");
            peso = scanner.nextDouble();
        
            imc = peso/(altura*altura);
        
            if (imc <= 18.5) 
            {
                resultadoIMC = "Abaixo do Peso";
            }
            else if (imc > 18.5 && imc <= 24.9) 
            {
                resultadoIMC = "Peso Ideal";
            }
            else if (imc > 24.9 && imc <= 29.9) 
            {
                resultadoIMC = "Acima do peso";
            }
            else if (imc > 29.9 && imc <= 34.9) 
            {
                resultadoIMC = "Obesidade Grau I";
            }
            else if (imc > 34.9 && imc <= 39.9) 
            {
                resultadoIMC = "Obesidade Grau II";
            }
            else 
            {
                resultadoIMC = "Obesidade Grau III";
            }
        
            System.out.println("IMC: " + resultadoIMC);
        }
    System.out.println("\n");
    
    System.out.println("Desafio");
        {
            int valorUm = 0, valorDois = 0;
            double resultado = 0.0;
            String operacao = "";
            Scanner scanner = new Scanner (System.in);
        
            System.out.println("Informe o primeiro valor: ");
            valorUm = scanner.nextInt();
        
            System.out.println("Informe o segundo valor: ");
            valorDois = scanner.nextInt();
        
            System.out.println("Informe a operação a ser realizada (+ - * /): ");
            operacao = scanner.next();
        
            if (operacao.equals("+")) 
            {
                resultado = valorUm + valorDois;
            }
            else if (operacao.equals("-")) 
            {
                resultado = valorUm - valorDois;
            }
            else if (operacao.equals("*")) 
            {
                resultado = valorUm * valorDois;
            }
            else 
            {
                resultado = valorUm / valorDois;
            }
        
            System.out.println("O resultado é: " + resultado);
        }
    System.out.println("\n");
    }
}