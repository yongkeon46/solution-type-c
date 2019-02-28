package problem03;

public class MyStack {
	private int maxSize;
	private String[] buffer;
	private int top;
	
	
	public MyStack( int size ) {
		maxSize=size;
		buffer = new String[maxSize];
		top=-1;
	}
	
	public void push(String item) {
		if(top==maxSize-1) {
			
		}else {
			top=top+1;
			buffer[top]=item;
		}
	}

	public String pop() {
		if(!isEmpty()) { 
			return buffer[top--];
		}
		else {
			
		}
		return null;
	}

	public boolean isEmpty() {
		return top==-1;
	}
	
	public int size() {
		return 0;
	}
}