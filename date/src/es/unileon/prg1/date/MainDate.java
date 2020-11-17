package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {

		Date today, tomorrow;

		try {
			today = new Date(13, 7, 2020);
			tomorrow = new Date(14, 7, 2020);
			today.equals(tomorrow);
			tomorrow.equals(today);
			System.out.println(today.toString());

			System.out.println("The name of the month from " +today+ " is " +today.getMonthName());
			System.out.println("The season of " +today+ " is " + today.getSeasonName());
			System.out.println("Number of attempts: " +today.numAttemptsRandomDateSameYear());

		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}
