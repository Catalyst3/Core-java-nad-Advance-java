package StarPatterns;
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
public class EighthPattern {

	public static void main(String[] args) 
	{
		int k = 1;
		for (int i = 0;i<5;i++)
		{
			for(int j= 0;j<6;j++)
			{
				if(j<=i)
				{
					System.out.print(k+" ");
					k++;
				}
			}
			System.out.println();
		}
	}

}
