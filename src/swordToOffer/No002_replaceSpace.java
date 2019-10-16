package swordToOffer;

/**
 * @Classname No002_replaceSpace
 * @Description
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @Date 2019/10/12 13:55
 * @Created by xgt
 */
public class No002_replaceSpace {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer(" A");
        System.out.println(replaceSpace(str));
    }

    public static String replaceSpace(StringBuffer str) {
        int left= str.indexOf(" ");
        int right=str.lastIndexOf(" ");
        while(left < right){
            str.replace(left,left+1,"%20");
            right = right + 2;
            str.replace(right,right+1,"%20");
            left= str.indexOf(" ");
            if (left == -1){
                break;
            }
            right=str.lastIndexOf(" ");
        }
        if (left == right && left != -1){
            str.replace(left, left+1,"%20");
        }
        return str.toString();

    }
}
