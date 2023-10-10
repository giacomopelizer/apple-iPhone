import java.util.Scanner;

import apps.phone;
import apps.safari;
import apps.music;

public class App {
    public static void main(String[] args) throws Exception {
        phone phone = new apps.phone();
        safari safari = new apps.safari();
        music music = new apps.music();
        Scanner scanner = new Scanner(System.in);
        System.out.println("iPhone iniciando... \n iPhone ligado");
        System.out.println("O que deseja fazer? \n 1 - Telefone \n 2 - Navegador Web \n 3 - iPod \n 4 - Desligar");

        Integer opc = scanner.nextInt();

        while(opc!=4){
            if(opc.equals(1)){
                System.out.println("Selecione uma opção: \n 1 - Ligar \n 2 - Atender ligação \n 3 - Acessar Correio de voz \n 4 - Sair");
                Integer subopc = scanner.nextInt();
                while(subopc != 4){
                    if(subopc.equals(1)){
                        phone.fazerLigacao();
                    }else if(subopc.equals(2)){
                        phone.atenderLigacao();
                    }else if(subopc.equals(3)){
                        phone.iniciarCorreioVoz();
                    }else{
                        System.out.println("Opção inválida");
                    }
                    System.out.println("Selecione uma opção: \n 1 - Ligar \n 2 - Atender ligação \n 3 - Acessar Correio de voz \n 4 - Sair");
                    subopc = scanner.nextInt();;
                }
            }else if(opc.equals(2)){
                System.out.println("Selecione uma opção: \n 1 - Exibir página \n 2 - Abrir nova aba \n 3 - Atualizar página \n 4 - Sair");
                Integer subopc = scanner.nextInt();
                while(subopc != 4){
                    if(subopc.equals(1)){
                        safari.exibirPagina();
                    }else if(subopc.equals(2)){
                        safari.abrirNovaAba();
                    }else if(subopc.equals(3)){
                        safari.atualizarPagina();
                    }else{
                        System.out.println("Opção inválida");
                    }
                    System.out.println("Selecione uma opção: \n 1 - Exibir página \n 2 - Abrir nova aba \n 3 - Atualizar página \n 4 - Sair");
                    subopc = scanner.nextInt();;
                }
            }else if(opc.equals(3)){
                System.out.println("Selecione uma opção: \n 1 - Tocar música \n 2 - Pausar música \n 3 - Escolher outra música \n 4 - Sair");
                Integer subopc = scanner.nextInt();
                while(subopc != 4){
                    if(subopc.equals(1)){
                        music.tocarMusica();
                    }else if(subopc.equals(2)){
                        music.pausar();
                    }else if(subopc.equals(3)){
                        music.selecionarMusica();
                    }else{
                        System.out.println("Opção inválida");
                    }
                    System.out.println("Selecione uma opção: \n 1 - Tocar música \n 2 - Pausar música \n 3 - Escolher outra música \n 4 - Sair");
                    subopc = scanner.nextInt();;
                }
            }
            
            System.out.println("1 - Telefone \n 2 - Navegador Web \n 3 - iPod \n 4 - Desligar");
            opc = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Desligando iPhone...");
    }
}