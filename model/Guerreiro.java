package model;

public class Guerreiro extends Personagem {
    private String arma;
    private boolean armadura;

    public Guerreiro(String nome, int nivel, String arma, boolean armadura){
    super(nome, "Guerreiro",nivel);
    this.arma = arma;
    this.armadura = armadura;
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Golpe devastador!");
    }

    @Override
    public void atacar(double dano) {
        System.out.println("O guerreiro "+nome+" está sendo atacado!!");
        super.atacar(dano);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Arma: "+arma);
        System.out.println("Armadura:"+armadura);
    }

    public void defender(){
        this.vida -= 10;
        System.out.println(nome+" está defendendo!");
    }

    public void berrar(){
        System.out.println("O guerreiro está berrando de raiva!!");
    }
    
}
