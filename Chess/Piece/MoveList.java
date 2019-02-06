package Chess.Piece;

public enum MoveList {
    UP(0, 1),
    UP_RIGHT(1, 1),
    RIGHT(1, 0),
    DOWN_RIGHT(1, -1),
    DOWN(0, -1),
    DOWN_LEFT(-1, -1),
    LEFT(-1, 0),
    UP_LEFT(-1, 1),

    KNIGHT_UP_LEFT(-1, 2),
    KNIGHT_UP_RIGHT(1, 2),
    KNIGHT_DOWN_LEFT(-1, -2),
    KNIGHT_DOWN_RIGHT(1, -2),
    KNIGHT_LEFT_UP(-2, 1),
    KNIGHT_LEFT_DOWN(-2, -1),
    KNIGHT_RIGHT_UP(2, 1),
    KNIGHT_RIGHT_DOWN(2, -1),

    DOUBLE_UP(0, 2),
    DOUBLE_DOWN(0, -2),
    DOUBLE_LEFT(-2, 0),
    DOUBLE_RIGHT(2, 0);

    private int x;
    private int y;

    MoveList(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private boolean hasCollided;

    public boolean hasCollided() {
        return hasCollided;
    }

    public void setHasCollided(boolean hasCollided) {
        this.hasCollided = hasCollided;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isEqual(MoveList m) {
        return (this.x==m.getX())&&(this.y==m.getY());
    }

    public boolean isEqual(int x, int y) {
        return (this.x==x)&&(this.y==y);
    }
}
