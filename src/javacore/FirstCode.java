package javacore;

class FirstCode{
	public static void main(String[] args){

		iumium:
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 4; j++){
				if(i==3) break iumium;	// unlabeld break

				System.out.print("* ");
			}

			System.out.println("");
		}
	}
}