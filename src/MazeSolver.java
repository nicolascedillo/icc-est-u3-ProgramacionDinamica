import java.util.List;

public interface MazeSolver {

    List<Cell> getPath(boolean[][] grid, Cell start, Cell end);

}
