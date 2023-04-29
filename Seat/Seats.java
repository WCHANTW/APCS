public class Seats {

    private final int SEAT_ROW = 3;
    private final int SEAT_COL = 6;

/* 
    private int [][] seats = {  {0, 0, 1, 1, 0, 1},
                                {0, 1, 0, 1, 0, 1},
                                {1, 0, 0, 0, 1, 1}};
*/
    
    private int [][] seats = {  {0, 1, 0,  1, 0, 1},
                                {1, 1, 0, 1, 0, 1},
                                {0, 1, 1, 1, 1, 1}};


    public Seats()
    {
        //seats = new boolean[SEAT_ROW][SEAT_COL];
    }

    public void resetSeats(int row, int col) {
        seats[row][col] = false;
    }

    public void setSeats(int row, int col) {
        seats[row][col] = true;
    }

    public boolean getSeats(int row, int col)
    {
        return seats[row][col];
    }

    public boolean twoTogether()
    {
        boolean bFound = false;

        System.out.println("    [0] [1] [2] [3] [4] [5]");

        for(int i=0; i<SEAT_ROW; i++)
        {
            System.out.print("[");
            System.out.print(Integer.toString(i));
            System.out.print("] ");

            for(int j=0; j<SEAT_COL-1; j++)
            {
                if(seats[i][j]==0 && seats[i][j+1]==0)
                {
                    seats[i][j]= 1;
                    seats[i][j+1]= 1;
                    
                    bFound = true;
                }
                
                System.out.print("[");
                System.out.print(Integer.toString(seats[i][j]));
                System.out.print("] [");
                System.out.print(Integer.toString(seats[i][j+1]));
                System.out.print("] ");
                j++;
            }

            System.out.println("");
        }

        return bFound;
    }
}
