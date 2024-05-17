public class NumeroFlotanteGarcia {
    public static void main(String[] args) {
        float numeroDecimal = 4.14159f; // Número decimal de tipo float

        int parteEntera = (int) numeroDecimal; // Parte entera del número (se realiza una conversión explícita de float a int)
        float parteDecimal = numeroDecimal - parteEntera; // Parte decimal del número

        System.out.println("Parte entera: " + parteEntera); // Muestra la parte entera
        System.out.println("Parte decimal: " + parteDecimal); // Muestra la parte decimal
    }
}
