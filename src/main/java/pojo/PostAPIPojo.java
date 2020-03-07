package pojo;

public class PostAPIPojo {
	
	private int id;
	private String Title;
	private String Auther;
	
	public PostAPIPojo(int id, String title, String auther) {
		this.id = id;
		this.Title = title;
		this.Auther = auther;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public String getAuther() {
		return Auther;
	}

	public void setAuther(String auther) {
		this.Auther = auther;
	}

	@Override
	public String toString() {
		return "PostAPIPojo [Id=" + this.id + ", Title=" + this.Title + ", Auther=" + this.Auther + "]";
	}
	
	
	
}
