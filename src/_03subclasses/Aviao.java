package _03subclasses;

import java.util.Scanner;
import _02superclasse.MeiosDeLocomocao;

public abstract class Aviao extends MeiosDeLocomocao {

    //atributos exclusivos da classe Aviao
    private String identificacao;
    private static double desconto = 0.08;
    public Motor motorDoAviao1 = new Motor();
    public Motor motorDoAviao2 = new Motor();
    public Motor motorDoAviao3 = new Motor();
    public Motor motorDoAviao4 = new Motor();

    //Construtores
    public Aviao() {
    }

    public Aviao(String identificacao) {
        this.identificacao = identificacao;
    }

    public Aviao(double comprimento) {
        super(comprimento);
    }

    public Aviao(String marca, String modelo, String cor, double comprimento, double largura, double preco) {
        super(marca, modelo, cor, comprimento, largura, preco);
    }

    public Aviao(String marca, String modelo, String cor, double comprimento, double largura, double preco, String identificacao) {
        super(marca, modelo, cor, comprimento, largura, preco);
        this.identificacao = identificacao;
    }

    //Métodos de Acesso
    //----------------
    // Setters
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    // Getters
    public String getIdentificacao() {
        return identificacao;
    }

    //Métodos extras
    public void entradaDeDados() {
        Scanner entradaDoDado = new Scanner(System.in);
        try {
            System.out.print("\nDigite a Identificação do AVIÃO: ");
            setIdentificacao(entradaDoDado.nextLine());
            super.entradaDeDados();
        } catch (Exception exception) {
            System.out.print("\nAlgo deu errado!");
            System.out.print("\nPor favor, tente novamente teclando 'Enter'.");
            entradaDoDado.nextLine();
        } finally {
        }
    }

    public void imprimir() {
        System.out.print("\nIdentificação do AVIÃO: " + getIdentificacao());
        super.imprimir();
        System.out.print("\nValor do Avião com um Desconto de 8% - R$ " + valorDeDesconto());
    }

    public void cadastrar(String marca, String modelo, String cor, double comprimento, double largura, double preco, String identificacao) {
        super.cadastrar(marca, modelo, cor, comprimento, largura, preco);
        setIdentificacao(identificacao);
    }

    public static double valorDeDesconto() {
        return preco - (preco * desconto);
    }
}
