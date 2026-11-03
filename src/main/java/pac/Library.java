package pac;

public class Library {

    private String bookTitle;
    protected String author;
    int year;
    public String category;

    // private String bookTitle;
   // protected String author;
    // int year;
   // public String category;

    String getBookTitle () {
        return this.bookTitle;
    }

    String getAuthor () {
        return this.author;
    }

    int getYear () {
        return this.year;
    }

    String getCategory () {
        return this.category;
    }


    void setBookTitle (String newBookTitle) {
        this.bookTitle = newBookTitle;
    }

    void  setAuthor (String newAuthor) {
        this.author = newAuthor;
    }

    void setYear (int newYear) {
        this.year = newYear;
    }

    void setCategory (String newCategory) {
        this.category = newCategory;
    }


    public Library (String someBookTitle, String someAuthor, int someYear, String someCategory) {
        this.bookTitle = someBookTitle;
        this.author = someAuthor;
        this.year = someYear;
        this.category = someCategory;
    }


}
