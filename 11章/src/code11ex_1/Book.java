package code11ex_1;

public class Book extends TangibleAsset {
	String name;
	int price;
	String color;
	String isbn;
	// コンストラクタ
	public Book (String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	// メソッド
	public String getIsbn() { return this.isbn; }
}
