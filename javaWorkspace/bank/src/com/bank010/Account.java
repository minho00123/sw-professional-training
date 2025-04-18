package com.bank010;

import java.util.ArrayList;
import java.util.List;

class Account {
	private final String accountNumber;
	private String password;
	private static long balance = 0;
	private List<long[]> records = new ArrayList<long[]>();

	Account(String accountNumber, String password) {
		this.accountNumber = accountNumber;
		this.password = password;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getPassword() {
		return password;
	}

	public List<long[]> getRecords() {
		return records;
	}

	public long getBalance() {
		return balance;
	}

	public void setRecords(int type, long amount, long time) {
		long[] record = new long[] { type, amount, time };

		records.add(record);
	}

	public boolean setBalance(int type, long amount) {
		if (type == 1) {
			balance += amount;
		} else if (type == 2) {
			if (balance - amount < 0) {
				System.out.println("잔액이 부족합니다.");
				return false;
			}

			balance -= amount;
		}

		return true;
	}
}
