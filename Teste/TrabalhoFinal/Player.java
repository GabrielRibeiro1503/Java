public class Player {
    
    private String nick;
    private int tamInvent;
    private int[] inventario = new int[tamInvent];

    public Player(String nick){
        this.nick = nick;
        this.tamInvent = 10;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}