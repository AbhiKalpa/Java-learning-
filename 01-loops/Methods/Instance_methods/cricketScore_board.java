package Methods.Instance_methods;

public class cricketScore_board {
    int totalRuns = 100;

    public void addRuns(int runs){
        totalRuns  = totalRuns + runs;
    }

    public void scoreBoard(){
        System.out.println("Total runs scored by the player is "+totalRuns);
    }

    public static void main(String[] args){
        System.out.println("welcome to ipl ");

        cricketScore_board obj = new cricketScore_board();

        obj.addRuns(50);
        obj.scoreBoard();
    }
}
