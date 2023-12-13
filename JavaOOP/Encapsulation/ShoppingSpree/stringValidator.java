package JavaOOP.Encapsulation.ShoppingSpree;

public class stringValidator {
    private stringValidator(){
        //прави се за да не може да се правят инстанции
    }

    public static boolean nameValidator(String name){
        if(name == null || name.trim().isEmpty()){
            return false;
        }
        return true;
    }
}
