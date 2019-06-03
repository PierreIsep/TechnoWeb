package com.isep.miga.exception;

public class UserNotFoundException extends Exception {
	
		private long book_id;
		public UserNotFoundException(long user_id) {
		        super(String.format("user is not found with id : '%s'", user_id));
		        }
		}


