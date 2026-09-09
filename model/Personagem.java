package model;

public class Personagem {
    protected String nome;
    protected String classe;
    protected int nivel;
    protected double vida = 100.0;
    
    // Construtor
    public Personagem(String nome, String classe, int nivel) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
    }

    public void atacar(double dano){
        this.vida -= dano;
        System.out.println(nome+" Perdeu "+dano+" de vida!! Vida atual: "+vida);
    }

    public void descansar(int horas){
        this.vida = Math.min(100.0, this.vida + (horas * 5));
        System.out.println("Sua vida aumentou em "+horas*5+". Vida atual: "+vida);
    }

    public void usarHabilidade(){
        System.out.println("O personagem está usando uma habilidade");
    }

    public void exibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Classe: "+classe);
        System.out.println("Nível: "+nivel);
        System.out.println("Vida: "+vida);
    }

    public String getClasse() { return classe; }
    public int getNivel() { return nivel; }
    public String getNome() { return nome; }
    public double getVida() { return vida; }
}
