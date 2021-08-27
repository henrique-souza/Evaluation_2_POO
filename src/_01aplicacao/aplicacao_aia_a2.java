package _01aplicacao;

import _03subclasses.Aviao;
import _03subclasses.Lancha;
import _03subclasses.Carro;

/* Aluno: Henrique Souza dos Santos. Matricula: 20202101992*/
public class aplicacao_aia_a2 {

    public static void main(String[] args) {
        // criando os objetos da embarcação
        Lancha lancha[] = new Lancha[5];
        Aviao aviao[] = new Aviao[5];
        Carro carro[] = new Carro[5];
        //Laço for para quantidade de Objetos
        for (int i = 0; i < 5; i++) {
            //Chamando os 5 objetos Lancha e seus Motores
            lancha[i] = new Lancha() {
                @Override
                public double ValorDoDesconto() {
                    throw new UnsupportedOperationException("Não suportado.");
                }
            };
            //lancha[i].entradaDeDados();
        }
        for (int i = 0; i < 5; i++) {
            //Chamando os 5 objetos Avião e seus Motores
            aviao[i] = new Aviao() {
                @Override
                public double ValorDoDesconto() {
                    throw new UnsupportedOperationException("Não suportado.");
                }
            };
            //aviao[i].entradaDeDados();
        }

        for (int i = 0; i < 5; i++) {
            //Chamando os 5 objetos Carro e seus Motores
            carro[i] = new Carro() {
                @Override
                public double ValorDoDesconto() {
                    throw new UnsupportedOperationException("Não suportado.");
                }
            };
            //carro[i].entradaDeDados();
        }

        /*Laço for para chamar os dados de todos os Motores e métodos 
        Imprimir dos Objetos*/
        for (int i = 0; i < 5; i++) {
            System.out.println("\n\n");

            //Imprimindo as Lanchas
            lancha[i].imprimir();
            //MotorDaLancha 1
            lancha[i].motorDaLancha1.rpm = 320;
            lancha[i].motorDaLancha1.velocidade = 250;
            lancha[i].motorDaLancha1.peso = 300;
            lancha[i].motorDaLancha1.tipo = "Hidrojato";
            lancha[i].motorDaLancha1.preco = 14845;
            //MotorDaLancha 2
            lancha[i].motorDaLancha2.rpm = 270;
            lancha[i].motorDaLancha2.velocidade = 120;
            lancha[i].motorDaLancha2.peso = 300;
            lancha[i].motorDaLancha2.tipo = "Centro com Eixo";
            lancha[i].motorDaLancha2.preco = 66819;
            //Imprimindo os Motores da Lancha
            lancha[i].motorDaLancha1.imprimir();
            lancha[i].motorDaLancha2.imprimir();

            //Imprimindo os Aviões
            aviao[i].imprimir();
            //MotorDoAviao 1
            aviao[i].motorDoAviao1.rpm = 645;
            aviao[i].motorDoAviao1.velocidade = 2020;
            aviao[i].motorDoAviao1.peso = 5441;
            aviao[i].motorDoAviao1.tipo = "Termojato";
            aviao[i].motorDoAviao1.preco = 564654;
            //MotorDoAviao 2
            aviao[i].motorDoAviao2.rpm = 541;
            aviao[i].motorDoAviao2.velocidade = 8787;
            aviao[i].motorDoAviao2.peso = 1151;
            aviao[i].motorDoAviao2.tipo = "Turbojato";
            aviao[i].motorDoAviao2.preco = 316596;
            //MotorDoAviao 3
            aviao[i].motorDoAviao3.rpm = 465;
            aviao[i].motorDoAviao3.velocidade = 3215;
            aviao[i].motorDoAviao3.peso = 8746;
            aviao[i].motorDoAviao3.tipo = "Foguete";
            aviao[i].motorDoAviao3.preco = 2185498;
            //MotorDoAviao 4
            aviao[i].motorDoAviao4.rpm = 874;
            aviao[i].motorDoAviao4.velocidade = 5849;
            aviao[i].motorDoAviao4.peso = 3189;
            aviao[i].motorDoAviao4.tipo = "Turbofan";
            aviao[i].motorDoAviao4.preco = 9059127;
            //Imprimindo os Motores dos Aviões
            aviao[i].motorDoAviao1.imprimir();
            aviao[i].motorDoAviao2.imprimir();
            aviao[i].motorDoAviao3.imprimir();
            aviao[i].motorDoAviao4.imprimir();

            //Imprimindo os Carros
            carro[i].imprimir();
            //MotorDoCarro 1
            carro[i].motorDoCarro1.rpm = 2654;
            carro[i].motorDoCarro1.velocidade = 471;
            carro[i].motorDoCarro1.peso = 4504;
            carro[i].motorDoCarro1.tipo = "Boxer";
            carro[i].motorDoCarro1.preco = 40954;
            //Imprimindo os Motores do Carro
            carro[i].motorDoCarro1.imprimir();
            System.out.println("\n\n");
        }
    }
}