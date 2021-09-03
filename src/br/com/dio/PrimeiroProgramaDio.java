package br.com.dio;


import br.com.dio.model.Cat;

public class PrimeiroProgramaDio {

    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat);
        Livro livro1 = new Livro("o problema dos 3 corpos", 300);
        System.out.println(livro1);
    }

}

class Livro{

    private String nome;
    private Integer numPag;

    public Livro(String nome, int numPag) {
        this.nome = nome;
        this.numPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}