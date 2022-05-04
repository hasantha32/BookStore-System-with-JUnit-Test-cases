package BookStore_Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



//import BookStore_Exception.BookNotFound;
import BookStore_Exception.BookNotFoundException;
import Book_Model.Book;

public class BookStore {

	
private List<Book> listOfBooks = new ArrayList<>();
	
//	Book book1 = new Book("1", "Java Cording", "K.A Brian");
//	addBook.addBook(book1);


	

//add
	public void addBook(Book book) {
		listOfBooks.add(book);
	}	
	
//remove
	public void removeBook(Book book) {
		listOfBooks.remove(book);
	}	
	
//return list	
	public List<Book> books(){
		return Collections.unmodifiableList(listOfBooks);
	}
	
	
////update
//	public boolean updateBook(Book oldBook, Book newBook) {
//		boolean updated = false;
//		
//		if( listOfBooks.contains(oldBook) ) {
//			listOfBooks.remove(oldBook);
//			listOfBooks.add(newBook);
//			updated = true;
//		}
//		
//		return updated;
//	}
	
//Set book signature
	
	 public String displayBookInOrder(String bookId, String title, String author, String type, String publisher) {
		  return bookId+ " --" +title+ " --" +author+ " --" +type+ " --" +publisher;
		 }

//getbyId
	public Book getBookById(String bookId) {
		for(Book book : listOfBooks) {
			if(bookId.equals(book.getBookId())) {
				return book;
			}
		}
		return null;
	}
//getbyTitle
	
	public Book getBookByTitle(String title) {
		for(Book book : listOfBooks) {
			if(title.equals(book.getTitle())) {
				return book;
			}
		}
		return null;
	}
	
	
//getbyAuthor
		public Book getBookByAuthor(String author) {
			for(Book book : listOfBooks) {
				if(author.equals(book.getAuthor())) {
					return book;
				}
			}
			return null;
		}
	
//getbyPublisher
	public Book getBookByPublisher(String publisher) {
		for(Book book : listOfBooks) {
			if(publisher.equals(book.getPublisher())) {
				return book;
			}
		}
		return null;
	}
	

////getbookbyTitleException
//	public Book getBookByTitle(String title) {
//		for(Book book : listOfBooks) {
//			if(title.equals(book.getTitle())) {
//				return book;
//			}
//		}
//		throw new BookNotFoundException("Book not found in Bookstore!!!");
//	}
	
//getbookIdbyPublisher
	public String[] getBookIdsByPublisher(String publisher) {
		List<String> bookIds = new ArrayList<>();
		for(Book book : listOfBooks) {
			if(publisher.equals(book.getPublisher())) {
				bookIds.add(book.getBookId());
			}
		}
		return bookIds.toArray(new String[bookIds.size()]);
	}
	
//getBookTitlesByPublisher
	public List<String> getBookTitlesByPublisher(String publisher) {
		List<String> bookTitles = new ArrayList<>();
		for(Book book : listOfBooks) {
			if(publisher.equals(book.getPublisher())) {
				bookTitles.add(book.getTitle());
			}
		}
		return bookTitles;
	}
	
}
