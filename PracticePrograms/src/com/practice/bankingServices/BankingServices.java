package com.practice.bankingServices;

public class BankingServices {
	
	private final Object obj = new Object();
	
	public void transfer(Account from, Account to, long amt) {
		Account fromLock, toLock;
		//System.out.println("Attempt to acquire lock by thread: " + Thread.currentThread().getName());
		int result = from.getAccountId().compareTo(to.getAccountId());
		System.out.println("Compare result: " + result);
		if(result > 0) {
			fromLock = to;
			toLock = from;
		} else {
			fromLock = from;
			toLock = to;
		}
		synchronized (fromLock) {
			try {
				System.out.println("Acquired lock by thread in transfer method: " + Thread.currentThread().getName());
				//Thread.sleep(2000);
				if(from.getBalance() >= amt) {
					from.withdraw(amt);
					synchronized (toLock) {
						to.deposit(amt);
					}
					System.out.println("Account balance in from account " + from.getAccountId() + " is: " + from.getBalance());
					System.out.println("Account balance in to account " + to.getAccountId() + " is: " + to.getBalance());
					System.out.println("Get sum of balance of all accounts: " + Transact.getSumOfBalancesOfAllAccounts());
				} else {
					System.out.println("Not enough balance to transfer.");
					return;
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("-------------------------------------------------------------");
			}
		}
	}

}
