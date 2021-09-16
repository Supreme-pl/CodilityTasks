package com.codilityTest;
import java.util.*;
import static java.lang.Math.abs;

class Solution {
    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    int cValue;
    public int solution(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int key = A[i];
            Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
            boolean isKeyPresent = false;
            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();
                if (key == entry.getKey()) {
                    isKeyPresent = true;
                }
            }
            if (!isKeyPresent) map.put(key, 1);
            else map.put(key, map.get(key) + 1);
        }
        for (int value : map.values())
            if (value % 2 != 0) cValue = value;

        return getKey(map, cValue);
    }
}

class Solution5 {
    public static int solution(int K, int[] A) {
        int N = A.length - 1;
        Map<Integer, Integer> map = new HashMap<>(); Map<Integer, Integer> eMap = new HashMap<>(); Map<Integer, Integer> mapp = new HashMap<>();
        for(int i = 0; i < N; i++)
        {
            if(Math.abs(A[i] - A[i+1]) <= K)
                map.put(i, i+1);
            for(int y = i; y < N - i; y++)
            {
                if(map.containsKey(y) && Math.abs(A[y] - A[y+i]) <= K) mapp.put(y, y + i);
            }
            eMap.put(i,i);
        }
        int sum = map.size() + eMap.size() + mapp.size();
        if(sum > 1000000000) return 1000000000;
        else return sum;
    }
}

class Solution4 {
    public static int solution(int X, int Y, int D) {
        int n = 0;
        while (X < Y)
            {X += D; n++;}
        return n;
    }
}

class Solution3 {
    public static int solution(int[] A) {
        int max_len = 1, n = 1;
        boolean less = false, prev = true;
        if(A.length < 3)
            return A.length == 1 ? 1 : (A[0] == A[1] ? 1 : 2);
        for (int i = 1; i < A.length; i++) {
            if(A[i] > A[i-1]) {
                if(prev) {
                    prev = false;
                    n++;
                }
                else if(less) n++;
                else
                    n = 2;
                less = false;
            }
            else if(A[i] < A[i-1]) {
                if(prev) {
                    prev = false;
                    n++;
                }
                else if(less)
                    n = 2;
                else
                    n++;
                less = true;
            }
            else {
                n = 1;
                prev = true;
            }
            max_len = Math.max(max_len,n);
        }
        return max_len;


        //3 msc praktyk
        //15.10.21 zaczynaja się
        //zadania ktore bym dostawal są istotne ale nie priorytetowe
        //zaczyna się od pisania testów

//        int n = 0;
//        if(A.length == 1)
//            return 1;
//        for(int i = 0; i < A.length - 2; i++)
//        {
//            if(A[i] > A[i+1] && A[i+1] < A[i+2]) n++;
//            else if (A[i] < A[i+1] && A[i] > A[i+2]) n++;
////            if(A[0] > A[1]) {
////                if (i % 2 == 0) {
////                    if (A[i] < A[i + 1]) n++;
////                }
////                else if (A[i] > A[i + 1]) n++;
////            }
////            else {
////                if (i % 2 == 0) {
////                    if (A[i] > A[i + 1]) n++;
////                }
////                else if (A[i] < A[i + 1]) n++;
////            }
//        }
//        return n;
    }
}

class Solution2 {
    public int[] solution(int N) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i <= N/2; i++) {
            array.add(i);
            array.add(-i);
        }
        if(N % 2 == 1)
            array.add(0);
        Object[] A = array.toArray();
        int[] intA = new int[A.length];

        for(int i = 0; i < A.length; i++)
            intA[i] = (int)A[i];

        return intA;

    }
}

class Solution6 {
    public static int solution() {
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
//        int A[] = {3,5,7,6,3};
//        System.out.println(Solution5.solution(2, A));
//        System.out.println(Solution4.solution(10,85,30));

        }
    }
