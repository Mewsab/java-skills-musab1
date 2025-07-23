public class UserInfo {
    String name;
    int age;
    String email;
    boolean isActive;

    public UserInfo(String name, int age, String email , boolean isActive){
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive = isActive;
    }
    //get methods
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public boolean getIsActive(){
        return isActive;
    }
    //set methods
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setActive(boolean active) {
        isActive = active;
    }

    public void displayInfo(){
        System.out.println("User information: " + "");
        System.out.println("Full Name: " + "" + name);
        System.out.println("Age: " + "" + age);
        System.out.println("Email: " + "" + email);
        System.out.println("Active: " + (isActive));

    }
    public static void main (String[] args){
        UserInfo User1 = new UserInfo("Musab Irfan", 21, "musab@gmail.com", true);
        UserInfo User2 = new UserInfo("Mohammed Ahmed", 20, "m.ahmed@gmail.com", false);
        UserInfo User3 = new UserInfo("Faisal Khalid", 23, "Fkhalid@gmail.com", true);

        User1.displayInfo();
        User2.displayInfo();
        User3.displayInfo();

        User2.setName("Hamed Junaid");
        User2.setAge(24);
        User2.setEmail("hamood@gmail.com");
        User2.setActive(false);
        System.out.println("User 2 full name has been updated: " + User2.getName());
        System.out.println("User 2 age has been updated: " + User2.getAge());
        System.out.println("User 2 email has been updated: " + User2.getEmail());
        System.out.println("User 2 status has been updated: " + User2.getIsActive());

    }




}
