package kodlama.io.entities;

public class Categories {
 private int CategoryId;
 private String CategoryName;
 
 public Categories() {
	 
 }

public Categories(int categoryId, String categoryName) {
	super();
	this.CategoryId = categoryId;
	this.CategoryName = categoryName;
}

public int getCategoryId() {
	return CategoryId;
}

public void setCategoryId(int categoryId) {
	this.CategoryId = categoryId;
}

public String getCategoryName() {
	return CategoryName;
}

public void setCategoryName(String categoryName) {
	this.CategoryName = categoryName;
}
 
 
}
