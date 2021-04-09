class Point{
    private double x;
    private double y;
    public Point(){

    }
    public Point(double x, double y ){
        this.x = x;
        this.y = y;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getX(){
        return x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getY(){
        return y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(double x, double y){
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y-y)*(this.y-y));
    }
    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }

    public static void main(String[] args) {
        Point point = new Point(1.2,2.3);
        Point point1 = new Point(5.2,2);
        System.out.println(point.distance(point1));
        System.out.println(point1.distance(1,2));
    }
}
