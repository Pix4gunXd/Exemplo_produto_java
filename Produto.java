package Principal;

/**
 *
 * @author caiop
 */
public class Produto {
    
   private int preco;
   private float peso;
   private String nome;
    
    
    
    public Produto() {}
    
    public Produto( String nome, int preco, float peso) {
        this.preco = preco;
        this.peso = peso;
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
