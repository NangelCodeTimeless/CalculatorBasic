package CalculatorBasic.Run;

import java.util.ArrayList;

public class test {



    /*public ArrayList<String> nivel3() {
        int index = 3;

        String antAnterior = expMath.get(index - 2);
        float anterior = Float.parseFloat(expMath.get(index - 1));
        float next = Float.parseFloat(expMath.get(index + 1));
        float response;

        if (antAnterior.equalsIgnoreCase("-")) {
            response = (anterior * next);
            expMath.set(index - 2, "-");
        } else {
            response = (anterior * next);
        }

        expMath.set(index, String.valueOf(response));
        expMath.set(index - 1, "B");
        expMath.set(index + 1, "B");
        expMath.removeIf(e -> (e.equalsIgnoreCase("B")));
        return expMath;
    }*/




    public static void main(String[] args) {
        ArrayList<String> expMath = new ArrayList<>();
        expMath.add("12");
        expMath.add("-");
        expMath.add("2");
        expMath.add("x");
        expMath.add("5");
    }
}
