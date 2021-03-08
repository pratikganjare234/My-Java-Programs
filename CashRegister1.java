import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CashRegister1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner fileInput = new Scanner(file);

        while (fileInput.hasNextLine()) {
            printCashChange(fileInput.nextLine());
        }
    }

    private static void printCashChange(String line) {
        float pp = Float.parseFloat(line.split(";")[0]);
        float ch = Float.parseFloat(line.split(";")[1]);

        System.out.println(getCashChange(pp, ch));
    }

    private static String getCashChange(float price, float cash) {
        if (cash < price) { return "ERROR"; }
        if (cash == price) { return "ZERO"; }
        float cashBack = cash - price;


        StringBuilder change = new StringBuilder();

        while (cashBack > 0.01f) {
            if (cashBack >= 100.0f) {
                change.append("ONE HUNDRED");
                cashBack -= 100.0f;
            } else if (cashBack >= 50.0f) {
                change.append("FIFTY");
                cashBack -= 50.0f;
            } else if (cashBack >= 20.0f) {
                change.append("TWENTY");
                cashBack -= 20.0f;
            } else if (cashBack >= 10.0f) {
                change.append("TEN");
                cashBack -= 10.0f;
            } else if (cashBack >= 5.0f) {
                change.append("FIVE");
                cashBack -= 5.0f;
            } else if (cashBack >= 2.0f) {
                change.append("TWO");
                cashBack -= 2.0f;
            } else if (cashBack >= 1.0f) {
                change.append("ONE");
                cashBack -= 1.0f;
            } else if (cashBack >= 0.5f) {
                change.append("HALF DOLLAR");
                cashBack -= 0.5f;
            } else if (cashBack >= 0.25f) {
                change.append("QUARTER");
                cashBack -= 0.25f;
            } else if (cashBack >= 0.1f) {
                change.append("DIME");
                cashBack -= 0.1f;
            } else if (cashBack >= 0.05f) {
                change.append("NICKEL");
                cashBack -= 0.05f;
            } else {
                change.append("PENNY");
                cashBack -= 0.01f;
            }
            change.append(",");
        }
        change.setLength(change.length() - 1);

        return change.toString();
    }
}