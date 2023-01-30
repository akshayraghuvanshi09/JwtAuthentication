package com.ar.test;

import com.ar.util.JwtUtil;

import io.jsonwebtoken.Claims;

public class Test {
	public static void main(String[] args) {
			//Hard coded way
		
//		String key = "Intellicatech";
//
//		// Token Generation
//		String token = Jwts.builder()
//				.setId("AR09") // ID
//				.setSubject("Akshay") // Subject
//				.setIssuer("AR Technology") // Provider
//				.setIssuedAt(new Date(System.currentTimeMillis())) // token generation date
//				.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(5))) // valid until ?
//				.signWith(SignatureAlgorithm.HS256, // signature Algo
//						Base64.getEncoder().encode(key.getBytes())) // secretKey
//				.compact(); // convert to string
//		
//		System.out.println(token);
//		
//		
//		//------------------Reading Token/Parsing Token --------------------------------------//
//		Claims c = Jwts.parser()
//		.setSigningKey(Base64.getEncoder().encode(key.getBytes()))  //secretkey
//		.parseClaimsJws(token)
//		.getBody();
//		
//		System.out.println(c.getId());
//		System.out.println(c.getSubject());
//		System.out.println(c.getIssuer());
//	 	System.out.println(c.getIssuedAt());
//		System.out.println(c.getExpiration());
		
			//real time scenario
		String key = "intelliatech";
		
		JwtUtil util = new JwtUtil();
		String token = util.generateToken("AR01", "Akshay",key);
		System.out.println(token);
		
		Claims c = util.getClaims(key,token);
		
		System.out.println(c.getId());
		System.out.println(c.getSubject());
		System.out.println(c.getIssuer());
		System.out.println(c.getIssuedAt());
		System.out.println(c.getExpiration());
	
		
	}
}
