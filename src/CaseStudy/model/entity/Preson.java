package CaseStudy.model.entity;

public abstract class Preson {
    private int code;
    private String name;
    private String address;
    private int age;
    private String gender;
    public Preson() {
    }

    public Preson(int code, String name, String address, int age, String gender) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "ID=" + code +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' ;
    }
}