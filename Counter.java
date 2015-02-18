public class Counter{
	private int val;
	public Counter(){
		this.val = 0;
	}

	public Counter(int val){
		this.val = val;
	}

	public void click(){
		val++;
	}

	public Counter add(Counter c){
		return new Counter(this.val + c.val);
	}

	public void sum(Counter c){
		this.val += c.val; 
	}

	public void merge(Counter c){
		this.val += c.val;
		c.val = this.val;
	}

	public int getVal(){
		return val;
	}
}