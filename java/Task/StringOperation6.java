package Task;

public class StringOperation6
{
    public static void main(String[] a)
    {
        StringBuffer word = new StringBuffer("DEMOCRAZY");
        String reversedWord = word.reverse().toString();
        
        System.out.println(reversedWord.substring(reversedWord.indexOf('C'), reversedWord.indexOf('D')));
    }
}