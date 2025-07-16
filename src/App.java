import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nombre: Nicolas Cedillo");
        // runEjerciciosPD();
        runMaze();
    }

    private static void runEjerciciosPD() {
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        System.out.println("Fibonacci Recursivo");
        long start = System.nanoTime() / 1;
        long resultado = ejerciciosPD.getFibonacci(50);
        long end = System.nanoTime() / 1;
        long duration = end - start;
        System.out.println("Resultado: " + resultado + " en tiempo " + duration);

        System.out.println("Fibonacci Recursivo Caching");
        start = System.nanoTime() / 1;
        resultado = ejerciciosPD.getFibonacciPD(50);
        end = System.nanoTime() / 1;
        duration = end - start;
        System.out.println("Resultado: " + resultado + " en tiempo " + duration);

        // Con n=5, es mas lento porque le toma tiempo crear el mapa
    }

    private static void runMaze() {
        boolean[][] predefinedMaze = {
                { true, true, true, true },
                { false, true, true, true },
                { true, true, false, false },
                { true, true, true, true }
        };
        Maze maze = new Maze(predefinedMaze);
        System.out.println("Laberinto cargado: ");
        maze.printMaze();

        Cell start = new Cell(0,0);
        Cell end = new Cell(3,3);
        List<MazeSolver> solvers = Arrays.asList(new MazeSolverRecursivo());

        MazeSolver solver = solvers.get(0);
        List<Cell> path;
        path = solver.getPath(maze.getgrid(), start, end);

        System.out.println("\nCamino encontrado");
        System.out.println(path);

    }
}
