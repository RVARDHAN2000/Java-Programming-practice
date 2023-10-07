package Strings;

public class Mississippie {

	public static void main(String[] args) {
		
		String st = "MISSISSIPPIE";
        char [] c= st.toCharArray();
      boolean [] b=new boolean[st.length()];
        String res = "";
        for (int i=0;i<c.length;i++) {
        	int count=0;
        	if(b[i]==false) {
        	 for (int j=0;j<c.length;j++) {
        			
        		 if(c[i]==c[j]) {
        			 count++;
        			 b[j]=true;
        		 } 
        	 }
        	 }
        if(count>1) {
        	 res=c[i]+""+count;
        	 System.out.print(res);}
        }}
        
	
	}


