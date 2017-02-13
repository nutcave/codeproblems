package backtracking;

/**
 *
 *
 * 1 is a wall
 * 0 is a path
 *
 *
 * find the minimum steps to the exit maze[exitRow][exitCol]
 *
 * Created by Nutcave on 1/8/2017.
 */
public class MinimumStepsInMaze {


        static int minimumStep =Integer.MAX_VALUE;

        static int rows_;
        static int columns_;
        static int[][] maze_;
        static int exitRow_;
        static int exitCol_;

        public static int findMinNumSteps(int[][] maze, int rows, int columns, int exitRow, int exitCol)
        {

            rows_=rows;
            columns_=columns;
            maze_=maze;
            exitRow_=exitRow;
            exitCol_=exitCol;
            minimumStep =Integer.MAX_VALUE;


            findMinNumStepsHelper(0,0,  0);


            return (minimumStep == Integer.MAX_VALUE)? -1 : minimumStep;



        }

        static void findMinNumStepsHelper(int curRow,int curCol, int steps){



            if(curRow >= rows_ || curCol>= columns_ || curCol < 0 || curRow < 0){
                return;
            }


            if(maze_[curRow][curCol] == 1){
                return;
            }

            if( curRow ==exitRow_ && curCol==exitCol_ ){
                if(steps < minimumStep){
                    minimumStep=steps;

                }
                return;
            }

            maze_[curRow][curCol]=1;
            findMinNumStepsHelper(curRow+1,curCol, steps+1);
            findMinNumStepsHelper(curRow-1,curCol, steps+1);
            findMinNumStepsHelper(curRow,curCol+1, steps+1);
            findMinNumStepsHelper(curRow,curCol-1, steps+1);

        }


}
