package introductionselenium;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		for (int i=1;i<=4;i++)
		{
			//System.out.println("out started");
			for (int j=1;j<1+i;j++) {
				//System.out.println("inner");
				System.out.print(x);
				System.out.print("\t");
				x++;
			}
			//System.out.println("out finished");
			System.out.println();
		}

	}

}
