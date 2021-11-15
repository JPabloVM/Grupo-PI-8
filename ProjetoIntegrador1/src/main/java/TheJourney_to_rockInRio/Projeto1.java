package TheJourney_to_rockInRio;

import java.util.Random;
import java.util.Scanner;

public class Projeto1 {

    static int pontos = 0;

    public static void main(String[] args) {

        try (Scanner menu = new Scanner(System.in)) {

            int num = 0;//escolha do menu do jogo

            System.out.println("    .___________. __    __   _______           __    ______    __    __  .______      .__   __.  _______ ____    ____    .___________.  ______   \n"
                    + "    |           ||  |  |  | |   ____|         |  |  /  __  \\  |  |  |  | |   _  \\     |  \\ |  | |   ____|\\   \\  /   /    |           | /  __  \\  \n"
                    + "    `---|  |----`|  |__|  | |  |__            |  | |  |  |  | |  |  |  | |  |_)  |    |   \\|  | |  |__    \\   \\/   /     `---|  |----`|  |  |  | \n"
                    + "        |  |     |   __   | |   __|     .--.  |  | |  |  |  | |  |  |  | |      /     |  . `  | |   __|    \\_    _/          |  |     |  |  |  | \n"
                    + "        |  |     |  |  |  | |  |____    |  `--'  | |  `--'  | |  `--'  | |  |\\  \\----.|  |\\   | |  |____     |  |            |  |     |  `--'  | \n"
                    + "        |__|     |__|  |__| |_______|    \\______/   \\______/   \\______/  | _| `._____||__| \\__| |_______|    |__|            |__|      \\______/  \n"
                    + "                                                                                                                                                 \n"
                    + "                             .______        ______     ______  __  ___     __  .__   __.    .______       __    ______   \n"
                    + "                             |   _  \\      /  __  \\   /      ||  |/  /    |  | |  \\ |  |    |   _  \\     |  |  /  __  \\  \n"
                    + "                             |  |_)  |    |  |  |  | |  ,----'|  '  /     |  | |   \\|  |    |  |_)  |    |  | |  |  |  | \n"
                    + "                             |      /     |  |  |  | |  |     |    <      |  | |  . `  |    |      /     |  | |  |  |  | \n"
                    + "                             |  |\\  \\----.|  `--'  | |  `----.|  .  \\     |  | |  |\\   |    |  |\\  \\----.|  | |  `--'  | \n"
                    + "                             | _| `._____| \\______/   \\______||__|\\__\\    |__| |__| \\__|    | _| `._____||__|  \\______/  ");

            System.out.println("Bem-vindo a maior jornada da sua vida, onde você irá batalhar contra outras bandas em busca do maior sonho de qualquer banda de Rock, tocar no Rock-in-rio!");
            while (num != 4 && num != 2) {
                System.out.println("  ESCOLHA UMA OPÇÃO:"
                        + "\n  ================"
                        + "\n  | 1. Instruções |"
                        + "\n  | 2. Jogar      |"
                        + "\n  | 3. Créditos   |"
                        + "\n  | 4. Sair       |"
                        + "\n  ================");
                num = menu.nextInt();

                switch (num) {
                    case 1:
                        System.out.println("The journey to rock in rio é um jogo textual onde você irá trilhar a sua jornada como músico em uma banda de rock."
                                + " O maior desejo do grupo é se tornar uma banda de sucesso e tocar no rock in rio. "
                                + "Para isso você terá que passar por desafios e testes durante o seu jogo, "
                                + "escolhendo música certa para agradar ao público e batalhando contra outras bandas em festivais.");//Escrever instruções
                        break;
                    case 2:
                        jogar();
                        break;
                    case 3:
                        System.out.println("---INTEGRANTES DO GRUPO 8 PARA O PROJETO INTEGRADOR 1º SEMESTRE -----"
                                + "\nIgor"
                                + "\nLucilene"
                                + "\nJoão Pablo"
                                + "\nDouglas"
                                + "\nLeo"
                                + "\nGabriel");
                        break;
                    default:
                        System.out.println("Você saiu do jogo");
                }
            }
        }
    }

    public static void jogar() {
        Scanner jogar = new Scanner(System.in);

        String integrante,
                integrante1 = "Tati",
                integrante2 = "Akira", // INTEGRANTES DA BANDA 1
                integrante3 = "Jeff",
                integrante4 = "Zeca",
                integrante5 = "João";

        System.out.println("\nAgora que você decidiu seguir essa carreira do Rock vamos escolher quem você"
                + "irá levar para o Rock-In-Rio");

        System.out.println("\nPara começar escolha seu personagem e instrumento que vc quer tocar:");

        /*Desafio para escolha do integrante que o usuario quer. usei um (do While) para repetição.
         Se o usuario digitar um dos integrantes listados o laço para e informa o integrante,
         Se digitar qualquer outro nome as opções aparecem denovo, para escolher.*/
        do {
            System.out.println("\nTati  -  Vocalista "
                    + "\nAkira -  Guitarra (Akira é um mestiço japonês que sofreu preconceito durante toda a sua infância,\n"
                    + "enquanto morava em uma pequena cidade do Japão. Ao crescer, decidiu vir\n"
                    + "para o Brasil conhecer a família de sua mãe)"
                    + "\nJeff  -  Baixista (Jefferson, apelido Jeff teve uma infância humilde e devido ao péssimo relacionamento com os pais decidiu morar sozinho aos 18 anos.)"
                    + "\nZeca  -  Baterista (Zeca é proprietário de uma escola de música. Tinha uma vida estável até a morte de seus pais em um acidente.)"
                    + "\nJoão  -  Violão (Tati e órfã e foi criada pela tia.)");

            System.out.println("\n Escolha um integrante:");
            integrante = jogar.nextLine();

            switch (integrante) {
                case "tati":
                    System.out.printf("Você escolheu a %s - vocalista", integrante1);// contar a história de Tati
                    desafio1();
                    return;
                case "akira":
                    System.out.printf("Você escolheu o %s - Guitarrista", integrante2);// contar a história de Akira
                    desafio1();
                    return;
                case "jeff":
                    System.out.printf("Você escolheu o %s - Baixo", integrante3);//contar a história de Jeff
                    desafio1();
                    return;
                case "joão":
                    System.out.printf("Você escolheu o %s - Violão", integrante5);//contar a história de João
                    desafio1();
                    return;
                case "zeca":
                    System.out.printf("Você escolheu o %s - Baterista", integrante4); //contar a história de zeca
                    desafio1();
                    return;
                default:
                    System.out.println("Este integrante não existe! Escolha um integrante, senão é game over");
                    break;
            }// switch

        }/*do*/ while (!integrante.equals(integrante1) || !integrante.equals(integrante2) || !integrante.equals(integrante3) || !integrante.equals(integrante4) || !integrante.equals(integrante5));

    }
// TEM QUE VER COMO QUE USA UMA VARIAVEL DE OUTRO MÉTODO

    public static void desafio1() {

        Scanner input = new Scanner(System.in);

        int banda = 0;// variavel da escolha da banda

        String resposta1;// reposta das perguntas

        System.out.println("\nQUE LEGAL VOCÊ COMEÇA HOJE A SUA CAMINHADA PARA O ROCK IN RIO"
                + "\nMAS PARA ISSO VOCÊ PASSARA POR ALGUNS DEFAFIOS. "
                + "\n\n-------- DESAFIO 01 ESCOLHA DA BANDA -------");

        System.out.println("\n[1] BANDA GUNS N' ROSES"
                + "\n[2] BANDA PARALAMAS"
                + "\n[3] BANDA CPM22" //escrever sobre as bandas
                + "\n[4] BANDA CAPITAL INICIAL"
                + "\n[5] BAMDA RED HOT CHILLI PEPERS"
                + "\n ------- QUAL BANDA VOCÊ ESCOLHE??? -------");
        banda = input.nextInt();

        switch (banda) {
            //ESCOLHA DA BANDA 1
            case 1:
                //PRIMEIRA PERGUNTA DA BANDA 1
                System.out.println("\n\nVocê escolheu Guns N'Roses, parabéns essa banda é muito top"
                        + "\n mas para confirmar a sua entrada na banda você terá que responder algumas perguntas nossas" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\n para você poder entrar, você tera que acertar 3 respostas de 5 perguntas"
                        + "\n---- PERGUNTA 1 -----"
                        + "\n Quem é Gustavo Lima?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("Você errou");
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                //SEGUNDA PERGUNTA DA PRIMEIRA BANDA
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n Quem é Gustavo Lima?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("Você errou");
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                //TERCEIRA PERGUNTA DA PRIMEIRA BANDA

                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n Quem é Gustavo Lima?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("Você errou");
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                //QUARTA PERGUNTA DA PRIMEIRA BANDA
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n Quem é Gustavo Lima?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos = pontos + 1;
                        break;
                    case "c":
                        System.out.println("Você errou");
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                //QUINTA PERGUNTA DA PRIMEIRA BANDA
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\n Quem é Gustavo Lima?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos = pontos + 1;
                        break;
                    case "c":
                        System.out.println("Você errou");
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                if (pontos >= 30) {
                    System.out.println("Você fez: " + pontos + " pontos");
                    System.out.println("PARABÉNS VOCÊ ENTROU PARA BANDA");
                    desafio2();
                    break;
                } else {
                    System.err.println("TENTE DENOVO");
                    desafio1();
                }

            //ESCOLHA DA BANDA 2 - PARALAMAS
            case 2:
                // PRIMEIRA PERGUNTA DA BANDA 2
                System.out.println("\n\nVocê escolheu PARALAMAS, parabéns essa banda é muito top"
                        + "\n mas para confirmar a sua entrada na banda você terá que responder algumas perguntas nossas" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\n para você poder entrar, você tera que acertar 3 respostas de 5 perguntas"
                        + "\n---- PERGUNTA 01 -----"
                        + "\n Quem é Galvão Bueno?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um narradorr"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("PArabéns você acertou");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                // SEGUNDA PERGUNTA DA BANDA 2
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n Quem Neymar?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Você errou");
                        break;
                    case "d":
                        System.out.println("Você errou");
                        break;
                    default:
                }
                // TERCEIRA PERGUNTA DA BANDA 2
                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n Quem é Luciano Huck?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("Você errou");
                        break;
                    default:
                }
                // QUARTA PERGUNTA DA BANDA 2
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n Quem é Danillo Gentili?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        break;
                    case "c":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("Você errou");
                        break;
                    default:
                }
                //QUINTA PERGUNTA DA BANDA 2
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\n Quem é Mrcos Mion?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        break;
                    case "c":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                if (pontos >= 30) {
                    System.out.println("Você fez: " + pontos + " pontos");
                    System.out.println("PARABÉNS VOCÊ ENTROU PARA BANDA");
                    desafio2();
                    break;
                } else {
                    System.err.println("TENTE DENOVO");
                    desafio1();
                }

            //ESCOLHA DA BANDA 3 - CPM22
            case 3:
                //PRIMEIRA PERGUNTA DA BANDA 3
                System.out.println("\n\nVocê escolheu CPM 22, parabéns essa banda é muito top"
                        + "\n mas para confirmar a sua entrada na banda você terá que responder algumas perguntas nossas" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\n para você poder entrar, você tera que acertar 3 respostas de 5 perguntas"
                        + "\n---- PERGUNTA 01 -----"
                        + "\n -----COMPLETE A MÚSICA----"
                        + "\n TOMA VAGABUNDA PIROCADA DE______"
                        + "\n(a) BANDIDO"
                        + "\n(b) VIOLENTA"
                        + "\n(c) SARRADA"
                        + "\n(d) SENTADA");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Você errou");
                        break;
                    default:
                        System.out.println("Você errou");
                }
                // SEGUNDA PERGUNTA DA BANDA 3
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n Em que ano aconteceu o ataque as torres gêmeas?"
                        + "\n(a) 2005"
                        + "\n(b) 2011"
                        + "\n(c) 1998"
                        + "\n(d) 2001");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Você errou");
                        break;
                    case "d":
                        System.out.println("Parabéns você acertou");
                        pontos = pontos + 10;
                        break;
                    default:
                }
                // TERCEIRA PERGUNTA DA BANDA 3
                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n Que seleção foi campeã do mundo de futebol masculino em 2006?"
                        + "\n(a) Brasil"
                        + "\n(b) França"
                        + "\n(c) Italia"
                        + "\n(d) Espanha");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Parabéns você acertou");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("Você errou");
                        break;
                    default:
                }
                // QUARTA PERGUNTA DA BANDA 3
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n Que continente está o Brasil?"
                        + "\n(a) America do sul"
                        + "\n(b) Europa"
                        + "\n(c) America do norte"
                        + "\n(d) Africa");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Parabéns você acertou");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Você errou");
                        break;
                    case "d":
                        System.out.println("Você errou");
                        break;
                    default:
                }
                //QUINTA PERGUNTA DA BANDA 3
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\n Em que ano aconteceu o primeiro caso de covid no Brasil?"
                        + "\n(a) 2019"
                        + "\n(b) 2017"
                        + "\n(c) 2021"
                        + "\n(d) 2020");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Você errou");
                        break;
                    case "d":
                        System.out.println("Parabéns você acertou");
                        pontos = pontos + 10;
                        break;
                    default:
                }
                if (pontos >= 30) {
                    System.out.println("Você fez: " + pontos + " pontos");
                    System.out.println("PARABÉNS VOCÊ ENTROU PARA BANDA");
                    desafio2();
                    break;
                } else {
                    System.err.println("TENTE DENOVO");
                    desafio1();
                }

            // ESCOLHA DA BANDA 4 - CAPITAL INICIAL 
            case 4:
                //  PRIMEIRA PERGUNTA DA BANDA 4
                System.out.println("\n\nVocê escolheu CAPITAL INICIAL, parabéns essa banda é muito top"
                        + "\n mas para confirmar a sua entrada na banda você terá que responder algumas perguntas nossas" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\n para você poder entrar, você tera que acertar 3 respostas de 5 perguntas"
                        + "\n---- PERGUNTA 01 -----"
                        + "\n -----COMPLETE A MÚSICA----"
                        + "\n TOMA VAGABUNDA PIROCADA DE______"
                        + "\n(a) BANDIDO"
                        + "\n(b) VIOLENTA"
                        + "\n(c) SARRADA"
                        + "\n(d) SENTADA");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Você errou");
                        break;
                    default:
                        System.out.println("Você errou");
                }
                // SEGUNDA PERGUNTA DA BANDA 4
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n Em que ano aconteceu o ataque as torres gêmeas?"
                        + "\n(a) 2005"
                        + "\n(b) 2011"
                        + "\n(c) 1998"
                        + "\n(d) 2001");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Você errou");
                        break;
                    case "d":
                        System.out.println("Parabéns você acertou");
                        pontos = pontos + 10;
                        break;
                    default:
                }
                // TERCEIRA PERGUNTA DA BANDA 4
                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n Que seleção foi campeã do mundo de futebol masculino em 2006?"
                        + "\n(a) Brasil"
                        + "\n(b) França"
                        + "\n(c) Italia"
                        + "\n(d) Espanha");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Parabéns você acertou");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("Você errou");
                        break;
                    default:
                }
                // QUARTA PERGUNTA DA BANDA 4
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n Que continente está o Brasil?"
                        + "\n(a) America do sul"
                        + "\n(b) Europa"
                        + "\n(c) America do norte"
                        + "\n(d) Africa");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Parabéns você acertou");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Você errou");
                        break;
                    case "d":
                        System.out.println("Você errou");
                        break;
                    default:
                }
                //QUINTA PERGUNTA DA BANDA 4
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\n Em que ano aconteceu o primeiro caso de covid no Brasil?"
                        + "\n(a) 2019"
                        + "\n(b) 2017"
                        + "\n(c) 2021"
                        + "\n(d) 2020");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Você errou");
                        break;
                    case "d":
                        System.out.println("Parabéns você acertou");
                        pontos = pontos + 10;
                        break;
                    default:
                }
                if (pontos >= 30) {
                    System.out.println("Você fez: " + pontos + " pontos");
                    System.out.println("PARABÉNS VOCÊ ENTROU PARA BANDA");
                    desafio2();
                    break;
                } else {
                    System.err.println("TENTE DENOVO");
                    desafio1();
                }

            //ESCOLHA DA BANDA 5 - RED HOT CHILLI PEPERS
            case 5:
                // PRIMEIRA PERGUNTA DA BANDA 5
                System.out.println("\n\nVocê escolheu RED HOT CHILLI PEPERS, parabéns essa banda é muito top"
                        + "\n mas para confirmar a sua entrada na banda você terá que responder algumas perguntas nossas" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\n para você poder entrar, você tera que acertar 3 respostas de 5 perguntas"
                        + "\n---- PERGUNTA 01 -----"
                        + "\n -----COMPLETE A MÚSICA----"
                        + "\n TOMA VAGABUNDA PIROCADA DE______"
                        + "\n(a) BANDIDO"
                        + "\n(b) VIOLENTA"
                        + "\n(c) SARRADA"
                        + "\n(d) SENTADA");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Você errou");
                        break;
                    default:
                        System.out.println("Você errou");
                }
                // SEGUNDA PERGUNTA DA BANDA 5
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n Quem é Gustavo Lima?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("Você errou");
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                //TERCEIRA PERGUNTA DA BANDA 5
                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n Quem é Gustavo Lima?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("Você errou");
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                //QUARTA PERGUNTA DA PRIMEIRA BANDA
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n Quem é Gustavo Lima?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("Você errou");
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                //QUINTA PERGUNTA DA PRIMEIRA BANDA
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\n Quem é Gustavo Lima?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("Você errou");
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                if (pontos >= 30) {
                    System.out.println("Você fez: " + pontos + " pontos");
                    System.out.println("PARABÉNS VOCÊ ENTROU PARA BANDA");
                    desafio2();
                    break;
                } else {
                    System.err.println("TENTE DENOVO");
                    desafio1();
                }
        }//SWITCH BANDA
    }

    static void desafio2() {

        Scanner desafio2 = new Scanner(System.in);

        System.out.println("\n\nPARABÉNS, VOCÊ ESTÁ INDO MUITO BEM, AGORA VOCÊ ESTÁ EM OUTRO DESAFIO");

        String empresario;
        int cont = 3;

        System.out.println("\n Agora vamos escolher um empresario para seguir conosco nesta caminhada");
        System.out.println("\n [1] Empresario - Carlos"
                + "\n [2] Empresario - José"
                + "\n [3] Empresario - Antonio" // ESCREVER UM PERFIRL PARA CADA EMPRESARIO
                + "\n [4] Empresario Josue");

        for (int i = 1; i <= 4; i++) {
            System.out.println("Escolha o empersario que você acha que a banda está de acordo:");
            pontos = pontos + 10; //SOMA DOS PONTOS
            empresario = desafio2.nextLine();

            if (empresario.equals("Antonio")) {
                System.out.println("Essa escolha é a correta"); //ELABORAR UM TEXTO
                desafio3();
                break;
            } else {
                System.out.println("Este empresario não é o certo");
                System.out.println("Daremos outra oportunidade para você escolher..... Você tem " + cont-- + " chances");
            }
        }

    }

    public static void desafio3() {
        Scanner input = new Scanner(System.in);

        System.out.println("DESAFIO 3");

        System.out.println("Parabéns por escolher o Antônio como seu empresário, ele é um dos melhores nesse ramo e tenho certeza "
                + "que você não vai se arrepender da sua escolha! \n ");
        System.out.println("Alguns dias depois... \n");
        System.out.println("Antonio: Eu tenho uma ótima notícia para vocês! Antes de mais nada, muito obrigado por me dar o "
                + "prívilégio de ser o empresário dessa banda!"
                + "\n Agora vem a boa notícia: eu marquei o primeiro show de vocês,nesse show vocês iram tocar 5 músicas, "
                + "porém prestem muita atenção na hora de escolher a música"
                + "\n porque o público pode não gostar muito da música se for de um estilo muito diferente deles!"
                + "\n Eu tenho as informações do público para que vocês estudem quais músicas escolher. Tô passando uma "
                + "lista contendo : Sexo, idade e gênero de todos que compraram os ingressos e a lista de músicas"
                + "\n =======Lista público========= \n"
                + "\n =======Lista de Músicas ======== \n"); //Criar uma lista que com as infos do público

        System.out.println("Obs: Vocês precisam dar o seu máximo para alegrar esse público, para que assim aumentem suas habilidades "
                + "e pontos para o jogo"
                + "\n Abaixo está os pontos que vão conseguir de acordo com suas escolhas: \n "
                + "\n Caso acerte 4 ou 5 músicas o público ficará feliz e cada personagem recebe 50 pontos de habilidade \n"
                + "\n Caso acerte 2 ou 3 músicas o público ficará indifirente e cada personagem recebe 25 pontos de habilidade. \n"
                + "\n Caso não acerte nenhuma música, ou acerte apenas 1, o público ficará triste e cada personagem perde 25 pontos! \n");

        int pontos = 0;
        int acertos = 0;
        int tentativas = 0;
        
        do {
            System.out.println("Digite o número da música escolhida: ");
            int resposta = input.nextInt();

            while (resposta > 0 && resposta < 11) {
                if (resposta == 1) {
                    System.out.println("O público não gostou dessa música!");
                    tentativas++;
                    break;
                } else if (resposta == 2) {
                    System.out.println("O público amou essa música!");
                    acertos++;
                    tentativas++;
                    break;
                } else if (resposta == 3) {
                    System.out.println("O público gostou essa música!");
                    acertos++;
                    tentativas++;
                    break;
                } else if (resposta == 4) {
                    System.out.println("O público gostou essa música!");
                    acertos++;
                    tentativas++;
                    break;
                } else if (resposta == 5) {
                    System.out.println("O público não gostou essa música!");

                    tentativas++;
                    break;
                } else if (resposta == 6) {
                    System.out.println("O público não gostou essa música!");

                    tentativas++;
                    break;
                } else if (resposta == 7) {
                    System.out.println("O público gostou essa música!");
                    acertos++;
                    tentativas++;
                    break;
                } else if (resposta == 8) {
                    System.out.println("O público não gostou essa música!");

                    tentativas++;
                    break;
                } else if (resposta == 9) {
                    System.out.println("O público gostou essa música!");
                    acertos++;
                    tentativas++;
                    break;
                } else if (resposta == 10) {
                    System.out.println("O público não gostou essa música!");
                    tentativas++;
                    break;
                }
            }

        } while (tentativas < 5);
        System.out.printf("Parabens vc acertou %d músicas", acertos);


        if (acertos == 4 || acertos == 5) {
            System.out.println("O público ficou feliz, sua banda recebeu mais 50 pontos!");
            pontos = pontos + 50;
        } else if (acertos == 2 || acertos == 3) {
            System.out.println("O público ficou indiferente, sua banda recebeu mais 25 pontos!");
            pontos = pontos + 25;
        } else if (acertos == 0 || acertos == 1) {
            System.out.println("O público ficou triste, sua banda perdeu 25 pontos!");
            pontos = pontos - 25;
        }
        desafio4();
    }

    

    static void desafio4() {
        Scanner input = new Scanner(System.in);

        System.out.println("Após o seu primeiro show você ganhou alguns fãs e "
                + "todos eles estão seguindo a banda nas redes sociais,"
                + "por isso seria muito bom para a banda se vocês fizessem um "
                + "vídeo para o YouTube e Instagram falando um pouco sobre como foi o show!");
        System.out.println("Você irá fazer o vídeo? \n Obs: Responda com sim ou não!");
        String resposta = input.nextLine();

        switch (resposta) {
            case "Sim":
                System.out.println("Graças ao vídeo sua banda ganhou mais 5 mil seguidores no Instagram"
                        + "e 2500 inscritos no YouTube.");
                System.out.println("Além disso ainda fomos convidados para um festival que valerá +150 pontos e 3 mil reais!");
                pontos = pontos + 25;

                break;
            case "Não":
                System.out.println("Já que você não fez o vídeo você acabou perdendo 2500 seguidores no Intagram, 1250"
                        + "incritos no YouTube e 50 pontos de poder!");
                System.out.println("Porém por sorte você acabou sendo convidado para um festival que valerá +150 pontos e 3 mil reais!");
                pontos = pontos - 50;
            default:
                System.out.println("Opção inválida!Tente novamente.");
        }

        System.out.println("\n Dois meses depois...");
        System.out.println("Eu: Eai pessoal todos preparados para o festival? Hoje vai ser um grande dia,"
                + "não podemos esquecer que é uma batalha entre bandas, nós precisamos batalhar contra uma mais fraca que nós!"
                + "Por sorte só mais 3 bandas além da nossa, irão batalhar, o restante irá apenas tocar no festival.");
        System.out.println("Antonio abre a porta do camarim: \n Opa, vim avisar que daqui 10 minutos vai começar o festival."
                + "\n Precisamos decidir com qual banda vamos batalhar antes de irmos para o palco. "
                + "\n Consegui um pouco de informações sobre essas bandas, olha aí a lista: "
                + "\n (1)Banda os loucos: infos"
                + "\n (2)Banda metalicos : infos"
                + "\n (3)Banda assasins: infos"); // elaborar uma lista contendo informações da banda, ao ínves de mostrar os pontos dela
        System.out.println("Eai qual com você quer batalhar? "
                + "\n Obs: Digite o número da banda");
        int bandarival = input.nextInt();
        int banda1 = 1, banda2 = 2, banda3 = 3; //definir niveis de poder

        if (bandarival == banda1) {
            System.out.println("Infelizmente você perdeu a batalha! Porque a banda os loucos tinham um poder de 1000!"
                    + " Com isso seu poder diminuiu 50 pontos e você foi desclassificado da batalha.");
            pontos = pontos - 50;

        } else if (bandarival == banda2) {
            System.out.println("Parábens você venceu a batalha!! A banda 2 tinha apenas 150 pontos e você ganhou mais 100 pontos de poder");
            pontos = pontos + 100;
        } else if (bandarival == banda3) {
            System.out.println("Infelizmente você perdeu a batalha! Porque a banda os loucos tinham um poder de 2000!"
                    + "Com isso seu poder diminuiu 50 pontos e você foi desclassificado da batalha.");
        }
        //desafio5();
        desafio7();
    }

    
    //DESAFIO 7    
    public static int vida = 100; //vida da banda
    public static int vidaenemy = 100; //vida do inimigo

    public static Random rand = new Random();

    static void desafio7() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int musica, aleatorio;

        //Danos do inimigo
        int[] dano = new int[5];
        dano[0] = 10;
        dano[1] = 10;
        dano[2] = 20;
        dano[3] = 25;
        dano[4] = 30;
        
        System.out.println("A banda se inscreveu em um festival de batalhas de bandas.\n"
                + "Nesse festival vocês terão que derrotar as outras bandas para poderem ganhar o prêmio.");
        System.out.println("\n---- Batalha entre bandas ---- ");
        //PRIMEIRA BANDA
        do {
            /*System.out.println(vidaenemy);*/
            System.out.println("\n***Desafio contra Região Urbana***");
            System.out.println("Vida da sua banda = " + vida);
            System.out.println("Escolha alguma música");
            System.out.println("1 - Lost time \n2 - What country is this \n3 - Eduardo and Monica \n4 - Western Caboclo ");
            musica = input.nextInt();
            switch (musica) {
                case 1:
                    vidaenemy = vidaenemy - 25;
                    System.out.println("A música foi muito efetiva");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                case 2:
                    vidaenemy = vidaenemy - 20;
                    System.out.println("A música foi boa");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                case 3:
                    vidaenemy = vidaenemy - 20;
                    System.out.println("A música foi boa");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                case 4:
                    vidaenemy = vidaenemy - 10;
                    System.out.println("A música foi fraca");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                default:
                    System.err.println("Valor invalido");
            }
        } while (vidaenemy > 0 && vida > 0 || musica > 4);
        if (vidaenemy <= 0) {
            System.out.println("***Você derrotou a Região Urbana***");
        } else if (vida <= 0) {
            System.out.println("Vida da banda = 0");
            System.out.println("Sua banda foi derrotada\nGAME OVER!!!");
            System.exit(0);
        }

        vida = 100;
        vidaenemy = 100;

        //SEGUNDA BANDA
        do {
            /*System.out.println(vidaenemy);*/
            System.out.println("\n***Desafio contra Capital Final***");
            System.out.println("Vida da sua banda = " + vida);
            System.out.println("Escolha alguma música");
            System.out.println("1 - First mistakes \n2 - Do not look back \n3 - Your way \n4 - Natasha ");
            musica = input.nextInt();
            switch (musica) {
                case 1:
                    vidaenemy = vidaenemy - 20;
                    System.out.println("A música foi boa");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                case 2:
                    vidaenemy = vidaenemy - 10;
                    System.out.println("A música foi fraca");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                case 3:
                    vidaenemy = vidaenemy - 20;
                    System.out.println("A música foi boa");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                case 4:
                    vidaenemy = vidaenemy - 25;
                    System.out.println("A música foi muito efetiva");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                default:
                    System.err.println("Valor invalido");
            }
        } while (vidaenemy > 0 && vida > 0 || musica > 4);
        if (vidaenemy <= 0) {
            System.out.println("***Você derrotou a Capital Final***");
            System.out.println("Sua banda está na final!!");
        } else if (vida <= 0) {
            System.out.println("Vida da banda = 0");
            System.out.println("Sua banda foi derrotada\nGAME OVER!!!");
            System.exit(0);
        }

        vida = 100;
        vidaenemy = 100;

        //TERCEIRA BANDA
        do {
            /*System.out.println(vidaenemy);*/
            System.out.println("\n***Desafio contra Os Titãs***");
            System.out.println("Vida da sua banda = " + vida);
            System.out.println("Escolha alguma música");
            System.out.println("1 - it is necessary to know how to live \n2 - Flowers \n3 - while there is sun \n4 - Epitaph ");
            musica = input.nextInt();
            switch (musica) {
                case 1:
                    vidaenemy = vidaenemy - 10;
                    System.out.println("A música foi fraca");
                    vida = vida - dano[rand.nextInt(5)];
                    musica = 0;
                    break;
                case 2:
                    vidaenemy = vidaenemy - 20;
                    System.out.println("A música foi boa");
                    vida = vida - dano[rand.nextInt(5)];
                    musica = 0;
                    break;
                case 3:
                    vidaenemy = vidaenemy - 25;
                    System.out.println("A música foi muito efetiva");
                    vida = vida - dano[rand.nextInt(5)];
                    musica = 0;
                    break;
                case 4:
                    vidaenemy = vidaenemy - 20;
                    System.out.println("A música foi boa");
                    vida = vida - dano[rand.nextInt(5)];
                    musica = 0;
                    break;
                default:
                    System.err.println("Valor invalido");
            }
        } while (vidaenemy > 0 && vida > 0 || musica > 4);
        if (vidaenemy <= 0) {
            System.out.println("***Você derrotou a Os Titãs***");
        } else if (vida <= 0) {
            System.out.println("Vida da banda = 0");
            System.out.println("Sua banda foi derrotada\nGAME OVER!!!");
            System.exit(0);
        }

        System.out.println("PARABÉNS!!\nSUA BANDA FOI A CAMPEÃ DA BATALHA DE BANDAS");
        //desafio8();
    }
    

    //DESAFIO 8
    static void desafio8() {
        Scanner input = new Scanner(System.in);
        int musica, gostou = 0;
        String ligacao;

        //Oitavo desafio
        System.out.println("Vocês se encontram com um empresário querendo ver uma apresentação sua!");

        do {
            System.out.println("Escolha uma música para apresentar com sua banda.");
            System.out.println("1 - musica\n2 - musica\n3 - musica\n4 - musica");
            musica = input.nextInt();

            if (musica == 4) {
                System.out.println("O empresário gostou da apresentação da banda");
                gostou = 1;
            } else {
                if (musica > 0 && musica <= 3) {
                    System.out.println("A apresentação não impressionou o empresário");
                    System.out.println("O rock in rio ja foi anunciado e vocês não conseguiram participar.\nQuem sabe ano que vem.");
                    break;
                } else {
                    System.err.println("Número inválido\n");
                }

            }
        } while (musica > 4);

        if (gostou == 1) {
            System.out.println("Você recebem uma ligação anonima deseja atender?(S/N)");
            ligacao = input.next();

            if (ligacao.equals("s") || ligacao.equals("S")) {
                System.out.println("Você descobre que a ligação erá do empresário,\ndizendo que consegiu uma vaga no rock in rio para a sua banda!");

            } else {
                System.out.println("O rock in rio ja foi anunciado e vocês não conseguiram participar.\n Quem sabe ano que vem.");
            }

        }
    }
}
