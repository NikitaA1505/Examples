package package1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String S = "Abhijeet";
         int len= S.length();
         String rev= "";
        
         for ( int i=len-1; i>=0; i--){
        	 rev =rev+ S.charAt(i);
         }
         
         System.out.print(rev);
	}

}