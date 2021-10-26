package TheJourney_to_rockInRio;

import java.util.Scanner;

public class Projeto1 {

    int pontos = 0;

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
                        System.out.println("ESCREVER INSTRUÇÕES DO JOGO");//Escrever instruções
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

    static void jogar() {
        Scanner jogar = new Scanner(System.in);

        String integrante,
                integrante1 = "Tati",
                integrante2 = "Akira", // INTEGRANTES DA BANDA 1
                integrante3 = "Jeff",
                integrante4 = "Zeca",
                integrante5 = "João";

        System.out.println("\nSEJA BEM VINDO AO SEU MAIOR DESAFIO, E O COMEÇO DO SEU MAIOR SONHO!!"
                + "\nHOJE VOCÊ COMEÇA A CAMINHADA PARA O GRANDE OBJETIVO, QUE É TOCAR NO ROCK IN RIO");

        System.out.println("\nPara começar escolha seu personagem e instrumento que vc quer tocar:");

        /*Desafio para escolha do integrante que o usuario quer. usei um (do While) para repetição.
         Se o usuario digitar um dos integrantes listados o laço para e informa o integrante,
         Se digitar qualquer outro nome as opções aparecem denovo, para escolher.*/
        do {
            System.out.println("\nTati  -  Vocal"
                    + "\nAkira -  Guitarra"
                    + "\nJeff  -  Baixo"
                    + "\nZeca  -  Baterista"
                    + "\nJoão  -  Violão");

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

    static void desafio1() {

        Scanner d1 = new Scanner(System.in);
        Projeto1 pontos = new Projeto1();//variavel de pontos

        int banda = 0;// variavel da escolha da banda
        // int pontos = 0;//variavel de pontos
        String resposta1;// reposta das perguntas

        System.out.println("\nQUE LEGAL VOCÊ COMEÇA HOJE A SUA CAMINHADA PARA O ROCK IN RIO"
                + "\nMAS PARA ISSO VOCÊ PASSARA POR ALGUNS DEFAFIOS. "
                + "\n\n-------- DESAFIO 01 ESCOLHA DA BANDA -------");

        System.out.println("\n[1] BANDA GUNS ROSES"
                + "\n[2] BANDA PARALAMAS"
                + "\n[3] BANDA CPM22" //escrever sobre as bandas
                + "\n[4] BANDA CAPITAL INICIAL"
                + "\n[5] BAMDA RED HOT CHILLI PEPERS"
                + "\n ------- QUAL BANDA VOCÊ ESCOLHE??? -------");
        banda = d1.nextInt();

        switch (banda) {
            //ESCOLHA DA BANDA 1
            case 1:
                //PRIMEIRA PERGUNTA DA BANDA 1
                System.out.println("\n\nVocê escolheu guns roses, parabéns essa banda é muito top"
                        + "\n mas para confirmar a sua entrada na banda você terá que responder algumas perguntas nossas" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\n para você poder entrar, você tera que acertar 3 respostas de 5 perguntas"
                        + "\n---- PERGUNTA 1 -----"
                        + "\n Quem é Gustavo Lima?"
                        + "\n(a) Ele é um jogador"
                        + "\n(b) Ele é um cantor sertanejo"
                        + "\n(c) Ele é um apresentador"
                        + "\n(d) Ele é um corredor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 1;
                        break;
                    case "c":
                        System.out.println("Você errou");
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                if (pontos.pontos >= 30) {
                    System.out.println("Você fez: " + pontos.pontos + " pontos");
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("PArabéns você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        break;
                    case "c":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        break;
                    case "c":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                if (pontos.pontos >= 30) {
                    System.out.println("Você fez: " + pontos.pontos + " pontos");
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

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
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Parabéns você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Parabéns você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

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
                        pontos.pontos = pontos.pontos + 10;
                        break;
                    default:
                }
                if (pontos.pontos >= 30) {
                    System.out.println("Você fez: " + pontos.pontos + " pontos");
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

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
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você errou");
                        break;
                    case "c":
                        System.out.println("Parabéns você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Parabéns você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

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
                        pontos.pontos = pontos.pontos + 10;
                        break;
                    default:
                }
                if (pontos.pontos >= 30) {
                    System.out.println("Você fez: " + pontos.pontos + " pontos");
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
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
                resposta1 = d1.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("Você errou");
                        break;
                    case "b":
                        System.out.println("Você acertou");
                        pontos.pontos = pontos.pontos + 10;
                        break;
                    case "c":
                        System.out.println("Você errou");
                    case "d":
                        System.out.println("Você errou");
                    default:
                }
                if (pontos.pontos >= 30) {
                    System.out.println("Você fez: " + pontos.pontos + " pontos");
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
        Projeto1 pontos = new Projeto1();
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
            pontos.pontos = pontos.pontos + 10; //SOMA DOS PONTOS
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

    static void desafio3() {
        System.out.println("DESAFIO 3");
    }
}
