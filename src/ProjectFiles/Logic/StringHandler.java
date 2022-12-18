package ProjectFiles.Logic;

import java.util.ArrayList;

public class StringHandler {
    static ArrayList<Double> doubleList;

    public static ArrayList<Double> getDoubleListFromString(String string) {
        doubleList = new ArrayList<>();
        double d1;
        double d2;
        if (string.contains("+")) {
            d1 = Double.parseDouble(string.substring(0, string.indexOf("+")));
            d2 = Double.parseDouble(string.substring(string.indexOf("+") + 1));
            doubleList.add(d1);
            doubleList.add(d2);

        } else if (string.contains("-")) {
            d1 = Double.parseDouble(string.substring(0, string.indexOf("-")));
            d2 = Double.parseDouble(string.substring(string.indexOf("-") + 1));
            doubleList.add(d1);
            doubleList.add(d2);

        }else if (string.contains("*")) {
            d1 = Double.parseDouble(string.substring(0, string.indexOf("*")));
            d2 = Double.parseDouble(string.substring(string.indexOf("*") + 1));
            doubleList.add(d1);
            doubleList.add(d2);

        }else if (string.contains("/")) {
            d1 = Double.parseDouble(string.substring(0, string.indexOf("/")));
            d2 = Double.parseDouble(string.substring(string.indexOf("/") + 1));
            doubleList.add(d1);
            doubleList.add(d2);

        }else if (string.contains("^")) {
            d1 = Double.parseDouble(string.substring(0, string.indexOf("^")));
            d2 = Double.parseDouble(string.substring(string.indexOf("^") + 1));
            doubleList.add(d1);
            doubleList.add(d2);

        }else if (string.contains("√")) {
            d1 = Double.parseDouble(string.substring(0, string.indexOf("√")));
            d2 = 1;
            doubleList.add(d1);
            doubleList.add(d2);
        }
        return doubleList;
    }
    public static String replaceCommasWithDots(String string){
        return string.replaceAll(",",".");
    }
    public static String replaceDotsWithCommas(String string){
        return string.replaceAll("\\.",",");
    }
}