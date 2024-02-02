public class IDProof {
    private int idNum;
    private String idType;

    // Default constructor
    public IDProof() {}

    // Parameterized constructor
    public IDProof(int idNum, String idType) {
        this.idNum = idNum;
        this.idType = idType;
    }

    // Getters
    public int getIdNum() {
        return idNum;
    }

    public String getIdType() {
        return idType;
    }

    // Setters
    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }
}
