package _03subclasses;

import java.util.Scanner;
import _02superclasse.MeiosDeLocomocao;

public abstract class Lancha extends MeiosDeLocomocao {

    //atributos exclusivos da classe Lancha
    private String nome;
    private static double desconto = 0.10;
    public Motor motorDaLancha1 = new Motor(); 
    public Motor motorDaLancha2 = new Motor(); 

    // Construtores
    public Lancha() {
    }

    public Lancha(String nome) {
        this.nome = nome;
    }

    public Lancha(double comprimento) {
        super(comprimento);
    }

    public Lancha(String marca, String modelo, String cor, double comprimento, double largura, double preco) {
        super(marca, modelo, cor, comprimento, largura, preco);
    }

    public Lancha(String marca, String modelo, String cor, double comprimento, double largura, double preco, String nome) {
        super(marca, modelo, cor, comprimento, largura, preco);
        this.nome = nome;
    }

    // Métodos de Acesso
    // -----------
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public void entradaDeDados() {
        Scanner entradaDoDado = new Scanner(System.in);
        try {
            System.out.print("\nNome da LANCHA: ");
            setNome(entradaDoDado.nextLine());
            super.entradaDeDados();
        } catch (Exception exception) {
            System.out.print("\nAlgo deu errado!");
            System.out.print("\nPor favor, tente novamente teclando 'Enter'.");
            entradaDoDado.nextLine();
        } finally {
        }
    }

    public void imprimir() {
        System.out.print("\nNome da LANCHA: " + getNome());
        super.imprimir();
        System.out.print("\nValor da Lancha com Desconto de 10% - R$ " + valorDeDesconto() + "\n\n");
    }

    public void cadastrar(String marca, String modelo, String cor, double comprimento, double largura, double preco, String nome) {
        super.cadastrar(marca, modelo, cor, comprimento, largura, preco);
        setNome(nome);
    }

    public static double valorDeDesconto() {
        return preco - (preco * desconto);
    }
}
