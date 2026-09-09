package app;

import model.Personagem;
import model.Guerreiro;

public class TestePersonagens {
    public static void main(String[] args) {
        System.out.println("1. Teste de criação ");
        System.out.println();

        Personagem p = new Personagem("Merlin" , "Mago" , 10);
        p.exibirInfo();
        System.out.println();

        System.out.println("2. Testando métodos básico:");
        p.atacar(20);
        p.descansar(4);
        p.usarHabilidade();
        System.out.println();

        System.out.println("3. Criando um guerreiro:");
        Guerreiro g = new Guerreiro("Conan", 8 , "Espada de ferro", true);
        g.exibirInfo(); 
        System.out.println();

        System.out.println("4. Testando heranca:");
        g.atacar(15);
        g.usarHabilidade();
        System.out.println();

        System.out.println("5. Metodos especificos:");
        g.defender();
        g.berrar();
        System.out.println();

        System.out.println("=== Fim do teste ===");
    }
}
