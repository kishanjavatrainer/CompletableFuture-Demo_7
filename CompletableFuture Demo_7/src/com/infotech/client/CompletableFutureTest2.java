package com.infotech.client;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest2 {
	
	public static void main(String[] args)  {
		
		String name = "Sean";
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
			if(name == null){
				throw new RuntimeException("Computation Error!!!");
			}
			return "Hello,"+name;
		});
		
		try {
			System.out.println(completableFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println(e.getMessage());
		}
	}
}
