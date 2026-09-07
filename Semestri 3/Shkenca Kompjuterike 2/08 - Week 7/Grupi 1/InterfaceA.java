public interface InterfaceA{
	public void printoInterfaceA();
	public void printo();
	default String getEmri(){
		return "InterfaceA";
	}
	
	static int getNumri(){
		return 10;
	}
	
}