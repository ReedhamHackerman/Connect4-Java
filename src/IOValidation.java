

public class IOValidation
{
    MyIoException myIoException = new MyIoException();
     public  int readInt(int min, int max)
    {

        while (true)
        {

            int userInput = myIoException.getInt();
            try {

                if (userInput >= min && userInput <= max) {
                    return userInput;
                } else {
                    System.out.println("Error: Selection must be between " + max + "and" + min);

                }
            }
            catch (Exception e)
            {
                System.err.println("May Be SomeThing Went Wrong");
            }
//            } catch(Exception e) {
//              e.printStackTrace();
//            }



        }

    }
}
