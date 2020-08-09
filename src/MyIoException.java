import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyIoException 
{
    // Input

    public static String readLine() throws IOException
    {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static int parseInt() throws IOException, NumberFormatException
    {
        return Integer.parseInt(readLine());
    }



    private static void println(String s)
    {
        System.out.println(s);
    }

    public  int getInt()
    {
        try
        {
            while (true)
            {
                try
                {
                    return parseInt();
                }
                catch (NumberFormatException e)
                {
                    println("Invalid integer format. Try again:");
                }
            }
        }
        catch (IOException e)
        {
            println("Input/output exception occurred. Returning 0.");
        }
        return 0;
    }


}
