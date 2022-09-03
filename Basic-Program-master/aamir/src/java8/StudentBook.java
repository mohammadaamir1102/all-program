package java8;

public class StudentBook {

	private Integer id;
	private String bookName;
	private int pages;

	public StudentBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentBook(Integer id, String bookName, int pages) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.pages = pages;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "StudentBook [id=" + id + ", bookName=" + bookName + ", pages=" + pages + "]";
	}

}
