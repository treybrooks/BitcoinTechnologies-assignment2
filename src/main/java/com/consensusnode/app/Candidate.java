package com.consensusnode.app;

public class Candidate {
	Transaction tx;
	int sender;
	
	public Candidate(Transaction tx, int sender) {
		this.tx = tx;
		this.sender = sender;
	}
}