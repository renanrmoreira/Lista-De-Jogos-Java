import java.util.Scanner;

public class DoublyLinkedList {
    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;
    int tamanho = 0;
    int total = 0;
    Scanner ler = new Scanner(System.in);

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String value) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
    }

    public void addLast(String value) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head.getNext().setPrev(null);
            head = head.getNext();
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail.getPrev().setNext(null);
            tail = tail.getPrev();
        }
    }
    public void printList() {
        DoublyLinkedListNode currentNode = head;
        while (currentNode != null) {
            if(currentNode.getNext() != null){
            System.out.print(currentNode.getValue() + ", ");
            }else{
                System.out.print(currentNode.getValue());
            }
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    public void editarJogo(String nomeJogo){
        DoublyLinkedListNode currentNode = head;
        while (currentNode != null) {
            if(currentNode.getValue().equals(nomeJogo)){
                System.out.println("Digite o nome do novo jogo:");
                currentNode.setValue(ler.nextLine());
                System.out.println("Jogo atualizado: " + currentNode.getValue());
                return;
            }
            currentNode = currentNode.getNext();
        }
    }
}
