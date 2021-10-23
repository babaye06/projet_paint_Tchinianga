public class Point
{
    public int getX() {return X;}

    public int getY() {return Y;}

    public void setX(int Xutilisateur)
    {this.X = Xutilisateur;}

    public void setY(int Yutilisateur)
    {this.Y = Yutilisateur;}

    @Override
    public String toString() {
        return "Position : /n" + "X : " + this.X + "/n Y : " + this.Y;
    }

    public Point()
    {this.X = this.Y =0;}

    public Point (int a, int b)
    {this.X = a;
        this.Y = b;}
    /*-----------------------------------------------------------------*/
    private int X, Y;
}
