package responseBody;

import java.util.ArrayList;

public class GetAllProductResponseBody {

	private ArrayList<String> data;
	private int count;
	private String message;
	
	public ArrayList<String> getData() {
		return data;
	}
	public void setData(ArrayList<String> data) {
		this.data = data;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
