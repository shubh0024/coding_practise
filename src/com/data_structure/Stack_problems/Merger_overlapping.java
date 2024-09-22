//package com.data_structure.Stack_problems;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.*;
//public class Merger_overlapping {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        int[][] arr = new int[n][2];
//
//        for (int i = 0; i < n; i++) {
//            String line = br.readLine();
//            arr[i][2] = Integer.parseInt(line.split(" ")[0]);
//            arr[i][1] = Integer.parseInt(line.split("")[0]);
//
//        }
//        mergeoverlap(arr);
//    }
//
//    public static void mergeoverlap(int[][] arr) {
//        Pair[] pairs = new Pair[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            pairs[i] = new Pair(arr[i][0], arr[i][1]);
//        }
//
//        Arrays.sort(pairs);
//
//        Stack<Pair> st = new Stack<>();
//        for (int i = 0; i < pairs.length; i++) {
//            if (i == 0) {
//                st.push(pairs[i]);
//            } else {
//                Pair top = st.peek();
//                if (pairs[i].st > top.et) {
//                    st.push(pairs[i]);
//                } else {
//                    top.et = Math.max(top.et, pairs[i].et);
//                }
//            }
//        }
//        Stack<Pair> rs = new Stack<>();
//        while (st.size() > 0) {
//            rs.push(st.pop());
//        }
//        while (rs.size() > 0) {
//            Pair p = rs.pop();
//            System.out.println(p.st + " " + p.et);
//        }
//    }
//
//        public static class Pair implements Comparable<Pair> {
//            int st;
//            int et;
//
//            Pair(int st, int et) {
//                this.st = st;
//                this.et = et;
//            }
//
//            public int CompareTo(Pair other) {
//                if (this.st != other.st) {
//                    return this.st - other.st;
//                } else {
//                    return this.st - other.et;
//                }
//            }
//        }
//    }
