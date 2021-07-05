package pilha;

// CRIANDO A CLASSE FILA

public class ClassePilha 
{
    long valor;
    ClassePilha prox;
        
    // CONSTRUTOR DA CLASSE
    public ClassePilha(Long valor)
    {
        this.prox = null;
        this.valor = valor;
    }

}
