public class Solution{
	public static void main(String[] args) {
		String[] names = {"Timmy","Monty","Titu","Rajesh","Kamlesh","Adarsh"};
		for (int i = 0; i < names.length; i++) {
           		if (i % 2 == 0) {
                		System.out.println(names[i]);
            		}
        	}

               for (int i = names.length - 1; i >= 0; i--) {
            		if (i % 2 != 0) {
                		System.out.println(names[i]);
            	}
        }
    }
}
		     

