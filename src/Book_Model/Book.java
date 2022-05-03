package Book_Model;

public class Book {
	
	private String bookId;
	private String title;
	private String author;
	private String type;
	private String publisher;
	
	public Book(String bookId, String title, String author,String type, String publisher) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.type = type;
		this.publisher = publisher;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
