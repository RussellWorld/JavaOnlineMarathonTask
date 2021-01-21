package Day19;

public class Task89 {
    public static void main(String[] args) {
        ChessPiece figure = null;
        ChessPiece[] arrFigure = new ChessPiece[8];
        for (int i = 0; i < 8; i++) {
            if (i < 4)
                arrFigure[i] = figure.PAWN_WHITE;
            else
                arrFigure[i] = figure.ROOK_BLACK;
        }
        for (int i = 0; i < arrFigure.length; i++) {
            System.out.print(arrFigure[i] + " ");
        }
    }
}
