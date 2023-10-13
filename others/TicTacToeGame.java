import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        char currentPlayer = 'X';
        boolean gameWon = false;
        
        printBoard(board);
        
        while (!gameWon) {
            int[] move = getPlayerMove(currentPlayer);
            int row = move[0];
            int col = move[1];
            
            if (isValidMove(board, row, col)) {
                board[row][col] = currentPlayer;
                printBoard(board);
                
                if (checkWin(board, currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameWon = true;
                } else if (isBoardFull(board)) {
                    System.out.println("It's a draw!");
                    gameWon = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    // Print the Tic Tac Toe board
    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Get a player's move (row and column)
    public static int[] getPlayerMove(char player) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Player " + player + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            return new int[] { row, col };
        }
    }

    // Check if a move is valid
    public static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ');
    }

    // Check if a player has won
    public static boolean checkWin(char[][] board, char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        
        return false;
    }

    // Check if the board is full (draw)
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
