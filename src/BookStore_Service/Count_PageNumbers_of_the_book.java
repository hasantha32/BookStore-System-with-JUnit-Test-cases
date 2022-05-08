package BookStore_Service;

import java.util.LinkedList;
import java.util.List;

class Book {
    private String title;
    private int numOfPages;

    public Book(String title, int numOfPages) {
        this.title = title;
        this.numOfPages = numOfPages;
    }

    public String getTitle() {
        return title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }
}

public class Count_PageNumbers_of_the_book {
    public static class Main {
        public static void main(String[] args) {
            List<Book> books = new LinkedList<>();
            books.add(new Book("The Catcher in the Rye", 190));
            books.add(new Book("Song of Myself", 259));
            books.add(new Book("A Man Called Ove", 295));
            books.add(new Book("Lolita", 360));
            books.add(new Book("The Diary of a Young Girl", 352));
            books.add(new Book("The Tattooist of Auschwitz", 288));
            books.add(new Book("The Notebook", 214));

            int totalPages = calcTotalPages(books);
            System.out.printf("Total number of books: %d\n", books.size());
            System.out.printf("Total pages: %d\n", totalPages);
        }
    }

    public static int calcTotalPages(List<Book> bookList) {
        return bookList.size() == 0 ? 0 : bookList.stream().mapToInt(Book::getNumOfPages).sum();
    }
}