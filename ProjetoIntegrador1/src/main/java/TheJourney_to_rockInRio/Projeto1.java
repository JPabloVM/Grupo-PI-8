package TheJourney_to_rockInRio;

import java.util.Random;
import java.util.Scanner;

public class Projeto1 {

    static int pontos = 0;
    static String banda; //varialvel da banda que o user escolheu
    //DESAFIO 7    
    static int vida = 100; //vida da banda
    static int vidaenemy = 100; //vida do inimigo

    static Random rand = new Random();

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

            System.out.println("Bem-vindo a maior jornada da sua vida, onde voc?? ir?? batalhar contra outras bandas em busca do maior sonho de qualquer banda de Rock, tocar no Rock-in-rio!");
            while (num != 4 && num != 2) {
                System.out.println("  ESCOLHA UMA OP????O:"
                        + "\n  ================"
                        + "\n  | 1. Instru????es |"
                        + "\n  | 2. Jogar      |"
                        + "\n  | 3. Cr??ditos   |"
                        + "\n  | 4. Sair       |"
                        + "\n  ================");
                num = menu.nextInt();

                switch (num) {
                    case 1:
                        System.out.println("The Journey to Rock In Rio ?? um jogo textual onde voc?? ir?? trilhar a sua jornada como m??sico em uma banda de rock."
                                + "\nO maior desejo do grupo ?? se tornar uma banda de sucesso e tocar no Rock In Rio. "
                                + "\nPara isso voc?? ter?? que passar por desafios e testes durante o seu jogo, "
                                + "\nescolhendo m??sica certa para agradar ao p??blico e batalhando contra outras bandas em festivais.\n");//Escrever instru????es
                        break;
                    case 2:
                        jogar();

                        break;
                    case 3:
                        System.out.println("---INTEGRANTES DO GRUPO 8 PARA O PROJETO INTEGRADOR 1?? SEMESTRE -----"
                                + "\nIgor Oliveira"
                                + "\nJo??o Pablo Vilanir de Melo"
                                + "\nDouglas Alves Angelo"
                                + "\nLeonardo Sousa Pereira"
                                + "\nGabriel Albuquerque");
                        break;
                    default:
                        System.out.println("Voc?? saiu do jogo");
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
                integrante5 = "Jo??o";

        System.out.println("\nAgora que voc?? decidiu seguir essa carreira do Rock vamos escolher quem voc??"
                + "ir?? levar para o Rock-In-Rio");

        System.out.println("\nPara come??ar escolha seu personagem e instrumento que vc quer tocar:");

        /*Desafio para escolha do integrante que o usuario quer. usei um (do While) para repeti????o.
         Se o usuario digitar um dos integrantes listados o la??o para e informa o integrante,
         Se digitar qualquer outro nome as op????es aparecem denovo, para escolher.*/
        do {
            System.out.println(
                    "\nTati - Vocal (Desde pequena sempre gostou de m??sica, e sempre mostrou que era uma meninda diferenciada. Logo come??ou a cantar, e todos em sua volta "
                    + "\n              que ela tinha uma voz incrivel e que bem lapidado esse diamante ia logo surgi no mundo musical. Come??ou cantando na igreja, mas logo surgiu o gosto"
                    + "\n              pelo estilo musical voltado mais ao rock. Depois de tantas idas e vindas ela quer uma chance para conseguir realizar um sonho que vem aumentando aos anos."
                    + "\n\nAkira - Guitarra (Na adolesc??ncia, surgiu um grande desejo de aprender a tocar um instrumento musical, logo se encantou pela guitarra. Estudou muito, ficava noites viradas"
                    + "\n                  para aprender a tocar logo. Hoje ele est?? muito experiente, e sabe tocar como poucos, um dos melhores guitarristas do Brasil."
                    + "\n\nJefferson - Baixo (Mas conhecido como Jeff, demorou um pouco para entrar no ramo musical. A paix??o dele por m??sica fez com que ele desse uma "
                    + "\n                   oportunidade para si mesmo, em aprender a tocar algo. Seu interesse pelo baixo, foi um pouco estranhado pelo seus amigos, "
                    + "\n                   mas mesmo assim o apoiaram a seguir esse caminho.Hoje ele quer uma oportunidade de conseguir realizar um sonho que qualquer artista deseja)"
                    + "\n\nZeca - Bateria (Os vizinhos n??o eram muitos f??s de Zeca, pois sempre ficava toacndo sua bateria dentro de casa, e o barulho era ensurdecedor. "
                    + "\n                Seus pais ent??o reclamavam muito, at?? que decidiram comprar uima bateria profissional e apoia-lo nesta caminhada. "
                    + "\n                Dava pra ver que Zeca era diferenciado, sempre tocando nas igrejas da cidade,e em eventos, e todos diziam que o sucesso dele estava muito pr??ximo.)"
                    + "\n\nJo??o - Viol??o (Sempre carregando seu viol??o nas costas, ia pra escola, e usava o viol??o como uma forma de conquistar as meninas, tocava e cantava "
                    + "\n               para todos na sala, se tivesse aula vaga, j?? sabia que teria que ver jo??o tocando e muitas das vezes ainda tirava onda na voz tamb??m. "
                    + "\n               Hoje ele quer conquistar algo maior, e ser reconhecido nacionalmente, e quem sabe at?? mundialmente");
            System.out.println("");

            System.out.println("\n Escolha um integrante que voc?? mais gostou e que deseja que o sonho dele(a) seja realizado:");
            integrante = jogar.nextLine();

            switch (integrante) {
                case "Tati":
                case "tati":
                    System.out.printf("Voc?? escolheu a %s - vocalista", integrante1);// contar a hist??ria de Tati
                    desafio1();
                    return;
                case "Akira":
                case "akira":
                    System.out.printf("Voc?? escolheu o %s - Guitarrista", integrante2);// contar a hist??ria de Akira
                    desafio1();
                    return;
                case "Jeff":
                case "jeff":
                    System.out.printf("Voc?? escolheu o %s - Baixo", integrante3);//contar a hist??ria de Jeff
                    desafio1();
                    return;
                case "Jo??o":
                case "joao":
                case "jo??o":
                    System.out.printf("Voc?? escolheu o %s - Viol??o", integrante5);//contar a hist??ria de Jo??o
                    desafio1();
                    return;
                case "Zeca":
                case "zeca":
                    System.out.printf("Voc?? escolheu o %s - Baterista", integrante4); //contar a hist??ria de zeca
                    desafio1();
                    return;
                default:
                    System.out.println("Este integrante n??o existe! Escolha um integrante, sen??o ?? game over");
                    break;
            }// switch

        }/*do*/ while (!integrante.equals(integrante1) || !integrante.equals(integrante2) || !integrante.equals(integrante3) || !integrante.equals(integrante4) || !integrante.equals(integrante5));

    }
// TEM QUE VER COMO QUE USA UMA VARIAVEL DE OUTRO M??TODO

    public static void desafio1() {

        Scanner input = new Scanner(System.in);

        //int escolhaBanda = 0;// variavel da escolha da banda
        String resposta1;// reposta das perguntas

        System.out.println("\n\nQUE LEGAL!!! VOC?? COME??A HOJE A SUA CAMINHADA PARA O ROCK IN RIO."
                + "\nMAS PARA ISSO ACONTECER, VOC?? PASSARA POR ALGUNS DESAFIOS."
                + "\nDESAFIOS ESTES QUE TESTARA SE VOC?? EST?? PRONTO PARA ESTA JORNADA."
                + "\nPRIMEIRO UMA ESCOLHA SIMPLES."
                + "\n\n-------- PRIMEIRO DESAFIO ?? ESOLHAR UMA BANDA PARA VOC?? ENTRAR -------");

        System.out.println("\n[1]BANDA The Last Wish"
                + "\n[2] BANDA Garage Singer"
                + "\n[3] BANDA Cheerful Dogs" //escrever sobre as bandas
                + "\n[4] BANDA SoulFolk"
                + "\n[5] BANDA Secretus"
                + "\n ------- DIGITE O NOME DA BANDA QUE VOC?? DESEJA SEGUIR NESTA CAMINHADA -------");
        banda = input.nextLine();

        switch (banda) {
            //ESCOLHA DA BANDA 1 - the last wish
            case "the last wish":
                //PRIMEIRA PERGUNTA DA BANDA 1
                System.out.printf("Voc?? escolheu %s, muito bem, bela escolha."
                        + "\nAgora vamos para mais uma etapa:"
                        + "\n\nPara confirmar a sua entrada na banda, os integrantes decidiram realizar algumas perguntas para voc??, para saber" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\ncomo est?? o seu conhecimento. "
                        + "\nvoc?? s?? vai poder entrar, se acertar 3 respostas de 5 perguntas. cada pergunta valendo 10 pontos. Precisa de apenas 30."
                        + "FACIL N??? ENT??O LET'S GO!!!!", banda);

                System.out.println("\n\n---- PERGUNTA 1 -----"
                        + "\n\n-> POR QUE NO ROCK IN RIO TOCA OUTROS RITMOS??"
                        + "\n(a) As bandas est??o menos interessadas"
                        + "\n(b) O p??blico que curte rock j?? n??o contemplava toda a enormidade do evento." //resposta certa
                        + "\n(c) Os empres??rios entedem que o mercado ta diferente"
                        + "\n(d) Marcas junto com as bandas for??aram que todos estilos fossem tocados");

                System.out.println("ESCOLHA A RESPOSTA CERTA:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                //SEGUNDA PERGUNTA DA PRIMEIRA BANDA
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n QAUL O DISCO DE ROCK MAIS VENDIDO AT?? HOJE?"
                        + "\n(a) Rumours ??? Fleetwood Mac"
                        + "\n(b) The Dark Side of the Moon ??? Pink Floyd"
                        + "\n(c) Back In Black, da banda AC/DC." //resposta certa
                        + "\n(d) Thriller ??? Michael Jackson ");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                //TERCEIRA PERGUNTA DA PRIMEIRA BANDA

                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n QUAIS S??O OS INTEGRANTES ORIGINAIS DA BANDA BEATLES?"
                        + "\n(a) Jim Morrison, Paul McCartney ,George Harrison, John Lennon e Stu Sutcliffe"
                        + "\n(b) John Lennon, Paul McCartney, George Harrison, Stu Sutcliffe e Peter Best" //resposta certa
                        + "\n(c) Ringo Starr, Paul McCartney, Peter Best, Bono Vox e Mick Jagger"
                        + "\n(d) John Lennon, Jimmy Page, Paul McCartney, Stu Sutcliffe e George Harrison");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                //QUARTA PERGUNTA DA PRIMEIRA BANDA
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n OZZY OSBOURNE, EM UM SHOW, MORDEU A CABE??A DE UM ANIMAL. QUE ANIMAL ERA ESSE?"
                        + "\n(a) Ornitorrinco"
                        + "\n(b) Rato"
                        + "\n(c) Pombo"
                        + "\n(d) Morcego");//resposta certa

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                //QUINTA PERGUNTA DA PRIMEIRA BANDA
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\n BRUCE DICKISON, VOCALISTA DO IRON MAIDEN, TEM OUTRAS PROFISS??ES."
                        + "\n QUAL DAS ALTERNATIVAS A SEGUIR ?? A QUE CONT??M 5 PROFISS??ES DELE?"
                        + "\n(a) Piloto de avi??o, esgrimista, tenor, historiador e roteirista"//resposta certa
                        + "\n(b) Servente, engenheiro, arquiteto, mec??nico e professor"
                        + "\n(c) M??dico, bi??logo, dentista, advogado e juiz"
                        + "\n(d) Astronauta, cientista, lutador, ator e pastor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                if (pontos >= 30) {
                    System.out.println("Voc?? fez: " + pontos + " pontos");
                    System.out.println("PARAB??NS VOC?? CONSEGUIU ENTRAR PARA BANDA.");
                    desafio2();
                    break;
                } else {
                    System.err.println("\nIH.... N??O FOI DESTA VEZ HEIN...."
                            + "\nTE DAREMOS MAS OUTRA OPORTUNIDADE, VE SE N??O DESPERDI??A.");
                    desafio1();
                }

            //ESCOLHA DA BANDA 2 - garage singer
            case "garage singer":
                // PRIMEIRA PERGUNTA DA BANDA 2
                System.out.printf("Voc?? escolheu %s, muito bem, bela escolha."
                        + "\nAgora vamos para mais uma etapa:"
                        + "\n\nPara confirmar a sua entrada na banda, os integrantes decidiram realizar algumas perguntas para voc??, para saber" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\ncomo est?? o seu conhecimento. "
                        + "\nvoc?? s?? vai poder entrar, se acertar 3 respostas de 5 perguntas. cada pergunta valendo 10 pontos. Precisa de apenas 30."
                        + "FACIL N??? ENT??O LET'S GO!!!!", banda);

                System.out.println("\n\n---- PERGUNTA 01 -----"
                        + "\n AP??S A MORTE DE KURT COBAIN, EM 1994, DAVE GROHL FORMOU UMA BANDA EM 1995. QUE BANDA ?? ESSA?"
                        + "\n(a) Kung Fu Fighter's"
                        + "\n(b) Dave Grohl Project"
                        + "\n(c) Foo Fighters"//resposta certa
                        + "\n(d) Nirvana");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                // SEGUNDA PERGUNTA DA BANDA 2
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n QUEM REVOLUCIONOU O MUNDO DO ROCK COM UM GESTO?"
                        + "\n(a) Ronnie James Dio"//resposta certa
                        + "\n(b) Paul McCartney"
                        + "\n(c) Jimmy Page"
                        + "\n(d) Freddie Mercury");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                // TERCEIRA PERGUNTA DA BANDA 2
                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n QUAL INTEGRANTE DO AC/DC SAIU DA BANDA E MONTOU UMA ESCOLA DE HELICOPTEROS NA NOVA ZEL??NDIA EM 1983?"
                        + "\n(a) Bon Scott"
                        + "\n(b) Brian Johnson"
                        + "\n(c) Phil Rudd"//resposta certa
                        + "\n(d) Cliff Williams");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                // QUARTA PERGUNTA DA BANDA 2
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n O QUE LEMMY KILMISTER FAZIA ANTES DE FUNDAR MOTORHEAD?"
                        + "\n(a) Ele era baixista dos Rolling Stones"
                        + "\n(b) Ele era vocalista do Led Zeppelin"
                        + "\n(c) Ele era baterista do Black Sabbath"
                        + "\n(d) Ele era Roadie do Jimi Hendrix");//resposta certa

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                //QUINTA PERGUNTA DA BANDA 2
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\n QUAL ??LBUM DO PINK FLOYD FOI CONSIDERADO O SEGUNDO MELHOR DE TODOS OS TEMPOS?"
                        + "\n(a) The Wall"
                        + "\n(b) Animals"
                        + "\n(c) Dark Side of the Moon" //resposta certa
                        + "\n(d) Wish You Were Here");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                if (pontos >= 30) {
                    System.out.println("Voc?? fez: " + pontos + " pontos");
                    System.out.println("PARAB??NS VOC?? CONSEGUIU ENTRAR PARA BANDA.");
                    desafio2();
                    break;
                } else {
                    System.err.println("\nIH.... N??O FOI DESTA VEZ HEIN...."
                            + "\nTE DAREMOS MAS OUTRA OPORTUNIDADE, VE SE N??O DESPERDI??A.");
                    desafio1();
                }

            //ESCOLHA DA BANDA 3 - cheerful dogs
            case "cheerful dogs":
                //PRIMEIRA PERGUNTA DA BANDA 3
                System.out.printf("Voc?? escolheu %s, muito bem, bela escolha."
                        + "\nAgora vamos para mais uma etapa:"
                        + "\n\nPara confirmar a sua entrada na banda, os integrantes decidiram realizar algumas perguntas para voc??, para saber" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\ncomo est?? o seu conhecimento. "
                        + "\nvoc?? s?? vai poder entrar, se acertar 3 respostas de 5 perguntas. cada pergunta valendo 10 pontos. Precisa de apenas 30."
                        + "FACIL N??? ENT??O LET'S GO!!!!", banda);

                System.out.println("\n\n---- PERGUNTA 01 -----"
                        + "\n M. SHADOWS ?? VOCALSITA DE QUAL BANDA?"
                        + "\n(a) Avenged Sevenfold"//resposta certa
                        + "\n(b) Guns N' Roses"
                        + "\n(c) Angra"
                        + "\n(d) Ramones");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                // SEGUNDA PERGUNTA DA BANDA 3
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n MARK HOPPUS ?? VOCALISTA DE QUAL BANDA?"
                        + "\n(a) Pink Floyd"
                        + "\n(b) Green Day"
                        + "\n(c) The Beatles"
                        + "\n(d) Blink-182");//resposta certa

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                // TERCEIRA PERGUNTA DA BANDA 3
                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n CHESTER BENNINGTON ?? VOCALISTA DE QUAL BANDA?"
                        + "\n(a) Motorhead"
                        + "\n(b) Aerosmith"
                        + "\n(c) Linkin Park"//resposta certa
                        + "\n(d) Alice In Chains");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                // QUARTA PERGUNTA DA BANDA 3
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n SERJ TANKIAN ?? VOCALISTA DE QUAL BANDA?"
                        + "\n(a) System Of a Down"//resposta certa
                        + "\n(b) Slipknot"
                        + "\n(c) Foo Fighters"
                        + "\n(d) Led Zeppelin");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                //QUINTA PERGUNTA DA BANDA 3
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\n ANTHONY KIEDIS ?? VOCALISTA DE QUAL BANDA?"
                        + "\n(a) AC/DC"
                        + "\n(b) DragonForce"
                        + "\n(c) Kiss"
                        + "\n(d) Red Hot Chili Peppers");//resposta certa

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                if (pontos >= 30) {
                    System.out.println("Voc?? fez: " + pontos + " pontos");
                    System.out.println("PARAB??NS VOC?? CONSEGUIU ENTRAR PARA BANDA.");
                    desafio2();
                    break;
                } else {
                    System.err.println("\nIH.... N??O FOI DESTA VEZ HEIN...."
                            + "\nTE DAREMOS MAS OUTRA OPORTUNIDADE, VE SE N??O DESPERDI??A.");
                    desafio1();
                }

            // ESCOLHA DA BANDA 4 - soulfolk
            case "soulfolk":
                //  PRIMEIRA PERGUNTA DA BANDA 4
                System.out.printf("Voc?? escolheu %s, muito bem, bela escolha."
                        + "\nAgora vamos para mais uma etapa:"
                        + "\n\nPara confirmar a sua entrada na banda, os integrantes decidiram realizar algumas perguntas para voc??, para saber" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\ncomo est?? o seu conhecimento. "
                        + "\nvoc?? s?? vai poder entrar, se acertar 3 respostas de 5 perguntas. cada pergunta valendo 10 pontos. Precisa de apenas 30."
                        + "FACIL N??? ENT??O LET'S GO!!!!", banda);

                System.out.println("\n\n---- PERGUNTA 01 -----"
                        + "\n QUAL BANDA AMERICANA TAMB??M ?? CONHECIDA COMO THE BAD BOYS FROM BOSTON?"
                        + "\n(a) Aerosmith"//resposta certa
                        + "\n(b) Coldplay"
                        + "\n(c) Journey"
                        + "\n(d) Avenged Sevenfold");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                // SEGUNDA PERGUNTA DA BANDA 4
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n L??DER QUE EST?? NA MEM??RIA, QUE PARTICIPOU DA BANDA LEGI??O URBANA?"
                        + "\n(a) Renato Rocha"
                        + "\n(b) Raul Seixas"
                        + "\n(c) Samuel Rosa"
                        + "\n(d) Renato Russo");//resposta certa

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                // TERCEIRA PERGUNTA DA BANDA 4
                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n QUAL BANDA TEVE APENAS UM POUCO MAIS DE 7 MESES DE SUCESSO?"
                        + "\n(a) Paralamas do sucesso"
                        + "\n(b) Legi??o urbana"
                        + "\n(c) Mamonas assassinas"//resposta certa
                        + "\n(d) Nirvana");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                // QUARTA PERGUNTA DA BANDA 4
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n QUAL BANDA NORTE AMERICANA TAMB??M CONHECIDA COMO A7X?"
                        + "\n(a) Avenged Sevenfold"//resposta certa
                        + "\n(b) The animals"
                        + "\n(c) Led Zeppelin"
                        + "\n(d) Rush");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                //QUINTA PERGUNTA DA BANDA 4
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\n QUAL O QUARTETO SAGRADO DO ROCK BRASILEIRO?"
                        + "\n(a) Skank, Legi??o Urbana, Capital inicial, Bar??o vermelho"
                        + "\n(b) Tit??s, Paralamas do sucesso, TNT, Mamonas assassinas"
                        + "\n(c) Legi??o Urbana, Bar??o vermelho, Mamonas assassinas, Tit??s"
                        + "\n(d) Legi??o urbana, Tit??s, Bar??o Vermelho, Paralamas do sucesso");//resposta certa

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                if (pontos >= 30) {
                    System.out.println("Voc?? fez: " + pontos + " pontos");
                    System.out.println("PARAB??NS VOC?? CONSEGUIU ENTRAR PARA BANDA.");
                    desafio2();
                    break;
                } else {
                    System.err.println("\nIH.... N??O FOI DESTA VEZ HEIN...."
                            + "\nTE DAREMOS MAS OUTRA OPORTUNIDADE, VE SE N??O DESPERDI??A.");
                    desafio1();
                }

            //ESCOLHA DA BANDA 5 - secretus
            case "secretus":
                // PRIMEIRA PERGUNTA DA BANDA 5
                System.out.printf("Voc?? escolheu %s, muito bem, bela escolha."
                        + "\nAgora vamos para mais uma etapa:"
                        + "\n\nPara confirmar a sua entrada na banda, os integrantes decidiram realizar algumas perguntas para voc??, para saber" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\ncomo est?? o seu conhecimento. "
                        + "\nvoc?? s?? vai poder entrar, se acertar 3 respostas de 5 perguntas. cada pergunta valendo 10 pontos. Precisa de apenas 30."
                        + "FACIL N??? ENT??O LET'S GO!!!!", banda);

                System.out.println("\n\n---- PERGUNTA 01 -----"
                        + "\n QUAL O NOME VERDADEIRO DO VOCALISTA AXL ROSES?"
                        + "\n(a) William Bailey"//resposta certa
                        + "\n(b) Waters Rose"
                        + "\n(c) Rose Waters"
                        + "\n(d) William Marrys");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                // SEGUNDA PERGUNTA DA BANDA 5
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n QUAL BANDA CUJA FAIXA DE ABERTURA CHAMADA SWEET LEAF ?? INTRODUZIDA COM UMA TOSSE?"
                        + "\n(a) Nazareth"
                        + "\n(b) Black Sabbath"//resposta certa
                        + "\n(c) The Beatles"
                        + "\n(d) Oasis");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                //TERCEIRA PERGUNTA DA BANDA 5
                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n QUAL BANDA TEM SEUS INTEGRANTES MASCARADOS?"
                        + "\n(a) Evanescence"
                        + "\n(b) Bon Jovi"
                        + "\n(c) Metallica"
                        + "\n(d) Slipknot");//resposta certa

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                //QUARTA PERGUNTA DA BANDA 5
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n A M??SICA YESTARDAY PERTENCE A QUAL BANDA?"
                        + "\n(a) Lamb of god"
                        + "\n(b) Queens"
                        + "\n(c) The Beatles"//resposta certa
                        + "\n(d) Kiss");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                //QUINTA PERGUNTA DA banda 5
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\nELA PULOU DA JANELA DO QUINTO ANDAR... ?? UM TRECHO DE QUAL M??SICA E DE QUAL BANDA?"
                        + "\n(a) Pais e Filhos do Restart"
                        + "\n(b) Pais e Filhos do Legi??o Urbana"//resposta certa
                        + "\n(c) Sangue Frio do Oficina G3"
                        + "\n(d) Filhos e Pais do Nx Zero");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("ESSA RESPOSTA EST??....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOC?? ERROU!!! :(");
                        break;
                }
                if (pontos >= 30) {
                    System.out.println("Voc?? fez: " + pontos + " pontos");
                    System.out.println("PARAB??NS VOC?? CONSEGUIU ENTRAR PARA BANDA.");
                    desafio2();
                    break;
                } else {
                    System.err.println("\nIH.... N??O FOI DESTA VEZ HEIN...."
                            + "\nTE DAREMOS MAS OUTRA OPORTUNIDADE, VE SE N??O DESPERDI??A.");
                    desafio1();
                }
        }//SWITCH BANDA
    }

    //DESAFIO 2
    static void desafio2() {

        Scanner desafio2 = new Scanner(System.in);

        System.out.println("\n\nA banda est?? muito feliz por voc?? ter conseguido entrar. Voc?? se junta a outros integrantes"
                + "\npara buscar um sonho que todos tem. A caminhada vai ser grande....BOA SORTE!!!");

        String empresario;
        int cont = 3;

        System.out.println("\n\n Agora que voc?? ta dentro, vamos escolher um empres??rio para nos ajudar, nesta caminhada."
                + "\nTem que ser um empres??rio muito bom, e que esteja na mesma sintonia que a banda. "
                + "\nQue com ele, n??s s?? vamos nos fortalecer."
                + "\nA banda j?? decidiu quem ser?? o empres??rio, mas sem te consultar, pois decidiram fazer mais um desafio"
                + "\npara voc??, pra confirmar se voc?? esta na mesma vibe que todos. Te daremos 3 chances, para acertar."
                + "\nSe errar, sinto muito mas voc?? ser?? expulso da banda e esta grande oportunidade acaba para voc??"
                + "\n\n ESTES S??O OS EMPRES??RIOS ????????? ");
        System.out.println("\n\n [1] Empres??rio - Carlos (Um dos gigantes da m??sica, ?? conhecido por transformar em ouro tudo que toca."
                + "\n                          Estamos falando de um dos maiores empresarios do Brasil, lan??ou nada menos que "
                + "\n                          mamonas assasinas para o cen??rio musical brasileiro.."
                + "\n\n [2] Empres??rio - Jos?? (T?? fazendo muito sucesso no meio dos sertanejos, lan??ou muitas duplas de renome, Jorge e Matheus,"
                + "\n                        Matheus e Kauan, Z?? neto e Cristiano, entre outros... Neste ano ele decidiu mudar de estilo musical"
                + "\n                        Hoje ele busca alguma banda para fazer sucesso. Segundo as m??s linguas, tem que ficar esperto com ele,"
                + "\n                        em rela????o a dinheiro."
                + "\n\n [3] Empres??rio - Antonio(?? um empres??rio e produtor musical brasileiro, respons??vel pela funda????o da Som Livre "
                + "\n                          gravadora das Organiza????es Globo. Pai do cantor e compositor Cazuza, foi respons??vel pelo "
                + "\n                          surgimento de v??rios artistas de renome no cen??rio da m??sica popular brasileira." // ESCREVER UM PERFIRL PARA CADA EMPRESARIO
                + "\n\n [4] Empres??ria Claudia (Empres??ria, compositora, arranjadora, multi-instrumentista e produtora musical brasileira, "
                + "\n                         ?? uma das mais consagradas nomes da produ????o musical do cen??rio art??stico do Brasil.");

        for (int i = 1; i <= 4; i++) {
            System.out.println("\n\n----- Escolha o empersario que voc?? acha que a banda est?? de acordo -----");
            pontos = pontos + 10; //SOMA DOS PONTOS
            empresario = desafio2.nextLine();

            if (empresario.equals("Antonio")) {
                System.out.println("\nAEEEE.... VOC?? ACERTOU....PARAB??NS...SABIAMOS QUE VOC?? N??O IA NOS DESAPONTAR :)"); //ELABORAR UM TEXTO
                System.out.println("pontos " + pontos);
                desafio3();
                break;
            } else {
                System.out.println("\nPOXA...JURAVA QUE VOC?? IA ACERTAR DE PRIMEIRA :(");
                System.out.println("..... VOC?? TEM " + cont-- + " CHANCES....");
            }
        }

    }

    public static void desafio3() {
        Scanner input = new Scanner(System.in);

        System.out.println("DESAFIO 3");

        System.out.println("Parab??ns por escolher o Ant??nio como seu empres??rio, ele ?? um dos melhores nesse ramo e tenho certeza "
                + "que voc?? n??o vai se arrepender da sua escolha! \n ");
        System.out.println("Alguns dias depois... \n");
        System.out.println("Antonio: Eu tenho uma ??tima not??cia para voc??s! Antes de mais nada, muito obrigado por me dar o "
                + "pr??vil??gio de ser o empres??rio dessa banda!"
                + "\n Agora vem a boa not??cia: eu marquei o primeiro show de voc??s,nele voc??s v??o tocar 5 m??sicas, "
                + "por??m prestem muita aten????o na hora de escolher a m??sica,"
                + "\n porque o p??blico pode n??o gostar muito da m??sica se for de um estilo muito diferente deles!");

        System.out.println("Obs: Voc??s precisam dar o seu m??ximo para alegrar esse p??blico, para conseguir aumentar suas habilidades "
                + "e pontos para o jogo"
                + "\n Abaixo est?? os pontos que v??o conseguir de acordo com suas escolhas: \n "
                + "\n Caso acerte 4 ou 5 m??sicas o p??blico ficar?? feliz e cada personagem recebe 50 pontos de habilidade \n"
                + "\n Caso acerte 2 ou 3 m??sicas o p??blico ficar?? indifirente e cada personagem recebe 25 pontos de habilidade. \n"
                + "\n Caso n??o acerte nenhuma m??sica, ou acerte apenas 1, o p??blico ficar?? triste e cada personagem perde 25 pontos! \n");

        System.out.println("\n Eu tenho as informa????es do p??blico para que voc??s estudem quais m??sicas escolher. T?? passando uma "
                + "lista contendo o gen??ro e idade de todos que compraram os ingressos e tamb??m a lista de m??sicas");

        System.out.println("\n   ===========Lista p??blico============= \n"
                + "   == P??blico total = 500 pessoas     ==\n"
                + "   == Gen??ro feminino = 200           ==\n"
                + "   == Gen??ro masculino = 300          ==\n"
                + "   == Nascidos entre 1960 ?? 1990 =450 ==\n"
                + "   == Nascidos entre 1990 ?? 2000 = 50 ==\n"
                + "   =====================================\n"
                + "\n  ==========Lista de M??sicas ============ \n"
                + " |(A) We Are Chaos - Marilyn Manson;     |\n"
                + " |(B) Sweet Child o Mine - Guns N' Roses;|\n"
                + "  =======================================");

        int acertos = 0;
        int tentativas = 0;

        System.out.println("Digite a letra da primeira m??sica escolhida: ");
        String resposta = input.next();

        char resposta1 = resposta.charAt(0);

        switch (resposta1) {

            case 'a':
            case 'A':
                System.out.println("O p??blico n??o gostou dessa m??sica!");

                break;
            case 'b':
            case 'B':
                System.out.println("O p??blico amou essa m??sica! \n");

                acertos++;
                break;
            default:
                System.out.println("Op????o inv??lida!");
        }

        System.out.println("\n   ===========Lista p??blico============= \n"
                + "   == P??blico total = 500 pessoas     ==\n"
                + "   == Gen??ro feminino = 200           ==\n"
                + "   == Gen??ro masculino = 300          ==\n"
                + "   == Nascidos entre 1960 ?? 1990 =450 ==\n"
                + "   == Nascidos entre 1990 ?? 2000 = 50 ==\n"
                + "   =====================================\n"
                + "\n  ==========Lista de M??sicas ============ \n"
                + " |(A) Radio Ga Ga - Queen;               |\n"
                + " |(B) Carnivore - Body Count;            |\n "
                + " =======================================");

        System.out.println("Digite a letra da segunda m??sica escolhida: ");
        resposta = input.next();
        char resposta2 = resposta.charAt(0);

        switch (resposta2) {
            case 'a':
            case 'A':
                System.out.println("O p??blico gostou essa m??sica! \n");
                acertos++;
                break;

            case 'b':
            case 'B':
                System.out.println("O p??blico n??o gostou dessa m??sica! \n");

                break;
        }
        System.out.println("\n   ===========Lista p??blico============= \n"
                + "   == P??blico total = 500 pessoas     ==\n"
                + "   == Gen??ro feminino = 200           ==\n"
                + "   == Gen??ro masculino = 300          ==\n"
                + "   == Nascidos entre 1960 ?? 1990 =450 ==\n"
                + "   == Nascidos entre 1990 ?? 2000 = 50 ==\n"
                + "   =====================================\n"
                + "\n  ==========Lista de M??sicas ============ \n"
                + " |(A) Livin on a Prayer - Bon Jovi;      |\n"
                + " |(B) Utgard - Enslaved;                 |\n"
                + "  =======================================");

        System.out.println("Digite a letra da terceira m??sica escolhida: ");
        resposta = input.next();
        char resposta3 = resposta.charAt(0);

        switch (resposta3) {
            case 'a':
            case 'A':
                System.out.println("O p??blico gostou dessa m??sica! \n");
                acertos++;
                break;

            case 'b':
            case 'B':
                System.out.println("O p??blico n??o gostou dessa m??sica! \n");

                break;
            default:
                System.out.println("Op????o inv??lida!");
        }

        System.out.println("\n   ===========Lista p??blico============= \n"
                + "   == P??blico total = 500 pessoas     ==\n"
                + "   == Gen??ro feminino = 200           ==\n"
                + "   == Gen??ro masculino = 300          ==\n"
                + "   == Nascidos entre 1960 ?? 1990 =450 ==\n"
                + "   == Nascidos entre 1990 ?? 2000 = 50 ==\n"
                + "   =====================================\n"
                + "\n  ==========Lista de M??sicas ============ \n"
                + " |(A) Nothing else metters - Metallica ; |\n"
                + " |(B) Manifest - Amaranthe ;             |\n"
                + "  =======================================");

        System.out.println("Digite a letra da quarta m??sica escolhida: ");
        resposta = input.next();
        char resposta4 = resposta.charAt(0);

        switch (resposta4) {
            case 'a':
            case 'A':
                System.out.println("O p??blico n??o gostou dessa m??sica! \n");

                break;

            case 'b':
            case 'B':
                System.out.println("O p??blico gostou dessa m??sica! \n");
                acertos++;
                break;
            default:
                System.out.println("Op????o inv??lida!");
        }
        System.out.println("\n   ===========Lista p??blico============= \n"
                + "   == P??blico total = 500 pessoas     ==\n"
                + "   == Gen??ro feminino = 200           ==\n"
                + "   == Gen??ro masculino = 300          ==\n"
                + "   == Nascidos entre 1960 ?? 1990 =450 ==\n"
                + "   == Nascidos entre 1990 ?? 2000 = 50 ==\n"
                + "   =====================================\n"
                + "\n  ==========Lista de M??sicas =========== \n"
                + " |(A) Smells Like Teen Spirit - Nirvana;|\n "
                + "|(B) Titans of Creation - Testament;   |\n "
                + " ======================================");

        System.out.println("Digite a letra da terceira m??sica escolhida: ");
        resposta = input.next();
        char resposta5 = resposta.charAt(0);

        switch (resposta5) {
            case 'a':
            case 'A':
                System.out.println("O p??blico gostou dessa m??sica! \n");
                acertos++;
                break;

            case 'b':
            case 'B':
                System.out.println("O p??blico n??o gostou dessa m??sica! \n");

                break;
            default:
                System.out.println("Op????o inv??lida!");
        }

       
        System.out.printf("Parab??ns, voc?? acertou %d m??sicas", acertos);
        if (acertos == 4 || acertos == 5) {
            System.out.println("O p??blico ficou feliz.Voc?? recebeu mais 50 pontos.");
            pontos = pontos + 50;
        } else if (acertos == 2 || acertos == 2) {
            System.out.println("O p??blico ficou satisfeito. Voc?? recebeu 25 pontos.");
            pontos = pontos + 25;
        } else {
            System.out.println("O p??blico ficou triste. Voc?? perdeu 25 pontos.");
            pontos = pontos - 25;

        }
        desafio4();
    }

    static void desafio4() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ap??s o seu primeiro show voc?? ganhou alguns f??s e "
                + "todos eles est??o seguindo a banda nas redes sociais,"
                + "por isso seria muito bom para a banda se voc??s fizessem um "
                + "v??deo para o \nYouTube e Instagram falando um pouco sobre como foi o show!");

        String resposta;

        do {
            System.out.println("Voc?? ir?? fazer o v??deo? \n Obs: Responda com Sim ou N??o!");
            resposta = input.nextLine();

            if (resposta.equalsIgnoreCase("SIM")) {
                System.out.println("Gra??as ao v??deo sua banda ganhou mais 5 mil seguidores no Instagram"
                        + "e 2500 inscritos no YouTube. Por isso voc?? ganhou mais 25 pontos de poder!");
                System.out.println("Al??m disso ainda fomos convidados para um festival que valer?? +60 pontos e 3 mil reais!");
                pontos = pontos + 25;
                break;
            } else if (resposta.equalsIgnoreCase("N??O")) {
                System.out.println("J?? que voc?? n??o fez o v??deo voc?? acabou perdendo 2500 seguidores no Intagram, 1250"
                        + "incritos no YouTube e 20 pontos de poder!");
                System.out.println("Por??m por sorte voc?? acabou sendo convidado para um festival que valer?? +60 pontos e 3 mil reais!");
                pontos = pontos - 20;
                break;
            } else {
                System.out.println("Op????o inv??lida!Tente novamente.");
            }

        } while (!resposta.equalsIgnoreCase("Sim") || !resposta.equalsIgnoreCase("N??o"));

        System.out.println("\n Dois meses depois...");

        int escolha;
        do {
            System.out.println("Eu: Eai pessoal todos est??o preparados para o festival? Hoje vai ser um grande dia,"
                    + "n??o podemos esquecer que ?? uma batalha entre bandas,por isso n??s precisamos batalhar contra uma mais \nfraca que n??s!"
                    + "Por sorte s?? mais 3 bandas, al??m da nossa, ir??o batalhar, o restante ir?? apenas tocar no festival.");
            System.out.println("Antonio abre a porta do camarim: \n Opa, vim avisar que daqui 10 minutos vai come??ar o festival."
                    + "\n Precisamos decidir com qual banda vamos batalhar antes de irmos para o palco. "
                    + "\n Consegui um pouco de informa????es sobre essas bandas, olha a?? a lista: "
                    + "\n (1)Banda DeathLoops: Criada 5 meses atr??s, participou de 1 festival e o p??blico amou a banda."
                    + "\n (2)Banda Metalicos : Criada 1 ano atr??s, participou de 3 festivais, e foi odiada em todos."
                    + "\n (3)Banda Assasins: Criada 3 meses atr??s, participou de 1 festival, e agradou o p??blico nele.");
            System.out.println("Eai qual com voc?? quer batalhar? "
                    + "\n Obs: Digite o n??mero da banda");
            escolha = input.nextInt();

            if (escolha == 1) {
                if (pontos >= 85) {
                    System.out.println("Par??bens voc?? venceu a batalha!! A banda DeathLoops tinha apenas 85 pontos de poder e voc?? ganhou mais 40 pontos de poder");
                    pontos = pontos + 60;
                    desafio5();
                } else {
                    System.out.println("Infelizmente voc?? perdeu a batalha! Porque a banda DeathLoops tinham 60 pontos de poder!"
                            + " Com isso seu poder diminuiu 15 pontos e voc?? foi desclassificado da batalha.");
                    pontos = pontos - 15;
                }
            } else if (escolha == 2) {

                if (pontos < 50 && pontos > 15) {
                    System.out.println("Par??bens voc?? venceu a batalha!! A banda Metalicos tinha apenas 15 pontos de poder e voc?? ganhou mais 40 pontos de poder");
                    pontos = pontos + 60;
                    desafio5();
                } else {
                    System.out.println("Infelizmente voc?? perdeu a batalha! Porque a banda Metalicos tinha apenas 15 pontos de poder!"
                            + " Como voc?? n??o conseguiu derrotar a banda mais fraca o p??blico nunca mais quis ouvi-los \n e a jornada para o Rock In Rio acabou.");
                    pontos = pontos - 15;
                }
            } else if (escolha == 3) {

                if (pontos <= 50 && pontos < 85) {
                    System.out.println("Par??bens voc?? venceu a batalha!! A banda Assasins tinha apenas 50 pontos de poder e voc?? ganhou mais 60 pontos de poder");
                    pontos = pontos + 60;
                    desafio5();
                } else {
                    System.out.println("Infelizmente voc?? perdeu a batalha! Porque a banda Assasins tinham um poder de 300!"
                            + " Com isso seu poder diminuiu 15 pontos e voc?? foi desclassificado da batalha.");
                    pontos = pontos - 15;
                    desafio5();
                }

            } else {

                System.out.println("Op????o inv??lida!");

            }
        } while (escolha <= 0 || escolha > 3);
    }

    static void desafio5() {

        // Quinto desafioD
        Scanner sc = new Scanner(System.in);

        int ponto = 0;

        System.out.println("Algumas semanas depois... \n");

        System.out.println("Ant??nio: Pessoal voc??s n??o v??o acreditar!! Consegui uma entrevista \n"
                + " para banda num programa de televis??o, essa ?? uma grande oportunidade \n"
                + " para se destacar, haver?? milhares de pessoas assistindo. \n");

        System.out.println("O combinado ?? que voc??s toquem cinco m??sicas, e depois ser??o entrevistados.\n"
                + " Pelo que me falaram a plateia tem prefer??ncia por rock dos anos 90, ent??o voc??s ter??o\n"
                + " que escolher as m??sicas corretas para agradar a plateia. A entrevista ser?? daqui\n "
                + "dois dias, ent??o j?? v??o se preparando. \n");

        System.out.println("Dois dias depois... \n");

        System.out.println("Ant??nio: Chegou o grande dia pessoal, espero que voc??s estejam preparados, \n"
                + "voc??s v??o entrar no palco daqui cinco minutos. \n");

        System.out.println("Assistente de palco: Est?? na hora da apresenta????o pessoal. \n");

        System.out.println("Ant??nio: Boa sorte pessoal. \n");

        System.out.println("A plateia tem prefer??ncia por rock dos anos 90, escolha a m??sica certa para "
                + "agradar a plateia. \n"
                + "A banda ter?? que acertar no minimo tr??s de cinco m??sicas para ir bem no desafio. \n");

        //primeira musica
        do {
            System.out.println("Escolha a primeira m??sica. \n");

            System.out.println("(1)Alice In Chains - Rooster "//correta
                    + "\n(2)Slaughter To Prevail - DEMOLISHER "
                    + "\n(3)Hunger Strike - Temple Of The Dog  "
                    + "\n(4)Death - Symbolic  ");
            int resposta1 = sc.nextInt();

            switch (resposta1) {

                case 1:
                    System.out.println("A plateia adorou a m??sica, n??o a deixe desanimar e j?? escolha a pr??xima. \n");
                    ponto = ponto + 1;
                    break;

                case 2:
                    System.out.println("A plateia detestou a m??sica.\n");
                    break;

                case 3:
                    System.out.println("A plateia detestou a m??sica.\n");
                    break;

                case 4:
                    System.out.println("A plateia detestou a m??sica.\n");
                    break;

                default:
                    System.out.println("Voc?? perdeu a chance de escolher uma m??sica, preste mais aten????o na pr??xima.\n");
            }

            //segunda musica
            System.out.println("Escolha a segunda m??sica.");

            System.out.println("(1)Outkast - Hey Ya!"
                    + "\n(2)Pearl Jam - Jeremy" //correta
                    + "\n(3)MC Poze do Rodo - Eu Fiz o Jogo Virar "
                    + "\n(4)Ice cube - It Was A Good Day ");
            int resposta2 = sc.nextInt();

            switch (resposta2) {

                case 1:
                    System.out.println("A plateia detestou a m??sica.\n");
                    break;

                case 2:
                    System.out.println("A plateia adorou a m??sica, n??o a deixe desanimar e j?? escolha a pr??xima.\n");
                    ponto = ponto + 1;
                    break;

                case 3:
                    System.out.println("A plateia detestou a m??sica.\n");
                    break;

                case 4:
                    System.out.println("?? uma boa m??sica mas infelizmente a plateia odiou.\n");
                    break;

                default:
                    System.out.println("Voc?? perdeu a chance de escolher uma m??sica, preste mais aten????o na pr??xima.\n");
            }

            //terceira pergunta
            System.out.println("Escolha a terceira m??sica.");

            System.out.println("(1)George Michael - Careless Whisper"
                    + "\n(2)Coolio - Gangsta's Paradise "
                    + "\n(3)Coldplay - Hymn For The Weekend"
                    + "\n(4)Alice In Chains - Man in the Box");//correta
            int resposta3 = sc.nextInt();

            switch (resposta3) {

                case 1:
                    System.out.println("A plateia detestou a m??sica.\n");
                    break;

                case 2:
                    System.out.println("A plateia detestou a m??sica.\n");
                    break;

                case 3:
                    System.out.println("A plateia detestou a m??sica.\n");
                    break;

                case 4:
                    System.out.println("A plateia adorou a m??sica, n??o a deixe desanimar e j?? escolha a pr??xima.\n");
                    ponto = ponto + 1;
                    break;

                default:
                    System.out.println("Voc?? perdeu a chance de escolher uma m??sica, preste mais aten????o na pr??xima.\n");
            }

            //quarta pergunta
            System.out.println("Escolha a quarta musica.");

            System.out.println("(1)twenty one pilots - Ride"
                    + "\n(2)Rag'n'Bone Man - Human "
                    + "\n(3)Metallica - Nothing Else Matters " //correta
                    + "\n(4)Racionais MC's - Da ponte pra c??");
            int resposta4 = sc.nextInt();

            switch (resposta4) {

                case 1:
                    System.out.println("A plateia detestou a m??sica.\n ");
                    break;

                case 2:
                    System.out.println("A plateia detestou a m??sica.\n ");
                    break;

                case 3:
                    System.out.println("A plateia adorou a m??sica, n??o a deixe desanimar e j?? escolha a pr??xima. \n");
                    ponto = ponto + 1;

                    break;

                case 4:
                    System.out.println("Essa m??sica ?? sensacional, mas infelizmente n??o ?? a m??sica que a plateia prefere. \n");
                    break;

                default:
                    System.out.println("Voc?? perdeu a chance de escolher uma m??sica, preste mais aten????o na pr??xima.\n");
            }

            //quinta pergunta
            System.out.println("Escolha a quinta m??sica.");

            System.out.println("(1)Nirvana - Smells Like Teen Spirit " //correta
                    + "\n(2)Post Malone - Congratulations"
                    + "\n(3)FBC & VHOOR - Vem pro BAILE"
                    + "\n(4)Oliver Tree - Life Goes On");
            int resposta5 = sc.nextInt();

            switch (resposta5) {

                case 1:
                    System.out.println(" A plateia adorou a m??sica. \n");
                    ponto = ponto + 1;
                    break;

                case 2:
                    System.out.println("A plateia detestou a m??sica.\n ");
                    break;

                case 3:
                    System.out.println("Essa m??sica ?? sensacional, mas infelizmente n??o ?? a m??sica que a plateia prefere.\n");
                    break;

                case 4:
                    System.out.println("A plateia detestou a m??sica.\n ");
                    break;

                default:
                    System.out.println("Voc?? perdeu a chance de escolher uma m??sica.\n");
            }

            if (ponto <= 2) {
                System.out.println("Voc?? foi muito mal nas escolhas das m??sicas, tente novamente. ");

            } else if (ponto >= 3) {
                System.out.println("Parab??ns!!! A plateia adorou as m??sicas escolhidas. ");
            }
            System.out.printf("Voc?? acertou %d m??sicas \n", ponto);
        } while (ponto <= 2);

        //entrevista
        int ponto1 = 0;
        System.out.println("Agora a banda ser?? entrevistada, tente escolher as respostas certas para agradar os seus f??s. \n");

        System.out.println("Meus parab??ns, foi uma ??tima apresenta????o, ent??o, vamos come??ar a entrevista?\n");
        System.out.println("Banda: Vamos sim!\n");

        //Primeira pergunta da entrevista
        do {
            System.out.println("Apresentador: Qual s??o os abjetivos futuros da banda? \n");

            System.out.println("(1)Resposta agrad??vel."
                    + "\n (2)Resposta esnobe.");
            int entrevista1 = sc.nextInt();

            switch (entrevista1) {

                case 1:
                    System.out.println("Resposta da banda: Uns dos nossos objetivos e continuar melhorando, para assim conseguir\n"
                            + "alcan??ar o nosso sonho que ?? tocar no Rock in Rio. \n");
                    ponto1 = ponto1 + 10;
                    break;

                case 2:

                    System.out.println("Resposta da banda: Preferimos n??o falar sobre. \n");
                    break;

                default:
                    System.out.println("A banda preferiu n??o responder. \n");
                    break;
            }

//Segunda pergunta da entrevista
            System.out.println("Apresentador: H?? um bom conv??vio entre voc??s? \n");

            System.out.println("(1)Resposta agrad??vel."
                    + "\n (2)Resposta esnobe.");
            int entrevista2 = sc.nextInt();

            switch (entrevista2) {

                case 1:
                    System.out.println("Resposta da banda: N??s fazemos de tudo para manter um bom conv??vio. \n");
                    ponto1 = ponto1 + 10;
                    break;

                case 2:

                    System.out.println("Resposta da banda: Preferimos n??o falar sobre. \n");
                    break;

                default:
                    System.out.println("A banda preferiu n??o responder \n");
                    break;
            }

//terceira pergunta da entrevista
            System.out.println("Apresentador:Algum projeto para o futuro? E voc??s tem algum recado para os f??s?\n");

            System.out.println("(1)Resposta agrad??vel."
                    + "\n (2)Resposta esnobe.");
            int entrevista3 = sc.nextInt();

            switch (entrevista3) {

                case 1:
                    System.out.println("Resposta da banda:Sim, temos muitos projetos pela frente, mas n??o podemos falar\n"
                            + " muito sobre. N??s quer??amos agradecer muito ao os nossos f??s, e queria pedir que eles\n"
                            + " continuassem nos acompanhando, porqu?? isso incentiva muito o nosso trabalho.\n ");
                    ponto1 = ponto1 + 10;
                    break;

                case 2:

                    System.out.println("Resposta da banda:N??o podemos comentar sobre. N??o temos nada para falar.\n");
                    break;

                default:
                    System.out.println("A banda preferiu n??o responder. \n");
                    break;

            }
            if (ponto1 <= 20) {
                System.out.println("Apresentador: Bom, podemos ver que essa banda n??o e muito carism??tica,\n"
                        + " mas agrade??o por ter tocado no meu programa. \n");
                System.out.println("A banda n??o foi muito bem na entrevista, tente novamente.");
            } else if (ponto1 >= 30) {
                System.out.println("Apresentador: Novamente muito obrigado, e eu gostaria de falar que voc??s foram \n"
                        + " uma das melhores bandas que j?? tocou no meu programa, muito obrigado mesmo. \n");
                System.out.println("Banda: Nos que agradecemos a oportunidade, muito obrigado!! \n");
                System.out.println("A banda foi muito bem na apresenta????o do programa, com isso a banda conseguiu mais \n "
                        + "reconhecimento, agora ela est?? mais popular doque nunca.\n");
            }
        } while (ponto1 <= 2);
        desafio6();
    }

    static void desafio6() {
        // sexto desafio 
        Scanner sc = new Scanner(System.in);

        int p1 = 0;
        int ponto2 = 0;

        System.out.println("Ap??s algumas semanas da apresenta????o do programa, a banda ganhou muita\n"
                + " visibilidade, e conseguiram muitos f??s.\n");

        // inicio do desafio 6
        System.out.println("Voc?? est?? recebendo uma liga????o, voc?? vai atender?");
        do {
            System.out.println("(1)Sim.\n"
                    + "(2)N??o.\n");
            int atender = sc.nextInt();

            switch (atender) {

                case 1:
                    System.out.println("Voc?? atendeu, era o Ant??nio, e tinha uma ??tima not??cia, ele conseguiu\n"
                            + " um show para fora do pa??s, voc??s v??o se apresentar na argentina, o show ser?? \n"
                            + "daqui duas semanas, ent??o ?? melhor voc?? ir se preparando. \n");
                    p1 = p1 + 10;
                    break;

                case 2:
                    System.out.print("Assim que voc?? nega a liga????o, o celular come??a a tocar de novo, voc?? vai atender?\n");
                    break;
            }
        } while (p1 <= 9);

        System.out.println("Duas semanas depois, a banda j?? est?? na argentina, prestes a entrar no palco.\n"
                + " A plateia tem prefer??ncia por rock and roll, escolha as m??sicas certas para agradala, \n"
                + "no intervalo de uma m??sica para outra haver?? o feedback da plateia.\n");

        //primeira musica
        do {
            System.out.println("Chegou a hora do show, escolha a primeira m??sica. \n");

            System.out.println("(1)The Animals -House of the Rising Sun  "//correta
                    + "\n(2)Bill Withers - Just the Two of Us \n");
            int musica1 = sc.nextInt();

            switch (musica1) {

                case 1:
                    System.out.println("Banda:Voc??s gostaram da m??sica!?  ");
                    System.out.println("Plateia:SIMM!!!");
                    System.out.println("A palteia deu um feedback positivo.\n");
                    ponto2 = ponto2 + 10;
                    break;

                case 2:
                    System.out.println("Banda:Voc??s gostaram da m??sica!? ");
                    System.out.println("Plateia:N??OOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;
            }

            //segunda musica
            System.out.println("Escolha a segunda m??sica. \n");

            System.out.println("(1)Nina Simone - Feeling Good  "
                    + "\n(2)Kiss - Heaven's on Fire"//correta
                    + "\n(3)Cartola - Preciso me encontrar ");
            int musica2 = sc.nextInt();

            switch (musica2) {

                case 1:
                    System.out.println("Banda:Voc??s gostaram da m??sica!? ");
                    System.out.println("Plateia:N??OOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 2:
                    System.out.println("Banda:Voc??s gostaram da m??sica!?  ");
                    System.out.println("Plateia:SIMM!!!");
                    System.out.println("A palteia deu um feedback positivo.\n");
                    ponto2 = ponto2 + 10;
                    break;

                case 3:
                    System.out.println("Banda:Voc??s gostaram da m??sica!? ");
                    System.out.println("Plateia:N??OOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;
            }

            //tercerira musica
            System.out.println("Escolha a terceira m??sica. \n");

            System.out.println("(1)James Brown - It's A Man's World "
                    + "\n(2)Roy Orbison - Oh, Pretty Woman "
                    + "\n(3)Paul Anka - Put Your Head on My Shouder"
                    + "\n(4)The Beatles - Let It Be ");//correta
            int musica3 = sc.nextInt();

            switch (musica3) {

                case 1:
                    System.out.println("Banda:Voc??s gostaram da m??sica!? ");
                    System.out.println("Plateia:N??OOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 2:
                    System.out.println("Banda:Voc??s gostaram da m??sica!? ");
                    System.out.println("Plateia:N??OOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 3:
                    System.out.println("Banda:Voc??s gostaram da m??sica!? ");
                    System.out.println("Plateia:N??OOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 4:
                    System.out.println("Banda:Voc??s gostaram da m??sica!?  ");
                    System.out.println("Plateia:SIMM!!!");
                    System.out.println("A palteia deu um feedback positivo.\n");
                    ponto2 = ponto2 + 10;
                    break;
            }

            // quarta musica
            System.out.println("Escolha a quarta m??sica. \n");

            System.out.println("(1)The Crows - Time and Time Again "//correta
                    + "\n(2)Roddy Ricch - Down Below"
                    + "\n(3)The police - Every Breath You Take"
                    + "\n(4)MC Kauan - Mestre das fugas "
                    + "\n(5)Yunk vino - Leans");
            int musica4 = sc.nextInt();

            switch (musica4) {

                case 1:
                    System.out.println("Banda:Voc??s gostaram da m??sica!?  ");
                    System.out.println("Plateia:SIMM!!!");
                    System.out.println("A palteia deu um feedback positivo.\n");
                    ponto2 = ponto2 + 10;
                    break;

                case 2:
                    System.out.println("Banda:Voc??s gostaram da m??sica!? ");
                    System.out.println("Plateia:N??OOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 3:
                    System.out.println("Banda:Voc??s gostaram da m??sica!? ");
                    System.out.println("Plateia:N??OOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 4:
                    System.out.println("Banda:Voc??s gostaram da m??sica!? ");
                    System.out.println("Plateia:N??OOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 5:
                    System.out.println("Banda:Voc??s gostaram da m??sica!? ");
                    System.out.println("Plateia:N??OOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo.\n");
                    break;
            }

            if (ponto2 == 10) {
                System.out.println("A banda n??o foi muito bem nesse show, tente novamente. \n");

            } else if (ponto2 == 20) {
                System.out.println("A banda se saiu muito bem, mas poderia ter sido melhor. A plateia ficou satisfeita "
                        + "com a performance.");

            } else if (ponto2 == 30) {
                System.out.println("O show foi ??timo, mas poderia ter sido melhor. A plateia ficou satisfeita com a "
                        + "performance, a banda ganhou novos f??s.");

            } else if (ponto2 == 40) {
                System.out.println("O SHOW FOI INCRIVEL!! Todos da plateia amaram, a banda ganhou muitos f??s.");
            }
        } while (ponto2 <= 10);
        desafio7();
    }

    //DESAFIO 7    
    static void desafio7() {

        Scanner input = new Scanner(System.in);
        int musica, aleatorio;

        //Danos do inimigo
        int[] dano = new int[5];
        dano[0] = 10;
        dano[1] = 10;
        dano[2] = 20;
        dano[3] = 25;
        dano[4] = 30;

        System.out.println("Ao retornar para o Brasil, a banda decide se inscrever em um festival de batalhas de bandas.\n"
                + "Nesse festival, voc??s ter??o que derrotar as outras bandas para poderem ganhar o pr??mio.");
        System.out.println("\n===== Batalha entre bandas =====");
        System.out.println("Voc?? tem que fazer a vida da banda adversaria chegar a 0 antes da sua,\n"
                + "para isso use as 4 m??sicas para causar dano e vencer o adversario. ");
        //PRIMEIRA BANDA
        do {
            /*System.out.println(vidaenemy);*/
            System.out.println("\n***Desafio contra Regi??o Urbana***");
            System.out.println("Vida da sua banda = " + vida + " | Vida da banda inimiga = " + vidaenemy);
            System.out.println("Escolha alguma m??sica");
            System.out.println("1 - Lost time \n2 - What country is this \n3 - Eduardo and Monica \n4 - Western Caboclo ");
            musica = input.nextInt();
            switch (musica) {
                case 1:
                    vidaenemy = vidaenemy - 25;
                    System.out.println("A m??sica foi muito efetiva");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                case 2:
                    vidaenemy = vidaenemy - 20;
                    System.out.println("A m??sica foi boa");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                case 3:
                    vidaenemy = vidaenemy - 20;
                    System.out.println("A m??sica foi boa");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                case 4:
                    vidaenemy = vidaenemy - 10;
                    System.out.println("A m??sica foi fraca");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                default:
                    System.err.println("Valor invalido");
            }
        } while (vidaenemy > 0 && vida > 0 || musica > 4);
        if (vidaenemy <= 0) {
            System.out.println("***Voc?? derrotou a Regi??o Urbana***");
        } else if (vida <= 0) {
            System.out.println("Vida da sua banda = 0");
            System.out.println("Sua banda foi derrotada\nGAME OVER!!!");
            System.exit(0);
        }

        vida = 100;
        vidaenemy = 100;

        //SEGUNDA BANDA
        do {
            /*System.out.println(vidaenemy);*/
            System.out.println("\n***Desafio contra Capital Final***");
            System.out.println("Vida da sua banda = " + vida + " | Vida da banda inimiga = " + vidaenemy);
            System.out.println("Escolha alguma m??sica");
            System.out.println("1 - First mistakes \n2 - Do not look back \n3 - Your way \n4 - Natasha ");
            musica = input.nextInt();
            switch (musica) {
                case 1:
                    vidaenemy = vidaenemy - 20;
                    System.out.println("A m??sica foi boa");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                case 2:
                    vidaenemy = vidaenemy - 10;
                    System.out.println("A m??sica foi fraca");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                case 3:
                    vidaenemy = vidaenemy - 20;
                    System.out.println("A m??sica foi boa");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                case 4:
                    vidaenemy = vidaenemy - 25;
                    System.out.println("A m??sica foi muito efetiva");
                    vida = vida - dano[rand.nextInt(4)];
                    musica = 0;
                    break;
                default:
                    System.err.println("Valor invalido");
            }
        } while (vidaenemy > 0 && vida > 0 || musica > 4);
        if (vidaenemy <= 0) {
            System.out.println("***Voc?? derrotou a Capital Final***");
            System.out.println("Sua banda est?? na final!!");
        } else if (vida <= 0) {
            System.out.println("Vida da sua banda = 0");
            System.out.println("Sua banda foi derrotada\nGAME OVER!!!");
            System.exit(0);
        }

        vida = 100;
        vidaenemy = 100;

        //TERCEIRA BANDA
        do {
            /*System.out.println(vidaenemy);*/
            System.out.println("\n***Desafio contra Os Tit??s***");
            System.out.println("Vida da sua banda = " + vida + " | Vida da banda inimiga = " + vidaenemy);
            System.out.println("Escolha alguma m??sica");
            System.out.println("1 - it is necessary to know how to live \n2 - Flowers \n3 - while there is sun \n4 - Epitaph ");
            musica = input.nextInt();
            switch (musica) {
                case 1:
                    vidaenemy = vidaenemy - 10;
                    System.out.println("A m??sica foi fraca");
                    vida = vida - dano[rand.nextInt(5)];
                    musica = 0;
                    break;
                case 2:
                    vidaenemy = vidaenemy - 20;
                    System.out.println("A m??sica foi boa");
                    vida = vida - dano[rand.nextInt(5)];
                    musica = 0;
                    break;
                case 3:
                    vidaenemy = vidaenemy - 25;
                    System.out.println("A m??sica foi muito efetiva");
                    vida = vida - dano[rand.nextInt(5)];
                    musica = 0;
                    break;
                case 4:
                    vidaenemy = vidaenemy - 20;
                    System.out.println("A m??sica foi boa");
                    vida = vida - dano[rand.nextInt(5)];
                    musica = 0;
                    break;
                default:
                    System.err.println("Valor invalido");
            }
        } while (vidaenemy > 0 && vida > 0 || musica > 4);
        if (vidaenemy <= 0) {
            System.out.println("***Voc?? derrotou a Os Tit??s***");
        } else if (vida <= 0) {
            System.out.println("Vida da sua banda = 0");
            System.out.println("Sua banda foi derrotada\nGAME OVER!!!");
            System.exit(0);
        }

        System.out.println("==== PARAB??NS ====\nSUA BANDA FOI A CAMPE?? DA BATALHA DE BANDAS.");
        desafio8();
    }

    //DESAFIO 8
    static void desafio8() {
        Scanner input = new Scanner(System.in);
        int musica, gostou = 0;
        String ligacao;

        System.out.println("\nA banda foi convidada para tocar em um evento,e descobrimos que neste lugar estar?? Roberto Medina."
                + "\nEle que ?? um empres??rio e ?? um dos fundadores do Rock In-Rio. Ent??o pode ser uma oportunidade de conhece-lo,"
                + "\ne podemos fazer com que ele olhe a banda e talvez d?? uma oportunidade para todos, quem sabe n??....."
                + "\n\n Em uma conversa totalmente informal, o Roberto sinalizou que gosta muito de guitarra, que tem um sonho de conhecer"
                + "\no Slash, pois ?? um dos grandes ??dolos dele no meio musical.");

        do {
            System.out.println("\n----- CHEGOU O GRANDE DIA DO EVENTO.....EST??O PREPARADOS? -----"
                    + "\n Pense muito bem no que Roberto Medina disse, aproveite este momento para surpreende-lo. Pois n??o sabemos quando iremos escontra-lo denovo"
                    + "\n\n ESCOLHA UMA M??SICA QUE A BANDA IR?? TOCAR:");
            System.out.println("\n1 - Queen - Love Of My Life"
                    + "\n2 - James Taylor - Only a Dream in Rio"
                    + "\n3 - Guns N??? Roses - You Could Be Mine"
                    + "\n4 - Faith No More -  The Real Thing");
            musica = input.nextInt();

            if (musica == 3) {
                System.out.println("HA HA HA HA sabia que a banda ia fazer a escolha certa."
                        + "\nDeu para ver de longe que o Roberto se emocionou muito com a apresenta????o de voc??s e que certeza ele gostou muito. "
                        + "\nEsta apresenta????o foi a melhor de todas...PARAB??NS!!!"
                        + "\nO sucesso esta come??ando, prepara-se para maiores desafios");
                gostou = 1;
            } else {
                if (musica > 0 && musica <= 4) {
                    System.out.println("\nA apresenta????o foi ??tima, mas percebi que o Roberto n??o estava prestando aten????o, estava conversando muito e nem olhava para o palco. :("
                            + "\n Ap??s alguns dias de angustia, para saber quais bandas v??o tocar no rock in rio, saiu a lista, e n??o estaremos l??, deixamos escapar uma oportunidade ??nica.");
                    break;
                } else {
                    System.err.println("\nESCOLHA A M??SICA CORRETA!!!");
                }

            }
        } while (musica > 4);

        if (gostou == 1) {
            System.out.println("\nAp??s alguns dias, o Antonio que ?? o empresario da banda, recebe uma liga????o anonima. O mesmo questiona todos os integrantes"
                    + "\n se ?? para atender ou n??o."
                    + "\n---- QUEREM ATENDER A LIGA????O? (S = sim/N = n??o) ----");
            ligacao = input.next();

            if (ligacao.equals("s") || ligacao.equals("S") || ligacao.equals("sim") || ligacao.equals("Sim") || ligacao.equals("SIM")) {
                System.out.println("A LIGA????O ANONIMA ?? DE NADA MENOS QUE ROBERTO MEDINA....ISSO MESMO, ELE DISSE QUE NUNCA VIU UMA APRESENTA????O COMO AQUELA"
                        + "\nELE DISSE QUE TOCOU MUITO O CORA????O DELE NAQUELE DIA, E QUE AQUELA APRESENTA????O FICARA NA CABE??A DELE PARA SEMPRE."
                        + "\nENT??O ELE DECIDIU CONVIDAR A BANDA PARA TOCAR NO ROCK INT RIO DESTE ANO....ISSO MESMO...CONSEGUIMOS CHEGAR NO NOSSO GRANDE OBJETIVO"
                        + "\nROCK IN RIO QUE NOS ESPERA !!!! ");

            } else {
                System.out.println("O rock in rio ja foi anunciado e voc??s n??o conseguiram participar. Quem sabe ano que vem.");
            }

        }
    }
}
