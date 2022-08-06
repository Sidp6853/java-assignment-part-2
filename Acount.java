package AccountThingy;
import java.util.Date;
import java.util.Scanner;

class Accounter {
    private double Id;
    private double Balance;
    private double AnnualInterestRate;
    private Date DateCreated;
    double Withdrawer,Depositer;


    Accounter() {
        Id = 0;
        Balance = 500;
        AnnualInterestRate = 0.07;
    }

    public void setId(double Id) {
        this.Id = Id;
    }

    public double getId() {
        return Id;
    }

    public void setDateCreated(Date dateCreated) {
        DateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void setAnnualInterestRate(double AnnualInterestRate) {
        this.AnnualInterestRate = AnnualInterestRate;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }
    double Withdraw(double Withdrawer)
    {
        /*System.out.println("Enter the Amount you want to Withdraw :");
        Scanner Obj = new Scanner(System.in);
        Withdrawer = Obj.nextDouble();*/
        return(Balance-Withdrawer);

    }
    double Deposit(double Depositer)
    {
        return(Balance+Depositer);
    }
    double getMonthlyInterestRate()
    {
        return((AnnualInterestRate/100)/12);
    }
    double getMonthlyInterest()
    {
        return(getMonthlyInterestRate()*Balance);
    }
}
    public class Acount {
        public static void main(String[] args)
        {
            Date D = new Date();
            Accounter A = new Accounter();
            System.out.println("Enter your Account ID : ");
            Scanner Obj = new Scanner(System.in);
            A.setId(Obj.nextDouble());
            System.out.println("Enter your Balance : ");
            A.setBalance(Obj.nextDouble());
            System.out.println("Enter your Annual Interest : ");
            A.setAnnualInterestRate(Obj.nextDouble());
            System.out.println("-----------------------------------------");
            System.out.println("Account ID : " + A.getId());
            System.out.println("Balance : " + A.getBalance());
            System.out.println("Date : " + D );
            System.out.println("Monthly Interest Rate : " + A.getMonthlyInterestRate());
            System.out.println("Monthly Interest : " + A.getMonthlyInterest());
            int flag = 1;
            while(flag == 1)
            {
                System.out.println("Enter 1 for Withdrawal and 2 for Deposit : ");
                int n = Obj.nextInt();
                switch (n) {
                    case 1 ->
                    {
                        System.out.println("Enter the Amount you want to Withdraw : ");
                        double temp=Obj.nextDouble();
                        System.out.println("Withdrawal Successful!");
                        System.out.println("Updated Balance is : " + A.Withdraw(temp));
                        A.setBalance(A.Withdraw(temp));
                    }
                    case 2 ->
                    {
                        System.out.println("Enter the Amount you want to Deposit : ");
                        double temp=Obj.nextDouble();
                        System.out.println("Deposit Successful!");
                        System.out.println("Updated Balance is : " + A.Deposit(temp));
                        A.setBalance(A.Deposit(temp));
                    }

                    default -> {
                        System.out.println("Please Select a Valid Operation.");
                        break;
                    }
                }
                System.out.println("If you want to continue enter 1, or Exit =0:");
                flag = Obj.nextInt();
                if(flag==0)
                {
                    break;
                }
            }
        }
}
