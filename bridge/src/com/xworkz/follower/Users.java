package com.xworkz.follower;

import com.xworkz.bridge.SocialMedia;

public class Users implements SocialMedia{

	public static void main(String[] args) {
		
		SocialMedia social = new Users();
		
		System.out.println(social.choose());
		System.out.println(social.responsibility());
		System.out.println(social.goLive());
		System.out.println(social.posts());
		System.out.println(social.security());
		
		Users users = new Users();
		
		System.out.println(users.choose());
		System.out.println(users.responsibility());
		System.out.println(users.goLive());
		System.out.println(users.posts());
		System.out.println(users.security());

	}

	@Override
	public boolean choose() {
		System.out.println("Running choose method..");
		return false;
	}

	@Override
	public String responsibility() {
		System.out.println("Running responsibility method..");
		return null;
	}

	@Override
	public char goLive() {
		System.out.println("Running goLive method..");
		return 0;
	}

	@Override
	public int posts() {
		System.out.println("Running posts method..");
		return 0;
	}

	@Override
	public boolean security() {
		System.out.println("Running security method..");
		return false;
	}

}
