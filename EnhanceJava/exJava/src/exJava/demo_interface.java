package exJava;

public class demo_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test(10);
		test.addwater(2);
		test.drinkwater(2);
		test.play();
	}

}


interface musicPlay{
	void play();
}

interface cup{
	void addwater();
	void drinkwater();
}

class Test implements musicPlay,cup{
	private int vol;
	public Test(int c){
		vol = c;
	}
	public void addwater(int w){
		System.out.println("add water "+w);
		System.out.println("current water "+(vol+w));
		vol += w;
	}
	
	public void drinkwater(int v){
		System.out.println("drink water "+v);
		System.out.println("current water "+(vol-v));
		vol-= v;
	}
	
	public void play(){
		System.out.println("lalalallal-----");
	}
}
