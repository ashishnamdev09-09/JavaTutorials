package loopings;

public class loops {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			//extra space
			System.out.println("");
			for(int j=1;j<=5;j++) {
				if(i==2 && j==2 || i==3 && j==3 || i==4 && j==4 || i==5 && j==5) {
					break;
				}
				System.out.println(i+" "+j);
			}
		}

	}

}
