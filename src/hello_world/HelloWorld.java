package hello_world;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello World!");

		int i = 1;
		while(i <= 100){
			String a;
			if(i%3 ==0 || i%4 ==0){
				a ="■";
			}
			else{
				a = String.valueOf(i);
			}
			System.out.println(a);
			i++;
		}

	}
}
