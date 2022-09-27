    import java.util.Scanner;

    public class TaxesCalculation {
        public static void main(String[] a) {
            System.out.println("input 1 if you are married or 0:");
            Scanner input = new Scanner(System.in);
            int w =input.nextInt();
            System.out.print ("input your monthly income:");
            double income = input.nextDouble();
            double taxes = 0;
            if( w == 1)
            {
                if(income<=16000)
                {
                    taxes = income*0.1;
                }
                else if(income>16000)
                {
                    taxes=16000*0.1;
                    if(income<=64000)
                    {
                        taxes=taxes+(income-16000)*0.15;
                    }
                    else if(income>64000)
                    {
                        taxes=taxes+(income-16000)*0.15+(income-64000)*.25;


                    }



                }

            }
            else
            {
                if(income<=8000)
                {
                    taxes=income*.1;
                }
                else if(income>8000)
                {
                    taxes=8000*.1;
                    if(income<=32000)
                    {
                        taxes=taxes+(income-8000)*.15;
                    }
                    else if(income>32000)
                    {
                        taxes=taxes+(income-8000)*0.15+(income-32000)*.25;


                    }



                }

            }
            System.out.println(taxes);
        }
    }


