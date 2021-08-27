package _03subclasses;

import java.util.Scanner;
import _02superclasse.MeiosDeLocomocao;

public abstract class Carro extends MeiosDeLocomocao {

    // atributos exclusivos da classe Carro
    private String placa;
    private static double desconto = 0.15;
    public Motor motorDoCarro1 = new Motor();

    // Construtores
    public Carro() {
    }

    public Carro(String placa) {
        this.placa = placa;
    }

    public Carro(double comprimento) {
        super(comprimento);
    }

    public Carro(String marca, String modelo, String cor, double comprimento, double largura, double preco) {
        super(marca, modelo, cor, comprimento, largura, preco);
    }

    public Carro(String marca, String modelo, String cor, double comprimento, double largura, double preco, String placa) {
        super(marca, modelo, cor, comprimento, largura, preco);
        this.placa = placa;
    }

    //Métodos de Acesso
    //----------------
    // Setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    //Métodos extras
    public void entradaDeDados() {
        Scanner entradaDoDado = new Scanner(System.in);
        try {
            System.out.print("\nDigite o Registro da Placa do CARRO: ");
            setPlaca(entradaDoDado.nextLine());
            super.entradaDeDados();
        } catch (Exception exception) {
            System.out.print("\nAlgo deu errado!");
            System.out.print("\nPor favor, tente novamente teclando 'Enter'.");
            entradaDoDado.nextLine();
        } finally {
        }
    }

    public void imprimir() {
        System.out.print("\nRegistro da Placa do CARRO: " + getPlaca());
        super.imprimir();
        System.out.print("\nValor do Carro com um Desconto de 15% - R$ " + valorDeDesconto());
    }

    public void cadastrar(String marca, String modelo, String cor, double comprimento, double largura, double preco, String placa) {
        super.cadastrar(marca, modelo, cor, comprimento, largura, preco);
        setPlaca(placa);
    }

    public double valorDeDesconto() {
        return preco - (preco * desconto);
    }
}
