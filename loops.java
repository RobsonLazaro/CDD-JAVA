package Fundamentos;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++) {
			if(50 < i && i < 60) {
				continue;
			}
			System.out.println(i);
		}
	}

}
