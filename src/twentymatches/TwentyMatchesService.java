package twentymatches;

import java.util.Scanner;

import static twentymatches.GameLogMessages.*;
import static twentymatches.TwentyMatchesGame.*;

public class TwentyMatchesService {

    static Scanner scanner = new Scanner(System.in);

    static void startGame(){
        setMatchesOnTable(AMOUNT_OF_MATCHES_IN_GAME);
        setPlayerTurn(false);
        System.out.println(gameStartsDeclaration + opponentDeclaration);
        printMatchesOnTable();
    }

    public static void printMatchesOnTable() {
        System.out.println("Matches remaining: " + getMatchesOnTable());
        for (int i = 0; i < getMatchesOnTable(); i++) {
            System.out.print("|");
        }
        System.out.println();
    }

    public static void separateTurns(){
        System.out.println(turnSeparator);
    }

    public static int decideAIMove(){
        if (getMatchesOnTable() == 8 || getMatchesOnTable() == 4) {
            return 3;
        } else if (getMatchesOnTable() == 7 || getMatchesOnTable() == 3) {
            return 2;
        }
        return 1;
    }

    public static void letPlayerMakeTurn(){
        System.out.print("Your turn." + playerWillPullMessage);
        int matchesPulledByPlayer = scanner.nextInt();
        while (matchesPulledByPlayer < 1 || matchesPulledByPlayer > 3){
            System.out.print("Invalid input." +  playerWillPullMessage);
            matchesPulledByPlayer = scanner.nextInt();
        }
        System.out.println(playerTurnStartsMessage + matchesPulledByPlayer + turnEndsMessage);
        setMatchesOnTable(getMatchesOnTable() - matchesPulledByPlayer);
        printMatchesOnTable();
        setPlayerTurn(!isPlayerTurn());
    }

    public static void aIMakesTurn(){
        int matchesPulledByAI = decideAIMove();
        System.out.println(aITurnStartsMessage + matchesPulledByAI + turnEndsMessage);
        setMatchesOnTable(getMatchesOnTable() - matchesPulledByAI);
        printMatchesOnTable();
        setPlayerTurn(!isPlayerTurn());
    }
}