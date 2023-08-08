import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class JStudentLombok {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int age;
}
