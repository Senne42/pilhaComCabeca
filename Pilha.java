package pilha;

import java.util.Scanner;

public class Pilha {
    
    public static void main(String[] args) 
    {
        Scanner le = new Scanner(System.in);
        ControllerPilha pilha = new ControllerPilha();
        int opcao;
        Long valor;


        System.out.println("-_-_- Pilha _-_-_");

        do 
        {
            System.out.println("\n***********************************");
            System.out.println("\n PILHA ");
            System.out.print("\nEntre com a opcao:");
            System.out.print("\n ----1: Empilhar");
            System.out.print("\n ----2: Desempilhar");
            System.out.print("\n ----3: Exibir Topo");
            System.out.print("\n ----4: Verificar se é vazio");
            System.out.print("\n ----5: Sair do programa");
            System.out.print("\n***********************************\n");
            //System.out.print("\n-> ");
            opcao = le.nextInt();
           
            switch(opcao) 
            {
                    // Opção do menu INSERIR
                    case 1: 
                    {
                        System.out.print("\n Informe o valor -> ");
                        valor = le.nextLong();
                        pilha.inserir(valor);
                        break;
                    }
                    // Opção do menu REMOVER
                    case 2:
                    {
                    
                        System.out.print(pilha.remover());
                        break;
                    }
                    // Opção do menu CAMINHAR
                    case 3: 
                    {  
                        pilha.exibirTopo();
                        break;
                    }
                    case 4:
                    {
                        pilha.eVazio();
                        break; 
                    }

            } // fim switch
        } 
        while(opcao != 5);


    }

}
