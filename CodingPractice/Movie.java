public class Movie {
    private String title;
    private int length; //in minutes

    public Movie(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
