package Day19;

public class Task88 {
    public static void main(String[] args) {
        ChessPiece f = null;
        ChessPiece[][] chessBoard = new ChessPiece[][]{
                {f.ROOK_BLACK, f.EMPTY, f.EMPTY, f.EMPTY, f.EMPTY, f.ROOK_BLACK, f.KING_BLACK, f.EMPTY},
                {f.EMPTY, f.ROOK_WHITE, f.EMPTY, f.EMPTY, f.PAWN_BLACK, f.PAWN_BLACK, f.EMPTY, f.PAWN_BLACK},
                {f.PAWN_BLACK, f.EMPTY, f.KNIGHT_BLACK, f.EMPTY, f.EMPTY, f.EMPTY, f.PAWN_BLACK, f.EMPTY,},
                {f.QUEEN_BLACK, f.EMPTY, f.EMPTY, f.BISHOP_WHITE, f.EMPTY, f.EMPTY, f.EMPTY, f.EMPTY,},
                {f.EMPTY, f.EMPTY, f.EMPTY, f.BISHOP_BLACK, f.PAWN_WHITE, f.EMPTY, f.EMPTY, f.EMPTY,},
                {f.EMPTY, f.EMPTY, f.EMPTY, f.EMPTY, f.BISHOP_WHITE, f.PAWN_WHITE, f.EMPTY, f.EMPTY,},
                {f.PAWN_WHITE, f.EMPTY, f.EMPTY, f.QUEEN_WHITE, f.EMPTY, f.PAWN_WHITE, f.EMPTY, f.PAWN_WHITE},
                {f.EMPTY, f.EMPTY, f.EMPTY, f.EMPTY, f.EMPTY, f.ROOK_WHITE, f.KING_WHITE, f.EMPTY,}
        };
        ChessBoard board = new ChessBoard(chessBoard);
        board.print();
    }
}
