package Day19;

public class ChessPiece {
    private final double figureМalue;
    public ChessPiece PAWN_WHITE = new ChessPiece(1, "♙");
    public ChessPiece ROOK_BLACK = new ChessPiece(5, "♜");
    public ChessPiece EMPTY = new ChessPiece(-1, "_");
    public ChessPiece ROOK_WHITE = new ChessPiece(5, "♖");
    public ChessPiece BISHOP_WHITE = new ChessPiece(3.5, "♗");
    public ChessPiece BISHOP_BLACK = new ChessPiece(3.5, "♝");
    public ChessPiece PAWN_BLACK = new ChessPiece(1, "♟");
    public ChessPiece KING_BLACK = new ChessPiece(100, "♚");
    public ChessPiece KING_WHITE = new ChessPiece(100, "♔");
    public ChessPiece KNIGHT_BLACK = new ChessPiece(3, "♞");
    public ChessPiece KNIGHT_WHITE = new ChessPiece(3, "♘");
    public ChessPiece QUEEN_BLACK = new ChessPiece(9, "♛");
    public ChessPiece QUEEN_WHITE = new ChessPiece(9, "♕");
    private String symbol;


    ChessPiece(double figureМalue, String symbol) {
        this.figureМalue = figureМalue;
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getFigureМalue() {
        return figureМalue;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
