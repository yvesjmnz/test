public class Player {
    private int row;
    private int col;

    public Player(int startRow, int startCol) {
        this.row = startRow;
        this.col = startCol;
    }

    public void move(String direction, int gridSize) {
        switch (direction.toLowerCase()) {
            case "up":
                row = Math.max(0, row - 1);
                break;
            case "down":
                row = Math.min(gridSize - 1, row + 1);
                break;
            case "left":
                col = Math.max(0, col - 1);
                break;
            case "right":
                col = Math.min(gridSize - 1, col + 1);
                break;
        }
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
