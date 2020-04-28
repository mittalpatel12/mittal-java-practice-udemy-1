package academy.learnprogramming.bankapplication;

public class Main {
    public static void main(String[] args) {
        Bank bank =  new Bank("National BAnk");
        bank.addBranch("Ahmedabad-naranpura");
        bank.addBranch("gurukul");

        bank.addCustomer("Ahmedabad-naranpura","mittal",100);
        bank.addCustomer("gurukul","chintan",200);
        bank.addCustomer("gurukul","jaladhi",100000);

        bank.addCustomerTransaction("gurukul","mittal",23);
        bank.addCustomerTransaction("gurukul","jaladhi",32);

        bank.listCustomers("gurukul",true);



    }


}
