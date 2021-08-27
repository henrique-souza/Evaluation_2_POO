package _03subclasses;

import java.util.Scanner;

public class Motor {

    public int rpm, velocidade;
    public double peso;
    public String tipo;
    public double preco;

    //Métodos Construtores
    public Motor() {
    }

    public Motor(double peso, String tipo) {
        this.peso = peso;
        this.tipo = tipo;
    }

    public Motor(double peso, double preco) {
        this.peso = peso;
        this.preco = preco;
    }

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public Motor(int rpm, int velocidade) {
        this.rpm = rpm;
        this.velocidade = velocidade;
    }

    public Motor(int rpm, int velocidade, double peso, String tipo) {
        this.rpm = rpm;
        this.velocidade = velocidade;
        this.peso = peso;
        this.tipo = tipo;
    }
    public Motor(int rpm, int velocidade, double peso, String tipo, double preco) {
        this.rpm = rpm;
        this.velocidade = velocidade;
        this.peso = peso;
        this.tipo = tipo;
        this.preco = preco;
    }

    //Métodos Getters e Setters
    public int getRPM() {
        return rpm;
    }

    public void setRPM(int rpm) {
        if (rpm > 0) {
            this.rpm = rpm;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade > 0) {
            this.velocidade = velocidade;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (!tipo.isEmpty()) {
            this.tipo = tipo;
        }
    }
    
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public void entradaDeDados() {
        Scanner entradaDoDado = new Scanner(System.in);
        try {
            System.out.print("\nQuanto de Rotação por Minuto o Motor tem? ");
            setRPM(Integer.parseInt(entradaDoDado.nextLine()));
            System.out.print("\nQual a Velocidade do Motor? ");
            setVelocidade(Integer.parseInt(entradaDoDado.nextLine()));
            System.out.print("\nQuanto o Motor pesa? ");
            setPeso(Double.parseDouble(entradaDoDado.nextLine()));
            System.out.print("\nQual do Tipo do Motor? ");
            setTipo(entradaDoDado.nextLine());
            System.out.print("\nDigite o Preço do Motor: ");
            setPreco(Double.parseDouble(entradaDoDado.nextLine()));
        } catch (Exception exception) {
            System.out.print("\nAlgo deu errado!");
            System.out.print("\nPor favor, tente novamente teclando 'Enter'.");
            entradaDoDado.nextLine();
        } finally{
        }
    }

    public void imprimir() {
        System.out.println("\n\nRotações por Minuto do Motor: " + getRPM() + (" RPM"));
        System.out.println("Consumo do Motor: " + getPeso() + (" KWh"));
        System.out.println("Tipo do Motor: " + getTipo());
        System.out.println("Velociade do Motor: " + getVelocidade() + (" Km/h"));
        System.out.println("Preço do Motor - R$ " + getPreco());
    }

    public void cadastrar(int rpm, int velocidade, double peso, String tipo, double preco) {
        this.rpm = rpm;
        this.velocidade = velocidade;
        this.peso = peso;
        this.tipo = tipo;
        this.preco = preco;
    }
}
