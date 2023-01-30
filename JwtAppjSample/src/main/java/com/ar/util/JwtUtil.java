package com.ar.util;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {

	
	public String generateToken(String id, String subject, String key) {
		return Jwts.builder()
				.setId(id) // ID
				.setSubject(subject) // Subject
				.setIssuer("AR Technology") // Provider
				.setIssuedAt(new Date(System.currentTimeMillis())) // token generation date
				.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(1))) // valid until ?
				.signWith(SignatureAlgorithm.HS256, // signature Algo
						Base64.getEncoder().encode(key.getBytes())) // secretKey
				.compact(); // convert to string

	}

	public Claims getClaims(String key,String token) {
		return Jwts.parser()
				.setSigningKey(Base64.getEncoder().encode(key.getBytes()))  //secretkey
				.parseClaimsJws(token)
				.getBody();
		
	}
	
	public boolean isValidToken(String key,String token) {
		//exp date > current date
		return getClaims(key, token)
				.getExpiration()
				.after(new Date(System.currentTimeMillis()));
		
	}
	
	public String getSubject(String key,String token) {
		return getClaims(key, token).getSubject();
	}

}
