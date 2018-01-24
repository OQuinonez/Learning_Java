package com.company;

public class TempatureConverter {

    public String startUnit;
    public String endUnit;


    public TempatureConverter(String start, String end){

        startUnit = start;
        endUnit = end;
    }

    public double convert(double temp){
        if (startUnit.equals(endUnit)) {
            return temp;
        } else if (startUnit.equals("C") && endUnit.equals("F")) {
            temp = temp * 9 / 5 + 32;
            return  temp;
        } else if (startUnit.equals("C") && endUnit.equals("K")) {
            temp = temp + 273.13;
            return temp;
        } else  if (startUnit.equals("F") && endUnit.equals("C")){
            temp = (temp - 32) * 5 / 9;
            return temp;
        } else if (startUnit.equals("F") && endUnit.equals("K")){
            temp = (temp + 459.67) * 5 / 9;
            return temp;
        } else if (startUnit.equals("K") && endUnit.equals("F")){
            temp = temp * 9 / 5 - 459.67;
            return temp;
        } else if (startUnit.equals("K") && endUnit.equals("C")){
            temp = temp - 273.13;
            return temp;
        }
        return temp;
    }
}
