package Magazine_Model;

public class Magazine {
	
	private String magazineId;
	private String title;
	private String author;
	private String type;
	private String publisher;
	private String published_date;
	
	public Magazine(String magazineId, String title, String author,String type, String publisher,String published_date) {
		this.magazineId = magazineId;
		this.title = title;
		this.author = author;
		this.type = type;
		this.publisher = publisher;
		this.published_date = published_date;
	}

	public String getMagazineId() {
		return magazineId;
	}

	public void setMagazineId(String magazineId) {
		this.magazineId = magazineId;
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

	public String getPublished_date() {
		return published_date;
	}

	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}

	
}
