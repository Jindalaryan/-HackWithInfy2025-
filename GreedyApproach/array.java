// sorting a 2d array

import java.util.*;
public class array {
public static void main(String[] args) {
    int [][] arr = {{1,2},{3,4},{5,6},{7,8},{9,12}};
    Arrays.sort(arr,(a,b)->Integer.compare(1, 1));
    System.out.println(Arrays.deepToString(arr));
}
}