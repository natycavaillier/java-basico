package aula9;

public class Wrapper {
    //#region Primitivos
    short num1 = 1;
    byte num2 = 10;
    int num3 = 100;
    long num4 = 1000000009;
    float num5 = 3.5f;
    double num6 = 3.555555;
    boolean flag = true;
    char a = 'a';
    //#endregion

    //#region Classes Wrapper que representa os tipos primitivos
    Short num7 = 1;
    Byte num8 = Byte.valueOf(num2);
    Integer num9 = Integer.parseInt("235");
    Long num10 = Long.valueOf(num4);

    Boolean flag2 = Boolean.parseBoolean("0");
    Character b = Character.valueOf('N');
    Double num11 = Double.parseDouble("3.4");
    //#endregion
}
