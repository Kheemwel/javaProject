public class Beller_LabExer1A {
    public static void main(String[] args) {
        int faveNumber = 8;
        String faveCartChar = "Pokemon";
        char mi = 'C';
        char[] nickNameArray = {'K', 'i', 'm'};

        //this will display my favorite number by calling the value of faveNumber variable.
        System.out.println(faveNumber + " is my favorite number.");

        //is will display the value of faveCartChar and concatenate it to "I love" and '!'.
        System.out.println("I love " + faveCartChar + "!");

        //this will display my full name by concatenating the variable mi between my firstname and surname.
        System.out.println("My name is Kimwel Lourence " + mi + ". Beller.");

        //this code statement will display all the values of the array by getting the value per index.
        System.out.println("You can call me " + nickNameArray[0] + nickNameArray[1] + nickNameArray[2]);
    }
}
