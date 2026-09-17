package JavaTutorial;


public class Learner{
	
	public static void main(String[]args) {
		
		int[] marks = {78,45,92,61,35,88};
		int count  = 0;
		int total = 0;
		double average = 0;
		int largest = marks[0];
		int lowest = marks[0];

		for (int mark : marks) {
			total += mark;
			if (mark >= 50) {
				count++;
			} 

			if (mark > largest) {
				largest = mark;
			}
			if (mark < lowest) {
				lowest = mark;
			}
		}
		average = (double)total / marks.length;

		System.out.println("Number of Student passed = " + count);
		System.out.println("Largest Mark = " + largest);
		System.out.println("Lowest Mark = " + lowest);
		System.out.println("Total Marks = " + total);
		System.out.println("Average Mark = " + average);
	}
}
