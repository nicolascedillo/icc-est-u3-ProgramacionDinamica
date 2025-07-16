public class Maze {
    private boolean[][] grid;

    public Maze(boolean[][] grid) {
        this.grid = grid;
    }

    public void printMaze() {
        for (boolean[] fila : grid) {
            for (boolean columna : fila) {
                if (columna) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public boolean[][] getgrid() {
        return grid;
    }

    

}
