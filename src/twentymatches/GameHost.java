package twentymatches;

import static twentymatches.GameLogMessages.*;
import static twentymatches.TwentyMatchesGame.getMatchesOnTable;
import static twentymatches.TwentyMatchesGame.isPlayerTurn;
import static twentymatches.TwentyMatchesService.*;


public class GameHost {
    public static void main(String[] args) {
        hostGame();
    }

    static String winner;

    static void hostGame(){
        startGame();
        while(getMatchesOnTable() > 1){
            separateTurns();
          if (isPlayerTurn()) {
              letPlayerMakeTurn();
          } else {
              aIMakesTurn();
            }
          }
        winner = (!isPlayerTurn()) ? playerWonMessage
                                  : aIWonMessage ;
        System.out.println(declareEndGameMessage + winner);
        }
}
