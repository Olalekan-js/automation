package Task;

public class TestifyTraining10
{
    public static void main(String a[])
    {
        // code
        TestifyTraining10 workShop = new TestifyTraining10();
        workShop.verifyParticipant("textbox");
    }

    public void verifyParticipant(String tag)
    {
        boolean isTestify = "testify".equals(tag);

        if (isTestify)
        {
            System.out.println("Welcome to Testify workshop");
            return;
        }

        System.err.println("Sorry, your tag is not geniune!");
    }
}