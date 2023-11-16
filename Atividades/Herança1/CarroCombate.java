package Herança;

public class CarroCombate extends Carros{

    private final int MAX_ARMAMENTO = 100;
    private final int MIN_ARMAMENTO = 0;
    private int qtdArmamento;

    public CarroCombate(String nome, int blindagem){
        super(nome);
        setArmamento(true);
        setBlindagem(blindagem);
        this.qtdArmamento=100;
    }

    public int getQtaArmamento(){
        return this.qtdArmamento;
    }

    public void setQtdArmamento(int qtdArmamento){
        this.qtdArmamento+=qtdArmamento;
        if(this.qtdArmamento > MAX_ARMAMENTO){
            this.qtdArmamento=MAX_ARMAMENTO;
        }
        if(this.qtdArmamento < MIN_ARMAMENTO){
            this.qtdArmamento=MIN_ARMAMENTO;
        }
    }

    public void atirar(){
        if(this.qtdArmamento > MIN_ARMAMENTO){
            setQtdArmamento(-1);
        }else{
            System.out.println("Armamento insuficiente!");
        }
    }
    
    public void Info(){
        super.Info();
        System.out.printf("Qtd.Armamento.....%d%n",this.qtdArmamento);
    }
}