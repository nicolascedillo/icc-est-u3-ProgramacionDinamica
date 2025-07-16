import java.util.ArrayList;
import java.util.List;

public class MazeSolverCompletoRecursivo implements MazeSolver{
    @Override
    public List<Cell> getPath(boolean[][] grid, Cell start, Cell end) {
        List<Cell> path = new ArrayList<>();
        if (grid == null || grid.length == 0) {
            return path;
        }
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        if (findPath(grid, start, end, path, visited)) {
            return path;
        }
        return new ArrayList<>();
    }

    private boolean findPath(boolean[][] grid, Cell start, Cell end, List<Cell> path, boolean[][] visited) {
        int row = start.row;
        int col = start.col;

        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || 
            !grid[row][col] || visited[row][col]) {
            return false;
        }

        visited[row][col] = true;

        if (row == end.row && col == end.col) {
            path.add(start);
            return true;
        }

        if (findPath(grid, new Cell(row + 1, col), end, path, visited) ||
            findPath(grid, new Cell(row, col + 1), end, path, visited) ||
            findPath(grid, new Cell(row - 1, col), end, path, visited) ||
            findPath(grid, new Cell(row, col - 1), end, path, visited)) {
            path.add(start);
            return true;
        }

        visited[row][col] = false;
        return false;
    }

}

