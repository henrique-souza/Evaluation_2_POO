package _02superclasse;

import java.util.Scanner;

public abstract class MeiosDeLocomocao {

    // atributos globais das embarcações
    private String marca, modelo, cor;
    private double comprimento, largura;
    public static double preco;

    // construtores globais
    public MeiosDeLocomocao() {
    }

    public MeiosDeLocomocao(String marca) {
        this.marca = marca;
    }

    public MeiosDeLocomocao(double comprimento) {
        this.comprimento = comprimento;
    }

    public MeiosDeLocomocao(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public MeiosDeLocomocao(double comprimento, double largura, double preco) {
        this.comprimento = comprimento;
        this.largura = largura;
        MeiosDeLocomocao.preco = preco;
    }

    public MeiosDeLocomocao(String marca, double comprimento) {
        this.marca = marca;
        this.comprimento = comprimento;
    }

    public MeiosDeLocomocao(String marca, String modelo, String cor,
            double comprimento, double largura, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.comprimento = comprimento;
        this.largura = largura;
        MeiosDeLocomocao.preco = preco;
    }

    public MeiosDeLocomocao(double comprimento, double largura, double preco,
            String marca, String modelo, String cor) {
        this.comprimento = comprimento;
        this.largura = largura;
        MeiosDeLocomocao.preco = preco;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    // Métodos de Acesso
    // Setters
    public void setMarca(String marca) {
        if (!marca.isEmpty()) {
            this.marca = marca;
        }
    }

    public void setModelo(String modelo) {
        if (!modelo.isEmpty()) {
            this.modelo = modelo;
        }
    }

    public void setCor(String cor) {
        if (!cor.isEmpty()) {
            this.cor = cor;
        }
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0) {
            this.comprimento = comprimento;
        }
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        }
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            MeiosDeLocomocao.preco = preco;
        }
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double getPreco() {
        return preco;
    }

    // Métodos extras - Imprimir(), EntradaDeDados() Cadastrar()
    // Método que entra com os dados pelo Teclado
    public void entradaDeDados() {
        Scanner entradaDoDado = new Scanner(System.in);
        try {
            System.out.print("\nDigite a Marca do Meio de Locomoção: ");
            setMarca(entradaDoDado.nextLine());
            System.out.print("\nDigite o Modelo do Meio de Locomoção: ");
            setModelo(entradaDoDado.nextLine());
            System.out.print("\nDigite a Cor do Meio de Locomoção: ");
            setCor(entradaDoDado.nextLine());
            System.out.print("\nDigite o Comprimento do Meio de Locomoção: ");
            setComprimento(Double.parseDouble(entradaDoDado.nextLine()));
            System.out.print("\nDigite a Largura do Meio de Locomoção: ");
            setLargura(Double.parseDouble(entradaDoDado.nextLine()));
            System.out.print("\nDigite o Preço do Meio de Locomocao: ");
            setPreco(Double.parseDouble(entradaDoDado.nextLine()));
        } catch (Exception exception) {
            System.out.print("\nAlgo deu errado!");
            System.out.print("\nPor favor, tente novamente teclando 'Enter'.");
            entradaDoDado.nextLine();
        } finally {
        }
    }

    // Método que cadastra os dados solicitados
    public void cadastrar(String marca, String modelo, String cor,
            double comprimento, double largura, double preco) {
        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setComprimento(comprimento);
        setLargura(largura);
        setPreco(preco);
    }

    // Método para imprimir os resultados
    public void imprimir() {
        System.out.print("\n\nMarca do Meio de Locomoção: " + getMarca());
        System.out.print("\nModelo do Meio de Locomoção: " + getModelo());
        System.out.print("\nCor do Meio de Locomoção: " + getCor());
        System.out.print("\nComprimento do Meio de Locomoção: "
                + getComprimento() + ("metros."));
        System.out.print("\nLargura do Meio de Locomoção: " + getLargura()
                + ("metros"));
        System.out.print("\nPreço do Meio de Locomoção - R$ " + getPreco());
    }

    /*Método abstrato ValorDoDesconto() que nos obriga a setar o desconto dentro
    das subclasses*/
    public abstract double ValorDoDesconto();
}
