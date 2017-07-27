import java.util.Scanner;

public class Mapping {
	
	/*static char c_arr[] = new char[26];
	static int i_arr[] = new int[26];
	static int i_arr2[] = new int[26];
	
	public int find(char c, int n){
		
		if(n == 0){
		for(int i = 0; i<26; i++){
			
			if(c_arr[i] == c){
				return i_arr2[i];
			}		
			
		}}
		else{
			for(int i = 0; i<26; i++){
				
				if(c_arr[i] == c){
					return i_arr[i];
				}		
				
			}
		}
		return 0;
	}*/
		
		public long Map(String str, char c[], int size){
			
			int k = 0;		
			
			for(int j = 0; j < 26; j++){
				if(str.charAt(0) == c[j]){
					k = j+1;        // Store character position in array
					break;
				}
			}
			
			StringBuffer sb = new StringBuffer(str);
			sb.deleteCharAt(0);        //Remove the first character everytime
			
			String newStr = sb.toString();
			int n = newStr.length();
			
			if(n == 0){
				return k;
			}
			else
				return k*(int)(Math.pow(26,n)) + Map(newStr, c, n);  //Cast so as to convert from double to int
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String s;
			Scanner sc = new Scanner(System.in);
			
			char ch[] = new char[26];
//			int in[] = new int[26];
			
			for(int i = 0; i < 26; i++){
				ch[i] = (char)(i+65);
//				in[i] = i+1;
			}
			
			/*for(int i = 0; i < 26; i++){
				System.out.println(ch[i] + " " + in[i]);
			}*/
			
			
			System.out.print("Enter any String: ");
			s = sc.nextLine();
			
			long res = new Mapping().Map(s, ch, s.length());     //long for large values
			System.out.println("Mapping integer is: " + res);
			
		}

	}
