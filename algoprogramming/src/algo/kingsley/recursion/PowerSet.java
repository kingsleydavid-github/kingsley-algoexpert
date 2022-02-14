package algo.kingsley.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowerSet {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        Integer limit  = ip.nextInt();
        List<Integer> list = new ArrayList<>();
        while(limit > 0){
            list.add(ip.nextInt());
            limit --;
        }
        System.out.println(powerset(list));
    }

    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        ret.add(new ArrayList<Integer>());

        for (Integer ele :  array) {
            Integer len = ret.size();
            for (int i =0 ; i < len; i++) {
                List<Integer> currSubList = new ArrayList<Integer>(ret.get(i));
                currSubList.add(ele);
                ret.add(currSubList);
            }
        }
        return ret;
    }
}
