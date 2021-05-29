
/**
 * Write a description of class Array2DExplorer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArray2DExplorer {

    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                            {0,2,3,4},
                            {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println();


        System.out.print("Test minRowAssignment: \n Expecting: 2 \n Actual: ");
        System.out.println(exp.minRow(array, 2));

        System.out.println();

        System.out.print("Test colMax: \n Expecting: {6 6 8 5} \n Actual: {");
        int [] colMaxs = exp.colMaxs(array);
        for(int i = 0; i < colMaxs.length; i++){
            System.out.print(colMaxs[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
        int [] sum = exp.allRowSums(array);
        for(int i = 0; i < sum.length; i++){
            System.out.print(sum[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();
  
        System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
        double [] avg = exp.averageCol(array);
        for(int i = 0; i < avg.length; i++){
            System.out.print(avg[i] + " ");
        }
        System.out.print("}");


        System.out.println();
        System.out.println();

        System.out.print("Test smallEven: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.smallEven(array));

        System.out.println();
        System.out.println();

        System.out.print("Test biggestRow: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.biggestRow(array));

        System.out.println();
    }

    //WRITE YOUR METHODS BELOW

    
    public int minRow(int [][] nums, int row){
        int min = nums[row][0];
        for(int x = 0; x < nums[row].length; x++){
            if(x < min){
                min = nums[row][x];
            }
        }
        return min;
    }
    
    public int[] colMaxs(int[][] matrix){
        int max = matrix[0][0];
        int[] arr = new int[matrix[0].length];
        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][i] > max){
                    max = matrix[j][i];
                }
            }
            int k = 0;
            arr[k] = max;
            k++;
        }
        return arr;
    }
    
    public int[] allRowSums(int[][] data){
        int[] arr = new int[data.length];
        
        for(int i = 0; i < data.length; i++){
            int count = 0;
            int k = 0;
            for(int j = 0; j < data[i].length; j++){
                count ++;
            }
            arr[k] = count;
            k++;
        }
        return arr;
    }
    
    public double[] averageCol(int[][] nums){
        double[] arr = new double[nums[0].length];
        for(int i = 0; i < nums[0].length; i++){
            int count = 0;
            int numRows = 0;
            for(int j = 0; j < nums.length; j++){
                count += j;
                numRows ++;
            }
            double average = count / numRows;
            
            int k = 0;
            arr[k] = average;
            k++;
        }
        return arr;
    }
    
    public int smallEven(int[][] matrix){
        int sE = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(sE < j && j % 2 == 0){
                    sE = j;
                }
            }
        }
        return sE;
    }
    
    public static int biggestRow(int[][] nums){
        int[] arr = new int[nums.length];
        int index;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j < nums[0].length; j++){
                sum += j;
            }
            int k = 0;
            arr[k] = sum;
            k++;
        }
        
        int big = arr[0];
        for(int g = 0; g < arr.length; g++){
            if(big > g){
                big = g;
            }
        }
        return big;
    }
   }