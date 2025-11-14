package h3;

public class H3_main {
    public static void main(String[] args) {
        float celsiusFloat = 24.6646489f;
        float fahrenheitFloat = 1f;
        double celsiusDouble = 24.6646489;
        double fahrenheitDouble = 1;

        fahrenheitFloat = (celsiusFloat * 9 / 5) + 32;
        fahrenheitDouble = (celsiusDouble * 9 / 5) + 32;

        System.out.println("fahrenheitFloat: " + fahrenheitFloat);
        System.out.println("fahrenheitDouble: " + fahrenheitDouble);  // Mehr Nachkommastellen = Genauer 
                                                                        // weniger Nachkommastellen = Rundungsfehler z.B.:
                                                                        // fahrenheitFloat: 76.3963
                                                                        // fahrenheitDouble: 76.39636802
}

}