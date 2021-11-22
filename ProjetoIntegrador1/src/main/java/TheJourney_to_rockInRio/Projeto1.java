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
                        System.out.println("The Journey to Rock In Rio é um jogo textual onde você irá trilhar a sua jornada como músico em uma banda de rock."
                                + "\nO maior desejo do grupo é se tornar uma banda de sucesso e tocar no Rock In Rio. "
                                + "\nPara isso você terá que passar por desafios e testes durante o seu jogo, "
                                + "\nescolhendo música certa para agradar ao público e batalhando contra outras bandas em festivais.\n");//Escrever instruções
                        break;
                    case 2:
                        jogar();
                        
                        break;
                    case 3:
                        System.out.println("---INTEGRANTES DO GRUPO 8 PARA O PROJETO INTEGRADOR 1º SEMESTRE -----"
                                + "\nIgor Oliveira"
                                + "\nJoão Pablo Vilanir de Melo"
                                + "\nDouglas Alves Angelo"
                                + "\nLeonardo Sousa Pereira"
                                + "\nGabriel Albuquerque");
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
               System.out.println("pontos " + pontos);
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
                + "lista contendo o genêro e idade de todos que compraram os ingressos e também a lista de músicas");

        System.out.println("\n   ===========Lista público============= \n"
                + "   == Público total = 500 pessoas     ==\n"
                + "   == Genêro feminino = 200           ==\n"
                + "   == Genêro masculino = 300          ==\n"
                + "   == Nascidos entre 1960 á 1990 =450 ==\n"
                + "   == Nascidos entre 1990 á 2000 = 50 ==\n"
                + "   =====================================\n"
                + "\n  ==========Lista de Músicas ============ \n"
                + " |(A) We Are Chaos - Marilyn Manson;     |\n"
                + " |(B) Sweet Child o Mine - Guns N' Roses;|\n"
                + "  =======================================");

        int acertos = 0;
        int tentativas = 0;

        System.out.println("Digite a letra da primeira música escolhida: ");
        String resposta = input.next();

        char resposta1 = resposta.charAt(0);

        switch (resposta1) {

            case 'a':
            case 'A':
                System.out.println("O público não gostou dessa música!");

                break;
            case 'b':
            case 'B':
                System.out.println("O público amou essa música! \n");

                acertos++;
                break;
            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("\n   ===========Lista público============= \n"
                + "   == Público total = 500 pessoas     ==\n"
                + "   == Genêro feminino = 200           ==\n"
                + "   == Genêro masculino = 300          ==\n"
                + "   == Nascidos entre 1960 á 1990 =450 ==\n"
                + "   == Nascidos entre 1990 á 2000 = 50 ==\n"
                + "   =====================================\n"
                + "\n  ==========Lista de Músicas ============ \n"
                + " |(A) Radio Ga Ga - Queen;               |\n"
                + " |(B) Carnivore - Body Count;            |\n "
                + " =======================================");

        System.out.println("Digite a letra da segunda música escolhida: ");
        resposta = input.next();
        char resposta2 = resposta.charAt(0);

        switch (resposta2) {
            case 'a':
            case 'A':
                System.out.println("O público gostou essa música! \n");
                acertos++;
                break;

            case 'b':
            case 'B':
                System.out.println("O público não gostou dessa música! \n");

                break;
        }
        System.out.println("\n   ===========Lista público============= \n"
                + "   == Público total = 500 pessoas     ==\n"
                + "   == Genêro feminino = 200           ==\n"
                + "   == Genêro masculino = 300          ==\n"
                + "   == Nascidos entre 1960 á 1990 =450 ==\n"
                + "   == Nascidos entre 1990 á 2000 = 50 ==\n"
                + "   =====================================\n"
                + "\n  ==========Lista de Músicas ============ \n"
                + " |(A) Livin on a Prayer - Bon Jovi;      |\n"
                + " |(B) Utgard - Enslaved;                 |\n"
                + "  =======================================");

        System.out.println("Digite a letra da terceira música escolhida: ");
        resposta = input.next();
        char resposta3 = resposta.charAt(0);

        switch (resposta3) {
            case 'a':
            case 'A':
                System.out.println("O público gostou dessa música! \n");
                acertos++;
                break;

            case 'b':
            case 'B':
                System.out.println("O público não gostou dessa música! \n");

                break;
            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("\n   ===========Lista público============= \n"
                + "   == Público total = 500 pessoas     ==\n"
                + "   == Genêro feminino = 200           ==\n"
                + "   == Genêro masculino = 300          ==\n"
                + "   == Nascidos entre 1960 á 1990 =450 ==\n"
                + "   == Nascidos entre 1990 á 2000 = 50 ==\n"
                + "   =====================================\n"
                + "\n  ==========Lista de Músicas ============ \n"
                + " |(A) Nothing else metters - Metallica ; |\n"
                + " |(B) Manifest - Amaranthe ;             |\n"
                + "  =======================================");

        System.out.println("Digite a letra da quarta música escolhida: ");
        resposta = input.next();
        char resposta4 = resposta.charAt(0);

        switch (resposta4) {
            case 'a':
            case 'A':
                System.out.println("O público não gostou dessa música! \n");

                break;

            case 'b':
            case 'B':
                System.out.println("O público gostou dessa música! \n");
                acertos++;
                break;
            default:
                System.out.println("Opção inválida!");
        }
        System.out.println("\n   ===========Lista público============= \n"
                + "   == Público total = 500 pessoas     ==\n"
                + "   == Genêro feminino = 200           ==\n"
                + "   == Genêro masculino = 300          ==\n"
                + "   == Nascidos entre 1960 á 1990 =450 ==\n"
                + "   == Nascidos entre 1990 á 2000 = 50 ==\n"
                + "   =====================================\n"
                + "\n  ==========Lista de Músicas =========== \n"
                + " |(A) Smells Like Teen Spirit - Nirvana;|\n "
                + "|(B) Titans of Creation - Testament;   |\n "
                + " ======================================");

        System.out.println("Digite a letra da terceira música escolhida: ");
        resposta = input.next();
        char resposta5 = resposta.charAt(0);

        switch (resposta5) {
            case 'a':
            case 'A':
                System.out.println("O público gostou dessa música! \n");
                acertos++;
                break;

            case 'b':
            case 'B':
                System.out.println("O público não gostou dessa música! \n");

                break;
            default:
                System.out.println("Opção inválida!");
        }

        int pontos = 0;
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
                + "vídeo para o \nYouTube e Instagram falando um pouco sobre como foi o show!");

        String resposta;

        do {
            System.out.println("Você irá fazer o vídeo? \n Obs: Responda com Sim ou Não!");
            resposta = input.nextLine();

            if (resposta.equalsIgnoreCase("SIM")) {
                System.out.println("Graças ao vídeo sua banda ganhou mais 5 mil seguidores no Instagram"
                        + "e 2500 inscritos no YouTube. Por isso você ganhou mais 25 pontos de poder!");
                System.out.println("Além disso ainda fomos convidados para um festival que valerá +60 pontos e 3 mil reais!");
                pontos = pontos + 25;
                break;
            } else if (resposta.equalsIgnoreCase("NÃO")) {
                System.out.println("Já que você não fez o vídeo você acabou perdendo 2500 seguidores no Intagram, 1250"
                        + "incritos no YouTube e 20 pontos de poder!");
                System.out.println("Porém por sorte você acabou sendo convidado para um festival que valerá +60 pontos e 3 mil reais!");
                pontos = pontos - 20;
                break;
            } else {
                System.out.println("Opção inválida!Tente novamente.");
            }

        } while (!resposta.equalsIgnoreCase("Sim") || !resposta.equalsIgnoreCase("Não"));

        System.out.println("\n Dois meses depois...");

        int escolha;
        do {
            System.out.println("Eu: Eai pessoal todos estão preparados para o festival? Hoje vai ser um grande dia,"
                    + "não podemos esquecer que é uma batalha entre bandas,por isso nós precisamos batalhar contra uma mais \nfraca que nós!"
                    + "Por sorte só mais 3 bandas, além da nossa, irão batalhar, o restante irá apenas tocar no festival.");
            System.out.println("Antonio abre a porta do camarim: \n Opa, vim avisar que daqui 10 minutos vai começar o festival."
                    + "\n Precisamos decidir com qual banda vamos batalhar antes de irmos para o palco. "
                    + "\n Consegui um pouco de informações sobre essas bandas, olha aí a lista: "
                    + "\n (1)Banda DeathLoops: Criada 5 meses atrás, participou de 1 festival e o público amou a banda."
                    + "\n (2)Banda Metalicos : Criada 1 ano atrás, participou de 3 festivais, e foi odiada em todos."
                    + "\n (3)Banda Assasins: Criada 3 meses atrás, participou de 1 festival, e agradou o público nele.");
            System.out.println("Eai qual com você quer batalhar? "
                    + "\n Obs: Digite o número da banda");
            escolha = input.nextInt();

            if (escolha == 1) {
                if (pontos >= 85) {
                    System.out.println("Parábens você venceu a batalha!! A banda DeathLoops tinha apenas 85 pontos de poder e você ganhou mais 40 pontos de poder");
                    pontos = pontos + 60;
                    desafio5();
                } else {
                    System.out.println("Infelizmente você perdeu a batalha! Porque a banda DeathLoops tinham 60 pontos de poder!"
                            + " Com isso seu poder diminuiu 15 pontos e você foi desclassificado da batalha.");
                    pontos = pontos - 15;
                }
            } else if (escolha == 2) {

                if (pontos < 50 && pontos > 15) {
                    System.out.println("Parábens você venceu a batalha!! A banda Metalicos tinha apenas 15 pontos de poder e você ganhou mais 40 pontos de poder");
                    pontos = pontos + 60;
                    desafio5();
                } else {
                    System.out.println("Infelizmente você perdeu a batalha! Porque a banda Metalicos tinha apenas 15 pontos de poder!"
                            + " Como você não conseguiu derrotar a banda mais fraca o público nunca mais quis ouvi-los \n e a jornada para o Rock In Rio acabou.");
                    pontos = pontos - 15;
                }
            } else if (escolha == 3) {

                if (pontos <= 50 && pontos < 85) {
                    System.out.println("Parábens você venceu a batalha!! A banda Assasins tinha apenas 50 pontos de poder e você ganhou mais 60 pontos de poder");
                    pontos = pontos + 60;
                    desafio5();
                } else {
                    System.out.println("Infelizmente você perdeu a batalha! Porque a banda Assasins tinham um poder de 300!"
                            + " Com isso seu poder diminuiu 15 pontos e você foi desclassificado da batalha.");
                    pontos = pontos - 15;
                    desafio5();
                }

            } else {

                System.out.println("Opção inválida!");

            }
        } while (escolha <= 0 || escolha > 3);
    }

    static void desafio5() {

        // Quinto desafioD
        Scanner sc = new Scanner(System.in);

        int ponto = 0;

        System.out.println("Algumas semanas depois... \n");

        System.out.println("Antônio: Pessoal vocês não vão acreditar!! Consegui uma entrevista \n"
                + " para banda num programa de televisão, essa é uma grande oportunidade \n"
                + " para se destacar, haverá milhares de pessoas assistindo. \n");

        System.out.println("O combinado é que vocês toquem cinco músicas, e depois serão entrevistados.\n"
                + " Pelo que me falaram a plateia tem preferência por rock dos anos 90, então vocês terão\n"
                + " que escolher as músicas corretas para agradar a plateia. A entrevista será daqui\n "
                + "dois dias, então já vão se preparando. \n");

        System.out.println("Dois dias depois... \n");

        System.out.println("Antônio: Chegou o grande dia pessoal, espero que vocês estejam preparados, \n"
                + "vocês vão entrar no palco daqui cinco minutos. \n");

        System.out.println("Assistente de palco: Está na hora da apresentação pessoal. \n");

        System.out.println("Antônio: Boa sorte pessoal. \n");

        System.out.println("A plateia tem preferência por rock dos anos 90, escolha a música certa para "
                + "agradar a plateia. \n"
                + "A banda terá que acertar no minimo três de cinco músicas para ir bem no desafio. \n");

        //primeira musica
        do {
            System.out.println("Escolha a primeira música. \n");

            System.out.println("(1)Alice In Chains - Rooster "//correta
                    + "\n(2)Slaughter To Prevail - DEMOLISHER "
                    + "\n(3)Hunger Strike - Temple Of The Dog  "
                    + "\n(4)Death - Symbolic  ");
            int resposta1 = sc.nextInt();

            switch (resposta1) {

                case 1:
                    System.out.println("A plateia adorou a música, não a deixe desanimar e já escolha a próxima. \n");
                    ponto = ponto + 1;
                    break;

                case 2:
                    System.out.println("A plateia detestou a música.\n");
                    break;

                case 3:
                    System.out.println("A plateia detestou a música.\n");
                    break;

                case 4:
                    System.out.println("A plateia detestou a música.\n");
                    break;

                default:
                    System.out.println("Você perdeu a chance de escolher uma música, preste mais atenção na próxima.\n");
            }

            //segunda musica
            System.out.println("Escolha a segunda música.");

            System.out.println("(1)Outkast - Hey Ya!"
                    + "\n(2)Pearl Jam - Jeremy" //correta
                    + "\n(3)MC Poze do Rodo - Eu Fiz o Jogo Virar "
                    + "\n(4)Ice cube - It Was A Good Day ");
            int resposta2 = sc.nextInt();

            switch (resposta2) {

                case 1:
                    System.out.println("A plateia detestou a música.\n");
                    break;

                case 2:
                    System.out.println("A plateia adorou a música, não a deixe desanimar e já escolha a próxima.\n");
                    ponto = ponto + 1;
                    break;

                case 3:
                    System.out.println("A plateia detestou a música.\n");
                    break;

                case 4:
                    System.out.println("É uma boa música mas infelizmente a plateia odiou.\n");
                    break;

                default:
                    System.out.println("Você perdeu a chance de escolher uma música, preste mais atenção na próxima.\n");
            }

            //terceira pergunta
            System.out.println("Escolha a terceira música.");

            System.out.println("(1)George Michael - Careless Whisper"
                    + "\n(2)Coolio - Gangsta's Paradise "
                    + "\n(3)Coldplay - Hymn For The Weekend"
                    + "\n(4)Alice In Chains - Man in the Box");//correta
            int resposta3 = sc.nextInt();

            switch (resposta3) {

                case 1:
                    System.out.println("A plateia detestou a música.\n");
                    break;

                case 2:
                    System.out.println("A plateia detestou a música.\n");
                    break;

                case 3:
                    System.out.println("A plateia detestou a música.\n");
                    break;

                case 4:
                    System.out.println("A plateia adorou a música, não a deixe desanimar e já escolha a próxima.\n");
                    ponto = ponto + 1;
                    break;

                default:
                    System.out.println("Você perdeu a chance de escolher uma música, preste mais atenção na próxima.\n");
            }

            //quarta pergunta
            System.out.println("Escolha a quarta musica.");

            System.out.println("(1)twenty one pilots - Ride"
                    + "\n(2)Rag'n'Bone Man - Human "
                    + "\n(3)Metallica - Nothing Else Matters " //correta
                    + "\n(4)Racionais MC's - Da ponte pra cá");
            int resposta4 = sc.nextInt();

            switch (resposta4) {

                case 1:
                    System.out.println("A plateia detestou a música.\n ");
                    break;

                case 2:
                    System.out.println("A plateia detestou a música.\n ");
                    break;

                case 3:
                    System.out.println("A plateia adorou a música, não a deixe desanimar e já escolha a próxima. \n");
                    ponto = ponto + 1;

                    break;

                case 4:
                    System.out.println("Essa música é sensacional, mas infelizmente não é a música que a plateia prefere. \n");
                    break;

                default:
                    System.out.println("Você perdeu a chance de escolher uma música, preste mais atenção na próxima.\n");
            }

            //quinta pergunta
            System.out.println("Escolha a quinta música.");

            System.out.println("(1)Nirvana - Smells Like Teen Spirit " //correta
                    + "\n(2)Post Malone - Congratulations"
                    + "\n(3)FBC & VHOOR - Vem pro BAILE"
                    + "\n(4)Oliver Tree - Life Goes On");
            int resposta5 = sc.nextInt();

            switch (resposta5) {

                case 1:
                    System.out.println(" A plateia adorou a música. \n");
                    ponto = ponto + 1;
                    break;

                case 2:
                    System.out.println("A plateia detestou a música.\n ");
                    break;

                case 3:
                    System.out.println("Essa música é sensacional, mas infelizmente não é a música que a plateia prefere.\n");
                    break;

                case 4:
                    System.out.println("A plateia detestou a música.\n ");
                    break;

                default:
                    System.out.println("Você perdeu a chance de escolher uma música.\n");
            }

            if (ponto <= 2) {
                System.out.println("Você foi muito mal nas escolhas das músicas, tente novamente. ");

            } else if (ponto >= 3) {
                System.out.println("Parabéns!!! A plateia adorou as músicas escolhidas. ");
            }
            System.out.printf("Você acertou %d músicas \n", ponto);
        } while (ponto <= 2);

        //entrevista
        int ponto1 = 0;
        System.out.println("Agora a banda será entrevistada, tente escolher as respostas certas para agradar os seus fãs. \n");

        System.out.println("Meus parabéns, foi uma ótima apresentação, então, vamos começar a entrevista?\n");
        System.out.println("Banda: Vamos sim!\n");

        //Primeira pergunta da entrevista
        do {
            System.out.println("Apresentador: Qual são os abjetivos futuros da banda? \n");

            System.out.println("(1)Resposta agradável."
                    + "\n (2)Resposta esnobe.");
            int entrevista1 = sc.nextInt();

            switch (entrevista1) {

                case 1:
                    System.out.println("Resposta da banda: Uns dos nossos objetivos e continuar melhorando, para assim conseguir\n"
                            + "alcançar o nosso sonho que é tocar no Rock in Rio. \n");
                    ponto1 = ponto1 + 10;
                    break;

                case 2:

                    System.out.println("Resposta da banda: Preferimos não falar sobre. \n");
                    break;

                default:
                    System.out.println("A banda preferiu não responder. \n");
                    break;
            }

//Segunda pergunta da entrevista
            System.out.println("Apresentador: Há um bom convívio entre vocês? \n");

            System.out.println("(1)Resposta agradável."
                    + "\n (2)Resposta esnobe.");
            int entrevista2 = sc.nextInt();

            switch (entrevista2) {

                case 1:
                    System.out.println("Resposta da banda: Nós fazemos de tudo para manter um bom convívio. \n");
                    ponto1 = ponto1 + 10;
                    break;

                case 2:

                    System.out.println("Resposta da banda: Preferimos não falar sobre. \n");
                    break;

                default:
                    System.out.println("A banda preferiu não responder \n");
                    break;
            }

//terceira pergunta da entrevista
            System.out.println("Apresentador:Algum projeto para o futuro? E vocês tem algum recado para os fãs?\n");

            System.out.println("(1)Resposta agradável."
                    + "\n (2)Resposta esnobe.");
            int entrevista3 = sc.nextInt();

            switch (entrevista3) {

                case 1:
                    System.out.println("Resposta da banda:Sim, temos muitos projetos pela frente, mas não podemos falar\n"
                            + " muito sobre. Nós queríamos agradecer muito ao os nossos fãs, e queria pedir que eles\n"
                            + " continuassem nos acompanhando, porquê isso incentiva muito o nosso trabalho.\n ");
                    ponto1 = ponto1 + 10;
                    break;

                case 2:

                    System.out.println("Resposta da banda:Não podemos comentar sobre. Não temos nada para falar.\n");
                    break;

                default:
                    System.out.println("A banda preferiu não responder. \n");
                    break;

            }
            if (ponto1 <= 20) {
                System.out.println("Apresentador: Bom, podemos ver que essa banda não e muito carismática,\n"
                        + " mas agradeço por ter tocado no meu programa. \n");
                System.out.println("A banda não foi muito bem na entrevista, tente novamente.");
            } else if (ponto1 >= 30) {
                System.out.println("Apresentador: Novamente muito obrigado, e eu gostaria de falar que vocês foram \n"
                        + " uma das melhores bandas que já tocou no meu programa, muito obrigado mesmo. \n");
                System.out.println("Banda: Nos que agradecemos a oportunidade, muito obrigado!! \n");
                System.out.println("A banda foi muito bem na apresentação do programa, com isso a banda conseguiu mais \n "
                        + "reconhecimento, agora ela está mais popular doque nunca.\n");
            }
        } while (ponto1 <= 2);
        desafio6();
    }

    static void desafio6() {
        // sexto desafio 
        Scanner sc = new Scanner(System.in);

        int p1 = 0;
        int ponto2 = 0;

        System.out.println("Após algumas semanas da apresentação do programa, a banda ganhou muita\n"
                + " visibilidade, e conseguiram muitos fãs.\n");

        // inicio do desafio 6
        System.out.println("Você está recebendo uma ligação, você vai atender?");
        do {
            System.out.println("(1)Sim.\n"
                    + "(2)Não.\n");
            int atender = sc.nextInt();

            switch (atender) {

                case 1:
                    System.out.println("Você atendeu, era o Antônio, e tinha uma ótima notícia, ele conseguiu\n"
                            + " um show para fora do país, vocês vão se apresentar na argentina, o show será \n"
                            + "daqui duas semanas, então é melhor você ir se preparando. \n");
                    p1 = p1 + 10;
                    break;

                case 2:
                    System.out.print("Assim que você nega a ligação, o celular começa a tocar de novo, você vai atender?\n");
                    break;
            }
        } while (p1 <= 9);

        System.out.println("Duas semanas depois, a banda já está na argentina, prestes a entrar no palco.\n"
                + " A plateia tem preferência por rock and roll, escolha as músicas certas para agradala, \n"
                + "no intervalo de uma música para outra haverá o feedback da plateia.\n");

        //primeira musica
        do {
            System.out.println("Chegou a hora do show, escolha a primeira música. \n");

            System.out.println("(1)The Animals -House of the Rising Sun  "//correta
                    + "\n(2)Bill Withers - Just the Two of Us \n");
            int musica1 = sc.nextInt();

            switch (musica1) {

                case 1:
                    System.out.println("Banda:Vocês gostaram da música!?  ");
                    System.out.println("Plateia:SIMM!!!");
                    System.out.println("A palteia deu um feedback positivo.\n");
                    ponto2 = ponto2 + 10;
                    break;

                case 2:
                    System.out.println("Banda:Vocês gostaram da música!? ");
                    System.out.println("Plateia:NÃOOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;
            }

            //segunda musica
            System.out.println("Escolha a segunda música. \n");

            System.out.println("(1)Nina Simone - Feeling Good  "
                    + "\n(2)Kiss - Heaven's on Fire"//correta
                    + "\n(3)Cartola - Preciso me encontrar ");
            int musica2 = sc.nextInt();

            switch (musica2) {

                case 1:
                    System.out.println("Banda:Vocês gostaram da música!? ");
                    System.out.println("Plateia:NÃOOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 2:
                    System.out.println("Banda:Vocês gostaram da música!?  ");
                    System.out.println("Plateia:SIMM!!!");
                    System.out.println("A palteia deu um feedback positivo.\n");
                    ponto2 = ponto2 + 10;
                    break;

                case 3:
                    System.out.println("Banda:Vocês gostaram da música!? ");
                    System.out.println("Plateia:NÃOOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;
            }

            //tercerira musica
            System.out.println("Escolha a terceira música. \n");

            System.out.println("(1)James Brown - It's A Man's World "
                    + "\n(2)Roy Orbison - Oh, Pretty Woman "
                    + "\n(3)Paul Anka - Put Your Head on My Shouder"
                    + "\n(4)The Beatles - Let It Be ");//correta
            int musica3 = sc.nextInt();

            switch (musica3) {

                case 1:
                    System.out.println("Banda:Vocês gostaram da música!? ");
                    System.out.println("Plateia:NÃOOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 2:
                    System.out.println("Banda:Vocês gostaram da música!? ");
                    System.out.println("Plateia:NÃOOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 3:
                    System.out.println("Banda:Vocês gostaram da música!? ");
                    System.out.println("Plateia:NÃOOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 4:
                    System.out.println("Banda:Vocês gostaram da música!?  ");
                    System.out.println("Plateia:SIMM!!!");
                    System.out.println("A palteia deu um feedback positivo.\n");
                    ponto2 = ponto2 + 10;
                    break;
            }

            // quarta musica
            System.out.println("Escolha a quarta música. \n");

            System.out.println("(1)The Crows - Time and Time Again "//correta
                    + "\n(2)Roddy Ricch - Down Below"
                    + "\n(3)The police - Every Breath You Take"
                    + "\n(4)MC Kauan - Mestre das fugas "
                    + "\n(5)Yunk vino - Leans");
            int musica4 = sc.nextInt();

            switch (musica4) {

                case 1:
                    System.out.println("Banda:Vocês gostaram da música!?  ");
                    System.out.println("Plateia:SIMM!!!");
                    System.out.println("A palteia deu um feedback positivo.\n");
                    ponto2 = ponto2 + 10;
                    break;

                case 2:
                    System.out.println("Banda:Vocês gostaram da música!? ");
                    System.out.println("Plateia:NÃOOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 3:
                    System.out.println("Banda:Vocês gostaram da música!? ");
                    System.out.println("Plateia:NÃOOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 4:
                    System.out.println("Banda:Vocês gostaram da música!? ");
                    System.out.println("Plateia:NÃOOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo, tente melhorar.\n");
                    break;

                case 5:
                    System.out.println("Banda:Vocês gostaram da música!? ");
                    System.out.println("Plateia:NÃOOO!!! >:(");
                    System.out.println("A palteia deu um feedback negativo.\n");
                    break;
            }

            if (ponto2 == 10) {
                System.out.println("A banda não foi muito bem nesse show, tente novamente. \n");

            } else if (ponto2 == 20) {
                System.out.println("A banda se saiu muito bem, mas poderia ter sido melhor. A plateia ficou satisfeita "
                        + "com a performance.");

            } else if (ponto2 == 30) {
                System.out.println("O show foi ótimo, mas poderia ter sido melhor. A plateia ficou satisfeita com a "
                        + "performance, a banda ganhou novos fãs.");

            } else if (ponto2 == 40) {
                System.out.println("O SHOW FOI INCRIVEL!! Todos da plateia amaram, a banda ganhou muitos fãs.");
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
                + "Nesse festival, vocês terão que derrotar as outras bandas para poderem ganhar o prêmio.");
        System.out.println("\n===== Batalha entre bandas =====");
        System.out.println("Você tem que fazer a vida da banda adversaria chegar a 0 antes da sua,\n"
                + "para isso use as 4 músicas para causar dano e vencer o adversario. ");
        //PRIMEIRA BANDA
        do {
            /*System.out.println(vidaenemy);*/
            System.out.println("\n***Desafio contra Região Urbana***");
            System.out.println("Vida da sua banda = " + vida + " | Vida da banda inimiga = " + vidaenemy);
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
            System.out.println("Vida da sua banda = 0");
            System.out.println("Sua banda foi derrotada\nGAME OVER!!!");
            System.exit(0);
        }

        vida = 100;
        vidaenemy = 100;

        //TERCEIRA BANDA
        do {
            /*System.out.println(vidaenemy);*/
            System.out.println("\n***Desafio contra Os Titãs***");
            System.out.println("Vida da sua banda = " + vida + " | Vida da banda inimiga = " + vidaenemy);
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
            System.out.println("Vida da sua banda = 0");
            System.out.println("Sua banda foi derrotada\nGAME OVER!!!");
            System.exit(0);
        }

        System.out.println("==== PARABÉNS ====\nSUA BANDA FOI A CAMPEÃ DA BATALHA DE BANDAS.");
        desafio8();
    }
    //DESAFIO 8
    static void desafio8() {
        Scanner input = new Scanner(System.in);
        int musica, gostou = 0;
        String ligacao;

        System.out.println("\nA banda foi convidada para tocar em um evento,e descobrimos que neste lugar estará Roberto Medina."
                + "\nEle que é um empresário e é um dos fundadores do Rock In-Rio. Então pode ser uma oportunidade de conhece-lo,"
                + "\ne podemos fazer com que ele olhe a banda e talvez dê uma oportunidade para todos, quem sabe né....."
                + "\n\n Em uma conversa totalmente informal, o Roberto sinalizou que gosta muito de guitarra, que tem um sonho de conhecer"
                + "\no Slash, pois é um dos grandes ídolos dele no meio musical.");

        do {
            System.out.println("\n----- CHEGOU O GRANDE DIA DO EVENTO.....ESTÃO PREPARADOS? -----"
                    + "\n Pense muito bem no que Roberto Medina disse, aproveite este momento para surpreende-lo. Pois não sabemos quando iremos escontra-lo denovo"
                    + "\n\n ESCOLHA UMA MÚSICA QUE A BANDA IRÁ TOCAR:");
            System.out.println("\n1 - Queen - Love Of My Life"
                    + "\n2 - James Taylor - Only a Dream in Rio"
                    + "\n3 - Guns N’ Roses - You Could Be Mine"
                    + "\n4 - Faith No More -  The Real Thing");
            musica = input.nextInt();

            if (musica == 3) {
                System.out.println("HA HA HA HA sabia que a banda ia fazer a escolha certa."
                        + "\nDeu para ver de longe que o Roberto se emocionou muito com a apresentação de vocês e que certeza ele gostou muito. "
                        + "\nEsta apresentação foi a melhor de todas...PARABÉNS!!!"
                        + "\nO sucesso esta começando, prepara-se para maiores desafios");
                gostou = 1;
            } else {
                if (musica > 0 && musica <= 4) {
                    System.out.println("\nA apresentação foi ótima, mas percebi que o Roberto não estava prestando atenção, estava conversando muito e nem olhava para o palco. :("
                            + "\n Após alguns dias de angustia, para saber quais bandas vão tocar no rock in rio, saiu a lista, e não estaremos lá, deixamos escapar uma oportunidade única."); 
                    break;
                } else {
                    System.err.println("\nESCOLHA A MÚSICA CORRETA!!!");
                }

            }
        } while (musica > 4);

        if (gostou == 1) {
            System.out.println("\nApós alguns dias, o Antonio que é o empresario da banda, recebe uma ligação anonima. O mesmo questiona todos os integrantes"
                    + "\n se é para atender ou não."
                    + "\n---- QUEREM ATENDER A LIGAÇÃO? (S = sim/N = não) ----");
            ligacao = input.next();

            if (ligacao.equals("s") || ligacao.equals("S")  || ligacao.equals("sim") || ligacao.equals("Sim") || ligacao.equals("SIM")) {
                System.out.println("A LIGAÇÃO ANONIMA É DE NADA MENOS QUE ROBERTO MEDINA....ISSO MESMO, ELE DISSE QUE NUNCA VIU UMA APRESENTAÇÃO COMO AQUELA"
                        + "\nELE DISSE QUE TOCOU MUITO O CORAÇÃO DELE NAQUELE DIA, E QUE AQUELA APRESENTAÇÃO FICARA NA CABEÇA DELE PARA SEMPRE."
                        + "\nENTÃO ELE DECIDIU CONVIDAR A BANDA PARA TOCAR NO ROCK INT RIO DESTE ANO....ISSO MESMO...CONSEGUIMOS CHEGAR NO NOSSO GRANDE OBJETIVO"
                        + "\nROCK IN RIO QUE NOS ESPERA !!!! ");

            } else {
                System.out.println("O rock in rio ja foi anunciado e vocês não conseguiram participar. Quem sabe ano que vem.");
            }

        }
    }
}
