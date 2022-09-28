import java.util.Scanner;
public class pizzaChallenge
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        double totalbill=0,totalpizzaprice=0,totalgarlicprice=0,totalbeverageprice=0,disc=0;
        double totalvaluepizza=0,totalValueForgarlicBread=0,totalvaluebeverageprice=0;

        System.out.println("Please Enter Customer Name :");
        String name=obj.next();
        System.out.println("Please Enter Customer Email Id :");
        String email=obj.next();
        System.out.println("Enter Customer Phone Number :");
        long phNo=obj.nextLong();
        System.out.println("Enter Customer Address :");
        String add=obj.next();
        System.out.println("Enter Pizza Size :");
        String pizzaSize=obj.next();

        float pizzaPrice=12.99f;
        float garlicBreadPrice=5.99f;
        float beverageprice=1.99f;

        int noofpizzaOrder,garlicNo,beverageNo;

        System.out.println("sl No        Item Category");
        System.out.println("---------------------------------------");

        System.out.println("1)  Pizza ");
        System.out.println("2)  Garlic Bread ");
        System.out.println("3)  Beverage");

        int choice=1;
        while(choice==1)

        {
            System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverage");
            int ischoice=obj.nextInt();

            switch(choice)
            {
                case 1:

                    System.out.println("Please enter the number of Pizza you want to order:");
                    noofpizzaOrder=obj.nextInt();

                    totalpizzaprice=noofpizzaOrder*pizzaPrice;
                    totalvaluepizza = totalvaluepizza+totalpizzaprice;
                    System.out.println("Your total pizza bill $" +totalvaluepizza);
                    break;

                case 2:
                    garlicNo=obj.nextInt();
                    System.out.println("Please enter the number of Garlic Bread you want to order:");
                    garlicNo=obj.nextInt();
                    totalgarlicprice=garlicNo *garlicBreadPrice;
                    totalValueForgarlicBread = totalValueForgarlicBread+totalgarlicprice;
                    System.out.println("Your total garlic bread bill $"+totalValueForgarlicBread);
                    break;

                case 3:

                    System.out.println("Please enter the number of Breverageyou want to order:");
                    beverageNo=obj.nextInt();
                    totalbeverageprice=beverageprice*beverageNo;
                    totalvaluebeverageprice=totalvaluebeverageprice*totalbeverageprice;
                    System.out.println("Your total beverage bill $" +totalvaluebeverageprice);
                    break;
                default:
                    System.out.println(" !! INVALID CHOICE !!, CHOOSE BETWEEN 1,2 OR 3");
                    break;
            }

            System.out.println("Do you want to place another order enter 1 to continue or 0 to exit");
            choice=obj.nextInt();
        }


        totalbill=totalvaluepizza+ totalValueForgarlicBread +totalvaluebeverageprice;
        System.out.println("your total bill: $ "+totalbill);

        if (totalbill>50)
        {
            disc=totalbill-(0.1*totalbill);
            System.out.println("The total bill amount is : $" +totalbill);
            System.out.println("The total discounted bill amount :" +disc);
        }
        else if(totalbill < 50)
        {
            System.out.println("The total bill amount is : $" +totalbill);
            System.out.println("No discount is provided since bill amount is less than $50");
        }

    }
}