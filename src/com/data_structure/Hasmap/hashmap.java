package com.data_structure.Hasmap;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
//        int arr[] = {12,15,18};
//
//        for(int i=0; i< arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//        for(int val:arr){
//            System.out.println(val);
//        }


        HashMap<String,Integer> map =new HashMap<>();

        map.put("sita",4);
        map.put("rita",3);
        map.put("bhagita",5);
        System.out.println(map);

  if(map.containsKey("sita")){
      System.out.println(true);
  }else{
      System.out.println(false);
  }
//        System.out.println(map.get("sita"));
//        System.out.println(map.remove("sita"));
//        System.out.println(map);

        Set<String> keys=map.keySet();
        System.out.println(keys);

        for(String key: map.keySet()){
            Integer val=map.get(key);
            System.out.println(key+ " " + val);
        }
    }
}
