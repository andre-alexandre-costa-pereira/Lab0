
/**
 * Write a description of class AppStart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppStart
{
    public static void main(String[] args)
    {
        System.out.println("Name : " + Size.MEDIUM.getDescription() + "\n"+
                            "toString() : " + Size.MEDIUM.toString() + "\n"+
                            "Ordem : " + Size.MEDIUM.ordinal() + "\n"+
                            "Valor minimo : " + Size.MEDIUM.getMaxValue() + "\n"+
                            "Valor maximo : " + Size.MEDIUM.getMinValue() + "\n"+
                            "Código : " + Size.MEDIUM.getCode() + "\n");
    }
}
