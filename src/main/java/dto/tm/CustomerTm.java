package dto.tm;

import javafx.scene.control.Button;

public class CustomerTm {
    private String id;
    private String name;
    private String address;
    private double salary;
    private Button btnDelete;

    @Override
    public String toString() {
        return "CustomerTm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", btnDelete=" + btnDelete +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Button getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(Button btnDelete) {
        this.btnDelete = btnDelete;
    }

    public CustomerTm(String id, String name, String address, double salary, Button btnDelete) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.btnDelete = btnDelete;
    }
}
