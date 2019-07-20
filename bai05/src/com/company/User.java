package com.company;

public class User {
    private String name;
    private String email;
    private Integer age;
    //method reference = function pointer
    Runnable doSomething1 = () -> {
        System.out.println("doSomething1");
    };
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "email:"+email+"name:"+name+"age:"+age;
    }
}
