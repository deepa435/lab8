	package lab8;

	import java.util.HashMap;

	class Bank {
	    private HashMap<Integer, Double> accounts = new HashMap<>();

	    // Method to create a new account
	    public void createAccount(int acNo, double balance) {
	        accounts.put(acNo, balance);
	        System.out.println("Creating account " + acNo + " with " + balance);
	    }

	    // Method to deposit money
	    public void deposit(int acNo, double amt) {
	        if (accounts.containsKey(acNo)) {
	            double newBalance = accounts.get(acNo) + amt;
	            accounts.put(acNo, newBalance);
	            System.out.println("Deposit " + amt + " in account " + acNo + " → Balance = " + newBalance);
	        } else {
	            System.out.println("Account " + acNo + " not found!");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(int acNo, double amt) {
	        if (accounts.containsKey(acNo)) {
	            double balance = accounts.get(acNo);
	            if (balance >= amt) {
	                double newBalance = balance - amt;
	                accounts.put(acNo, newBalance);
	                System.out.println("Withdraw " + amt + " from account " + acNo + " → Balance = " + newBalance);
	            } else {
	                System.out.println("Insufficient balance in account " + acNo);
	            }
	        } else {
	            System.out.println("Account " + acNo + " not found!");
	        }
	    }

	    // Method to check balance
	    public void checkBalance(int acNo) {
	        if (accounts.containsKey(acNo)) {
	            System.out.println("Account " + acNo + ": " + accounts.get(acNo));
	        } else {
	            System.out.println("Account " + acNo + " not found!");
	        }
	    }
	}