import java.util.Scanner;

public class InheritanceRunner
	{
		static String answer;
		static int count;

		public static void main(String[] args)
			{
				
				System.out.println("Pop Inheritance Quiz! These are the four possible instantiations: ");
				System.out.println("Seasons x = new Seasons( );");
				System.out.println("Seasons x = new Winter( );");
				System.out.println("Winter x = new Seasons( );");
				System.out.println("Winter x = new Winter( );");
				System.out.println();
				
				questionOne();
				questionTwo();
				questionThree();
				questionFour();
				questionFive();
				questionSix();
				questionSeven();
				questionEight();
				questionNine();
				questionTen();
				questionEleven();
				questionTwelve();
				
				System.out.println("You got " + count + "/12 question(s) right!");
				double percentage = (count/12) * 100;
				//System.out.println("SCORE: " + percentage + "%");


			}
		
		public static void questionOne()
			{
				answer = "A";
				
				System.out.println("Question 1: What will this output?");
				System.out.println("    Seasons x = new Seasons( );");
				System.out.println("    x.isTemperature();");
				System.out.println();
				
				System.out.println("A. The temperature changes throughout the year!");
				System.out.println("B. It's freezing out here!");
				System.out.println("C. I love the snow!");
				System.out.println("D. Error");
				System.out.println();
				
				Scanner userAnswer = new Scanner(System.in);
				String choice = userAnswer.nextLine();
				System.out.println();
				
				if(choice.equals(answer))
					{
						count++;
						System.out.println("Correct");
						System.out.println();
					}
				
				else
					{
						System.out.println("Incorrect: The answer was " + answer);
						System.out.println();
					}
			}
		
		public static void questionTwo()
			{
				answer = "B";
				
				System.out.println("Question 2: What will this output?");
				System.out.println("    Seasons x = new Seasons( );");
				System.out.println("    x.hasWeather();");
				
				System.out.println("A. Christmas: The best holiday of the year!");
				System.out.println("B. Rain, shine, snow, or wind");
				System.out.println("C. It's freezing out here!");
				System.out.println("D. Error");
				System.out.println();
				
				Scanner userAnswer = new Scanner(System.in);
				String choice = userAnswer.nextLine();
				System.out.println();
				
				if(choice.equals(answer))
					{
						count++;
						System.out.println("Correct");
						System.out.println();
					}
				
				else
					{
						System.out.println("Incorrect: The answer was " + answer);
						System.out.println();
					}
			}
		
		public static void questionThree()
			{
				answer = "A";
				
				System.out.println("Question 3: What will this output?");
				System.out.println("    Seasons x = new Winter( );");
				System.out.println("    x.isTemperature();");
				
				System.out.println("A. It's freezing out here!");
				System.out.println("B. The temperature changes throughout the year!");
				System.out.println("C. I love the snow!");
				System.out.println("D. Error");
				System.out.println();
				
				Scanner userAnswer = new Scanner(System.in);
				String choice = userAnswer.nextLine();
				System.out.println();
				
				if(choice.equals(answer))
					{
						count++;
						System.out.println("Correct");
						System.out.println();
					}
				
				else
					{
						System.out.println("Incorrect: The answer was " + answer);
						System.out.println();
					}
			}
		
		public static void questionFour()
			{
				answer = "D";
				
				System.out.println("Question 4: What will this output?");
				System.out.println("    Winter x = new Seasons( );");
				System.out.println("    x.hasWeather();");
				
				System.out.println("A. Rain, shine, snow, or wind");
				System.out.println("B. Christmas: The best holiday of the year!");
				System.out.println("C. I love the snow!");
				System.out.println("D. Error");
				System.out.println();
				
				Scanner userAnswer = new Scanner(System.in);
				String choice = userAnswer.nextLine();
				System.out.println();
				
				if(choice.equals(answer))
					{
						count++;
						System.out.println("Correct");
						System.out.println();
					}
				
				else
					{
						System.out.println("Incorrect: The answer was " + answer);
						System.out.println();
					}
			}
		
		public static void questionFive()
			{
				answer = "D";
				System.out.println("Question 5: What will this output?");
				System.out.println("    Winter x = new Seasons( );");
				System.out.println("    x.isTemperature();");
				
				System.out.println("A. It's freezing out here!");
				System.out.println("B. The temperature changes throughout the year!");
				System.out.println("C. Rain, shine, snow, or wind");
				System.out.println("D. Error");
				System.out.println();
				
				Scanner userAnswer = new Scanner(System.in);
				String choice = userAnswer.nextLine();
				System.out.println();
				
				if(choice.equals(answer))
					{
						count++;
						System.out.println("Correct");
						System.out.println();
					}
				
				else
					{
						System.out.println("Incorrect: The answer was " + answer);
						System.out.println();
					}
			}
		
		public static void questionSix()
			{
				answer = "D";
				
				System.out.println("Question 6: What will this output?");
				System.out.println("    Winter x = new Seasons( );");
				System.out.println("    x.celebrateChristmas();");
				
				System.out.println("A. Rain, shine, snow, or wind");
				System.out.println("B. Christmas: The best holiday of the year!");
				System.out.println("C. I love the snow!");
				System.out.println("D. Error");
				System.out.println();
				
				Scanner userAnswer = new Scanner(System.in);
				String choice = userAnswer.nextLine();
				System.out.println();
				
				if(choice.equals(answer))
					{
						count++;
						System.out.println("Correct");
						System.out.println();
					}
				
				else
					{
						System.out.println("Incorrect: The answer was " + answer);
						System.out.println();
					}
			}
		
		public static void questionSeven()
			{
				answer = "A";
				
				System.out.println("Question 7: What will this output?");
				System.out.println("    Winter x = new Winter( );");
				System.out.println("    x.hasWeather();");
				
				System.out.println("A. I love the snow!");
				System.out.println("B. Rain, shine, snow, or wind");
				System.out.println("C. It's freezing out here!");
				System.out.println("D. Error");
				System.out.println();
				
				Scanner userAnswer = new Scanner(System.in);
				String choice = userAnswer.nextLine();
				System.out.println();
				
				if(choice.equals(answer))
					{
						count++;
						System.out.println("Correct");
						System.out.println();
					}
				
				else
					{
						System.out.println("Incorrect: The answer was " + answer);
						System.out.println();
					}
			}
		
		public static void questionEight()
			{
				answer = "C";
				
				System.out.println("Question 8: What will this output?");
				System.out.println("    Winter x = new Winter( );");
				System.out.println("    x.isTemperature();");
				
				System.out.println("A. The temperature changes throughout the year!");
				System.out.println("B. I love the snow!");
				System.out.println("C. It's freezing out here!");
				System.out.println("D. Error");
				System.out.println();
				
				Scanner userAnswer = new Scanner(System.in);
				String choice = userAnswer.nextLine();
				System.out.println();
				
				if(choice.equals(answer))
					{
						count++;
						System.out.println("Correct");
						System.out.println();
					}
				
				else
					{
						System.out.println("Incorrect: The answer was " + answer);
						System.out.println();
					}
				
				
			}
		
		public static void questionNine()
			{
				answer = "B";
				
				System.out.println("Question 9: What will this output?");
				System.out.println("    Winter x = new Winter( );");
				System.out.println("    x.celebrateChristmas();");
				
				System.out.println("A. It's freezing out here!");
				System.out.println("B. Christmas: The best holiday of the year!");
				System.out.println("C. Rain, shine, snow, or wind");
				System.out.println("D. Error");
				System.out.println();
				
				Scanner userAnswer = new Scanner(System.in);
				String choice = userAnswer.nextLine();
				System.out.println();
				
				if(choice.equals(answer))
					{
						count++;
						System.out.println("Correct");
						System.out.println();
					}
				
				else
					{
						System.out.println("Incorrect: The answer was " + answer);
						System.out.println();
					}
			}
		
		public static void questionTen()
			{
				answer = "D";
				
				System.out.println("Question 10: What will this output?");
				System.out.println("    Seasons x = new Seasons();");
				System.out.println("    x.celebrateChristmas;");
				
				System.out.println("A. Christmas: The best holiday of the year!");
				System.out.println("B. Rain, shine, snow, or wind");
				System.out.println("C. It's freezing out here!");
				System.out.println("D. Error");
				System.out.println();
				
				Scanner userAnswer = new Scanner(System.in);
				String choice = userAnswer.nextLine();
				System.out.println();
				
				if(choice.equals(answer))
					{
						count++;
						System.out.println("Correct");
						System.out.println();
					}
				
				else
					{
						System.out.println("Incorrect: The answer was " + answer);
						System.out.println();
					}
			}
		
		public static void questionEleven()
			{
				answer = "A";
				
				System.out.println("Question 11: What will this output?");
				System.out.println("    Seasons x = new Winter();");
				System.out.println("    x.hasWeather;");
				
				System.out.println("A. I love the snow!");
				System.out.println("B. Christmas: The best holiday of the year!");
				System.out.println("C. Rain, shine, snow, or wind");
				System.out.println("D. Error");
				System.out.println();
				
				Scanner userAnswer = new Scanner(System.in);
				String choice = userAnswer.nextLine();
				System.out.println();
				
				if(choice.equals(answer))
					{
						count++;
						System.out.println("Correct");
						System.out.println();
					}
				
				else
					{
						System.out.println("Incorrect: The answer was " + answer);
						System.out.println();
					}
			}
		
		public static void questionTwelve()
			{
				answer = "D";
				
				System.out.println("Question 12: What will this output?");
				System.out.println("    Seasons x = new Winter();");
				System.out.println("    x.celebrateChristmas;");
				
				System.out.println("A. The temperature changes throughout the year!");
				System.out.println("B. Christmas: The best holiday of the year!");
				System.out.println("C. It's freezing out here!");
				System.out.println("D. Error");
				System.out.println();
				
				Scanner userAnswer = new Scanner(System.in);
				String choice = userAnswer.nextLine();
				System.out.println();
				
				if(choice.equals(answer))
					{
						count++;
						System.out.println("Correct");
						System.out.println();
					}
				
				else
					{
						System.out.println("Incorrect: The answer was " + answer);
						System.out.println();
					}
			}

	}
