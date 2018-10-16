package ed.pilha;

import java.util.Stack;
import ed.pilha.Pilha;

public class TesteDaPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push("Maurício");
        System.out.println(pilha);

        pilha.push("Guilherme");
        System.out.println(pilha);

        String r1 = pilha.pop();
        System.out.println(r1);

        String r2 = pilha.pop();
        System.out.println(r2);

        System.out.println(pilha.vazia());
        pilha.push("Marcelo");
        System.out.println(pilha.vazia());

        System.out.println(pilha);

        //Pilha do Java
        Stack<String> stack = new Stack<String>();

        stack.push("Maurício");
        stack.push("Marcelo");
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        String nome = stack.peek();
        System.out.println(nome);
        System.out.println(stack);
    }
}