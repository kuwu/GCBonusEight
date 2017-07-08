import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

import static java.util.Collections.*;

/**
 * Created by kuwu on 2017/07/07.
 */
public class MovieApp {

  public static void main(String[] args) {


    ArrayList<Movie> list = new ArrayList<>();

    for (int i = 1; i < 101; i++) {
      list.add(Movie.getMovie(i));


    }

    // TODO select category by number
    // TODO arrange movie in alphabetical
    // TODO add continue y/n

    Scanner scan = new Scanner(System.in);
    System.out.println("What movie category are you interested in? ");

    String input = scan.nextLine();
    for (Movie check : list) {
      if (check.getCatagory().equalsIgnoreCase(input)) {
        System.out.println(check.getTitle());
      } else {

        continue;
      }
    }
  }
}

      //  search my movie name

//    Scanner scan = new Scanner(System.in);
//    System.out.println("Enter a movie title to search: ");
//    String input = scan.nextLine();
//    for (Movie check : list){
//      if (check.getTitle().equalsIgnoreCase(input)){
//        System.out.println("\n" + check);
//      }else {
//
//        continue;
//      }
//    }





