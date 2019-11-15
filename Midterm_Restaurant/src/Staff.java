public abstract class Staff {

    //proprieties/ fields
    private String fullName;
    private int id;
    private String typeOfJob;
    private String shifts;


    //SETTERS
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTypeOfJob(String typeOfJob) {
        this.typeOfJob = typeOfJob;
    }

    public void setShifts(String shifts) {
        this.shifts = shifts;
    }

    //GETTERS
    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public String getTypeOfJob() {
        return typeOfJob;
    }

    public String getShifts() {
        return shifts;
    }
}
