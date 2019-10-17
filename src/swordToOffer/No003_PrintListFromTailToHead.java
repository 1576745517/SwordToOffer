package swordToOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Classname No003_PrintListFromTailToHead
 * @Description 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @Date 2019/10/16 15:16
 * @Created by xgt
 */
public class No003_PrintListFromTailToHead {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        System.out.println(printListFromTailToHead(listNode));
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> integers = new ArrayList<>();
        ListNode curListNode = listNode;
        process(integers, curListNode);

        ArrayList<Integer> integers2 = new ArrayList<>();
        process2(integers2, curListNode);
        //System.out.println("integers2" + integers2);

        return integers2;
    }

    private static void process2(ArrayList<Integer> integers, ListNode curListNode) {
        Stack<Integer> stack = new Stack<>();
        while (curListNode != null){
            stack.push(curListNode.val);
            curListNode = curListNode.next;
        }

        while(!stack.empty()){
            integers.add(stack.pop());
        }
    }

    private static void process(ArrayList<Integer> integers, ListNode curListNode) {
        if (curListNode != null){
            process(integers, curListNode.next);
            integers.add(curListNode.val);
        }else {
            return;
        }
    }


    public static class ListNode {
         int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
     }


}
