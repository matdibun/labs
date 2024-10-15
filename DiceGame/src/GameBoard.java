public class GameBoard {
    private int size;
    Player player1;
    Player player2;
    public GameBoard(int size, Player player1, Player player2) {


    }

    public void paintComponent(Graphics g) {
        // 게임 진행과 상관없이 그릴 부분
        // ...

        if (player1.rolled() != null && player2.rolled() != null) {
            // 게임 진행 후(주사위를 굴린 다음)에 그릴 부분
            // ...
        }
    }
}
