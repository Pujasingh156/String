package String;

public class splitdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "finally recovered the original essence";
	      //  String str = "this was his responsibility";

	      String[] stArr = str.split("i");
	     //   String[] stArr = str.split("hi");

	        for(int i=0; i<stArr.length;i++)
	        {
	            System.out.println(stArr[i]);
	        }
	    }
	

	

}