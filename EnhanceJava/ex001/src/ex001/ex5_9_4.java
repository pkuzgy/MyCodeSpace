package ex001;

public class ex5_9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("");
		for(int i = 1; i <= 10; i++){
			str.append(i);
			str.append(" ");
		}
		
		str.insert(0, "I am OK\n");
		str.delete(0, 4);
		System.out.println("str is:"+str.toString());
	}

}
