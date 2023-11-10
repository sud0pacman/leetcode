package string;

public class _1079_numTilePossibilities {
    public static void main(String[] args) {
        System.out.println(64 - 24);
    }

    public boolean stoneGame(int[] piles) {
        //start->end
        int alice=0;
        for(int i=0; i<piles.length; i+=2){
            alice+=piles[i];
        }
        int bob=0;
        for(int i=1; i<piles.length; i+=2){
            bob+=piles[i];
        }

        //end->start
        int alice1=0;
        for(int i=piles.length-1; i>=0 ; i-=2){
            alice1+=piles[i];
        }
        int bob1=0;
        for(int i=piles.length-2; i>=0 ; i-=2){
            bob1+=piles[i];
        }

        return alice>bob || alice1>bob1;

    }
}
