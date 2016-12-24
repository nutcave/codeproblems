import java.awt.Point;
import java.util.*;

/**
 *
 */
public class MaxDotLine {


    /**
     *  (1) given a graph with random dots, find the line that crosses the most dots "hint: use slope equation",
     *
     */

    Map<Integer,Set<Point>> pointM=new HashMap<>(); // slope to ListOfPoints

    public Set<Point> getLineWithMostDots(Set<Point> points){

        Set<Point> maxSet= new HashSet<>();

        for (Point a : points) {

            for (Point b : points) {

                if(a.getX()-b.getX() !=0) {
                    int slope = slope(a, b);
                    Set<Point> orDefault = pointM.getOrDefault(slope, new HashSet<>());
                    orDefault.add(a);
                    orDefault.add(b);
                    pointM.put(slope, orDefault);

                    if (orDefault.size() > maxSet.size()) maxSet = orDefault;
                }



            }

        }

        return maxSet;

    }

    public int slope(Point a,Point b){
       return (int) ((a.getY() - b.getY())/(a.getX()-b.getX()));
    }


    public static void main(String[] args) {
        Set<Point> h = new HashSet<>(Arrays.asList(new Point(1,1),new Point(2,2),new Point(3,3),new Point(4,4),new Point(5,5)
                ,new Point(1,2),new Point(1,5),new Point(1,7),new Point(1,9)));
        Set<Point> lineWithMostDots = new MaxDotLine().getLineWithMostDots(h);

        System.out.println(Arrays.toString(lineWithMostDots.toArray()));
    }
}
