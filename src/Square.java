public class Square implements Comparable<Square>{
    int height;
    int width;


    public Square(int height, int width) {
        this.height = height;
        this.width = width;

    }

    public int getPerim(){
        return (this.height * 2) + (this.width * 2);
    }

    @Override
    public int compareTo(Square o) {
        System.out.println(Integer.compare(this.getPerim(), o.getPerim()));
        return Integer.compare(this.getPerim(), o.getPerim());
    }
}
