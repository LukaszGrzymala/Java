package com.company.telescope;
import java.util.Scanner;

public class TelescopeClass{


    public void addTelescope() {
        System.out.println("Podaj nazwę teleskopu: ");
        Scanner telescopeClassScanner = new Scanner(System.in);
        String telescopeName = telescopeClassScanner.nextLine();
        System.out.println("Podaj standard rozmiaru wyciągu w calach");
        String focuserSize = telescopeClassScanner.nextLine();
        System.out.println("Podaj aperturę teleskopu w milimetrach");
        Double telescopeAperture = telescopeClassScanner.nextDouble();
        System.out.println("Podaj ogniskową teleskopu w milimetrach");
        Double telescopeFocalLength = telescopeClassScanner.nextDouble();
        

    }
}
