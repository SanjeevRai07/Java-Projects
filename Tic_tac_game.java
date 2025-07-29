import java.util.Scanner;

public class Tic_tac_game {
    static char[][] board = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gameEnded = false;

        System.out.println("🎮 Welcome to Tic-Tac-Toe Game!");
        printBoard();

        while (!gameEnded) {
            System.out.print("\nPlayer " + currentPlayer + ", enter a number (1-9): ");
            int move = sc.nextInt();

            if (makeMove(move)) {
                printBoard();

                if (checkWinner()) {
                    System.out.println("🎉 Player " + currentPlayer + " wins!");
                    gameEnded = true;
                } else if (isBoardFull()) {
                    System.out.println("🤝 It's a draw!");
                    gameEnded = true;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("❌ Invalid move! Try again.");
            }
        }

        sc.close();
    }

    // Function to print the board
    public static void printBoard() {
        System.out.println();
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(" " + cell + " ");
            }
            System.out.println();
        }
    }

    // Make a move
    public static boolean makeMove(int move) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == (char)(move + '0')) {
                    board[i][j] = currentPlayer;
                    return true;
                }
            }
        }
        return false;
    }

    // Check for a win
    public static boolean checkWinner() {
        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if (
                (board[i][0] == currentPlayer &&
                 board[i][1] == currentPlayer &&
                 board[i][2] == currentPlayer) ||

                (board[0][i] == currentPlayer &&
                 board[1][i] == currentPlayer &&
                 board[2][i] == currentPlayer)
            ) return true;
        }

        // Diagonals
        if (
            (board[0][0] == currentPlayer &&
             board[1][1] == currentPlayer &&
             board[2][2] == currentPlayer) ||

            (board[0][2] == currentPlayer &&
             board[1][1] == currentPlayer &&
             board[2][0] == currentPlayer)
        ) return true;

        return false;
    }

    // Check if board is full
    public static boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell != 'X' && cell != 'O') {
                    return false;
                }
            }
        }
        return true;
    }

    // Switch players
    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
