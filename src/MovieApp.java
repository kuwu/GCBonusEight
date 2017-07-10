import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by kuwu on 2017/07/07.
 */
public class MovieApp {

  public static void main(String[] args) {
    System.out.println("\u001B[35m" + "Welcome to the Movie List Application!" + "\u001B[0m");
    System.out.println("\u001B[35m" + "There are six categories to choose from: " + "\u001B[0m" + "\n");
    // runs movie search one time before continue/check loop
    findMovie();
    // runs check continue (y/n)
    getContinue();

  }

  public static String getCategoryNum() {
    Scanner scnr = new Scanner(System.in);
    int usrInp;


    usrInp = scnr.nextInt();

    int genre = usrInp;

    String category;

    switch (genre) {
      case 1:
        category = "Animated";
        break;
      case 2:
        category = "Drama";
        break;
      case 3:
        category = "Horror";
        break;
      case 4:
        category = "Comedy";
        break;
      case 5:
        category = "Musical";
        break;
      case 6:
        category = "Scifi";
        break;
      default:
        category = "Invalid genre";
        break;
    }
    System.out.println(category + " selection: \n");
    return category;
  }

  private static void getContinue() {
    char userChar;
    boolean value = true;

    // loop allows user to continue using 'y or Y' until the user
    // types 'n or N' to quit    validates for 'y or Y' and 'n or N'
    do {
      userChar = getUserInput();
      if (userChar == 'y') {
        //
        findMovie();
      } else if (userChar == 'n') {
        value = false;
      } else {
        System.out.println("\u001B[31m" + userChar + " is not a valid choice, please re-enter" + "\u001B[0m");
      }

    } while (value);

    // Informing the user the program has ended
    System.out.print("Goodbye");
  }

  public static char getUserInput() {
    Scanner scnr = new Scanner(System.in); // create a scanner object
    System.out.println("\nWould you like to continue?  (y / n):");
    // cast uppercase to lowercase
    String userInput = scnr.next().toLowerCase();

    return userInput.charAt(0);

  }

  private static void findMovie() {

    ArrayList<Movie> list = new ArrayList<>();

    for (int i = 1; i < 101; i++) {
      list.add(Movie.getMovie(i));

    }


    // TODO arrange movie in alphabetical

    Scanner scan = new Scanner(System.in);

    System.out.println("\u001B[33m" + "(1)Animated, (2)Drama, (3)Horror, (4)Comedy, (5)Musical, (6)Scifi\n" + "\u001B[0m");
    System.out.println("What movie category are you interested in? ");
    //getCategoryNum();

    String input = getCategoryNum();
    for (Movie check : list) {
      if (check.getCatagory().equalsIgnoreCase(input)) {
        System.out.println(check.getTitle());

      }
    }
  }
}

