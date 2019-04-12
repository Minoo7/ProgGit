package kapitel;

import java.util.HashMap;
import java.util.Set;
import java.util.Arrays;


public class kapitel14 {
        public static void main(String[] args) {

            // number of line segments to plot
            //int n = Integer.parseInt(args[0]);
            int n = 2;

            // the function y = sin(4x) + sin(20x), sampled at n+1 points
            // between x = 0 and x = pi
            double[] x = new double[n+1];
            double[] y = new double[n+1];
            for (int i = 0; i <= n; i++) {
                x[i] = 10 * i / n;
                //y[i] = Math.sin(4*x[i]) + Math.sin(20*x[i]);
                y[i] = (x[i]);
            }

            // rescale the coordinate system
            StdDraw.setXscale(-10, +10);
            StdDraw.setYscale(-10.0, +10.0);

            // plot the approximation to the function
            for (int i = 0; i < n; i++) {
                StdDraw.line(x[i], y[i], x[i+1], y[i+1]);
            }
            /*StdDraw.setPenRadius(0.05);
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.point(0.5, 0.5);
            StdDraw.setPenColor(StdDraw.MAGENTA);
            StdDraw.line(0.2, 0.2, 0.8, 0.2);*/
        }


    /*public static void main(String[] args) {
        HashMap<String, Integer> minHashMap = new HashMap();
        minHashMap.put("ett", 1);
        minHashMap.put("tre", 3);
        minHashMap.put("fa", 4);
        minHashMap.put("fem", 11);
        VärdeList(minHashMap);
        //Set<String> strings = minHashMap.get("hedg2j").keySet();
        //for(String s : minHashMap.keySet()){
            //System.out.println(s + " : " + minHashMap.get(s));
        //}
        //System.out.println(strings);
    }

    static String VärdeList(HashMap<String, Integer> minHashMap) {

        Set<String> strings = minHashMap.keySet();
        for(String s : minHashMap.keySet()) {
            System.out.println(s);
        }
        //fo
        return null;
    }*/
}
