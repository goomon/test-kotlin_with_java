import java.time.LocalDate;
import java.util.UUID;

public class JStudent {

    private String name;

    private String studentId;

    private int age;

    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getUUID() {
        return UUID.randomUUID().toString();
    }
}
