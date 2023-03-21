public class Andy extends Human{
    private boolean mahjong = false;
    Andy(String name, int age){
        super(name,age);
    }
    public void playMahjong(){
        System.out.println("this is so fun guys");
        mahjong = true;
    }
    public boolean playedMahjong(){
        return mahjong;
    }
}
