package Day19;

public class ChessBoard {
    ChessPiece[][] figureArray;

    public ChessBoard(ChessPiece[][] figureArray) {
        this.figureArray = figureArray;
    }

    public void print() {
        for (int i = 0; i < figureArray.length; i++) {
            for (int j = 0; j < figureArray[i].length; j++) {
                System.out.print(figureArray[i][j]);
            }
            System.out.println();
        }
    }
}
