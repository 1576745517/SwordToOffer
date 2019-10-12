package SwordToOffer;

/**
 * @Classname No001_IsContainsFromTwoDimensionalArray
 * @Description
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @Date 2019/10/12 13:55
 * @Created by xgt
 */
public class No001_IsContainsFromTwoDimensionalArray {
    public static void main(String[] args) {
        int target = 2;
        int [][] array = {{1,3,5},{2,4,6},{7,8,9}};

        System.out.println(Find(target,array));
    }
    public static boolean Find(int target, int[][] array) {
        if(array.length < 0 || array == null){
            return false;
        }
        return findProcess(target, array);
    }

    private static boolean findProcess(int target, int[][] array) {
        int row=array.length;
        int col = array[0].length;
        int row_index = 0;
        int col_index= col-1;
        while (row_index !=  row && col_index != -1) {
            if(array[row_index][col_index] > target){
                col_index--;
            }else if (array[row_index][col_index] < target) {
                row_index++;
            }else {
                return true;
            }
        }
        return false;
    }
}
