package Exemplo;

public class Main {
    
    public static void main(String[] args){

        Animal animal1 = new Animal("Homo Sapiens" , 60 , 19 , "Fêmea" , "Gay");
        Cachorro cachorro1 = new Cachorro("Cannis", 20, 7, "Macho", "Vira-Lata", "Cagar");

        animal1.info();
        cachorro1.info();
        cachorro1.comer();
        cachorro1.getPeso();
        cachorro1.latir();
        cachorro1.aniversario();
        cachorro1.getIdade();
    }
}