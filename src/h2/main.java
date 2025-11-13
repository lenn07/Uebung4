package h2;

public class main {
    public static void main(String[] args) {
		boolean x = false,y = false,a = false,b = false,c = false;
		
		x = false;
		y = false;
		a = false;
		b = false;
		c= false;
		
		int input = 10;
		switch (input) {
		case 0: {
			c = true;
			break;
		}
		case 1: {
			y=true;
			b = true;
			break;
		}
		case 10: {
			x = true;
			b = true;
			c= true;
			break;
		}
		case 11: {
			x = true;
			y = true;
			a = true;
			b = true;
			break;
		}
	    }
		
		System.out.println("a :" + a + " b :" + b + " c :" + c +  " x :" + x + " y :" + y);
		
    }	
}
