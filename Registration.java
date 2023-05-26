package class23Project;

class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email! Please enter a valid Yahoo email.");
        }
    }

    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username! Username should be at least 7 characters long.");
        }
    }

    public void setPassword(String password) {
        if (password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password! Password should be at least 7 characters long and should not contain username.");
        }
    }
}

class MainRegistration {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("example@yahoo.com");
        registration.setUserName("example");
        registration.setPassword("password");
    }
}

















}
