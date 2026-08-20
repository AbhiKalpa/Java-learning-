package Access_modifires.ProtectedModifier.practice2.player;
import Access_modifires.ProtectedModifier.practice2.game.GameEngine;



public class Proplayer extends GameEngine {

    public void startGame(){
        activateCheetCOde();
    }

    public static void main(String[] args){
        Proplayer pp = new Proplayer();

        pp.startGame();

    }
}
