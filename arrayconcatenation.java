 package nov25;

public class Concatenation {

	public static void main(String[]args){
		int[]iqhlas={1,2,3,4,5};
		int[]boom={1,2,3,4,5,6};
		int[]as=new int[iqhlas.length+boom.length];
		int index=0;
		for(int i=0;i<iqhlas.length;i++){
			as[index]=iqhlas[i];
			index=index+1;
		}
		for(int i=0;i< boom.length;i++){
			as[index]=boom[i];
			index=index+1;
		}
		for(int finalout:as){
		System.out.print(finalout);
		}
		
	}
}


