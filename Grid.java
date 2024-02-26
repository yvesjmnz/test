public class Grid {
    private int size;
    private char[][] grid;
    public Grid(int size) {
        this.size = size;
        this.grid = new char[size][size];
        initializeGrid();
    }

    private void initializeGrid() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = '-';
            }
        }
    }

    public void displayGrid() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void placePeg(int row, int col) {
        grid[row][col] = 'P';
    }

    public void removePeg(int row, int col) {
        grid[row][col] = '-';
    }

    public int getSize() {
        return size;
    }
}
