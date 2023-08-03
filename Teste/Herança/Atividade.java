package Herança;

public class Atividade {
     
    public static void main(String[] args){

        Carros carro1 = new Carros("Golf");
        Carros carro2 = new Carros("HIV");
        CarroCombate carro3 = new CarroCombate("Civic", 69);
        CarroCombate carro4 = new CarroCombate("Bruno Gay", 95);

        carro1.Info();
        carro2.Info();
        carro3.Info();
        carro4.Info();

    }
}
