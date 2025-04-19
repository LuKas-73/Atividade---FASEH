package Lista3;

public class Produto {
    private int Codigo;
    private String Nome;
    private float Valor;
    private String Tipo;

    public Produto(String Nome, int Codigo, float Valor, String Tipo) {
        this.Nome = Nome;
        this.Codigo = Codigo;
        this.Valor = Valor;
        this.Tipo = Tipo;
    }

    public String getNome() {
        return Nome;
    }

    public int getCodigo() {
        return Codigo;
    }

    public float getValor() {
        return Valor;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setValor(float valor) {
        this.Valor = valor;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + Nome + " | Codigo: " + Codigo + " | Valor: " + Valor + " | Tipo de Unidade: " + Tipo;
    }
}
