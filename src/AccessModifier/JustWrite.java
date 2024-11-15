package AccessModifier;

public class JustWrite {
     private  String name = "john" ;
    private  String Class = "C02";

    public JustWrite() {
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setClass(String aClass) {
        Class = aClass;
    }
    public  String Display(){
        return "name: " + name + "\nClass: " + Class + "\n";
    }
}
