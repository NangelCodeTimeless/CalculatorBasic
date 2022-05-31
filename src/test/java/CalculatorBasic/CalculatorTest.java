package CalculatorBasic;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class CalculatorTest {

    @Test
    public void prioridad_operador(){
        ArrayList<String> expMath = new ArrayList<>();
        expMath.add("12");
        expMath.add("-");
        expMath.add("2");
        expMath.add("x");
        expMath.add("5");

        int bandera = 0;

        for (String operador:expMath) {
            if(operador.equals("x") || operador.equals("/")){
                bandera = expMath.indexOf(operador);
                break;
            }
        }

        Assert.assertEquals(3, bandera);
    }
}
