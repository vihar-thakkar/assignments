package Assignments;
class complex{
	double real;
	double imaginary;
	complex(int r, int i){
		real = r;
		imaginary = i;

	}
	complex (double r, double i){
		real = r;
		imaginary = i;

	}
	complex(){

	}
	void add(complex c1 , complex c2) {
		real =c1.real+c2.real;
		imaginary=c1.imaginary+c2.imaginary;

	}
	void display() {
		System.out.println(real+"+"+imaginary+"i");
	}
}

public class RealImaginary {
	public static void main(String[] args) {
		
		complex c1= new complex(4,7);
		complex c2= new complex(3.4,5.5);
		complex c3= new complex();

		c3.add(c1, c2);
		c3.display();

	}

}