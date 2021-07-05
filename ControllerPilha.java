package pilha;

public class ControllerPilha 
{    
    //ClassePilha base = null;
    ClassePilha topo = null;
        
    // Função de Inserir
    public void inserir(Long valor){ inserindo(valor);}
    
    public void inserindo(Long valor)
    {   
        // Verifica se a base da pilha é nula, se sim o valor é adicionado a ela, e ao topo
        ClassePilha aux = new ClassePilha(valor);
        aux.prox = topo;
        topo = aux;
    }
    
    
    // Função de exibição do Topo
    void exibirTopo(){ exibindoTopo();}
    // Função simples para exibir o que esta guardado no topo
    void exibindoTopo()
    {
        if(topo == null){System.out.println("- Esta pilha esta vazia, não possui topo -");}
        else{ System.out.println(topo.valor);}
    }

    // Função para verificar se pilha é vazia
    void eVazio(){ vazio(topo);}
    // Verificamos se existe algo na base se sim a pilha não é vazia
    void vazio(ClassePilha topo)
    {
        if (topo == null){System.out.println("- Sim a pilha esta vazia -");}
        else{System.out.println("- Esta Pilha não esta vazia -");}
    }
    
    // Função para remover registro da pilha
    void remover(){ removendo(topo);}
    // Removemos nós apenas apontando o topo para o nó anterior
    Long removendo(ClassePilha topo2)
    {   
        if (topo == null){ System.out.println("- Não é possivel desempilhar pois a pilha esta vazia -"); }
        else 
        { 
            Long saida = topo.valor;
            topo = topo.prox;
            return saida;
        }
        return null;
    }
}
      
    




