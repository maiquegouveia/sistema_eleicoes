import java.util.Scanner;

class Main{
    public static void main(String[]agrs){
        Scanner scanf = new Scanner(System.in);

        int ciro=0, lula=0, bolsonaro=0, qntVotos=0;
        double porCiro, porLula, porBolso;
        int titulo, voto, votoValido=0;
        String nome;

        do{
            System.out.println("Eleições 2022");
            System.out.print("Digite o seu nome: ");
            nome = scanf.next();

            System.out.println("Olá " + nome + " seja bem-vindo(a)!");
            System.out.print("Digite o seu título de eleitor: ");
            titulo = scanf.nextInt();
            votoValido=0;
            do{
                System.out.println("Candidatos:");
                System.out.println("1 - Lula");
                System.out.println("2 - Ciro");
                System.out.println("3 - Bolsonaro");
                System.out.println("4 - Sair");
                System.out.println("Escolha uma opção --> ");
                voto = scanf.nextInt();
            
                if (voto == 1){
                    lula++;
                    qntVotos++;
                    votoValido=1;
                    System.out.println("Você votou em Lula!");
                } else if (voto == 2){
                    ciro++;
                    qntVotos++;
                    votoValido=1;
                    System.out.println("Você votou em Ciro!");
                } else if (voto == 3){
                    bolsonaro++;
                    qntVotos++;
                    votoValido=1;
                    System.out.println("Você votou em Bolsonaro!");
                } else if (voto == 4){
                    votoValido=1;
                } else {
                    System.out.println("Opção inválida.");
                }

            } while (votoValido != 1);

        } while (voto != 4);

            porLula = (lula * 100) / qntVotos;
            porCiro = (ciro * 100) / qntVotos;
            porBolso = (bolsonaro * 100) / qntVotos;

        if (porLula >= 50 && porCiro < 50 && porBolso < 50){
            System.out.println("Votação encerrada!");
            System.out.println("Lula foi o vencedor.");
        } else if (porCiro >= 50 && porLula < 50 && porBolso < 50){
            System.out.println("Votação encerrada!");
            System.out.println("Ciro foi o vencedor.");
        } else if (porBolso >= 50 && porLula < 50 && porCiro < 50){
            System.out.println("Votação encerrada!");
            System.out.println("Bolsonaro foi o vencedor.");
        } else {
            System.out.println("Segundo turno!");
            if (porLula > porBolso && porCiro > porBolso){
                System.out.println("Lula: " + porLula + "%");
                System.out.println("Ciro: " + porCiro + "%");
            } else if (porLula > porCiro && porBolso > porCiro){
                System.out.println("Lula: " + porLula + "%");
                System.out.println("Bolsonaro: " + porBolso + "%"); 
            } else if (porCiro > porLula && porBolso > porLula){
                System.out.println("Ciro: " + porCiro + "%");
                System.out.println("Bolsonaro: " + porBolso + "%"); 
            }
        }

        scanf.close();
    }
}