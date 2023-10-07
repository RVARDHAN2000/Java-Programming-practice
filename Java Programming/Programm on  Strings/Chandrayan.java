package Strings;

public class Chandrayan {

	public static void main(String[] args) {
		String st="Chandrayana123india";
		String res="";
		char c []=st.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>='a'&&c[i]<='z'||c[i]>='A'&&c[i]<='Z') {
				res+=c[i];
			}
			if(i==10) {
				res=res+" ";
			}
		}
     System.out.println(res);
	}

}
