import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Jogo {
    private String titulo;
    private String classificacao_etaria;
    private double preco;

    public Jogo(String titulo, String classificacao_etaria, double preco){
        this.classificacao_etaria = classificacao_etaria;
        this.titulo = titulo;
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getClassificacao_etaria(){
        return this.classificacao_etaria;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void aplicarDesconto(double porcentagem){
        this.preco = this.preco * (1 - porcentagem);
    }

    public void aumentarPreco(double porcentagem){
        this.preco = this.preco * (1 + porcentagem);
    }

    public void atualizarClassficacao(String classificacao){
        this.classificacao_etaria = classificacao;
    }

    @Override
    public String toString() {
        return "Título: " + this.titulo + "\nClassificação Etária: " + this.classificacao_etaria + "\nPreço: R$" + String.format("%.2f", new BigDecimal(preco));
    }
}
