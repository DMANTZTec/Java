package JV00010;

public class PasswordManager {
    private String password;

    public void setPassword(String newPassword) 
    {    
        if (newPassword.length() >= 8) 
        {
            this.password = newPassword;
            System.out.println("Password set successfully!");
        } 
        else
        {
            System.out.println("Invalid password! Password must be at least 8 characters long.");
        }
    }
}
