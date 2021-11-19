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
            System.out.println(
                    "\nTati - Vocal (Desde pequena sempre gostou de música, e sempre mostrou que era uma meninda diferenciada. Logo começou a cantar, e todos em sua volta "
                    + "\n              que ela tinha uma voz incrivel e que bem lapidado esse diamante ia logo surgi no mundo musical. Começou cantando na igreja, mas logo surgiu o gosto"
                    + "\n              pelo estilo musical voltado mais ao rock. Depois de tantas idas e vindas ela quer uma chance para conseguir realizar um sonho que vem aumentando aos anos."
                    + "\n\nAkira - Guitarra (Na adolescência, surgiu um grande desejo de aprender a tocar um instrumento musical, logo se encantou pela guitarra. Estudou muito, ficava noites viradas"
                    + "\n                  para aprender a tocar logo. Hoje ele está muito experiente, e sabe tocar como poucos, um dos melhores guitarristas do Brasil."
                    + "\n\nJefferson - Baixo (Mas conhecido como Jeff, demorou um pouco para entrar no ramo musical. A paixão dele por música fez com que ele desse uma "
                    + "\n                   oportunidade para si mesmo, em aprender a tocar algo. Seu interesse pelo baixo, foi um pouco estranhado pelo seus amigos, "
                    + "\n                   mas mesmo assim o apoiaram a seguir esse caminho.Hoje ele quer uma oportunidade de conseguir realizar um sonho que qualquer artista deseja)"
                    + "\n\nZeca - Bateria (Os vizinhos não eram muitos fãs de Zeca, pois sempre ficava toacndo sua bateria dentro de casa, e o barulho era ensurdecedor. "
                    + "\n                Seus pais então reclamavam muito, até que decidiram comprar uima bateria profissional e apoia-lo nesta caminhada. "
                    + "\n                Dava pra ver que Zeca era diferenciado, sempre tocando nas igrejas da cidade,e em eventos, e todos diziam que o sucesso dele estava muito próximo.)"
                    + "\n\nJoão - Violão (Sempre carregando seu violão nas costas, ia pra escola, e usava o violão como uma forma de conquistar as meninas, tocava e cantava "
                    + "\n               para todos na sala, se tivesse aula vaga, já sabia que teria que ver joão tocando e muitas das vezes ainda tirava onda na voz também. "
                    + "\n               Hoje ele quer conquistar algo maior, e ser reconhecido nacionalmente, e quem sabe até mundialmente");
            System.out.println("");

            System.out.println("\n Escolha um integrante que você mais gostou e que deseja que o sonho dele(a) seja realizado:");
            integrante = jogar.nextLine();

            switch (integrante) {
                case "Tati":
                case "tati":
                    System.out.printf("Você escolheu a %s - vocalista", integrante1);// contar a história de Tati
                    desafio1();
                    return;
                case "Akira":
                case "akira":
                    System.out.printf("Você escolheu o %s - Guitarrista", integrante2);// contar a história de Akira
                    desafio1();
                    return;
                case "Jeff":
                case "jeff":
                    System.out.printf("Você escolheu o %s - Baixo", integrante3);//contar a história de Jeff
                    desafio1();
                    return;
                case "João":
                case "joao":
                case "joão":
                    System.out.printf("Você escolheu o %s - Violão", integrante5);//contar a história de João
                    desafio1();
                    return;
                case "Zeca":
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

        //int escolhaBanda = 0;// variavel da escolha da banda
        String resposta1;// reposta das perguntas

        System.out.println("\n\nQUE LEGAL!!! VOCÊ COMEÇA HOJE A SUA CAMINHADA PARA O ROCK IN RIO."
                + "\nMAS PARA ISSO ACONTECER, VOCÊ PASSARA POR ALGUNS DESAFIOS."
                + "\nDESAFIOS ESTES QUE TESTARA SE VOCÊ ESTÁ PRONTO PARA ESTA JORNADA."
                + "\nPRIMEIRO UMA ESCOLHA SIMPLES."
                + "\n\n-------- PRIMEIRO DESAFIO É ESOLHAR UMA BANDA PARA VOCÊ ENTRAR -------");

        System.out.println("\n[1]BANDA The Last Wish"
                + "\n[2] BANDA Garage Singer"
                + "\n[3] BANDA Cheerful Dogs" //escrever sobre as bandas
                + "\n[4] BANDA SoulFolk"
                + "\n[5] BANDA Secretus"
                + "\n ------- DIGITE O NOME DA BANDA QUE VOCÊ DESEJA SEGUIR NESTA CAMINHADA -------");
        banda = input.nextLine();

        switch (banda) {
            //ESCOLHA DA BANDA 1 - the last wish
            case "the last wish":
                //PRIMEIRA PERGUNTA DA BANDA 1
                System.out.printf("Você escolheu %s, muito bem, bela escolha."
                        + "\nAgora vamos para mais uma etapa:"
                        + "\n\nPara confirmar a sua entrada na banda, os integrantes decidiram realizar algumas perguntas para você, para saber" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\ncomo está o seu conhecimento. "
                        + "\nvocê só vai poder entrar, se acertar 3 respostas de 5 perguntas. cada pergunta valendo 10 pontos. Precisa de apenas 30."
                        + "FACIL NÉ? ENTÃO LET'S GO!!!!", banda);

                System.out.println("\n\n---- PERGUNTA 1 -----"
                        + "\n\n-> POR QUE NO ROCK IN RIO TOCA OUTROS RITMOS??"
                        + "\n(a) As bandas estão menos interessadas"
                        + "\n(b) O público que curte rock já não contemplava toda a enormidade do evento." //resposta certa
                        + "\n(c) Os empresários entedem que o mercado ta diferente"
                        + "\n(d) Marcas junto com as bandas forçaram que todos estilos fossem tocados");

                System.out.println("ESCOLHA A RESPOSTA CERTA:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                //SEGUNDA PERGUNTA DA PRIMEIRA BANDA
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n QAUL O DISCO DE ROCK MAIS VENDIDO ATÉ HOJE?"
                        + "\n(a) Rumours — Fleetwood Mac"
                        + "\n(b) The Dark Side of the Moon — Pink Floyd"
                        + "\n(c) Back In Black, da banda AC/DC." //resposta certa
                        + "\n(d) Thriller — Michael Jackson ");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                //TERCEIRA PERGUNTA DA PRIMEIRA BANDA

                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n QUAIS SÃO OS INTEGRANTES ORIGINAIS DA BANDA BEATLES?"
                        + "\n(a) Jim Morrison, Paul McCartney ,George Harrison, John Lennon e Stu Sutcliffe"
                        + "\n(b) John Lennon, Paul McCartney, George Harrison, Stu Sutcliffe e Peter Best" //resposta certa
                        + "\n(c) Ringo Starr, Paul McCartney, Peter Best, Bono Vox e Mick Jagger"
                        + "\n(d) John Lennon, Jimmy Page, Paul McCartney, Stu Sutcliffe e George Harrison");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                //QUARTA PERGUNTA DA PRIMEIRA BANDA
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n OZZY OSBOURNE, EM UM SHOW, MORDEU A CABEÇA DE UM ANIMAL. QUE ANIMAL ERA ESSE?"
                        + "\n(a) Ornitorrinco"
                        + "\n(b) Rato"
                        + "\n(c) Pombo"
                        + "\n(d) Morcego");//resposta certa

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                //QUINTA PERGUNTA DA PRIMEIRA BANDA
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\n BRUCE DICKISON, VOCALISTA DO IRON MAIDEN, TEM OUTRAS PROFISSÕES."
                        + "\n QUAL DAS ALTERNATIVAS A SEGUIR É A QUE CONTÉM 5 PROFISSÕES DELE?"
                        + "\n(a) Piloto de avião, esgrimista, tenor, historiador e roteirista"//resposta certa
                        + "\n(b) Servente, engenheiro, arquiteto, mecânico e professor"
                        + "\n(c) Médico, biólogo, dentista, advogado e juiz"
                        + "\n(d) Astronauta, cientista, lutador, ator e pastor");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                if (pontos >= 30) {
                    System.out.println("Você fez: " + pontos + " pontos");
                    System.out.println("PARABÉNS VOCÊ CONSEGUIU ENTRAR PARA BANDA.");
                    desafio2();
                    break;
                } else {
                    System.err.println("\nIH.... NÃO FOI DESTA VEZ HEIN...."
                            + "\nTE DAREMOS MAS OUTRA OPORTUNIDADE, VE SE NÃO DESPERDIÇA.");
                    desafio1();
                }

            //ESCOLHA DA BANDA 2 - garage singer
            case "garage singer":
                // PRIMEIRA PERGUNTA DA BANDA 2
                System.out.printf("Você escolheu %s, muito bem, bela escolha."
                        + "\nAgora vamos para mais uma etapa:"
                        + "\n\nPara confirmar a sua entrada na banda, os integrantes decidiram realizar algumas perguntas para você, para saber" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\ncomo está o seu conhecimento. "
                        + "\nvocê só vai poder entrar, se acertar 3 respostas de 5 perguntas. cada pergunta valendo 10 pontos. Precisa de apenas 30."
                        + "FACIL NÉ? ENTÃO LET'S GO!!!!", banda);

                System.out.println("\n\n---- PERGUNTA 01 -----"
                        + "\n APÓS A MORTE DE KURT COBAIN, EM 1994, DAVE GROHL FORMOU UMA BANDA EM 1995. QUE BANDA É ESSA?"
                        + "\n(a) Kung Fu Fighter's"
                        + "\n(b) Dave Grohl Project"
                        + "\n(c) Foo Fighters"//resposta certa
                        + "\n(d) Nirvana");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
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
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                // TERCEIRA PERGUNTA DA BANDA 2
                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n QUAL INTEGRANTE DO AC/DC SAIU DA BANDA E MONTOU UMA ESCOLA DE HELICOPTEROS NA NOVA ZELÂNDIA EM 1983?"
                        + "\n(a) Bon Scott"
                        + "\n(b) Brian Johnson"
                        + "\n(c) Phil Rudd"//resposta certa
                        + "\n(d) Cliff Williams");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
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
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                //QUINTA PERGUNTA DA BANDA 2
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\n QUAL ÁLBUM DO PINK FLOYD FOI CONSIDERADO O SEGUNDO MELHOR DE TODOS OS TEMPOS?"
                        + "\n(a) The Wall"
                        + "\n(b) Animals"
                        + "\n(c) Dark Side of the Moon" //resposta certa
                        + "\n(d) Wish You Were Here");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                if (pontos >= 30) {
                    System.out.println("Você fez: " + pontos + " pontos");
                    System.out.println("PARABÉNS VOCÊ CONSEGUIU ENTRAR PARA BANDA.");
                    desafio2();
                    break;
                } else {
                    System.err.println("\nIH.... NÃO FOI DESTA VEZ HEIN...."
                            + "\nTE DAREMOS MAS OUTRA OPORTUNIDADE, VE SE NÃO DESPERDIÇA.");
                    desafio1();
                }

            //ESCOLHA DA BANDA 3 - cheerful dogs
            case "cheerful dogs":
                //PRIMEIRA PERGUNTA DA BANDA 3
                System.out.printf("Você escolheu %s, muito bem, bela escolha."
                        + "\nAgora vamos para mais uma etapa:"
                        + "\n\nPara confirmar a sua entrada na banda, os integrantes decidiram realizar algumas perguntas para você, para saber" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\ncomo está o seu conhecimento. "
                        + "\nvocê só vai poder entrar, se acertar 3 respostas de 5 perguntas. cada pergunta valendo 10 pontos. Precisa de apenas 30."
                        + "FACIL NÉ? ENTÃO LET'S GO!!!!", banda);

                System.out.println("\n\n---- PERGUNTA 01 -----"
                        + "\n M. SHADOWS É VOCALSITA DE QUAL BANDA?"
                        + "\n(a) Avenged Sevenfold"//resposta certa
                        + "\n(b) Guns N' Roses"
                        + "\n(c) Angra"
                        + "\n(d) Ramones");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOCÊ ERROU!!! :(");
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                // SEGUNDA PERGUNTA DA BANDA 3
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n MARK HOPPUS É VOCALISTA DE QUAL BANDA?"
                        + "\n(a) Pink Floyd"
                        + "\n(b) Green Day"
                        + "\n(c) The Beatles"
                        + "\n(d) Blink-182");//resposta certa

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                // TERCEIRA PERGUNTA DA BANDA 3
                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n CHESTER BENNINGTON É VOCALISTA DE QUAL BANDA?"
                        + "\n(a) Motorhead"
                        + "\n(b) Aerosmith"
                        + "\n(c) Linkin Park"//resposta certa
                        + "\n(d) Alice In Chains");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                // QUARTA PERGUNTA DA BANDA 3
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n SERJ TANKIAN É VOCALISTA DE QUAL BANDA?"
                        + "\n(a) System Of a Down"//resposta certa
                        + "\n(b) Slipknot"
                        + "\n(c) Foo Fighters"
                        + "\n(d) Led Zeppelin");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                //QUINTA PERGUNTA DA BANDA 3
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\n ANTHONY KIEDIS É VOCALISTA DE QUAL BANDA?"
                        + "\n(a) AC/DC"
                        + "\n(b) DragonForce"
                        + "\n(c) Kiss"
                        + "\n(d) Red Hot Chili Peppers");//resposta certa

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                if (pontos >= 30) {
                    System.out.println("Você fez: " + pontos + " pontos");
                    System.out.println("PARABÉNS VOCÊ CONSEGUIU ENTRAR PARA BANDA.");
                    desafio2();
                    break;
                } else {
                    System.err.println("\nIH.... NÃO FOI DESTA VEZ HEIN...."
                            + "\nTE DAREMOS MAS OUTRA OPORTUNIDADE, VE SE NÃO DESPERDIÇA.");
                    desafio1();
                }

            // ESCOLHA DA BANDA 4 - soulfolk
            case "soulfolk":
                //  PRIMEIRA PERGUNTA DA BANDA 4
                System.out.printf("Você escolheu %s, muito bem, bela escolha."
                        + "\nAgora vamos para mais uma etapa:"
                        + "\n\nPara confirmar a sua entrada na banda, os integrantes decidiram realizar algumas perguntas para você, para saber" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\ncomo está o seu conhecimento. "
                        + "\nvocê só vai poder entrar, se acertar 3 respostas de 5 perguntas. cada pergunta valendo 10 pontos. Precisa de apenas 30."
                        + "FACIL NÉ? ENTÃO LET'S GO!!!!", banda);

                System.out.println("\n\n---- PERGUNTA 01 -----"
                        + "\n QUAL BANDA AMERICANA TAMBÉM É CONHECIDA COMO THE BAD BOYS FROM BOSTON?"
                        + "\n(a) Aerosmith"//resposta certa
                        + "\n(b) Coldplay"
                        + "\n(c) Journey"
                        + "\n(d) Avenged Sevenfold");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                }
                // SEGUNDA PERGUNTA DA BANDA 4
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n LÍDER QUE ESTÁ NA MEMÓRIA, QUE PARTICIPOU DA BANDA LEGIÃO URBANA?"
                        + "\n(a) Renato Rocha"
                        + "\n(b) Raul Seixas"
                        + "\n(c) Samuel Rosa"
                        + "\n(d) Renato Russo");//resposta certa

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                // TERCEIRA PERGUNTA DA BANDA 4
                System.out.println("\n\n---- PERGUNTA 3 -----"
                        + "\n QUAL BANDA TEVE APENAS UM POUCO MAIS DE 7 MESES DE SUCESSO?"
                        + "\n(a) Paralamas do sucesso"
                        + "\n(b) Legião urbana"
                        + "\n(c) Mamonas assassinas"//resposta certa
                        + "\n(d) Nirvana");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                // QUARTA PERGUNTA DA BANDA 4
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n QUAL BANDA NORTE AMERICANA TAMBÉM CONHECIDA COMO A7X?"
                        + "\n(a) Avenged Sevenfold"//resposta certa
                        + "\n(b) The animals"
                        + "\n(c) Led Zeppelin"
                        + "\n(d) Rush");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                //QUINTA PERGUNTA DA BANDA 4
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\n QUAL O QUARTETO SAGRADO DO ROCK BRASILEIRO?"
                        + "\n(a) Skank, Legião Urbana, Capital inicial, Barão vermelho"
                        + "\n(b) Titãs, Paralamas do sucesso, TNT, Mamonas assassinas"
                        + "\n(c) Legião Urbana, Barão vermelho, Mamonas assassinas, Titãs"
                        + "\n(d) Legião urbana, Titãs, Barão Vermelho, Paralamas do sucesso");//resposta certa

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                if (pontos >= 30) {
                    System.out.println("Você fez: " + pontos + " pontos");
                    System.out.println("PARABÉNS VOCÊ CONSEGUIU ENTRAR PARA BANDA.");
                    desafio2();
                    break;
                } else {
                    System.err.println("\nIH.... NÃO FOI DESTA VEZ HEIN...."
                            + "\nTE DAREMOS MAS OUTRA OPORTUNIDADE, VE SE NÃO DESPERDIÇA.");
                    desafio1();
                }

            //ESCOLHA DA BANDA 5 - secretus
            case "secretus":
                // PRIMEIRA PERGUNTA DA BANDA 5
                System.out.printf("Você escolheu %s, muito bem, bela escolha."
                        + "\nAgora vamos para mais uma etapa:"
                        + "\n\nPara confirmar a sua entrada na banda, os integrantes decidiram realizar algumas perguntas para você, para saber" // MELHORAR MAIS ESSE TEXTO, PARA FICAR MAIS EXPLICATIVO, OU INSERIR MAIS COISAS
                        + "\ncomo está o seu conhecimento. "
                        + "\nvocê só vai poder entrar, se acertar 3 respostas de 5 perguntas. cada pergunta valendo 10 pontos. Precisa de apenas 30."
                        + "FACIL NÉ? ENTÃO LET'S GO!!!!", banda);

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
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                // SEGUNDA PERGUNTA DA BANDA 5
                System.out.println("\n\n---- PERGUNTA 2 -----"
                        + "\n QUAL BANDA CUJA FAIXA DE ABERTURA CHAMADA SWEET LEAF É INTRODUZIDA COM UMA TOSSE?"
                        + "\n(a) Nazareth"
                        + "\n(b) Black Sabbath"//resposta certa
                        + "\n(c) The Beatles"
                        + "\n(d) Oasis");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
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
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                //QUARTA PERGUNTA DA BANDA 5
                System.out.println("\n\n---- PERGUNTA 4 -----"
                        + "\n A MÚSICA YESTARDAY PERTENCE A QUAL BANDA?"
                        + "\n(a) Lamb of god"
                        + "\n(b) Queens"
                        + "\n(c) The Beatles"//resposta certa
                        + "\n(d) Kiss");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "c":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "d":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                //QUINTA PERGUNTA DA banda 5
                System.out.println("\n\n---- PERGUNTA 5 -----"
                        + "\nELA PULOU DA JANELA DO QUINTO ANDAR... É UM TRECHO DE QUAL MÚSICA E DE QUAL BANDA?"
                        + "\n(a) Pais e Filhos do Restart"
                        + "\n(b) Pais e Filhos do Legião Urbana"//resposta certa
                        + "\n(c) Sangue Frio do Oficina G3"
                        + "\n(d) Filhos e Pais do Nx Zero");

                System.out.println("Escolha a resposta certa:");
                resposta1 = input.next();

                switch (resposta1) {
                    case "a":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "b":
                        System.out.println("ESSA RESPOSTA ESTÁ....CORRETA!!! :)");
                        pontos = pontos + 10;
                        break;
                    case "c":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    case "d":
                        System.out.println("VOCÊ ERROU!!! :(");
                        break;
                    default:
                        System.out.println("VOCê ERROU!!! :(");
                        break;
                }
                if (pontos >= 30) {
                    System.out.println("Você fez: " + pontos + " pontos");
                    System.out.println("PARABÉNS VOCÊ CONSEGUIU ENTRAR PARA BANDA.");
                    desafio2();
                    break;
                } else {
                    System.err.println("\nIH.... NÃO FOI DESTA VEZ HEIN...."
                            + "\nTE DAREMOS MAS OUTRA OPORTUNIDADE, VE SE NÃO DESPERDIÇA.");
                    desafio1();
                }
        }//SWITCH BANDA
    }

    //DESAFIO 2
    static void desafio2() {

        Scanner desafio2 = new Scanner(System.in);

        System.out.println("\n\nA banda está muito feliz por você ter conseguido entrar. Você se junta a outros integrantes"
                + "\npara buscar um sonho que todos tem. A caminhada vai ser grande....BOA SORTE!!!");

        String empresario;
        int cont = 3;

        System.out.println("\n\n Agora que você ta dentro, vamos escolher um empresário para nos ajudar, nesta caminhada."
                + "\nTem que ser um empresário muito bom, e que esteja na mesma sintonia que a banda. "
                + "\nQue com ele, nós só vamos nos fortalecer."
                + "\nA banda já decidiu quem será o empresário, mas sem te consultar, pois decidiram fazer mais um desafio"
                + "\npara você, pra confirmar se você esta na mesma vibe que todos. Te daremos 3 chances, para acertar."
                + "\nSe errar, sinto muito mas você será expulso da banda e esta grande oportunidade acaba para você"
                + "\n\n ESTES SÃO OS EMPRESÁRIOS ↓↓↓ ");
        System.out.println("\n\n [1] Empresário - Carlos (Um dos gigantes da música, é conhecido por transformar em ouro tudo que toca."
                + "\n                          Estamos falando de um dos maiores empresarios do Brasil, lançou nada menos que "
                + "\n                          mamonas assasinas para o cenário musical brasileiro.."
                + "\n\n [2] Empresário - José (Tá fazendo muito sucesso no meio dos sertanejos, lançou muitas duplas de renome, Jorge e Matheus,"
                + "\n                        Matheus e Kauan, Zé neto e Cristiano, entre outros... Neste ano ele decidiu mudar de estilo musical"
                + "\n                        Hoje ele busca alguma banda para fazer sucesso. Segundo as más linguas, tem que ficar esperto com ele,"
                + "\n                        em relação a dinheiro."
                + "\n\n [3] Empresário - Antonio(É um empresário e produtor musical brasileiro, responsável pela fundação da Som Livre "
                + "\n                          gravadora das Organizações Globo. Pai do cantor e compositor Cazuza, foi responsável pelo "
                + "\n                          surgimento de vários artistas de renome no cenário da música popular brasileira." // ESCREVER UM PERFIRL PARA CADA EMPRESARIO
                + "\n\n [4] Empresária Claudia (Empresária, compositora, arranjadora, multi-instrumentista e produtora musical brasileira, "
                + "\n                         é uma das mais consagradas nomes da produção musical do cenário artístico do Brasil.");

        for (int i = 1; i <= 4; i++) {
            System.out.println("\n\n----- Escolha o empersario que você acha que a banda está de acordo -----");
            pontos = pontos + 10; //SOMA DOS PONTOS
            empresario = desafio2.nextLine();

            if (empresario.equals("Antonio")) {
                System.out.println("\nAEEEE.... VOCÊ ACERTOU....PARABÉNS...SABIAMOS QUE VOCÊ NÃO IA NOS DESAPONTAR :)"); //ELABORAR UM TEXTO
                desafio3();
                break;
            } else {
                System.out.println("\nPOXA...JURAVA QUE VOCÊ IA ACERTAR DE PRIMEIRA :(");
                System.out.println("..... VOCÊ TEM " + cont-- + " CHANCES....");
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
                + "\n Agora vem a boa notícia: eu marquei o primeiro show de vocês,nele vocês vão tocar 5 músicas, "
                + "porém prestem muita atenção na hora de escolher a música,"
                + "\n porque o público pode não gostar muito da música se for de um estilo muito diferente deles!");

        System.out.println("Obs: Vocês precisam dar o seu máximo para alegrar esse público, para conseguir aumentar suas habilidades "
                + "e pontos para o jogo"
                + "\n Abaixo está os pontos que vão conseguir de acordo com suas escolhas: \n "
                + "\n Caso acerte 4 ou 5 músicas o público ficará feliz e cada personagem recebe 50 pontos de habilidade \n"
                + "\n Caso acerte 2 ou 3 músicas o público ficará indifirente e cada personagem recebe 25 pontos de habilidade. \n"
                + "\n Caso não acerte nenhuma música, ou acerte apenas 1, o público ficará triste e cada personagem perde 25 pontos! \n");

        System.out.println("\n Eu tenho as informações do público para que vocês estudem quais músicas escolher. Tô passando uma "
                + "lista contendo o genêro e idade de todos que compraram os ingressos \n e também a lista de músicas");

        int pontos = 0;
        int acertos = 0;
        int tentativas = 0;

        do {
            System.out.println("\n   ===========Lista público============= \n"
                    + "   == Público total = 500 pessoas     ==\n"
                    + "   == Genêro feminino = 200           ==\n"
                    + "   == Genêro masculino = 300          ==\n"
                    + "   == Nascidos entre 1960 á 1990 =450 ==\n"
                    + "   == Nascidos entre 1990 á 2000 = 50 ==\n"
                    + "   =====================================\n"
                    + "\n  ==========Lista de Músicas ============ \n"
                    + " |(1) We Are Chaos - Marilyn Manson;     |\n"
                    + " |(2) Sweet Child o Mine - Guns N' Roses;|\n"
                    + " |(3) Radio Ga Ga - Queen;               |\n"
                    + " |(4) Livin on a Prayer - Bon Jovi;      |\n "
                    + "|(5) Carnivore - Body Count;            |\n"
                    + " |(6) Utgard - Enslaved;                 |\n"
                    + " |(7) Nothing else metters - Metallica ; |\n"
                    + " |(8) Manifest - Amaranthe ;             |\n"
                    + " |(9) Smells Like Teen Spirit - Nirvana; |\n "
                    + "|(10) Titans of Creation - Testament;   |\n "
                    + " ========================================");
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
        System.out.printf("Parabéns, você acertou %d músicas", acertos);
        if (acertos == 4 || acertos == 5) {
            System.out.println("O público ficou feliz.Você recebeu mais 50 pontos.");
            pontos = pontos + 50;
        } else if (acertos == 2 || acertos == 2) {
            System.out.println("O público ficou satisfeito. Você recebeu 25 pontos.");
            pontos = pontos + 25;
        } else {
            System.out.println("O público ficou triste. Você perdeu 25 pontos.");
            pontos = pontos - 25;
        }
        desafio4();
    }

    static void desafio4() {
        Scanner input = new Scanner(System.in);
        int pontos = 0;
        System.out.println("Após o seu primeiro show você ganhou alguns fãs e "
                + "todos eles estão seguindo a banda nas redes sociais,"
                + "por isso seria muito bom para a banda se vocês fizessem um "
                + "vídeo para o YouTube \n e Instagram falando um pouco sobre como foi o show!");
        System.out.println("Você irá fazer o vídeo? \n Obs: Responda com sim ou não!");
        String resposta = input.nextLine();

        switch (resposta) {
            case "Sim":
                System.out.println("Graças ao vídeo sua banda ganhou mais 5 mil seguidores no Instagram"
                        + "e 2500 inscritos no YouTube. Por isso você ganhou mais 25 pontos de poder!");
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
        System.out.println("Eu: Eai pessoal todos estão preparados para o festival? Hoje vai ser um grande dia,"
                + "não podemos esquecer que é uma batalha entre bandas,por isso nós precisamos batalhar contra uma mais \n fraca que nós!"
                + "Por sorte só mais 3 bandas além da nossa, irão batalhar, o restante irá apenas tocar no festival.");
        System.out.println("Antonio abre a porta do camarim: \n Opa, vim avisar que daqui 10 minutos vai começar o festival."
                + "\n Precisamos decidir com qual banda vamos batalhar antes de irmos para o palco. "
                + "\n Consegui um pouco de informações sobre essas bandas, olha aí a lista: "
                + "\n (1)Banda DeathLoops: Criada 5 anos atrás, participou de 15 festivais e em todos o público amou a banda."
                + "\n (2)Banda Metalicos : Criada 1 ano atrás, participou de 3 festivais, e foi odiada em todos."
                + "\n (3)Banda Assasins: Criada 3 anos atrás, participou de 6 festivais, e agradou o público em 4 deles.");
        System.out.println("Eai qual com você quer batalhar? "
                + "\n Obs: Digite o número da banda");
        int bandarival = input.nextInt();
        int banda1 = 1, banda2 = 2, banda3 = 3;

        if (bandarival == banda1) {
            System.out.println("Infelizmente você perdeu a batalha! Porque a banda DeathLoops tinham um poder de 10000!"
                    + " Com isso seu poder diminuiu 50 pontos e você foi desclassificado da batalha.");
            pontos = pontos - 50;

        } else if (bandarival == banda2) {
            System.out.println("Parábens você venceu a batalha!! A banda Metálicos tinha apenas 50 pontos e você ganhou mais 100 pontos de poder");
            pontos = pontos + 100;
        } else if (bandarival == banda3) {
            System.out.println("Infelizmente você perdeu a batalha! Porque a banda Assasins tinham um poder de 3000!"
                    + "Com isso seu poder diminuiu 50 pontos e você foi desclassificado da batalha.");
        }
        //desafio5();
        desafio7();
    }

    //DESAFIO 7    
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
        desafio8();
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
