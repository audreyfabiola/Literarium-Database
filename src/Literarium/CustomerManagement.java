package Literarium;

/**
 *
 * @author Clarissa Audrey Fabiola
 */
public class CustomerManagement implements BookStore{
    private String id, name, custEmail, custGender, custAddress;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getcustEmail() {
        return custEmail;
    }

    public void setcustEmail(String custEmail) {
        this.custEmail = custEmail;
    }
    
    public String getcustAddress() {
        return custAddress;
    }
    
    public void setcustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getcustGender() {
        return custGender;
    }

    public void setcustGender(String custGender) {
        this.custGender = custGender;
    }
}
