package pac1;

public class LibraryTest2 {
    public static void main(String[] args) {

        Library book2 = new Library("Гарри_Поттер", "Джоан_Роулинг", 1990,"Фэнтезиbb");
        book2.bookTitle = "новое_название";
        book2.author = "новый_автор";
        book2.category = "новая_категория";
        book2.year = 2001;


        book2.setBookTitle ("новое название");
        book2.setAuthor ("новый автор)";
        book2.setCategory ("новая категория");
        book2.setYear (2000);

    }

}
