package com.company;
public class Polynom {
    double[] coef;

    public Polynom(double[] coef) {
        this.coef = coef;
    }
    @Override
    public String toString() {
        String result = "";

        if (coef[0]==0) {
            result = "";
        }
        else if (coef[0]<0) {
            coef[0]= -1*coef[0];
            result = "" + " - " + coef[0];
            coef[0]=-1*coef[0];
        }
        else {
            result = "" + " + " + coef[0];
        }
        if (coef[1]==0) {
            result = "" + result;
        }
        else if (coef[1]==1) {
            result = "" + " + " + "x" + result;
        }
        else if (coef[1] < 0) {
            coef[1] = -1*coef[1];
            result = "" + " - " + coef[1] + "x" + result;
            coef[1] = -1*coef[1];
        }
        else {
            result = "" + " + " + coef[1] + "x" + result;
        }

        for (int i = 2; i < coef.length; i++) {

            if (coef[i] == 0) {
                result = "" + result;
            }
            else if (coef[i] == 1.0) {
                result= "" + " + " + "x^" + i + result;
            }
            else if (coef[i] < 0) {
                coef[i] = -1*coef[i];
                result= "" + " - " + coef[i] + "x^" + i + result;
                coef[i] = -1*coef[i];
            }
            else {
                result = "" + " + " + coef[i] + "x^" + i + result;
            }

        }

        return result;


    }
}
