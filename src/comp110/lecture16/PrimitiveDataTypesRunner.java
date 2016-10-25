package comp110.lecture16;

public class PrimitiveDataTypesRunner {

  public static void main(String[] args) {
    PrimitiveDataTypesRunner.primitiveTypeExamples();
    // PrimitiveDataTypesRunner.overflowExample();
    // PrimitiveDataTypesRunner.charExample();
  }

  public static void primitiveTypeExamples() {
    // === Binary Primitive ===
    boolean aBit = true;

    // === Integer Primitives ===
    byte an8BitInteger = 127; // 8 bits
    short a16BitInteger = 32767; // 16 bits
    int a32BitInteger = 2147483647; // 32 bits
    long a64BitInteger = 9223372036854775807L; // 64 bits
    System.out.println("The maximum integer primitive in Java is " + a64BitInteger);

    // === Floating Point Primitives ===
    float a32BitFloatingPoint = 0.0F;
    double a64BitFloatingPoint = 0.0;

    // === Character Primitives ===
    char a16BitUnicodeCharacter = 'U';
  }

  public static void overflowExample() {
    int largest32BitInteger = 2147483647;
    largest32BitInteger++;
    System.out.println("Overflow: " + largest32BitInteger);
  }

  public static void charExample() {
    char a, b, c;
    a = 85;
    b = 78;
    c = 67;
    System.out.println("The chars are: " + a + b + c);
  }

}
