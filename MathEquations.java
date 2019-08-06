public class MathEquations {
	public static void main(String[] args){
		double squareRoot;
		double sin, cos;
		double floor, ceiling, round;
		double random;
		
		squareRoot = Math.sqrt(37);
		
		sin = Math.sin(300);
		cos = Math.cos(300);
		
		floor = Math.floor(22.8);
		ceiling = Math.ceil(22.8);
		round = Math.round(22.8);
		
		random = (double)Math.random()*20;
		
		System.out.println("Square root: " + squareRoot);
		System.out.println("Sin and Cos: " + sin + " " + cos);
		System.out.println("floor ceiling and round: " + floor + ceiling + round);
		System.out.println("Random: " + random);
	}
	
}