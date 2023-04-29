public class Parabola
{
    private int saved_a;
    private int saved_b;
    private int saved_c;

    public Parabola(int input_a, int input_b, int input_c)
    {
        saved_a = input_a;
        saved_b = input_b;
        saved_c = input_c;
    }

    public double getAxis()
    {
        if( saved_a!=0 )
        {
            return saved_b*(-1.0)/(2.0*saved_a);
        }

        return 0;
    }

    public boolean isOnGraph( int point_x, int point_y)
    {
        double y = saved_a * point_x * point_x + saved_b * point_x + saved_c;
        if (y == (double)point_y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}