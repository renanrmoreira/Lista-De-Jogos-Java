import java.util.Scanner;

public class Jogos {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        DoublyLinkedList deque = new DoublyLinkedList();
        boolean repeticao = true;
        deque.addFirst("Destiny");
        deque.addFirst("Gta V");
        deque.addFirst("Tom Clancy's Rainbow Six Siege");
        deque.addFirst("Valorant");
        deque.addFirst("LoL");
        deque.addFirst("CS 2");


        do{
        
        System.out.println("");
        System.out.println("##BEM VINDO A BIBLIOTECA DE JOGOS##");
        System.out.println("1-Adicionar jogos");
        System.out.println("2-Consultar jogos");
        System.out.println("3-Editar jogos");
        System.out.println("4-Deletar jogos");
        System.out.println("5-Sair");

        String escolha;
        escolha = ler.next();
        ler.nextLine();

        String subEscolha;

        switch (escolha) {

            case "1":
                System.out.println("Você deseja adicionar jogos ao inicio da fila(1) ou ao final(2)?");
                subEscolha = ler.next();
                ler.nextLine();                

                if (subEscolha.equals("1")) {
                    System.out.print("Digite o nome do jogo que deseja adicionar: ");
                    deque.addFirst(ler.nextLine());
                } else if (subEscolha.equals("2")) {
                    System.out.print("Digite o nome do jogo que deseja adicionar: ");
                    deque.addLast(ler.nextLine());
                } else {
                    System.out.println("Você digitou uma opção inválida!");
                }

                break;

                case "2":
                    System.out.println("Sua lista de jogos: ");
                    System.out.println("");
                    deque.printList();
                    break;

                case "3":
                    System.out.println("Digite o jogo que você quer editar");
                    deque.editarJogo(ler.nextLine()); 
                    break;

                case "4":
                System.out.println("Você deseja deletar um jogo ao inicio da fila(1) ou ao final(2)?");
                subEscolha = ler.next();

                if(subEscolha.equals("1")){
                    deque.removeFirst();
                    System.out.println("Lista nova: ");
                    deque.printList();
                }else if(subEscolha.equals("2")){
                    deque.removeLast();
                    System.out.println("Lista nova: ");
                    deque.printList();
                }
                    break;

                case "5":
                    System.out.println("Obrigado por usar!");
                    repeticao = false;
                    break;

                default:
                    System.out.println("Valor inválido");
                    break;
                }} while(repeticao);
        ler.close();
    }
}
