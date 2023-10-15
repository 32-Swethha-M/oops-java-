// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

    import  java.util.Scanner;

    public class PasswordStrengthChecker {

        private static Object hasUppercaseUppercase;
        private static Object hasLowercaseUppercase;
        private static Object hasDigit;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String password;
            String strength;

            do {
                System.out.print("Please enter a password: ");
                password = scanner.nextLine();
                strength = checkPasswordStrength(password);
                System.out.println("Password strength: " + strength);
            } while (!strength.equals("Strong"));

            System.out.println("Password is strong. You may proceed.");
        }

        public static <object, object> String checkPasswordStrength(String password) {
            if (password.length() < 8) {
                return "Weak";
            }

            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;
            boolean hasSpecialCharacter = false;

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) hasUppercase = true;
                if (Character.isLowerCase(c)) hasLowercase = true;
                if (Character.isDigit(c)) hasDigit = true;
                if (!Character.isLetterOrDigit(c)) hasSpecialCharacter = true;
            }

            if (hasUppercase && hasLowercase && hasDigit && !hasSpecialCharacter) {
                return "Moderate";
            }

            if (hasUppercase && hasLowercase && hasDigit && hasSpecialCharacter) {
                return "Strong";
            }

            return "Weak";
        }
    }