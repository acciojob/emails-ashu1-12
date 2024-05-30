package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
    	
    	if(!oldPassword.equals(this.password)) 
    		System.out.println("Old password is not equal to current Password");
    	else if(!isPasswordValid(newPassword))
    		System.out.println("Current Password does not meet the requirements");
    	else
    		this.password=newPassword;
    		
    	
    	
    }

	private boolean isPasswordValid(String newPassword) {
		// TODO Auto-generated method stub
		// 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
		if(newPassword.length() != 8)
			return false;
		boolean hasUppercase=false;
		boolean hasLowercase=false;
		boolean hasDigit=false;
		boolean hasSpecialChar=false;
		
		for(char c:newPassword.toCharArray()) {
			if(Character.isUpperCase(c))
				hasUppercase=true;
			else if(Character.isLowerCase(c))
				hasLowercase=true;
			else if(Character.isDigit(c))
				hasDigit=true;
			else
				hasSpecialChar=true;
		}
		return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
	}
}
