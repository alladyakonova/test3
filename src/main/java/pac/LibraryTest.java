package pac;

public class LibraryTest {

    public static void main(String[] args) {


   Library book1 = new Library("Гарри Поттер", "Джоан Роулинг", 1998,"Фэнтези");
   // book1.bookTitle = "новое название";
   book1.author = "новый автор";
   book1.category = "новая категория";
   book1.year = 2000;


    book1.setBookTitle ("новое название");
    book1.setAuthor ("новый автор");
    book1.setCategory ("новая категория");
    book1.setYear (2000);

    }
}
