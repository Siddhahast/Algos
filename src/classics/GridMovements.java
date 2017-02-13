package classics;

/**
 * Created by siddhahastmohapatra on 23/01/17.
 */
public class GridMovements {

    Cell [][] matrix;
    int[][] city;

    public static void main(String[] args) {

        Cell[][] matrix = new Cell[5][5];

        for(int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = new Cell(i, j);
            }
        }

        int[][] city = new int[5][5];
        Cell source = matrix[0][0];
        Cell destination = matrix[3][4];

        GridMovements movements = new GridMovements(city);
        int paths = movements.paths(0, 0, 3, 3);
        System.out.println(paths);
    }

    public GridMovements( int[][] city){
        this.city = city;
    }

    public int paths(int row, int col, int destination_row, int destination_col){

        if(isValidCell(row, col)){
            return 0;
        }

        if(isDestination(row, col, destination_row, destination_col)){
            return 1;
        }

        if(row == city.length-1 && col == city[row].length-1){
            return 0;
        }

        return paths(row, col+1, destination_row, destination_col) + paths(row+1, col, destination_row, destination_col);

    }

    private boolean isValidCell(int row,int col){
        if(row<city.length && col<city[row].length){
            return true;
        }
        return false;
    }

    private boolean isDestination(int row, int col, int dest_row, int dest_col){
        if(row == dest_row && col == dest_col){
            return true;
        }
        return  false;
    }

    public int pathWays(Cell source, Cell destination){

        if(!isValidCell(source)){
            return 0;
        }
        if(isDestination(source, destination)){
            return 1;
        }
        if(source.row == matrix.length-1 || source.col==matrix[source.row].length -1){
            return 0;
        }

        return pathWays(matrix[source.row][source.col+1], destination) + pathWays(matrix[source.row+1][source.col], destination);

    }

    public boolean isDestination(Cell x, Cell y){
        if(x.row == y.row && x.col == y.col){
            return true;
        }
        return false;
    }

    private boolean isValidCell(Cell cell){
        int rows= matrix.length;
        int cols = matrix[0].length;

        if(cell.row >= rows){
            return true;
        }
        if(cell.col >= cols){
            return false;
        }
        return true;
    }

    private static class Cell{

        int row;
        int col;

        public Cell(int row, int col){
            this.col = col;
            this.row = row;
        }
    }

}
