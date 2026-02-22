public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String pyramid(int a){
		String b = "";
		for (int i = 1; i<= a; i++){
			for (int s = 0; s< a -i;s++){
				b += " ";
			}
			for (int j = 1; j <= i; j++){
				b +="*";
				if (j<i) b +=" ";
			}
			if (i<a) b +="\n";
		}
		return b;

	}
	public static String square(int n) {
    	if (n <= 0) return "";

    	String result = "";

    	for (int r = 0; r < n; r++) {

        	for (int c = 0; c < n; c++) {

            	if (r == 0 || r == n - 1 || c == 0 || c == n - 1) {
                	result += "*";
            	} else {
                	result += " ";
            	}
        	}

        	if (r < n - 1) result += "\n";
    	}

    	return result;
	}
	public static boolean hasLowercase(String str) {
    	for (int i = 0; i < str.length(); i++) {
        	char c = str.charAt(i);

        	if (c >= 'a' && c <= 'z') {
            	return true;
        	}
    	}
    	return false;
	}


}
