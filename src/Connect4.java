
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;


public class Connect4
{

    public static int discs = 42;
    public static   Boolean drawAndPlayAgainCondition = true;
    public static void main(String[] args)
    {
      IOValidation ioValidation = new IOValidation();





        String win;
        do {
            char[][] gameBoard =
                    {
                            {'6','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
                            {'5','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
                            {'4','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
                            {'3','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
                            {'2','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
                            {'1','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
                            {' ',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' ','-',' '},
                            {' ',' ','1',' ','2',' ','3',' ','4',' ','5',' ','6',' ','7',' '}
                    };
            PrintGameBoard(gameBoard);

        drawAndPlayAgainCondition = true;
        while(drawAndPlayAgainCondition)
        {


            WinningCheck(gameBoard);
            Point tejashviPoint = new Point();
            System.out.println("Please Enter y value Between(1-7)");
            int tejashviYAxis = ioValidation.readInt(1, 7);

            PlacePiece(gameBoard, tejashviPoint, tejashviYAxis, "Tejashvi");
            PrintGameBoard(gameBoard);



            WinningCheck(gameBoard);
            System.out.println("Please Enter y value Between(1-7)");
            int reedhamYAxis = ioValidation.readInt(1, 7);

            Point reedhamPoint = new Point();
            PlacePiece(gameBoard, reedhamPoint, reedhamYAxis, "Reedham");
            PrintGameBoard(gameBoard);
        }
        Scanner s  = new Scanner(System.in);
        System.out.println("Game Draw, Do U Want to continue Please Say Yes Or No");
        win = s.nextLine();


        }while (win.equalsIgnoreCase("Yes"));



    }
    public static void PrintGameBoard(char[][] myGameBoard)
    {
        for(char[] row : myGameBoard)
        {
            for(char c: row)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static  void PlacePiece(char[][] myGameBoard,Point point,int yAxis,String user)
    {
        IOValidation myIoValidate = new IOValidation();
        point.x=5;


        point.y = (2 * yAxis) ;
        char symbol = ' ';
        if(user.equals("Tejashvi"))
        {
            symbol = 'G';
        }
        else if (user.equals("Reedham"))
        {
            symbol = 'B';
        }
        while (myGameBoard[(int) point.getX()][(int) point.getY()] == 'B' || myGameBoard[(int) point.getX()][(int) point.getY()] == 'G'  )
        {
            point.x = (int) (point.getX()-1);
            if (point.getX()==-1)
            {
                System.out.println("This column is Full");
                System.out.println("Enter Another Value Of Y As a That Column Is Full , value should be between 1 and 7");
                int YAnother = myIoValidate.readInt(1, 7);
                point.y = YAnother*2;
                point.x = (int) (point.getX()+6);

            }
        }
        discs = discs -1;
        myGameBoard[(int) point.getX()][(int) point.getY()] = symbol;
        if (symbol == 'B')
        {
            System.out.println("Player has placed a Blue disc at  column " +((int) point.getY()/2) + " and row at " +((int) point.getX()+1));
        }
        else
        {
            System.out.println("Player has placed a Green disc at  column " + ((int) point.getY() /2) + " and row at " + ((int) point.getX()+1));
        }

        if(discs == 0)
        {
            WinningCheck(myGameBoard);
            drawAndPlayAgainCondition = false;
        }



        }










    private static void WinningCheck(char[][] gameBoard)

    {
        //Row win check
        for (int i = 0 ; i<=5 ;i++)
        {
            for(int j = 0; j<=4;j++)
            {

                if(gameBoard[i][j*2]=='B' & gameBoard[i][(j+1)*2] == 'B' & gameBoard[i][(j+2)*2] == 'B' & gameBoard[i][(j+3)*2] == 'B')
                {
                    System.out.println("Reedham Won");
                    System.exit(0);
                }
                if(gameBoard[i][j*2]=='G' & gameBoard[i][(j+1)*2] == 'G' & gameBoard[i][(j+2)*2] == 'G' & gameBoard[i][(j+3)*2] == 'G')
                {
                    System.out.println("Tejashvi Won");
                    System.exit(0);
                }

            }

        }
        // Column win Condition
        for(int i=0;i<=2;i++)
        {
            for(int j = 0;j<=3;j++)
            {
                if(gameBoard[i][j*2]=='B' & gameBoard[i+1][j*2] == 'B' & gameBoard[i+2][j*2] == 'B'& gameBoard[i+3][j*2]=='B')
                {
                    System.out.println("Reedham Won");
                    System.exit(0);
                }
                if(gameBoard[i][j*2]=='G' & gameBoard[i+1][j*2] == 'G' & gameBoard[i+2][j*2] == 'G'& gameBoard[i+3][j*2]=='G' )
                {
                    System.out.println("Tejashvi Won");
                    System.exit(0);
                }
            }
        }

        //ForWard Diagonal
        for (int i=0;i<=2;i++)
        {
            for (int j=0;j<=3;j++)
            {
                if (gameBoard[i][j*2]=='B'& gameBoard[i+1][(j+1)*2]=='B'& gameBoard[i+2][(j+2)*2]=='B'& gameBoard[i+3][(j+3)*2]=='B')
                {
                    System.out.println("Reedham Won");
                    System.exit(0);
                }
                if (gameBoard[i][j*2]=='G'& gameBoard[i+1][(j+1)*2]=='G'& gameBoard[i+2][(j+2)*2]=='G'& gameBoard[i+3][(j+3)*2]=='G')
                {
                    System.out.println("Tejashvi Won");
                    System.exit(0);
                }
            }
        }
        //reverse diaGonal
        for (int i=0;i<=2;i++)
        {
            for (int j=0;j<=3;j++)
            {
                if (gameBoard[i][(j+4)*2]=='B'& gameBoard[i+1][(j+3)*2]=='B'& gameBoard[i+2][(j+2)*2]=='B' & gameBoard[i+3][(j+1)*2]=='B')
                {
                    System.out.println("Reedham Won");
                    System.exit(0);
                }
                if (gameBoard[i][(j+4)*2]=='G'& gameBoard[i+1][(j+3)*2]=='G'& gameBoard[i+2][(j+2)*2]=='G' & gameBoard[i+3][(j+1)*2]=='G')
                {
                    System.out.println("Tejashvi Won");
                    System.exit(0);
                }
            }
        }


    }



}
