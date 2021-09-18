package br.com.jorgeacetozi.ebookChat.utils;

public enum SystemUsers {
	
	ADMIN("admin");
	
	SystemUsers(String username) {
		this.username = username;
	}
	
	private final String username;

	public String getUsername() {
		return this.username;
	}
}
